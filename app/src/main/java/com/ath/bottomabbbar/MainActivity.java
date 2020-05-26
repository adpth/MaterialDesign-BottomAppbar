package com.ath.bottomabbbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Modal> list;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomAppBar bar = (BottomAppBar) findViewById(R.id.bar);
        setSupportActionBar(bar);

        list = new ArrayList<>();
        list.add(new Modal("Bruce Garza", "Samsung S8 and S8+ rank highly on their own, especially when compared to other flagship smartphones released in 2017. The design is beautiful and reflect the effort Samsung has placed into designing the most futuristic, feature packed smartphones over the past 4 to 5 years.", R.drawable.photo1));
        list.add(new Modal("Janice Lopez","Samsung Galaxy A7 smartphone is one of the most powerful executor that you would love to hold. The phone has all the features that one would require. You get a full gigantic screen size in full HD Super AMOLED display mode, a screen that has a touch model- swipe and touch and your instructions are followed. An expandable memory that will capture everything without even thinking about data storage.", R.drawable.photo2));
        list.add(new Modal("Jordan Robinson", "Completely redesigned to remove interruptions from your view. No notch, no distractions. Precise laser cutting, on-screen security, and a Dynamic AMOLED that's easy on the eyes make the Infinity-O Display the most innovative Galaxy screen yet. Use the Ultra Wide Camera to take stunning, cinematic photos with a 123 degree field of vision. Wireless Power Share gives you the ability to share your power with other devices and Fast Wireless Charging 2.0 gets your phone back to 100 percent, faster.",R.drawable.photo3 ));
        list.add(new Modal("Carolyn Gomez", "Introducing next-level power. With Galaxy Note10 and Note10+ we've designed a mobile experience thats like a computer, a gaming console, a movie-tech camera, and an intelligent pen, all in one device.",R.drawable.photo4 ));
        list.add(new Modal("Hannah King", "Completely redesigned to remove interruptions from your view. No notch, no distractions. Precise laser cutting, on-screen security, and a Dynamic AMOLED that's easy on the eyes make the Infinity-O Display the most innovative Galaxy screen yet. Use the Ultra Wide Camera to take stunning, cinematic photos with a 123 degree field of vision. Wireless Power Share gives you the ability to share your power with other devices and Fast Wireless Charging 2.0 gets your phone back to 100 percent, faster.",R.drawable.photo5 ));
        list.add(new Modal("Denise Ford", "Stay connected to your digital world at all times using the Oppo F11 Pro. Raise the bar when it comes to clicking selfies with the rising front camera. Brilliant portrait in low light with 80% larger image sensors that captures more light to deliver portraits that shine, even in low light. 48MP + 5MP Dual Rear Camera and AI-driven 48MP Front camera for professional quality pictures in every setting.",R.drawable.photo6 ));
        list.add(new Modal("Denise Ford", "OPPO F15 smartphone runs on Android v9.0 (Pie) operating system. The phone is powered by Octa core (2.1 GHz, Quad core, Cortex A73 + 2 GHz, Quad core, Cortex A53) processor. It runs on the MediaTek Helio P70 Chipset. It has 8 GB RAM and 128 GB internal storage. OPPO F15 smartphone has a AMOLED display.",R.drawable.photo7 ));
        list.add(new Modal("Benjamin Stanley", "Whether it's work or entertainment - the Redmi Note 7 Pro challenges all odds and provides a truly immersive and enriched smartphone experience.",R.drawable.photo1 ));
        list.add(new Modal("Hannah King", "Redmi Note mobiles phones are gaining huge popularity because of its features at an affordable price. A value priced mobile phone that does not compromise on the features you would be looking for. This beauty is packed with loads of features than you can imagine. The Redmi Mote 7 32 GB mobile phone can be boast about its gigantic screen size that is not displays clear and bright images but also protects the phone from accidental falls and scratches.",R.drawable.photo2 ));
        list.add(new Modal("Joyce Clark", "The Realme 3 redefines excellent performance and elegant design. Its Helio P70 AI Processor (12nm-class), combined with a powerful 4230-mAh battery, makes the Realme 3 a highly power-efficient smartphone. It has a 3D Unibody Design, that's complemented by a gradient effect, which adds to your stylish persona. Its 13+2 MP AI Dual Camera, coupled with the Chroma Boost feature and Nightscape Mode, helps capture all the fine details of precious moments, whether it's day or night.",R.drawable.photo3 ));
        list.add(new Modal("Joan Spencer", "Buy Xiaomi Mi A3 (Not just Blue, 64 GB, 4 GB RAM) online at best price in India. Read more about Xiaomi Mi A3 specifications, colours, reviews, performance & features on Croma.",R.drawable.photo4 ));
        list.add(new Modal("Victoria Crawford", "Buy Apple iPhone 11 (Black, 64 GB, 4 GB RAM) online at best price in India. Read more about Apple iPhone 11 specifications, colours, reviews, performance & features on Croma.",R.drawable.photo5 ));
        list.add(new Modal("Grace Alvarado","It caught everyone's fancy from the time it was first leaked in a video, and since then, all Android enthusiasts, and especially the ones who swear by the pure stock user interface of the operating system, have been eyeing this smartphone. No prizes for guessing, we're talking about the Nexus 5, Google's new platform showcase device which has been manufactured by Korean electronics giant, LG. It's also the first time that Google has launched its flagship device in the Indian market just weeks after its international launch.",R.drawable.photo6));
        list.add(new Modal("Justin Scott", "4 GB RAM | 64 GB ROM | 14.22 cm (5.6 inch) FHD+ Display 12.2MP Rear Camera | 8MP Front Camera 3000 mAh Battery Qualcomm Snapdragon 670 Processor t has an extraordinary camera with features such as Night Sight, Super Res Zoom, Portrait Mode. It features a battery that charges fast and lasts all day long. It also comes with three years of security and OS updates included.",R.drawable.photo7));
        list.add(new Modal( "Kyle Butler", "Google is embarking on a new adventure with its first self-designed smartphones, the Pixel and Pixel XL, which are practically identical other than their size. While its looks aren't going to set the world on fire, the Pixel XL is packed with today's top components including a Snapdragon 821 SoC and 4GB of RAM. Software, including the new voice-based Google Assistant, is the main draw. The company also boasts of having developed the best smartphone camera in the world, and we can see why.",R.drawable.photo8));
        list.add(new Modal("Donald Silva", "4 GB RAM | 64 GB ROM | Expandable Upto 512 GB 15.49 cm (6.1 inch) HD+ Display 13MP + 2MP | 8MP Front Camera 3000 mAh Battery MediaTek Helio P22 Processor Performance With 64 GB of ROM, this mobile will offer plenty of space to store all your photos and personal files. You can also expand the storage space up to 512 GB by using a microSD card. To top it off, it has 4GB of RAM to ensure seamless performance. 6.1 Max Vision Display It has a 15.49-cm HD+ screen with 19.5:9 aspect ratio that will offer maximum viewing, thereby giving life to your favorite movies, sports, and games.n the lighting is poor.",R.drawable.photo1));
        list.add(new Modal( "Susan Fox", "Buy Nokia 7.2 (Charcoal, 64 GB, 6 GB RAM) online at best price in India. Read more about Nokia 7.2 specifications, colours, reviews, performance & features on Croma.",R.drawable.photo2));
        list.add(new Modal("Denise Freeman", "Comparison between Samsung Galaxy A7 2018 vs Xiaomi Mi 7 Mobile Phones. The comparision between these Mobile Phones is based on Quick Specs, Basic Information, Features, Technical Specifications and Other Basic Features. Also see Price Comparision between Samsung Galaxy A7 2018 vs Xiaomi Mi 7 Mobile Phones",R.drawable.photo3));
        list.add(new Modal("Donna Allen", "Samsung Galaxy M20 with 16cm (6.3\") Infinity-V Display. It's available up to 4GB of RAM and 64GB of Storage options. Click group photos from the Ultra Wide Dual Rear Camera, and you also get 8MP F2.0 Front Camera. Do more with your phone and do it faster than ever before with the new Exynos 7904, 1.8 GHz Octa Core Processor. The Galaxy M20 is built for the long haul action so that you stay in charge with its 5000 mAh battery.",R.drawable.photo4));
        list.add(new Modal("Gerald Wright", "Samsung Galaxy M40 comes with a near bezel-less 16.0 cm (6.3”) FHD+ display. It’s quick with Qualcomm SnapdragonTM 675 mobile platform & LPDDR4x RAM. SO SWANKY! with a 32MP Triple Rear Camera. SO SOCIAL! with 16MP Front Camera and F2.0 Aperture. SO BLING! with a 7.9mm sleek body and premium dual tone finish. The Galaxy M40 is your all-access pass to the world of entertainment with its Widevine L1 certification and Dolby Atmos* 360 surround sound.",R.drawable.photo5));
        list.add(new Modal("Roger Sanchez", "Completely redesigned to remove interruptions from your view. No notch, no distractions. Precise laser cutting, on-screen security, and a Dynamic AMOLED that's easy on the eyes make the Infinity-O Display the most innovative Galaxy screen yet. Use the Ultra Wide Camera to take stunning, cinematic photos with a 123 degree field of vision. Wireless Power Share gives you the ability to share your power with other devices and Fast Wireless Charging 2.0 gets your phone back to 100 percent, faster.",R.drawable.photo6));

        recyclerView = findViewById(R.id.RecylerView);
        recyclerView.setHasFixedSize(true);
        AdapterList adapter = new AdapterList(this,list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

}
