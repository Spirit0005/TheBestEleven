/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebesteleven;
import Logic.playerdata;
import java.io.IOException;
import java.net.URL;
import javafx.scene.layout.AnchorPane;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.control.ProgressIndicator;
import model.FileReader;
import static thebesteleven.TheBestEleven.stg;
import javafx.scene.control.ChoiceBox;
import model.fileWriter;
import static thebesteleven.TheBestEleven.Players;
import static Logic.playerdata.playerNames;
import java.util.Arrays;
import static model.FileReader.names;
import static thebesteleven.TheBestEleven.Cricketer;
/**
 * FXML Controller class
 *
 * @author hk_th
 */
public class Controller implements Initializable {
    @FXML
   private Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    
    @FXML
   private ImageView img1,img2,img3,img4,img5;
    
    
   
    
     @FXML
     private ListView<String> lst1,lst2;
   ObservableList<String> lst = FXCollections.observableArrayList(names);
   ObservableList<String> lst3 = FXCollections.observableArrayList(playerNames);
     @FXML
   AnchorPane ap1,ap2;
     
     @FXML
   ProgressIndicator pg1;
     
    
           //------------------------------Home------------------------------//
    
     
    @FXML
    private void exitApp() {
        System.exit(0);
    }
    
   @FXML
    private void mouseEnter1()
    {
        img1.setScaleX(1.2);
        img1.setScaleZ(1.2);
        img1.setScaleY(1.2);
        l1.setText("Add");
        l2.setText("Player");
       fade(l1);
       fade(l2);

      }
    @FXML
    private void mouseEnter2()
    {   
        img2.setScaleX(1.2);
        img2.setScaleZ(1.2);
        img2.setScaleY(1.2);
       l3.setText("Browse");
        l4.setText("Player");
        fade(l3);
       fade(l4);
      
    }
     @FXML
    private void mouseEnter3()
    {
        img3.setScaleX(1.2);
        img3.setScaleZ(1.2);
        img3.setScaleY(1.2);
        l5.setText("Generate");
        l6.setText("Team");
        fade(l5);
       fade(l6);
    }
     @FXML
    private void mouseEnter4()
    {  
        
       img4.setScaleX(1.4);
       img4.setScaleY(1.4);
       img4.setScaleZ(1.4);
       l7.setText("Exit");
       fade(l7);
      }
     
    @FXML
    private void mouseExit1()
    {
        img1.setScaleX(1);
        img1.setScaleZ(1);
        img1.setScaleY(1);
        l1.setText("");
        l2.setText("");
        
    }
    @FXML
     private void mouseExit2()
    {   
        img2.setScaleX(1);
        img2.setScaleZ(1);
        img2.setScaleY(1);
         l3.setText("");
        l4.setText("");
    }
    
    
    @FXML
     private void mouseExit3()
    {
        img3.setScaleX(1);
        img3.setScaleZ(1);
        img3.setScaleY(1);
        l5.setText("");
        l6.setText("");
    } 
     @FXML
    private void mouseExit4()
    {   img4.setScaleX(1);
        img4.setScaleZ(1);
        img4.setScaleY(1);
       
        l7.setText("");
    }
   
     @FXML
      private void mouseClick1() throws IOException
         {
            stg.hide();
            Parent root = FXMLLoader.load(getClass().getResource("AddPlayer.fxml"));
       
        Scene scene = new Scene(root);
        stg.setScene(scene);
        stg.show();
        
         }
      
              //----------------------Add Player-----------------------------//
      
      
    @FXML
    TextField t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44,t45,t46;
    @FXML
    ChoiceBox cb1,cb2,cb3;
    
    @FXML    
    ObservableList<String> batStyle= FXCollections.observableArrayList("Left-hand bat","Right-hand bat");
    ObservableList<String> bowlStyle= FXCollections.observableArrayList("Pace","Spin");
    ObservableList<String> playStyle= FXCollections.observableArrayList("Batsman","Bowler","All-Rounder");
    
