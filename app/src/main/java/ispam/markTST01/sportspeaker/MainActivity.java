package ispam.markTST01.sportspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imgBoxing, imgKickBoxing, imgJudo, imgKarate, imgAikido, imgTaekwondo;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing = findViewById(R.id.imgBoxing);
        imgKickBoxing = findViewById(R.id.imgKickBoxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgAikido = findViewById(R.id.imgAikido);
        imgTaekwondo = findViewById(R.id.imgTaekwondo);

        imgBoxing.setOnClickListener(this);
        imgKickBoxing.setOnClickListener(this);
        imgJudo.setOnClickListener(this);
        imgKarate.setOnClickListener(this);
        imgAikido.setOnClickListener(this);
        imgTaekwondo.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imgBoxing:
                playAudioByName(R.raw.boxing);
                break;
            case R.id.imgKickBoxing:
                playAudioByName(R.raw.kickboxing);
                break;
            case R.id.imgJudo:
                playAudioByName(R.raw.judo);
                break;
            case R.id.imgKarate:
                playAudioByName(R.raw.karate);
                break;
            case R.id.imgAikido:
                playAudioByName(R.raw.aikido);
                break;
            case R.id.imgTaekwondo:
                playAudioByName(R.raw.taekwondo);
                break;

        }
    }

    private void playAudioByName(int musicName) {
        mediaPlayer = MediaPlayer.create(this, musicName);
        mediaPlayer.start();
    }
}
