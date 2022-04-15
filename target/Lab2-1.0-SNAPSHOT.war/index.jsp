<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Lab № 2</title>
    <link rel="stylesheet" href="style.css">
    <script src="js/jquery-3.6.0.js"></script>
</head>
<body>
<header>
    <div class="header_content">
        <div>Стуков Егор Александрович<br>
            Антонов Всеволод Владимирович
        </div>
        <div>P3232<br>P3233</div>
        <div>34601</div>
    </div>
</header>
<article>
    <form class="form" name="form" method="get">
        <div class="selectors">
            <div class="x-selector">
                <label class="selector-description">Введите значение X:</label>
                <div class="checkbox-with-label">
                    <input type="checkbox" id="-3_x" name="x_value" value="-3">
                    <label for="-3_x">-3</label>
                </div>
                <div class="checkbox-with-label">
                    <input type="checkbox" id="-2_x" name="x_value" value="-2">
                    <label for="-2_x">-2</label>
                </div>
                <div class="checkbox-with-label">
                    <input type="checkbox" id="-1_x" name="x_value" value="-1">
                    <label for="-1_x">-1</label>
                </div>
                <div class="checkbox-with-label">
                    <input type="checkbox" id="0_x" name="x_value" value="0">
                    <label for="0_x">0</label>
                </div>
                <div class="checkbox-with-label">
                    <input type="checkbox" id="1_x" name="x_value" value="1">
                    <label for="1_x">1</label>
                </div>
                <div class="checkbox-with-label">
                    <input type="checkbox" id="2_x" name="x_value" value="2">
                    <label for="2_x">2</label>
                </div>
                <div class="checkbox-with-label">
                    <input type="checkbox" id="3_x" name="x_value" value="3">
                    <label for="3_x">3</label>
                </div>
                <div class="checkbox-with-label">
                    <input type="checkbox" id="4_x" name="x_value" value="4">
                    <label for="4_x">4</label>
                </div>
                <div class="checkbox-with-label">
                    <input type="checkbox" id="5_x" name="x_value" value="5">
                    <label for="5_x">5</label>
                </div>
            </div>
            <div class="y-selector">
                <div class="selector-description">Выберите значение Y:</div>
                <input type="text" id="y" name="y_value">
            </div>
            <div class="r-selector">
                <div class="selector-description">Выберите значение параметра R:</div>
                <select name="r_value" id="r">
                    <option value="1">1</option>
                    <option value="1.5">1.5</option>
                    <option value="2">2</option>
                    <option value="2.5">2.5</option>
                    <option value="3">3</option>
                </select>
            </div>
            <button class="submit-button" type="submit">Проверить</button>
        </div>
        <canvas class="task-image" width="500" height="500" id="canvas"></canvas>
    </form>
    <table class="results" id="results">
        <thead>
        <tr>
            <th>X</th>
            <th>Y</th>
            <th>R</th>
            <th>Попадание</th>
            <th>Время обращения</th>
            <th>Время работы скрипта</th>
        </tr>
        </thead>
        <tbody>

        </tbody>
    </table>
</article>
<script src="js/validation.js"></script>
<script></script>
</body>
</html>