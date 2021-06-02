package com.example.orgendonation.Receipient;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.orgendonation.R;

public class ReceipientHome extends AppCompatActivity
{
    ImageView iv_liver,iv_lung,iv_heart,iv_brain,iv_spleen,iv_stomach,iv_intestines,iv_eyes;
    Context ctx = this;
    AlertDialog a1;
    AlertDialog.Builder b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipient_home);
        allocatememory();
        setEvents();
    }

    private void setEvents()
    {
        iv_liver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                b1 = new AlertDialog.Builder(ctx);
                b1.setTitle("Liver");
                b1.setMessage(R.string.liver);
                b1.setIcon(R.mipmap.ic_liver);
                b1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        a1.dismiss();
                    }
                });
                a1 = b1.create();
                a1.show();
            }
        });

        iv_lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                b1 = new AlertDialog.Builder(ctx);
                b1.setTitle("Lung");
                b1.setMessage(R.string.lung);
                b1.setIcon(R.mipmap.ic_lung);
                b1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        a1.dismiss();
                    }
                });
                a1 = b1.create();
                a1.show();
            }
        });

        iv_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                b1 = new AlertDialog.Builder(ctx);
                b1.setTitle("Heart");
                b1.setMessage(R.string.heart);
                b1.setIcon(R.mipmap.ic_heart);
                b1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        a1.dismiss();
                    }
                });
                a1 = b1.create();
                a1.show();
            }
        });

        iv_brain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                b1 = new AlertDialog.Builder(ctx);
                b1.setTitle("Brain");
                b1.setMessage(R.string.brain);
                b1.setIcon(R.mipmap.ic_brain);
                b1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        a1.dismiss();
                    }
                });
                a1 = b1.create();
                a1.show();
            }
        });

        iv_spleen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                b1 = new AlertDialog.Builder(ctx);
                b1.setTitle("Spleen");
                b1.setMessage(R.string.spleen);
                b1.setIcon(R.mipmap.ic_spleen);
                b1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        a1.dismiss();
                    }
                });
                a1 = b1.create();
                a1.show();
            }
        });

        iv_stomach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                b1 = new AlertDialog.Builder(ctx);
                b1.setTitle("Stomach");
                b1.setMessage(R.string.stomach);
                b1.setIcon(R.mipmap.ic_stomach);
                b1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        a1.dismiss();
                    }
                });
                a1 = b1.create();
                a1.show();
            }
        });

        iv_intestines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                b1 = new AlertDialog.Builder(ctx);
                b1.setTitle("Intestines");
                b1.setMessage(R.string.intestines);
                b1.setIcon(R.mipmap.ic_intestines);
                b1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        a1.dismiss();
                    }
                });
                a1 = b1.create();
                a1.show();
            }
        });

        iv_eyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                b1 = new AlertDialog.Builder(ctx);
                b1.setTitle("Eyes");
                b1.setMessage(R.string.eyes);
                b1.setIcon(R.mipmap.ic_eyes);
                b1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        a1.dismiss();
                    }
                });
                a1 = b1.create();
                a1.show();
            }
        });



    }

    private void allocatememory()
    {
        //ImageView iv_liver,iv_lung,iv_heart,iv_brain,iv_spleen,iv_stomach,iv_intestines,iv_eyes;
       iv_liver = findViewById(R.id.iv_liver);
        iv_lung = findViewById(R.id.iv_lung);
        iv_heart = findViewById(R.id.iv_heart);
        iv_brain = findViewById(R.id.iv_brain);
        iv_spleen = findViewById(R.id.iv_spleen);
        iv_stomach = findViewById(R.id.iv_stomach);
        iv_intestines = findViewById(R.id.iv_intestines);
        iv_eyes = findViewById(R.id.iv_eyes);
    }

}