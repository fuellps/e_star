//订单提交按钮
var orderButton = document.getElementById('button-place-order');
var orderSuccessBox = document.getElementById('alertBox');

orderButton.addEventListener('click', function () {
    orderSuccessBox.style.display = 'block';
    setTimeout(function () {
        orderSuccessBox.style.display = 'none';
    }, 1200);
});

//email提交按钮
document.getElementById('submitButton').addEventListener('click', function () {
    // 检查是否已填写
    var emailInput = document.getElementById('emailInput');
    if (emailInput.value.trim() === '') {
        alert('请填写邮箱地址！'); //如果邮箱为空，弹出警告
        return;
    }

    var successAlert = document.getElementById('alert-email-box');
    successAlert.style.display = 'block';

    // 延迟几秒后隐藏提示框
    setTimeout(function () {
        successAlert.style.display = 'none';
    }, 1200); // 3秒后隐藏提示框
});

