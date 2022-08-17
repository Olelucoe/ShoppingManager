public class RemoveName {
    public static void main(String[] args) {

        String[] names = {
                "Anya",
                "Katya",
                "Sveta",
                "Olya",
                "Yura"
        };
        String removeName = "Sveta";
        String[] tmp = new String[names.length - 1];
        int index = 0;
        for (String name : names) {
            if (!name.equals(removeName)) {
                tmp[index] = name;
                index++;
            }
        }
        names = tmp;
    }
}
