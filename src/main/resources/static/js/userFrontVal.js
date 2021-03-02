var num = document.getElementById("primAccBalance");
const balance = parseInt(num.innerHTML);
if (balance < 0) {
    num.style.color = "red";
}

var num1 = document.getElementById("saveAccBalance");
const balance1 = parseInt(num1.innerHTML);
if (balance1 < 0) {
    num1.style.color = "red";
}