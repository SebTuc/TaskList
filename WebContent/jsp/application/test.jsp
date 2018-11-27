<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>

	<head>		
		<meta charset="ISO-8859-1">
		<title>Test Hibernate</title>
		<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">	
	</head>
	
	<body>	
	
		<div class="container-fluid">
	
			<jsp:include page="/jsp/common/menuNavbar.jsp" />
			
			<br><br><br>		
			
			<div class="row">
				<div class="col">
					<h1 class="display-4">Test Hibernate</h1>
				</div>
			</div>
			
			<br>
			
			<form method="post">
							
				<c:forEach var="List" items="${allTypes}"> 
				
					<div class="row">
						
						<div class="col">
				
							<div class="card text-white bg-dark">
							
								<div class="card-header">
							    	<b>${fn:escapeXml(List.nom)}</b>
							  	</div>
							  	
								<div class="card-body">
	
									<div class="row">
									
										<div class="col">
		  		     
										    <div class="form-group">
										     
											    <label for="themes">Ajouter un nouveau Theme</label>
													
												<div class="input-group">
	  											
													<input id="themes" name="themes" class="form-control" placeholder="Nouveau Theme"/>
													
													<div class="input-group-append">
														<button name="buttonAddTheme" value="${List.id_type}" class="btn btn-success" type="submit">Ajouter</button>
													</div>
											
												</div>
											
											</div>
										
										</div>
							
									</div>
							 
									<c:forEach var="Theme" items="${List.themes}">
									
										<div class="row">
										
											<div class="col">
									
												<div class="card text-white bg-secondary">
									
													<div class="card-header">
												    	<b>${fn:escapeXml(Theme.nom)}</b>
												  	</div>
									    
									    			<div class="card-body">									    
									     				
									    				<div class="form-group">
									    				
													     	<label for="liste">Ajouter un nouveau message</label>
													     	
													     	<div class="input-group">
													     	
																<input id="listes" name="listes" class="form-control" placeholder="Nouveau Message"/>
																<div class="input-group-append">
																	<button name="buttonAddListe" value="${Theme.id_theme}" class="btn btn-success" type="submit">Ajouter</button>
																</div>
															
															</div>
															
														</div>
														
														<div class="card text-dark bg-light">
									
															<div class="card-header">
														    	<b>Liste des Message</b>
														  	</div>
											    
											    			<div class="card-body">		
																
																<ul>
																															
															     	<c:forEach var="test" items="${Theme.listes}">								     	
															     	
																	    <li>
																	    	${fn:escapeXml(test.message)} 
																	    	<button name="deleteList" value="${test.id_liste}" class="btn btn-danger" type="submit">Supprimer</button>
																	    </li>
															     																	     		
															     	</c:forEach>
					
																</ul>
																
															</div>
															
														</div>
									     	
									     			</div>
									     			
									     			<div class="card-footer">
													    
													    <div class="row">
													    
													    	<div class="col">
									     						<button name="updateTheme" class="btn btn-warning btn-block" value="${Theme.id_theme}" type="submit">Modifier en => TEST!!</button>
													    	</div>
										
															<div class="col">
													    		<button name="deleteTheme" class="btn btn-danger btn-block" value="${Theme.id_theme}" type="submit">Supprimer</button>
													    	</div>
													    													    
													    </div>
													    
													</div>
									     			
									     		</div>
								     		
								     		</div>
								     		
								     	</div>
								     	
								     	<br>
								     	
								 	</c:forEach>
					     
					     		</div>
					     		
						     </div>
						     
					     </div>
					     
				     </div>
				     
				     <br>
				     
				</c:forEach>				
				
				<div class="row">
				
					<div class="col">
				
						<div class="card border-primary">
					  		
					  		<div class="card-header text-white bg-primary">
					  			<b>Ajouter un nouveau Types</b>
					  		</div>
					  		
					  		<div class="card-body">
					  		
					  			<div class="input-group">
							
									<input id="types" name="types" class="form-control" placeholder="Nouveau Types"/>
									<div class="input-group-append">
										<button name="buttonAdd" value="add" class="btn btn-success" type="submit">Ajouter</button>
									</div>
								
								</div>
								
							</div>
							
						</div>
					
					</div>
					
				</div>
				
				<br>
				
			</form>
		
		</div>
		
		<script src="resources/js/bootstrap.min.js"></script>
		
	</body>
	
</html>