package com.company.lab.hw16;

import com.company.pr.hw16.*;

import javax.swing.*;
import java.awt.*;

public class OrdersUI extends JFrame {
    JButton internetButton, restaurantButton, listOrders, chooseDrink, chooseDish, enterData, back, readyOrder;
    JPanel jPanel1, jPanel2;
    choice_order choiceOrder;
    JTextField jTextField;
    OrderManager orderManager;
    InternetOrder internetOrder;
    RestaurantOrder restaurantOrder;

    OrdersUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        orderManager = new OrderManager();
        internetOrder = new InternetOrder();
        restaurantOrder = new RestaurantOrder();
        jPanel1 = create_pnl1();
        internetButton.addActionListener(actionEvent -> {
            remove(jPanel1);
            choiceOrder = new choice_order();
            choiceOrder.update_txt(internetOrder);
            add(choiceOrder);
            choiceOrder.choose_drink.addActionListener(ae1 -> {
                remove(choiceOrder);
                jPanel2 = create_Drink(internetOrder);
                add(jPanel2);
                repaint();
                revalidate();
                back.addActionListener(ae11 -> {
                    remove(jPanel2);
                    add(choiceOrder);
                    choiceOrder.update_txt(internetOrder);
                    SwingUtilities.updateComponentTreeUI(this);
                });
            });
            choiceOrder.choose_dish.addActionListener(actionEvent12 -> {
                remove(choiceOrder);
                jPanel2 = create_Dish(internetOrder);
                add(jPanel2);
                repaint();
                revalidate();
                back.addActionListener(ae121 -> {
                    remove(jPanel2);
                    add(choiceOrder);
                    choiceOrder.update_txt(internetOrder);
                    SwingUtilities.updateComponentTreeUI(this);
                });
            });
            choiceOrder.enter_data.addActionListener(actionEvent13 -> {
                remove(choiceOrder);
                jPanel2 = create_pnl3();
                add(jPanel2);
                repaint();
                revalidate();
                back.addActionListener(actionEvent131 -> {
                    remove(jPanel2);
                    add(choiceOrder);
                    repaint();
                });
                readyOrder.addActionListener(actionEvent1312 -> {
                    String s = jTextField.getText();
                    if (!s.equals("")) {
                        remove(jPanel2);
                        add(jPanel1);
                        orderManager.add(s, internetOrder);
                        JOptionPane.showMessageDialog(null, "Успешно",
                                "Информация", JOptionPane.INFORMATION_MESSAGE);
                        internetOrder = new InternetOrder();
                        repaint();
                    } else {
                        JOptionPane.showMessageDialog(null, "Неверный адрес",
                                "Информация", JOptionPane.ERROR_MESSAGE);
                    }
                });
            });
            choiceOrder.back.addActionListener(actionEvent14 -> {
                remove(choiceOrder);
                add(jPanel1);
                repaint();
                internetOrder = new InternetOrder();
            });
            repaint();
            revalidate();
        });
        restaurantButton.addActionListener(actionEvent -> {
            remove(jPanel1);
            choiceOrder = new choice_order();
            choiceOrder.update_txt(restaurantOrder);
            add(choiceOrder);
            choiceOrder.choose_drink.addActionListener(actionEvent16 -> {
                remove(choiceOrder);
                jPanel2 = create_Drink(restaurantOrder);
                add(jPanel2);
                repaint();
                revalidate();
                back.addActionListener(ae151 -> {
                    remove(jPanel2);
                    choiceOrder.update_txt(restaurantOrder);
                    add(choiceOrder);
                    SwingUtilities.updateComponentTreeUI(this);
                });
            });
            choiceOrder.choose_dish.addActionListener(actionEvent16 -> {
                remove(choiceOrder);
                jPanel2 = create_Dish(restaurantOrder);
                add(jPanel2);
                repaint();
                revalidate();
                back.addActionListener(actionEvent161 -> {
                    remove(jPanel2);
                    choiceOrder.update_txt(restaurantOrder);
                    add(choiceOrder);
                    SwingUtilities.updateComponentTreeUI(this);
                });
            });
            choiceOrder.enter_data.addActionListener(actionEvent17 -> {
                remove(choiceOrder);
                jPanel2 = createPanel4();
                add(jPanel2);
                repaint();
                revalidate();
                back.addActionListener(actionEvent171 -> {
                    remove(jPanel2);
                    add(choiceOrder);
                    repaint();
                });
                readyOrder.addActionListener(actionEvent1712 -> {
                    String s = jTextField.getText();
                    if (!s.equals("")) {
                        try {
                            int k = Integer.parseInt(s);
                            try {
                                orderManager.add(k, restaurantOrder);
                                remove(jPanel2);
                                add(jPanel1);
                                repaint();
                                JOptionPane.showMessageDialog(null, "Успешно",
                                        "Информация", JOptionPane.INFORMATION_MESSAGE);
                                restaurantOrder = new RestaurantOrder();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Стол занят",
                                        "Информация", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Такого стола нет",
                                    "Информация", JOptionPane.ERROR_MESSAGE);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Такого стола нет",
                                "Информация", JOptionPane.ERROR_MESSAGE);
                    }
                });
            });
            choiceOrder.back.addActionListener(actionEvent18 -> {
                remove(choiceOrder);
                add(jPanel1);
                repaint();
                restaurantOrder = new RestaurantOrder();
            });
            repaint();
            revalidate();
        });
        listOrders.addActionListener(ae -> {
            String s = orderManager.getAllOrders();
            if (!s.equals("")) {
                JOptionPane.showMessageDialog(null, s, "Информация",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Заказов нет",
                        "Информация", JOptionPane.ERROR_MESSAGE);
            }
        });
        add(jPanel1);
        setSize(600, 600);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public JPanel create_pnl1() {
        JPanel pnl = new JPanel();
        pnl.setLayout(null);

        JLabel text1 = new JLabel("Оформление заказа");
        Font fn = new Font("Times New Roman", Font.BOLD, 30);
        text1.setFont(fn);
        internetButton = new JButton("Заказать в интернете");
        restaurantButton = new JButton("Заказать в ресторане");
        listOrders = new JButton("Список");

        text1.setBounds(160, 80, 300, 80);
        internetButton.setBounds(200, 180, 200, 80);
        restaurantButton.setBounds(200, 280, 200, 80);
        listOrders.setBounds(200, 380, 200, 80);

        pnl.add(text1);
        pnl.add(internetButton);
        pnl.add(restaurantButton);
        pnl.add(listOrders);

        return pnl;
    }

