package instatag.com.smarthashtag;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HashTag extends AppCompatActivity {
    Toolbar toolbar;
    TextView tv;
    ClipboardManager clipboardManager;
    ClipData clipData;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hash_tag);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        tv=(TextView)findViewById(R.id.text1);
button=(Button)findViewById(R.id.btncopy);
        clipboardManager=(ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=tv.getText().toString();
                clipData=ClipData.newPlainText("text",text);
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"Text Copied",Toast.LENGTH_SHORT).show();

            }
        });
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            toolbar.setTitle(bundle.getString("HashTag"));
            if(toolbar.getTitle().toString().equalsIgnoreCase("All Tags")){
                tv.setText("#love #followback #instagramers #socialenvy #tweegram #photooftheday #20likes #amazing #smile #follow4follow #like4like #look #instalike #igers #picoftheday #food #instadaily #instafollow #followme #girl #instagood #bestoftheday #instacool #socialenvyco #follow #colorful #style #swag");

            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Most-Popular1")) {
                tv.setText("#amazing #socialenvy #fitness #followme #all_shots #textgram #family #instago #igaddict #awesome #girls #instagood #my #bored #baby #music #red #green #water #bestoftheday #black #party #white #yum #flower #socialenvyco #night #instalove #instagood #like4like #like4follow");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Most-Popular2")) {
                tv.setText("#fun #instagramers #model #socialenvy #likes #likeme #food #smile #pretty #followme #nature #lol #dog #hair #sunset #swag #throwbackthursday #instagood #beach #friends #hot #funny #blue #life #art #photo #cool #socialenvyco #bestoftheday #clouds");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Most-Popular3")) {
                tv.setText("#amazing #socialenvy #PleaseForgiveMe #fitness #followme #all_shots #textgram #family #instago #igaddict #awesome #girls #instagood #my #bored #baby #music #red #green #water #bestoftheday #black #party #white #yum #flower #socialenvyco #night #instalove");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("SelfieQueen")) {
                tv.setText("#selfie #selfienation #selfies #socialenvy #me #love #pretty #like4like #instagood #instaselfie #selfietime #face #shamelessselefie #life #hair #portrait #igers #fun #followme #instalove #smile #igdaily #eyes #follow");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Groupie")) {
                tv.setText("#thanksgiving #thanks #giving socialenvy #turkey #turkeyday #food #foodporn #holiday #family #friends #love #instagood #photooftheday #happythanksgiving #celebrate #stuffing #feast #thankful #blessed #fun");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Girls gorgeous")) {
                tv.setText("#fashion #style #stylish #love #socialenvy #like4like #me #cute #photooftheday #nails #hair #beauty #beautiful #instagood #instafashion #pretty #girl #girls #eyes #model #dress #skirt #shoes #heels #styles #outfit #purse #jewelry #shopping");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Boys Hunk")) {
                tv.setText("#fashion #swag #style #stylish #socialenvy #PleaseForgiveMe #me #swagger #photooftheday #jacket #hair #pants #shirt #handsome #cool #polo #swagg #guy #boy #boys #man #model #tshirt #shoes #sneakers #styles #jeans #fresh #dope");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("MakeUp")) {
                tv.setText("#makeup #instamakeup #cosmetic #cosmetics #socialenvy #like4like #fashion #eyeshadow #lipstick #gloss #mascara #palettes #eyeliner #lip #lips #concealer #foundation #powder #eyes #eyebrows #lashes #lash #glue #glitter #crease #primers #base #beauty #beautiful");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Outfit Of The Day")) {
                tv.setText("#ootd #outfitoftheday #lookoftheday #fashion #fashiongram #style #love #beautiful #currentlywearing #lookbook #wiwt #whatiwore #whatiworetoday #ootdshare #outfit #clothes #wiw #mylook #fashionista #todayimwearing #instastyle #socialenvy #PleaseForgiveMe #instafashion #outfitpost #fashionpost #todaysoutfit #fashiondiaries");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Jewelry")) {
                tv.setText("#jewelry #jewels #jewel #socialenvy #like4like #fashion #gems #gem #gemstone #bling #stones #stone #trendy #accessories #love #crystals #beautiful #ootd #style #fashionista #accessory #instajewelry #stylish #cute #jewelrygram #fashionjewelry");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Nails")) {
                tv.setText("#nails #nail #fashion #style #socialenvy #like4like #cute #beauty #beautiful #instagood #pretty #girl #girls #stylish #sparkles #styles #gliter #nailart #art #photooftheday #unhas #preto #branco #rosa #love #shiny #polish #nailpolish #nailswag");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("High Heels")) {
                tv.setText("#highheels #heels #platgorm #socialenvy #like4like #fashion #style #stylish #love #cute #photooftheday #tall #beauty #beautiful #girl #girls #model #shoes #styles #outfit #instaheels #fashionshoes #shoelover #instashoes #highheelshoes #heelsaddict #loveheels #iloveheels #shoestagram");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Fashion (Female)")) {
                tv.setText("#fashion #style #stylish #love #socialenvy #like4like #me #cute #photooftheday #nails #hair #beauty #beautiful #instagood #instafashion #pretty #girl #girls #eyes #model #dress #skirt #shoes #heels #styles #outfit #purse #jewelry #shopping");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Fashion (Male)")) {
                tv.setText("#fashion #swag #style #stylish #socialenvy #like4like #me #swagger #photooftheday #jacket #hair #pants #shirt #handsome #cool #polo #swagg #guy #boy #boys #man #model #tshirt #shoes #sneakers #styles #jeans #fresh #dope");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Nature")) {
                tv.setText("#nature #socialenvy #like4like #sky #sun #summer #beach #beautiful #pretty #sunset #sunrise #blue #flowers #night #tree #twilight #clouds #beauty #light #cloudporn #photooftheday #love #green #skylovers #dusk #weather #day #red #mothernature");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Weather")) {
                tv.setText("#sunset #sunrise #sun #socialenvy #like4like #pretty #beautiful #red #orange #pink #sky #skyporn #cloudporn #nature #clouds #horizon #photooftheday #instagood #gorgeous #warm #view #night #morning #silhouette #instasky #all_sunsets");
            }

            else if(toolbar.getTitle().toString().equalsIgnoreCase("All_Seasons")){
                tv.setText("#summer #summertime #sun #socialenvy #like4like #hot #sunny #warm #fun #beautiful #sky #clearskys #season #seasons #instagood #instasummer #photooftheday #nature #clearsky #bluesky #vacationtime #weather #summerweather #sunshine #summertimeshine");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Animals_Lover")){
                tv.setText("#animals #animal #pet #socialenvy #like4like #dog #cat #dogs #cats #photooftheday #cute #pets #instagood #animales #cute #love #nature #animallovers #pets_of_instagram #petstagram #petsagram");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("SocialLife")){
                tv.setText("#love #socialenvy #PleaseForgiveMe #like4like #me #instamood #cute #igers #picoftheday #girl #guy #beautiful #fashion #instagramers #follow #smile #pretty #followme #friends #hair #swag #photo #life #funny #cool #hot #portrait #baby #girls");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("People")){
                tv.setText("#selfie #selfienation #selfies #socialenvy #like4like #me #love #pretty #handsome #instagood #instaselfie #selfietime #face #shamelessselefie #life #hair #portrait #igers #fun #followme #instalove #smile #igdaily #eyes #follow");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Holidays")){
                tv.setText("#happyholidays #holidays #holiday #socialenvy #like4like #vacation #winter2016 #2016 #2017 #happyholidays2016 #presents #parties #fun #happy #family #love #christmas #holidays #tistheseason #socialenvy #PleaseForgiveMe #holiday #winter #instagood #happyholidays");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Celebration")){
                tv.setText("#party #partying #fun #socialenvy #like4like #instaparty #instafun #instagood #bestoftheday #crazy #friend #friends #besties #guys #girls #chill #chilling #kickit #kickinit #cool #love #memories #night #smile #music #outfit #funtime #funtimes #happy");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Family_Time")){
                tv.setText("#family #fam #mom #dad #socialenvy #like4like #brother #sister #brothers #sisters #bro #sis #siblings #love #instagood #father #mother #related #fun #photooftheday #children #kids #life #happy #familytime #cute #smile #fun");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Art_Lover")){
                tv.setText("#art #illustration #drawing #draw #socialenvy #like4like #picture #artist #sketch #sketchbook #paper #pen #pencil #artsy #instaart #beautiful #instagood #gallery #masterpiece #creative #photooftheday #instaartist #graphic #graphics #artoftheday #beautiful #abstracto #stayabstract #instaabstract");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Photoholic")){
                tv.setText("#photo #photos #pic #pics #socialenvy #like4like #picture #pictures #snapshot #art #beautiful #instagood #picoftheday #photooftheday #color #all_shots #exposure #composition #focus #capture #moment #hdr #hdrspotters #hdrstyles_gf #hdri #hdroftheday #hdriphonegraphy #hdr_lovers #awesome_hdr");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("FoodLover")){
                tv.setText("#food #foodporn #yum #instafood #socialenvy #like4like #yummy #amazing #instagood #photooftheday #sweet #dinner #lunch #breakfast #fresh #tasty #food #delish #delicious #eating #foodpic #foodpics #eat #hungry #foodgasm #hot #foods");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Celab")){
                tv.setText("#filmmaker #celebritystyle #photo #swag #fleek #picture #fashionblogger #motivation #inspiration #lifestyle #blackmen #blackgirlmagic #fashionpheeva #stylish #instafashion #instastyle #celebrityfashion #ootd #lookoftheday #womensfashion #womenswear #fashiondaily #celebs #artists #music #fan4life #follow #repost #share #support");
            }

            else if(toolbar.getTitle().toString().equalsIgnoreCase("Entertainment")){
                tv.setText("#music #genre #song #songs #socialenvy #like4like #melody #hiphop #rnb #pop #love #rap #dubstep #instagood #beat #beats #jam #myjam #party #partymusic #newsong #lovethissong #remix #favoritesong #bestsong #photooftheday #listentothis #goodmusic #instamusic");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Follow/Shotout/Like/Comment")){
                tv.setText("#follow #f4f #followme #socialenvy #like4like #followforfollow #follow4follow #teamfollowback #followher #followbackteam #followhim #followall #like4like #liker #likes #l4l #likes4likes #photooftheday #love #likeforlike #likesforlikes #liketeam #likeback #likebackteam #instagood");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Travel/Active/Sports")){
                tv.setText("#travel #traveling #socialenvy #PleaseForgiveMe #vacation #visiting #instatravel #instago #instagood #trip #holiday #photooftheday #fun #travelling #tourism #tourist #instapassport #instatraveling #mytravelgram #travelgram #travelingram #igtravel");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Movies")){
                tv.setText("#movies #theatre #video #socialenvy #PleaseForgiveMe #movie #film #films #videos #actor #actress #cinema #dvd #amc #instamovies #star #moviestar #photooftheday #hollywood #goodmovie #instagood #flick #flicks #instaflick #instaflicks");
            }
            else if(toolbar.getTitle().toString().equalsIgnoreCase("Others")){
                tv.setText("#family #fam #mom #dad #socialenvy #PleaseForgiveMe #brother #sister #brothers #sisters #bro #sis #siblings #love #instagood #father #mother #related #fun #photooftheday #children #kids #life #happy #familytime #cute #smile #fun");
            }
        }
    }
}