    @FXML
    public void battingStyle(){
        
         cb1.setValue("");
         cb1.setItems(playStyle);
         cb2.setValue("");
         cb2.setItems(batStyle);
         cb3.setValue("");
        cb3.setItems(bowlStyle);
     }
    
      
      @FXML
    private void addPlayer() throws IOException
    {
         FileReader reader = new FileReader();
         int noOfPlayers = reader.noOfIterations();
                Cricketer.strdata[0]=t26.getText();
                Cricketer.strdata2[0]=t27.getText();
                Cricketer.intdata[2]=Integer.parseInt(t27.getText());
                Cricketer.strdata2[1]=(String) cb1.getSelectionModel().getSelectedItem();
                Cricketer.strdata2[2]=(String) cb2.getSelectionModel().getSelectedItem();
                Cricketer.strdata2[3]=(String) cb3.getSelectionModel().getSelectedItem();
                Cricketer.strdata2[9]=t28.getText();
                Cricketer.strdata2[4]=t29.getText();
                Cricketer.strdata2[5]=t30.getText();
                Cricketer.strdata2[6]=t31.getText();
                Cricketer.strdata2[7]=t32.getText();
                Cricketer.strdata2[8]=t33.getText();
                Cricketer.strdata2[10]=t34.getText();
                //arr[12]=t35.getText();
                Cricketer.strdata2[13]=t36.getText();
                Cricketer.strdata2[14]=t37.getText();
                Cricketer.strdata2[15]=t38.getText();
                Cricketer.strdata2[16]=t39.getText();
                Cricketer.strdata2[17]=t40.getText();
                Cricketer.strdata2[20]=t41.getText();
                Cricketer.strdata2[21]=t42.getText();
                Cricketer.strdata2[18]=t43.getText();
                Cricketer.strdata2[19]=t44.getText();
                Cricketer.strdata2[22]=t45.getText();
                Cricketer.strdata2[23]=t46.getText();
              //  System.out.println(""+Arrays.toString(Cricketer.strdata2));
                fileWriter writer = new fileWriter();
                writer.createPlayerFile(Cricketer, noOfPlayers);
                noOfPlayers++;
                writer.noOfIterations(noOfPlayers);
                float a = Float.parseFloat(t33.getText());
                float b = Float.parseFloat(t34.getText());
                Cricketer.floatdata[1] = (a * b)/1000;
                int runsScored = Integer.parseInt(t31.getText());
                int matchesPlayed = Integer.parseInt(t29.getText());
                int notOuts = Integer.parseInt(t30.getText());
                int ballsFaced = Integer.parseInt(t28.getText());
                matchesPlayed = matchesPlayed - notOuts;
                float battingAverage = runsScored / matchesPlayed;
                float battingStrikeRate = (runsScored / ballsFaced) * 100;
                int runsConceded = Integer.parseInt(t39.getText());
                int ballsBowled = Integer.parseInt(t38.getText());
                int wickets = Integer.parseInt(t40.getText());
                int oversBowled = ballsBowled / 6;
                float bowlingAverage = runsConceded / ballsBowled;
                float bowlingEconomy = runsConceded / oversBowled;
                float bowlingStrikeRate = ballsBowled / wickets;
                
                
    }
      @FXML
    private void addButtonEnter()
    {
    l11.setScaleX(1.4);
    l11.setScaleY(1.4);
    l11.setScaleZ(1.4);
   
    }
    
      @FXML
    private void addButtonExit()
    {
    l11.setScaleX(1);
    l11.setScaleY(1);
    l11.setScaleZ(1);
    }
     
      @FXML
    private void mouseenter5()
    {  
        
       img5.setScaleX(1.5);
       img5.setScaleY(1.5);
       img5.setScaleZ(1.5);
       l8.setText("Back");
       fade(l8);
      }
     @FXML
    private void mouseexit5()
    {   img5.setScaleX(1);
        img5.setScaleZ(1);
        img5.setScaleY(1);
        l8.setText("");
    }
    
    
      @FXML
      private void mouseclick2(  ) throws IOException
         {
            stg.hide();
            Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
       
        Scene scene = new Scene(root);
        
        stg.setScene(scene);
        stg.show();
         }
      
    
     
