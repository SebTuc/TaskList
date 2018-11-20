package com.seb.generic.dao;


import java.util.Map;

public class DAOFactory {
	
	private static Map<String, String> daosMap;
	
	
	@SuppressWarnings({ "rawtypes" })
	public static GenericDAO getDAO(String daoName) {
		if (daosMap != null && daosMap.containsKey(daoName)) {

			try {
				return (GenericDAO) Class.forName(daosMap.get(daoName))
						.newInstance();

			} catch (Exception e) {
				throw new RuntimeException(e);
			}

		} else {
			throw new RuntimeException(
					"DAO "
							+ daoName
							+ " has not been registered - Please add it in dao.properties");
			
		}

	}

	public static Map<String, String> getDaosMap() {
		return daosMap;
	}

	public static void setDaosMap(Map<String, String> servicesMap) {
		DAOFactory.daosMap = servicesMap;
	}
}