    public static class choice_order extends JPanel {
        JButton choose_drink, choose_dish, enter_data, back;
        JLabel tx1, tx2, txt;

        public choice_order() {
            this.setLayout(null);
            choose_drink = new JButton("Добавить напиток");
            choose_dish = new JButton("Добавить блюдо");
            enter_data = new JButton("Заказать");
            back = new JButton("Отмена");
            Font fn = new Font("Times New Roman", Font.BOLD, 40);
            tx1 = new JLabel("Ваш заказ: ");
            tx1.setFont(fn);
            tx2 = new JLabel();
            txt = new JLabel();
        }

        public void update_txt(InternetOrder io) {
            removeAll();

            StringBuilder s = new StringBuilder();
            String s1 = "Итого: ";

            Font fn1 = new Font("Times New Roman", Font.BOLD, 18);
            txt.setFont(fn1);

            Drink[] drinks = io.getDrinks();
            Dish[] dishes = io.getDish();
            int k = 0;
            for (Drink drink : drinks) {
                if (drink != null) {
                    s.append(drink).append(" x ").append(io.getOrderQuantity(drink.getName()));
                    txt = new JLabel(s.toString());
                    txt.setBounds(340, 120 + 20 * k, 300, 80);
                    add(txt);
                    s = new StringBuilder();
                    k++;
                }
            }
            for (Dish dish : dishes) {
                if (dish != null) {
                    s.append(dish).append(" x ").append(io.getOrderQuantity(dish.getName()));
                    txt = new JLabel(s.toString());
                    txt.setBounds(340, 120 + 20 * k, 300, 80);
                    add(txt);
                    s = new StringBuilder();
                    k++;
                }
            }
            s1 += io.priceTotal();
            tx2.setText(s1);
            Font fn2 = new Font("Times New Roman", Font.BOLD, 25);
            tx2.setFont(fn2);

            tx1.setBounds(340, 70, 300, 80);
            tx2.setBounds(350, 380, 300, 80);
            choose_drink.setBounds(100, 80, 200, 80);
            choose_dish.setBounds(100, 180, 200, 80);
            enter_data.setBounds(100, 280, 200, 80);
            back.setBounds(100, 380, 200, 80);

            add(tx1);
            add(tx2);
            add(txt);
            add(choose_drink);
            add(choose_dish);
            add(enter_data);
            add(back);
        }