          //----------------------Browse Player-----------------------------//

   
      @FXML
    TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,
             t18,t19,t20,t21,t22,t23,t24,t25;
      
    String[] s={"/files/PlayersPics/0.png","/files/PlayersPics/1.png","/files/PlayersPics/2.png",
    "/files/PlayersPics/3.png","/files/PlayersPics/4.png","/files/PlayersPics/5.png","/files/PlayersPics/6.png",
    "/files/PlayersPics/7.png","/files/PlayersPics/8.png","/files/PlayersPics/9.png","/files/PlayersPics/10.png",
    "/files/PlayersPics/11.png","/files/PlayersPics/12.png","/files/PlayersPics/13.png","/files/PlayersPics/14.png",
    "/files/PlayersPics/15.png","/files/PlayersPics/16.png","/files/PlayersPics/17.png","/files/PlayersPics/18.png",
    "/files/PlayersPics/19.png","/files/PlayersPics/20.png","/files/PlayersPics/21.png","/files/PlayersPics/22.png",
    "/files/PlayersPics/23.png","/files/PlayersPics/24.png","/files/PlayersPics/25.png","/files/PlayersPics/26.png",
    "/files/PlayersPics/27.png","/files/PlayersPics/28.png","/files/PlayersPics/29.png","/files/PlayersPics/30.png",
    "/files/PlayersPics/31.png","/files/PlayersPics/32.png","/files/PlayersPics/33.png","/files/PlayersPics/34.png",
    "/files/PlayersPics/35.png","/files/PlayersPics/36.png","/files/PlayersPics/37.png","/files/PlayersPics/38.png",
    "/files/PlayersPics/39.png","/files/PlayersPics/40.png","/files/PlayersPics/41.png","/files/PlayersPics/42.png",
    "/files/PlayersPics/43.png","/files/PlayersPics/44.png","/files/PlayersPics/45.png","/files/PlayersPics/46.png",
    "/files/PlayersPics/47.png","/files/PlayersPics/48.png","/files/PlayersPics/49.png"};
    
    @FXML
    ImageView img6;    
    @FXML
         private void listv(){            
             
        lst1.setItems(lst);}
     
     //-------------Profile View------------//
         @FXML
        private void prifv() throws IOException
     {
           ap1.setVisible(true);
          
            String item = lst1.getSelectionModel().getSelectedItem(); 
            
        for(int i=0;i<50;i++)
        {
            
          if(item.equals(Players[i].strdata[0]))
        {
           ap1.setVisible(true);
           
           t1.setText(Players[i].strdata[0]);
           t2.setText(Players[i].strdata2[0]);
           t3.setText(Players[i].strdata2[1]);
           t4.setText(Players[i].strdata2[2]);
           t5.setText(Players[i].strdata2[3]);
           t6.setText(Players[i].strdata2[4]);
           t7.setText(Players[i].strdata2[5]);
           t8.setText(Players[i].strdata2[6]);
           t9.setText(Players[i].strdata2[7]);
           t10.setText(Players[i].strdata2[8]);
           t11.setText(Players[i].strdata2[9]);
           t12.setText(Players[i].strdata2[10]);
           t13.setText(Players[i].strdata2[11]);
           t14.setText(Players[i].strdata2[12]);
           t15.setText(Players[i].strdata2[13]);
           t16.setText(Players[i].strdata2[14]);
           t17.setText(Players[i].strdata2[15]);
           t18.setText(Players[i].strdata2[16]);
           t19.setText(Players[i].strdata2[17]);
           t20.setText(Players[i].strdata2[18]);
           t21.setText(Players[i].strdata2[19]);
           t22.setText(Players[i].strdata2[20]);
           t23.setText(Players[i].strdata2[21]);
           t24.setText(Players[i].strdata2[22]);
           t25.setText(Players[i].strdata2[23]);
           Image player=new Image(s[i]);
           img6.setImage(player);
           img6.setVisible(true);
           } 
        }
     }
     
         
     @FXML
        private void prfo(){
              ap1.setVisible(false);
           
           t1.setText("");
           t2.setText("");
           t3.setText("");
           t4.setText("");
           t5.setText("");
           t6.setText("");
           t7.setText("");
           t8.setText("");
           t9.setText("");
           t10.setText("");
           t11.setText("");
           t12.setText("");
           t13.setText("");
           t14.setText("");
           t15.setText("");
           t16.setText("");
           t17.setText("");
           t18.setText("");
           t19.setText("");
           t20.setText("");
           t21.setText("");
           t22.setText("");
           t23.setText("");
           t24.setText("");
           t25.setText("");
           
           img6.setVisible(false);
              
     }
          
