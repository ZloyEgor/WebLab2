package com.example.lab2;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Arrays;

@WebServlet("/calculate")
public class AreaCheckServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String x = request.getParameter("x_value").replace(",",".");
        String y = request.getParameter("y_value").replace(",",".");
        String r = request.getParameter("r_value").replace(",",".");
        long time = System.nanoTime();
        PrintWriter writer = response.getWriter();
//
//        String valid = main_validate(x,y,r);
//        if (valid.equals("Кайф")){
//
//            double new_x = Double.parseDouble(x);// парсим значения в дабл
//            double new_y = Double.parseDouble(y);
//            double new_r = Double.parseDouble(r);
//
//            String result = check_oblast(new_x,new_y,new_r);
//
//            Tochks tochks = new Tochks(new_x,new_y,new_r,String.valueOf((System.nanoTime() - time) / 1000) + " mcs", String.valueOf(LocalTime.now()),result);
//
//            Tochka_list tochka_list = (Tochka_list) request.getServletContext().getAttribute("tochka_list");
//
//            if (tochka_list == null){
//                tochka_list = new Tochka_list();
//            }
//            tochka_list.getInformationList().add(tochks);
//
//            ServletContext context = getServletContext();
//            context.setAttribute("serverInfo", valid);
//            request.setAttribute("tochka_list",tochka_list);
//            context.getRequestDispatcher("/index.jsp").forward(request,response);
//
//
//        }else{
//
//            request.getSession().setAttribute("serverInfo", valid);
//            getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
//
//        }
//    }
//
//    public String main_validate(String x, String y, String r){
//        if (!validate_for_X(x)){
//            return "Вы ввели некорректное значение";
//        }else if (!validate_for_Y(y)){
//            return "Вы ввели некорректное значение";
//        }else if (!validate_for_R(r)){
//            return "Вы ввели некорректное значение";
//        }else {
//            return "Кайф";
//        }
//    }
//
//    public boolean validate_for_X(String x){ // валидация для x
//        try {
//            Double[] array_of_x_value = {-4.0, -3.0, -2.0, -1.0, 0d, 1.0, 2.0, 3.0, 4.0}; // массив для сравнения
//            double xARR = Double.parseDouble(x); // парсим в добл
//            return Arrays.asList(array_of_x_value).contains(xARR);// asList фигачит листок(объект java.util.Arrays) из массива, а contains вернет true, если список содержит нужный элемент
//        }catch (NumberFormatException e){ // ошибка парса(например если будет null)
//            return false;
//        }
//    }
//
//    public boolean validate_for_Y(String y){// валидация для y
//        try {
//            double doub_y = Double.parseDouble(y);
//            return !(doub_y > 3) && !(doub_y < -5);
//        }catch (NumberFormatException e){
//            return false;
//        }
//    }
//
//    public boolean validate_for_R(String r){//валидация для r
//        try {
//            Double[] array_of_x_value = {1.0,2.0,3.0,4.0,5.0}; // массив для сравнения
//            double rARR = Double.parseDouble(r); // парсим в добл
//            return Arrays.asList(array_of_x_value).contains(rARR);// asList фигачит листок(объект java.util.Arrays) из массива, а contains вернет true, если список содержит нужный элемент
//        }catch (NumberFormatException e){ // ошибка парса(например если будет null)
//            return false;
//        }
//    }
//
//    public String first_oblast(double x, double y, double r){ // чек попадания в первой области
//        if (Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r, 2)) return "Балдеж";
//        return "Не балдеж";
//    }
//
//    public String second_oblast(double x, double y, double r){// чек попадания во второй области
//        if (x <= 0 && y >= 0 && y <= x + (r/2)) {
//            return "Есть пробитие";
//        }else{
//            return "Нету пробития";
//        }
//    }
//
//    public String third_oblast(double x, double y, double r){// чек попадания в третьей области
//        if (x >= -r && y >= -r/2){
//            return "Балдеж";
//        }else{
//            return "Не балдеж";
//        }
//    }
//
//    public String oblast_osi(double x, double y, double r){// чек попадания на осях
//        if (x == 0){
//            if (y <= r && y >= (-r/2)){
//                return "Балдеж";
//            }else {
//                return "Не балдеж";
//            }
//        }else{
//            if (Math.abs(x) <= r){
//                return "Балдеж";
//            }else{
//                return "Не балдеж";
//            }
//        }
//    }
//
//    public String check_oblast(double x, double y, double r){// определение области
//        if (x > 0 && y > 0 ){
//            return first_oblast(x, y, r);
//        }else if (x < 0 && y > 0){
//            return second_oblast(x, y, r);
//        }else if (x < 0 && y < 0){
//            return third_oblast(x, y, r);
//        }else if (x > 0 && y < 0){
//            return "Не балдеж";
//        }else {
//            return oblast_osi(x, y, r);
//        }
    }
}
