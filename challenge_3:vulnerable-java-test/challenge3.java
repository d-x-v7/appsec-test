//Example case 1

// SQL Injection Vulnerability. This type of vulnerability can be remediated by using parametized code or PreparedStatements. 
// ORIGINAL -- String sql_query = "SELECT * FROM users WHERE userid ='"+ username + "'" + " AND password='" + Base64.getEncoder().encodeToString(passwordString.getBytes()) + "'";
//// The query above is concatenated with user input being directly connected to the other parts of the query. Using a placeholder instead of a "'" will reduce the liklihood of success. 
String sql_query = "SELECT * FROM users WHERE userid = ?"+ username + "'" + " AND password='" + Base64.getEncoder().encodeToString(passwordString.getBytes()) + "'";
Statement stmt = connection.createStatement();
ResultSet rs = stmt.executeQuery(query);
//End of example


//Example case 2
public void postToMessageBoard(MessageBoard mb){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s = br.readLine(); //VIOLATION
	mb.post(s)
}
//End of Example

//Example case 3
// This looks to be vulnerable to Server Side Request Forgery, since the user input is directly interpretted in the code. 
String url = request.getParameter("hidden_url"); // not so hidden...
URL url = new URL(url); // VIOLATION
InputStream is = url.openConnection().getContent();
//End of Example
~                                                                                                                                                        
~                                                                                                                                                        
~                                                                                                                                                        
~                                                                                                                                                        
~                                                                                                                                                        
~                                                                                                                                                        
~                                                                                                                                                        
~                                                                                                                                                        
~                                        
