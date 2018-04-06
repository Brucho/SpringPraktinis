<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Vartotojai</title>
	</head>
	<body>
		<h1>Automobiliu sarasas</h1>
		<table>
			<tr>
				<th>Id</th>
				<th>Pavadinimas</th>
				<th>Metai</th>
				<th>Modelis</th>
				<th>Type</th>
				<th>Transission</th>
			</tr>
			<#list cars as car>
				<tr>
					<td><a href="/FirstProject/car/${car.id}">${car.id}</a></td>
					<td>${car.name}</td>
					<td>${car.year}</td>
					<td>${car.model}</td>
					<td>${car.type}</td>
					<td>${car.transmission}</td>
					<td><a href="/FirstProject/delete/${car.id}">Trinti</a></td>
					<td><a href="/FirstProject/update/${car.id}">Redaguoti</a></td>
				</tr>
			</#list>
		</table>
		<p>
		<a href="/FirstProject/addCar">Sukurti</a>
	</body>
</html>