     @FXML
      private void mouseclick3(  ) throws IOException
         { 
            stg.hide();
           
            Parent root = FXMLLoader.load(getClass().getResource("BrowsePlayer.fxml"));
       
        Scene scene = new Scene(root);
        
        stg.setScene(scene);
        
        stg.show();
         
         }

         //----------------------Generate Team-----------------------------//

       
      @FXML
      private void mouseclick4(  ) throws IOException
         {
            stg.hide();
            Parent root = FXMLLoader.load(getClass().getResource("GenerateTeam.fxml"));
       
        Scene scene = new Scene(root);
        
        stg.setScene(scene);
        stg.show();
         }
      
      @FXML
      private void gt()
      {
          l9.setVisible(true);
     //ap2.setVisible(true);
      lst2.setItems(lst3);
      lst2.setVisible(true);
      pg1.setVisible(false);
      l10.setVisible(false);
      
      }
      @FXML
        private void prifv1() throws IOException
     {
           //ap2.setVisible(true);
          
            String item = lst2.getSelectionModel().getSelectedItem(); 
            
        for(int i=0;i<50;i++)
        {
            
          if(item.equals(Players[i].strdata[0]))
        {
           ap2.setVisible(true);
           
           t1.setText(Players[i].strdata[0]);
           t2.setText(Players[i].strdata2[0]);
           t3.setText(Players[i].strdata2[1]);
           t4.setText(Players[i].strdata2[2]);
           t5.setText(Players[i].strdata2[3]);
           t6.setText(Players[i].strdata2[4]);
           t7.setText(Players[i].strdata2[5]);
           t8.setText(Players[i].strdata2[6]);
           t9.setText(Players[i].strdata2[7]);
           t10.setText(Players[i].strdata2[8]);
           t11.setText(Players[i].strdata2[9]);
           t12.setText(Players[i].strdata2[10]);
           t13.setText(Players[i].strdata2[11]);
           t14.setText(Players[i].strdata2[12]);
           t15.setText(Players[i].strdata2[13]);
           t16.setText(Players[i].strdata2[14]);
           t17.setText(Players[i].strdata2[15]);
           t18.setText(Players[i].strdata2[16]);
           t19.setText(Players[i].strdata2[17]);
           t20.setText(Players[i].strdata2[18]);
           t21.setText(Players[i].strdata2[19]);
           t22.setText(Players[i].strdata2[20]);
           t23.setText(Players[i].strdata2[21]);
           t24.setText(Players[i].strdata2[22]);
           t25.setText(Players[i].strdata2[23]);
           Image player=new Image(s[i]);
           img6.setImage(player);
           img6.setVisible(true);
           } 
        }
     }
     
         
     
    /**
     * initializes the controller class.
     * @param url
     * @param resource
     */
    @Override
    public void initialize(URL url, ResourceBundle resource) {
        // TODO
        
       
    }    
                     //----------Functions-------------//
    
     static void fade(Label x)
        {FadeTransition ft = new FadeTransition(Duration.millis(1000), x);
        
ft.setFromValue(1.0);
ft.setToValue(0.1);
ft.setCycleCount(Timeline.INDEFINITE);
ft.setAutoReverse(true);
ft.play();}
     
     
      
}
