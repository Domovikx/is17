function fullScreen() {
    var el = document.getElementById('calc'); // Получаем элемент
    if (el.webkitRequestFullscreen) el.webkitRequestFullscreen(); // Chrome, Opera, Safari
    else if (el.mozRequestFullScreen) el.mozRequestFullScreen(); // Firefox
    else if (el.msRequestFullscreen) el.msRequestFullscreen(); // Internet Explorer, Edge
    else if (el.requestFullscreen) el.requestFullscreen(); // Стандарт
}


window.onload = function () {
    console.log('window.onload');
    let input = document.getElementById('calc__input').value;
    if (input === "undefined") {
        console.log('test undefined');
        document.getElementById('calc__input').value = "";
    }
    if (input === "") {
        let l = localStorage["calcInputValue"];
        document.getElementById('calc__input').value = localStorage["calcInputValue"];
    }
};


window.onunload = function () {
    console.log('window.onunload');
    let input = document.getElementById('calc__input').value;
    console.log('input', input);
    localStorage.setItem("calcInputValue", input);
};



document.getElementById("calc").addEventListener("click", (e) => {

    // fullScreen();
    let input = document.getElementById('calc__input').value;
    const target = e.target.value;


    if (input === target | target === undefined) return;

    if (target === "=") {
        if (input[0] === '0') input = input.substring(1);

        const result = eval(input);
        if (result === undefined) return;
        document.getElementById('calc__input').value = result;
        return;
    }

    if (target === "C") {
        document.getElementById('calc__input').value = "";
        return;
    }

    if (target === "back") {
        document.getElementById('calc__input').value = input.slice(0, -1);
        return;
    }

    document.getElementById('calc__input').value += target;
});


function loadLocalStorage() {
    let input = document.getElementById('calc__input').value;
    if (input === "") {
        let l = localStorage["calcInputValue"];
        document.getElementById('calc__input').value = localStorage["calcInputValue"];
    }
}
loadLocalStorage();
