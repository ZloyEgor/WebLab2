function validate() {
    return !(!checkX() || !checkY());
}

function checkX() {
    let selected = $("input[name='x_value']:checked");
    if (selected.length > 1) {
        alert('Select only one value!');
        console.log(selected);
        console.log(selected.length);
        return false;
    } else if(selected.length === 0) {
        alert('Select X value');
        console.log(selected);
        console.log(selected.length);
        return false;
    } else if (selected.length === 1)
        return true;
    else {
        console.log(selected);
        console.log(selected.length);
        return false;
    }
}

function checkY() {
    const minValue = -5;
    const maxValue = 3;

    let yValue = $('#y').val();
    if (yValue === '') {
        alert("Enter Y value");
        return false;
    }
    yValue = parseFloat(yValue.replace(",", "."));
    if (isNaN(yValue)) {
        alert("Invalid Y value");
        return false;
    } else if (yValue <= minValue || yValue >= maxValue) {
        alert("Invalid Y value:\n" +
            `Minimal value: ${minValue} \n` +
            `Maximal value: ${maxValue}`);
        return false;
    }
    return true;
}


function getData() {
    let x = parseInt($("input[name='x_value']:checked:first").val());
    let y = parseFloat($('#y').val().replace(",", "."));
    let r = parseFloat($('#r').val());

    return {
        "x_value": x,
        "y_value": y,
        "r_value": r
    };
}

// $('.form').on("submit", function (event) {
//     if (validate()) {
//         event.preventDefault();
//         let data = getData();
//         $.ajax( {
//             url: 'send',
//             type: 'GET',
//             data: data,
//             success: function (data) {
//
//             },
//             error: function (jqXhr, textStatus, errorMessage) { // error callback
//                 console.log(errorMessage);
//                 alert("There's an error on server");
//             }
//         });
//     }
// });
