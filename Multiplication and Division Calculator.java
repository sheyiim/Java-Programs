<!DOCTYPE html>
<html>
<head>
    <title>Multiplication and Division Calculator</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
            margin-top: 80px;
        }

        .container {
            width: 350px;
            margin: auto;
            padding: 20px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0px 0px 10px gray;
        }

        h2 {
            color: darkblue;
        }

        input {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            font-size: 16px;
        }

        button {
            padding: 10px 20px;
            margin: 10px;
            font-size: 16px;
            background-color: royalblue;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background-color: darkblue;
        }

        #result {
            margin-top: 20px;
            color: green;
            font-size: 20px;
            font-weight: bold;
        }
    </style>

</head>

<body>

<div class="container">

    <h2>Multiplication and Division Calculator</h2>

    <input type="number" id="num1" placeholder="Enter First Number">

    <input type="number" id="num2" placeholder="Enter Second Number">

    <br>

    <button onclick="multiply()">Multiply</button>

    <button onclick="divide()">Divide</button>

    <h3 id="result"></h3>

</div>

<script>

function multiply() {

    let num1 = Number(document.getElementById("num1").value);
    let num2 = Number(document.getElementById("num2").value);

    let result = num1 * num2;

    document.getElementById("result").innerHTML =
    "Multiplication = " + result;
}

function divide() {

    let num1 = Number(document.getElementById("num1").value);
    let num2 = Number(document.getElementById("num2").value);

    if (num2 == 0) {

        document.getElementById("result").innerHTML =
        "Division by zero is not allowed.";

    } else {

        let result = num1 / num2;

        document.getElementById("result").innerHTML =
        "Division = " + result;
    }
}

</script>

</body>
</html>