        public void update_txt(RestaurantOrder ro) {
            removeAll();
            StringBuilder s = new StringBuilder();
            String s1 = "Итого: ";

            txt.setText(s.toString());
            Font fn1 = new Font("Times New Roman", Font.BOLD, 18);
            txt.setFont(fn1);

            for (int i = 0; i < ro.getCount(); i++) {
                Drink[] drinks = ro.getDrinks();
                Dish[] dishes = ro.getDishes();
                int k = 0;
                for (Drink drink : drinks) {
                    if (drink != null) {
                        s.append(drink).append(" x ").append(ro.drinkQuantity(drink.getName()));
                        txt = new JLabel(s.toString());
                        txt.setBounds(340, 120 + 20 * k, 300, 80);
                        add(txt);
                        s = new StringBuilder();
                        k++;
                    }
                }
                for (Dish dish : dishes) {
                    if (dish != null) {
                        s.append(dish).append(" x ").append(ro.dishQuantity(dish.getName()));
                        txt = new JLabel(s.toString());
                        txt.setBounds(340, 120 + 20 * k, 300, 80);
                        add(txt);
                        s = new StringBuilder();
                        k++;
                    }
                }
            }
            s1 += ro.priceTotal();
            tx2.setText(s1);
            Font fn2 = new Font("Times New Roman", Font.BOLD, 25);
            tx2.setFont(fn2);


            tx1.setBounds(340, 70, 300, 80);
            tx2.setBounds(350, 380, 300, 80);
            choose_drink.setBounds(100, 80, 200, 80);
            choose_dish.setBounds(100, 180, 200, 80);
            enter_data.setBounds(100, 280, 200, 80);
            back.setBounds(100, 380, 200, 80);

            add(tx1);
            add(tx2);
            add(txt);
            add(choose_drink);
            add(choose_dish);
            add(enter_data);
            add(back);
        }
    }

    public JPanel create_pnl3() {
        JPanel pnl = new JPanel();
        pnl.setLayout(null);

        jTextField = new JTextField(15);
        readyOrder = new JButton("Готово");
        back = new JButton("Отмена");
        JLabel tx1 = new JLabel("Введите адрес");
        Font fn = new Font("Times New Roman", Font.BOLD, 45);
        tx1.setFont(fn);

        tx1.setBounds(160, 130, 300, 80);
        jTextField.setBounds(200, 240, 200, 40);
        readyOrder.setBounds(200, 300, 200, 80);
        back.setBounds(200, 400, 200, 80);

        pnl.add(tx1);
        pnl.add(jTextField);
        pnl.add(readyOrder);
        pnl.add(back);

        return pnl;
    }

    public JPanel createPanel4() {
        JPanel pnl = new JPanel();
        pnl.setLayout(null);

        jTextField = new JTextField(15);
        readyOrder = new JButton("Готово");
        back = new JButton("Отмена");
        JLabel tx1 = new JLabel("Введите номер");
        JLabel tx2 = new JLabel("стола");
        Font fn = new Font("Times New Roman", Font.BOLD, 40);
        tx1.setFont(fn);
        tx2.setFont(fn);

        tx1.setBounds(170, 100, 300, 80);
        tx2.setBounds(250, 145, 300, 80);
        jTextField.setBounds(200, 240, 200, 40);
        readyOrder.setBounds(200, 300, 200, 80);
        back.setBounds(200, 400, 200, 80);

        pnl.add(tx1);
        pnl.add(tx2);
        pnl.add(jTextField);
        pnl.add(readyOrder);
        pnl.add(back);

        return pnl;
    }

