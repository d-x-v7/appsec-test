//Example case 1
// ORIGINAL -- String sql_query = "SELECT * FROM users WHERE userid ='"+ username + "'" + " AND password='" + Base64.getEncoder().encodeToString(passwordString.getBytes()) + "'";
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
String url = request.getParameter("hidden_url"); // not so hidden...
URL url = new URL(url); // VIOLATION
InputStream is = url.openConnection().getContent();
//End of Example
