public class Main {

    public static void main(String[] args) {

        String[] names = {
                "Anya",
                "Katya",
                "Sveta",
                "Olya",
                "Yura"
        };
        String newName = "Vova";

        String[] tmp = new String[names.length + 1];

        for (int i = 0; i < names.length; i++) { // перебираем все номера ячеек первого массива
            tmp[i] = names[i]; // возьми значение, которое лежит в этой ячейке массива
        } // и положи его в ячейку того же номера, но уже нового массива tmp
        tmp[tmp.length - 1] = newName; // кладём сюда новое имя из newName
        names = tmp;
    }
}
