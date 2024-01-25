public class App {
    public static void main(String[] args) throws Exception {
        
        String ako [][]  = {{"mark", "russell", "lim"}, {"macren", "lacsina", "lim"}, {"james", "andrew", "cruz"}};
        
        for(int x=0; x<ako.length; x++ ){
            System.out.println();
            for(int y = 0; y<ako[x].length; y++){
                System.out.print(ako[x][y]+" ");
            }
            
        }
    }
}
