<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Create Car</title>
    </head>

    <body>
        <h1>Create Car</h1>

        <form action="/create-car" method="post">

            <label>Car Name</label>
            <input type="text" name="car-name" id="car-name" value="${param.name}">
            <input type="hidden" id="id" name="id" value="${param.id}">

            <button type="submit">Save</button>
        </form>

        <div>
            <h1>Cars</h1>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                </tr>
                <c:forEach var="car" items="${cars}">
                    <tr>
                        <td></td>
                        <td>${car.name}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </body>
</html>