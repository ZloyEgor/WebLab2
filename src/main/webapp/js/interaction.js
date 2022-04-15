const SVG_SIZE = 300
// Функции для расчёта координат точки
function calculateX(x, r) {
    return (x - SVG_SIZE / 2) * r / 100;
}

function calculateY(y, r) {
    return (SVG_SIZE / 2 - y) * r / 100;
}

function doRequest(x, y, r) {
    let request = ("send?x_value=" + x + "&y_value=" + y + "&r_value=" + r);
    fetch(request)
        .then(response => response.text())
        .then(console.log(response));
}

$('svg').on("click", function (e) {
    const position = $('svg').offset();
    const rowX = e.pageX - position.left;
    const rowY = e.pageY - position.top;
    const r = parseFloat($('#r').val());
    const x = (((r / 50) * (rowX - SVG_SIZE / 2)) / 2).toFixed(2);
    const y = (((r / 50) * (SVG_SIZE / 2 - rowY)) / 2).toFixed(2);
    doRequest(x, y, r);
});