import javafx.application.Application;
import javafx.animation.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import oshi.SystemInfo;
import oshi.hardware.*;
import java.util.*;
import oshi.hardware.NetworkIF;

/**
 * internetspeed
 */
public class internetspeed extends Application
{
    public SystemInfo systemInfo;
    public NetworkIF networkIF;
    public Label label;

    public static void main(String[] args)
    {
        launch(args);    
    }
     
    public void start(Stage primary)
    {
        try 
        {
            primary.setTitle("Internet Speed Detector ");
                systemInfo = new SystemInfo();
                List<NetworkIF> networkIFs = systemInfo.getHardware().getNetworkIFs();
                if(networkIFs.size() > 0)
                {
                    label = new Label();
                    HBox root= new HBox(label);
                    Scene scene = new Scene(root,200,50);
                    primary.setScene(scene);
                    primary.show();
                    beginspeedmonitor();
                }
                else
                {
                    System.out.println(" not interface found ");
                }
                


        } catch (Exception e) {
            e.printStackTrace();
        }
                

    }

    public void beginspeedmonitor() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'beginspeedmonitor'");

        new AnimationTimer()
         {
            private long lasttime=0;
            private long lastsent=0;
            private long lastreceived=0;

            public void handle(long now )
            {
                if(now-lasttime >= 1_000_000_000)
                {
                    long sentspeed=networkIF.getBytesSent()-lastsent;
                    long receivedspeed=networkIF.getBytesRecv()-lastreceived;

                    label.setText(String.format("↑ %s   ↓ %s", formatSpeed(sentspeed),formatSpeed(receivedspeed)));
                    lastsent = networkIF.getBytesSent();
                    lastreceived=networkIF.getBytesRecv();
                    lasttime=now;
                }
            }
        }.start();
    }
    private String formatSpeed(long speed)
    {
        String[] suffix = {"B/s", "KB/s", "MB/s", "GB/s"};
        int index =0;
        while(speed> 1024 && index<suffix.length-1)
        {
            speed = speed/1024;
            index++;
        }
        return String.format("%2f %s",speed, suffix[index]);

    }
    
}