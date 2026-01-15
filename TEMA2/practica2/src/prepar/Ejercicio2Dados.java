package prepar;

import java.util.Scanner;

public class Ejercicio2Dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. الإعدادات الأولية
        int vidaP1 = 40;
        int vidaP2 = 40;

        // متغيرات لمعرفة هل يملك اللاعب درعاً للجولة القادمة
        boolean tieneEscudoP1 = false;
        boolean tieneEscudoP2 = false;


        System.out.println("⚔️ أهلاً بكم في مملكة النرد السحرية! ⚔️");

        for (int i = 1; i <= 5; i++) {

            // رمي النرد (1 إلى 6)
            int dado1 = (int) (Math.random() * 6) + 1;
            int dado2 = (int) (Math.random() * 6) + 1;
            System.out.println("اللاعب 1: [" + dado1 + "]  vs  اللاعب 2: [" + dado2 + "]");


            int regla = (int) (Math.random() * 5) + 1;

// متغيرات لتخزين الضرر المؤقت لهذه الجولة
            int damageP1 = 0;
            int damageP2 = 0;

            switch (regla) {
                case 1: // 🔥 نرد النار
                    System.out.println("القاعدة: نرد النار (Fuego)!");
                    int diff = Math.abs(dado1 - dado2);

                    if (dado1 > dado2) {

                        damageP2 = diff;

                    } else if (dado1 < dado2) {
                        damageP1 = diff;
                    }


                    break;

                case 2: // 💚 نرد الشفاء
                    System.out.println("القاعدة: نرد الشفاء (Curación)!");
                    vidaP1 += dado1;
                    vidaP2 += dado2;
                    break;

                case 3: // 🥷 نرد السرقة
                    System.out.println("القاعدة: نرد السرقة (Robo)!");

                    if (dado1 > dado2) {
                        int robo = dado2 / 2;
                        vidaP1 += robo;
                        damageP2 = robo;

                    } else if (dado1 < dado2) {
                        int robo = dado1 / 2;
                        vidaP2 += robo;
                        damageP1 = robo;
                    }
                    break;

                case 4: // 💣 نرد الانفجار
                    System.out.println("القاعدة: نرد الانفجار (Explosivo)!");
                    if (dado1 == 6 && dado2 != 6) {
                        vidaP2 -= 6;
                        damageP2 = 10;
                    } else if (dado2 == 6 && dado1 != 6) {
                        vidaP1 -= 6;
                    }
                    break;

                case 5: // 🛡️ نرد الدرع
                    System.out.println("القاعدة: نرد الدرع (Escudo)!");
                    if (dado1 > dado2) {
                        tieneEscudoP1 = true;
                    } else if (dado1 < dado2) {
                        tieneEscudoP2 = true;

                    }
                    break;
            }

            if (damageP1 > 0) {
                if (tieneEscudoP1) {
                    System.out.println("🛡️ اللاعب 2 استخدم الدرع وتجنب الضرر!");
                    tieneEscudoP1 = false;
                } else {
                    vidaP1 -= damageP2;
                    System.out.println("💥 اللاعب 2 تلقى " + damageP2 + " ضرر.");
                }
            }

            if (damageP2 > 0) {
                if (tieneEscudoP2) {
                    System.out.println("🛡️ اللاعب 1 استخدم الدرع وتجنب الضرر!");
                    tieneEscudoP2 = false;
                } else {

                    vidaP2 -= damageP1;
                    System.out.println("💥 اللاعب 1 تلقى " + damageP1 + " ضرر.");
                }
            }

            // عرض الحياة الحالية
            System.out.println("******* " + i + " ******* ");
            System.out.println("❤️ الحياة: P1 (" + vidaP1 + ") - P2 (" + vidaP2 + ")");

            // شرط التوقف: الموت المفاجئ
            if (vidaP1 <= 0 || vidaP2 <= 0) {
                break;
            }

        }
    }
}
