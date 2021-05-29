<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="RegisterPlayer" id="register"
		name="Player form registration">
		<label>Enter name</label> <input type="text" id="name" name="name"
			placeholder="Enter name"> <br> <br> <label>Enter
			age</label> <input type="number" id="age" name="age" placeholder="Enter age">
		<br> <br> <label>Enter gender</label> <input type="text"
			id="gender" name="gender" placeholder="Enter gender"> <br>
		<br> <label>Enter team</label> <input type="text" id="team"
			name="team" placeholder="Enter team">
		<button id="button" type="submit">submit</button>

	</form>
	

<form action="DisplayPlayers" id="view" name="view">
<button id="viewButton" type="submit"> View Players</button>


 </form>

</body>
</html>