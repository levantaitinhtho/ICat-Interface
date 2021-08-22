package managercat.manager.cat;

import catexam.CatDetail;

import java.util.*;

public class ManagerCat extends CatDetail {
    ArrayList<CatDetail> catDetaiList = new ArrayList<>();

    public ManagerCat() {
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter Number Meo Need Add: ");
        n = Integer.parseInt(input.nextLine());
        for( int i=0;i<n;i++){
            CatDetail catDetail = new CatDetail();
            catDetail.input();

            catDetaiList.add(catDetail);
        }
    }
    public void show(){
        for(int i = 0; i< catDetaiList.size();i++ ){
            catDetaiList.get(i).show();
        }
    }
    public void sort(){
        Collections.sort(catDetaiList, new Comparator<CatDetail>() {
            @Override
            public int compare(CatDetail catDetail, CatDetail t1) {
                return catDetail.getColor().compareToIgnoreCase(t1.getColor());

            }
        });
        show();
    }
    public void search(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Speacies: ");
        String speciesFake = input.nextLine();
        int count =0;
        for(CatDetail catDetail: catDetaiList){
            if(catDetail.getSpecies().equalsIgnoreCase(speciesFake)){
                catDetail.show();
                count ++;
            }
        }
        if(count ==0){
            System.out.println("Not Found Speacies");
        }
    }
}