    public JPanel create_Drink(InternetOrder internetOrder) {
        JPanel pnl = new JPanel();
        pnl.setLayout(null);

        JButton appleJuice = new JButton("Яблочный сок");
        JButton teaEralGray = new JButton("Чай Эрл Грэй");
        JButton coffeeAmericano = new JButton("Американо");
        JButton beerBud = new JButton("Пиво Bud");
        JButton whiteWine = new JButton("Белое вино");
        JButton CubaLibre = new JButton("Красное вино");
        JButton LongIslen = new JButton("Лонг Айленд");
        JButton redWine = new JButton("Красное вино");
        JButton Cola = new JButton("Кола");
        JButton Fanta = new JButton("Фанта");
        JButton Sprite = new JButton("Спрайт");
        back = new JButton("Закончить выбор");

        appleJuice.setBounds(200, 30, 200, 30);
        teaEralGray.setBounds(200, 70, 200, 30);
        coffeeAmericano.setBounds(200, 110, 200, 30);
        beerBud.setBounds(200, 150, 200, 30);
        whiteWine.setBounds(200, 190, 200, 30);
        CubaLibre.setBounds(200, 230, 200, 30);
        LongIslen.setBounds(200, 270, 200, 30);
        redWine.setBounds(200, 310, 200, 30);
        Cola.setBounds(200, 350, 200, 30);
        Fanta.setBounds(200, 390, 200, 30);
        Sprite.setBounds(200, 430, 200, 30);
        back.setBounds(200, 470, 200, 30);

        pnl.add(appleJuice);
        pnl.add(teaEralGray);
        pnl.add(coffeeAmericano);
        pnl.add(beerBud);
        pnl.add(whiteWine);
        pnl.add(CubaLibre);
        pnl.add(LongIslen);
        pnl.add(redWine);
        pnl.add(Cola);
        pnl.add(Fanta);
        pnl.add(Sprite);
        pnl.add(back);

        appleJuice.addActionListener(actionEvent -> {
            try {
                Drink juice = new Drink(appleJuice.getText(), "0.8", 65);
                internetOrder.add(juice);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        teaEralGray.addActionListener(actionEvent -> {
            try {
                Drink erlGray = new Drink(teaEralGray.getText(), "0.3", 75);
                internetOrder.add(erlGray);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        coffeeAmericano.addActionListener(actionEvent -> {
            try {
                Drink americano = new Drink(coffeeAmericano.getText(), "0.4", 95);
                internetOrder.add(americano);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        beerBud.addActionListener(actionEvent -> {
            try {
                Drink beer = new Drink(beerBud.getText(), "0.5", 75);
                internetOrder.add(beer);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        whiteWine.addActionListener(actionEvent -> {
            try {
                Drink white = new Drink(whiteWine.getText(), "0.5", 85);
                internetOrder.add(white);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        CubaLibre.addActionListener(actionEvent -> {
            try {
                Drink cuba = new Drink(CubaLibre.getText(), "0.4", 210);
                internetOrder.add(cuba);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        LongIslen.addActionListener(actionEvent -> {
            try {
                Drink longIsland = new Drink(LongIslen.getText(), "0.4", 240);
                internetOrder.add(longIsland);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        redWine.addActionListener(actionEvent -> {
            try {
                Drink red = new Drink(redWine.getText(), "0.5", 85);
                internetOrder.add(red);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        Cola.addActionListener(actionEvent -> {
            try {
                Drink cola = new Drink(Cola.getText(), "0.3", 45);
                internetOrder.add(cola);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        Fanta.addActionListener(actionEvent -> {
            try {
                Drink fanta = new Drink(Fanta.getText(), "0.3", 45);
                internetOrder.add(fanta);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        Sprite.addActionListener(actionEvent -> {
            try {
                Drink sprite = new Drink(Sprite.getText(), "0.3", 45);
                internetOrder.add(sprite);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });

        return pnl;
    }

    public JPanel create_Drink(RestaurantOrder ro) {
        JPanel pnl = new JPanel();
        pnl.setLayout(null);

        JButton appleJuice = new JButton("Яблочный сок");
        JButton teaEralGray = new JButton("Чай Эрл Грэй");
        JButton coffeeAmericano = new JButton("Американо");
        JButton beerBud = new JButton("Пиво Bud");
        JButton whiteWine = new JButton("Белое вино");
        JButton CubaLibre = new JButton("Красное вино");
        JButton LongIslen = new JButton("Лонг Айленд");
        JButton redWine = new JButton("Красное вино");
        JButton Cola = new JButton("Кола");
        JButton Fanta = new JButton("Фанта");
        JButton Sprite = new JButton("Спрайт");
        back = new JButton("Закончить выбор");

        appleJuice.setBounds(200, 30, 200, 30);
        teaEralGray.setBounds(200, 70, 200, 30);
        coffeeAmericano.setBounds(200, 110, 200, 30);
        beerBud.setBounds(200, 150, 200, 30);
        whiteWine.setBounds(200, 190, 200, 30);
        CubaLibre.setBounds(200, 230, 200, 30);
        LongIslen.setBounds(200, 270, 200, 30);
        redWine.setBounds(200, 310, 200, 30);
        Cola.setBounds(200, 350, 200, 30);
        Fanta.setBounds(200, 390, 200, 30);
        Sprite.setBounds(200, 430, 200, 30);
        back.setBounds(200, 470, 200, 30);

        pnl.add(appleJuice);
        pnl.add(teaEralGray);
        pnl.add(coffeeAmericano);
        pnl.add(beerBud);
        pnl.add(whiteWine);
        pnl.add(CubaLibre);
        pnl.add(LongIslen);
        pnl.add(redWine);
        pnl.add(Cola);
        pnl.add(Fanta);
        pnl.add(Sprite);
        pnl.add(back);

        appleJuice.addActionListener(actionEvent -> {
            try {
                Drink juice = new Drink(appleJuice.getText(), "0.8", 65);
                internetOrder.add(juice);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        teaEralGray.addActionListener(actionEvent -> {
            try {
                Drink erlGray = new Drink(teaEralGray.getText(), "0.3", 75);
                internetOrder.add(erlGray);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        coffeeAmericano.addActionListener(actionEvent -> {
            try {
                Drink americano = new Drink(coffeeAmericano.getText(), "0.4", 95);
                internetOrder.add(americano);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        beerBud.addActionListener(actionEvent -> {
            try {
                Drink beer = new Drink(beerBud.getText(), "0.5", 75);
                internetOrder.add(beer);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        whiteWine.addActionListener(actionEvent -> {
            try {
                Drink white = new Drink(whiteWine.getText(), "0.5", 85);
                internetOrder.add(white);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        CubaLibre.addActionListener(actionEvent -> {
            try {
                Drink cuba = new Drink(CubaLibre.getText(), "0.4", 210);
                internetOrder.add(cuba);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        LongIslen.addActionListener(actionEvent -> {
            try {
                Drink longIsland = new Drink(LongIslen.getText(), "0.4", 240);
                internetOrder.add(longIsland);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        redWine.addActionListener(actionEvent -> {
            try {
                Drink red = new Drink(redWine.getText(), "0.5", 85);
                internetOrder.add(red);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        Cola.addActionListener(actionEvent -> {
            try {
                Drink cola = new Drink(Cola.getText(), "0.3", 45);
                internetOrder.add(cola);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        Fanta.addActionListener(actionEvent -> {
            try {
                Drink fanta = new Drink(Fanta.getText(), "0.3", 45);
                internetOrder.add(fanta);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });
        Sprite.addActionListener(actionEvent -> {
            try {
                Drink sprite = new Drink(Sprite.getText(), "0.3", 45);
                internetOrder.add(sprite);
            } catch (Exception e) {
                System.out.println("Такого напитка нет");
            }
        });

        return pnl;
    }

    public JPanel create_Dish(InternetOrder io) {
        JPanel pnl = new JPanel();
        pnl.setLayout(null);

        JButton steak = new JButton("Стейк");
        JButton fries = new JButton("Картошка фри");
        JButton dumplings = new JButton("Пельмени");
        JButton mozzarella = new JButton("Курица");
        JButton borsch = new JButton("Борщ");
        back = new JButton("Закончить выбор");

        steak.setBounds(200, 40, 200, 60);
        fries.setBounds(200, 120, 200, 60);
        dumplings.setBounds(200, 200, 200, 60);
        mozzarella.setBounds(200, 280, 200, 60);
        borsch.setBounds(200, 360, 200, 60);
        back.setBounds(200, 440, 200, 60);

        pnl.add(steak);
        pnl.add(fries);
        pnl.add(dumplings);
        pnl.add(mozzarella);
        pnl.add(borsch);
        pnl.add(back);

        steak.addActionListener(ae -> {
            try {
                Dish steak1 = new Dish("Стейк", "тарелка", 400);
                io.add(steak1);
            } catch (Exception e) {
                System.out.println("Такого блюда нет");
            }
        });
        fries.addActionListener(ae -> {
            try {
                Dish fries1 = new Dish("фри", "тарелка", 100);
                io.add(fries1);
            } catch (Exception e) {
                System.out.println("Такого блюда нет");
            }
        });
        dumplings.addActionListener(ae -> {
            try {
                Dish dumplings1 = new Dish("Пельмени", "тарелка", 150);
                io.add(dumplings1);
            } catch (Exception e) {
                System.out.println("Такого блюда нет");
            }
        });
        mozzarella.addActionListener(ae -> {
            try {
                Dish mozzarella1 = new Dish("Курица", "тарелка", 250);
                io.add(mozzarella1);
            } catch (Exception e) {
                System.out.println("Такого блюда нет");
            }
        });
        borsch.addActionListener(ae -> {
            try {
                Dish borsch1 = new Dish("Борщ", "тарелка", 120);
                io.add(borsch1);
            } catch (Exception e) {
                System.out.println("Такого блюда нет");
            }
        });

        return pnl;
    }

    public JPanel create_Dish(RestaurantOrder ro) {
        JPanel pnl = new JPanel();
        pnl.setLayout(null);

        JButton steak = new JButton("Стейк");
        JButton fries = new JButton("Картошка фри");
        JButton dumplings = new JButton("Пельмени");
        JButton mozzarella = new JButton("Курица");
        JButton borsch = new JButton("Борщ");
        back = new JButton("Закончить выбор");

        steak.setBounds(200, 40, 200, 60);
        fries.setBounds(200, 120, 200, 60);
        dumplings.setBounds(200, 200, 200, 60);
        mozzarella.setBounds(200, 280, 200, 60);
        borsch.setBounds(200, 360, 200, 60);
        back.setBounds(200, 440, 200, 60);

        pnl.add(steak);
        pnl.add(fries);
        pnl.add(dumplings);
        pnl.add(mozzarella);
        pnl.add(borsch);
        pnl.add(back);

        steak.addActionListener(ae -> {
            try {
                Dish steak1 = new Dish("Стейк", "тарелка", 400);
                ro.add(steak1);
            } catch (Exception e) {
                System.out.println("Такого блюда нет");
            }
        });
        fries.addActionListener(ae -> {
            try {
                Dish fries1 = new Dish("Фри", "тарелка", 100);
                ro.add(fries1);
            } catch (Exception e) {
                System.out.println("Такого блюда нет");
            }
        });
        dumplings.addActionListener(ae -> {
            try {
                Dish dumplings1 = new Dish("Пельмени", "тарелка", 150);
                ro.add(dumplings1);
            } catch (Exception e) {
                System.out.println("Такого блюда нет");
            }
        });
        mozzarella.addActionListener(ae -> {
            try {
                Dish mozzarella1 = new Dish("Курица", "тарелка", 250);
                ro.add(mozzarella1);
            } catch (Exception e) {
                System.out.println("Такого блюда нет");
            }
        });
        borsch.addActionListener(ae -> {
            try {
                Dish borsch1 = new Dish("Борщ", "тарелка", 120);
                ro.add(borsch1);
            } catch (Exception e) {
                System.out.println("Такого блюда нет");
            }
        });

        return pnl;
    }

}
