public class Euro2021 {
    public static void main(String[] args) {
        String[] club = {"Switzerland", "Spain", "Belgium", "Italy"};
        DanhSach(club);
    }
    public static void DanhSach(String[] club){
        for(int i = 0; i<club.length;i++){
            for(int j = i+1;j<club.length;j++){
                System.out.println(club[i] + " - " + club[j]);
            }
        }
    }
}