public class Main {
    public static void main(String[] args) {

        int vasyaAge = 30;
        int katyAge = 40;
        int mishaAge = 50;
        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasyaAge >= 0 && katyAge >= 0 && mishaAge >= 0) {
            if (vasyaAge == katyAge && katyAge == mishaAge) {
                min = vasyaAge;
                middle = katyAge;
                max = mishaAge;
            } else if (vasyaAge == katyAge && vasyaAge > mishaAge) {
                min = mishaAge;
                middle = vasyaAge;
                max = katyAge;
            } else if (vasyaAge == katyAge && vasyaAge < mishaAge) {
                min = vasyaAge;
                middle = katyAge;
                max = mishaAge;
            } else if (vasyaAge == mishaAge && vasyaAge > katyAge) {
                min = katyAge;
                middle = vasyaAge;
                max = mishaAge;
            } else if (vasyaAge == mishaAge && vasyaAge < katyAge) {
                min = vasyaAge;
                middle = mishaAge;
                max = katyAge;
            } else if (katyAge == mishaAge && katyAge > vasyaAge) {
                min = vasyaAge;
                middle = katyAge;
                max = mishaAge;
            } else if (katyAge == mishaAge && katyAge < vasyaAge) {
                min = katyAge;
                middle = mishaAge;
                max = vasyaAge;
            } else if (katyAge > mishaAge) {
                if (katyAge > vasyaAge) {
                    if (mishaAge > vasyaAge) {
                        min = vasyaAge;
                        middle = mishaAge;
                        max = katyAge;
                    } else {
                        min = mishaAge;
                        middle = vasyaAge;
                        max = katyAge;
                    }
                } else {
                    min = mishaAge;
                    middle = katyAge;
                    max = vasyaAge;
                }
            } else if (katyAge < mishaAge) {
                if (katyAge < vasyaAge) {
                    if (mishaAge < vasyaAge) {
                        min = katyAge;
                        middle = mishaAge;
                        max = vasyaAge;
                    } else {
                        min = katyAge;
                        middle = vasyaAge;
                        max = mishaAge;
                    }
                } else {
                    min = vasyaAge;
                    middle = katyAge;
                    max = mishaAge;
                }
            }
            System.out.println("Minimal age: " + min);
            System.out.println("Middle age: " + middle);
            System.out.println("Maximum age: " + max);

        } else {
            System.out.println("Некорректно указан возраст");
        }
    }
}
