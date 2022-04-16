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
        .then(response => addToTable(response));
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

function addToTable(response) {
    console.log(response)
    response = JSON.parse(response);
    console.log(response);
    $('tbody')
        .append($('<tr>')
            .append($('<td>')
                .text(Number.isInteger(response['x']) ? parseFloat(response['x']).toFixed(1) : response['x'])
            )
            .append($('<td>')
                .text(Number.isInteger(response['y']) ? parseFloat(response['y']).toFixed(1) : response['y'])
            )
            .append($('<td>')
                .text(Number.isInteger(response['r']) ? parseFloat(response['r']).toFixed(1) : response['r'])
            )
            .append($('<td>')
                .text(response['result'])
            ).append($('<td>')
                .text(response['localTime'])
            ).append($('<td>')
                .text(response['executionTime'])
            ));
}