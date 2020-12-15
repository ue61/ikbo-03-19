package com.company.lab.hw12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class RegularString {
        public static void main(String[] args) {
            System.out.println("Пароль считается надежным, если он состоит из 8 или более символов.\n" +
                    "Где символом может быть цифрой, английской буквой, и знаком подчеркивания.\n" +
                    "Пароль должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру.");
            System.out.println("Примеры надежных паролей: F032_Password, TrySpy_1");
            System.out.println("Примеры ненадежных паролей: smart_pass, A007");

            System.out.println("Введите надежный пароль:");
            Scanner scanner = new Scanner(System.in);

            String password = scanner.nextLine();

            // больше или ровно 8 символов (?=^.{8,}$)
            // можно большие буквы (минимум 1) (?=.*[A-Z])
            // можно маленькие английские буквы (минимум 1) (?=.*[a-z])
            // можно цифры (минимум 1): (?=.*\d)
            // нет пробелов: (?!.*\s)
            String regex = "(?=^.{8,}$)^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?!.*\\s).*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            System.out.println(matcher.matches());


        }
    }

