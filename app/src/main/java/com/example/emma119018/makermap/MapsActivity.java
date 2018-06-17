package com.example.emma119018.makermap;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private BottomBar mBottomBar;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override

        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent=new Intent(MapsActivity.this,Main2Activity.class);
                    startActivity(intent);
                    break;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            finish();
            return true;
        }
    };


       @Override
       protected void onCreate(Bundle savedInstanceState) {

           super.onCreate(savedInstanceState);
               setContentView(R.layout.activity_maps);
               // Obtain the SupportMapFragment and get notified when the map is ready to be used.
                      SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
               mapFragment.getMapAsync(this);

           mTextMessage = (TextView) findViewById(R.id.message);
           BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
           navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
               }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {


        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        MarkerOptions makerOpt = new MarkerOptions();



        mMap = googleMap;


        // Add a marker in Sydne
        // y and move the camera
        LatLng FGU = new LatLng(24.816226, 121.722100);
        mMap.addMarker(new MarkerOptions()
                .position(FGU)
                .title("佛光大學")
                .snippet("宜蘭縣礁溪鄉林美村林尾路160號"+'\n'+"03-9871000#25321"));
        makerOpt.position(FGU);

        LatLng SBH = new LatLng(24.984116, 121.451362);
        mMap.addMarker(new MarkerOptions()
                .position(SBH)
                .title("新北高中Fablab")
                .snippet("新北市土城區學府路一段241號"+'\n'+"02-22615427"));
        makerOpt.position(SBH);


        LatLng HCH = new LatLng(25.007288, 121.447562);
        mMap.addMarker(new MarkerOptions()
                .position(HCH)
                .title("華僑高中FabLab")
                .snippet("新北市板橋區大觀路一段32號"+'\n'+"02-29684131#201"));
        makerOpt.position(HCH);

        LatLng KMS = new LatLng(25.063048, 121.500932);
        mMap.addMarker(new MarkerOptions()
                .position(KMS)
                .title("Kick2real Maker Space")
                .snippet("新北市三重區重新路一段108號3樓"+'\n'+"02-89720218#312"));
        makerOpt.position(KMS);

        LatLng YDU = new LatLng(24.995194, 121.453119);
        mMap.addMarker(new MarkerOptions()
                .position(YDU)
                .title("亞東技術學院工商業設計系")
                .snippet("新北市板橋區四川路二段58號"+'\n'+"02-77380145#3302"));
        makerOpt.position(YDU);

        LatLng CH = new LatLng(24.994027, 121.478425);
        mMap.addMarker(new MarkerOptions()
                .position(CH)
                .title("創客中和")
                .snippet("新北市中和區連城路460號"+'\n'+"02-22227146"));
        makerOpt.position(CH);

        LatLng TUA = new LatLng(25.002459, 121.445736);
        mMap.addMarker(new MarkerOptions()
                .position(TUA)
                .title("國立台灣藝術大學文化創意產學園區")
                .snippet("新北市板橋區大觀路二段28號"+'\n'+"02-82751414#204"));
        makerOpt.position(TUA);

        LatLng DM = new LatLng(25.084958, 121.662885);
        mMap.addMarker(new MarkerOptions()
                .position(DM)
                .title("夢基地木創")
                .snippet("新北市汐止區鄉長路2段169號"+'\n'+"02-26426675/0987-840-995"));
        makerOpt.position(DM);

        LatLng S7W = new LatLng(24.976492, 121.541913);
        mMap.addMarker(new MarkerOptions()
                .position(S7W)
                .title("小七工作站")
                .snippet("新北市新店區北新路二段171巷12號1樓"+'\n'+"0988-856-901"));
        makerOpt.position(S7W);

        LatLng DLU = new LatLng(24.972325, 121.455768);
        mMap.addMarker(new MarkerOptions()
                .position(DLU)
                .title("德霖技術學院3D列印實驗室")
                .snippet("新北市土城區青雲路380巷1號機械館3樓308"+'\n'+"02-22733567#396"));
        makerOpt.position(DLU);

        LatLng GJH = new LatLng(25.073832, 121.488675);
        mMap.addMarker(new MarkerOptions()
                .position(GJH)
                .title("私立格致高級中學FabLab")
                .snippet("新北市三重區大智街260號"+'\n'+"02-29855892"));
        makerOpt.position(GJH);

        LatLng RFJ = new LatLng(25.105614, 121.817488);
        mMap.addMarker(new MarkerOptions()
                .position(RFJ)
                .title("瑞芳國中")
                .snippet("新北市瑞芳區三爪子坑路1號"+'\n'+"02-24972145#214"));
        makerOpt.position(RFJ);

        LatLng DNU = new LatLng(25.003296, 121.604445);
        mMap.addMarker(new MarkerOptions()
                .position(DNU)
                .title("東南科技大學數位模型製作空間")
                .snippet("新北市深坑區北深路三段152號"+'\n'+"02-86625974"));
        makerOpt.position(DNU);

        LatLng IOT = new LatLng(25.066270, 121.449388);
        mMap.addMarker(new MarkerOptions()
                .position(IOT)
                .title("物聯網創客基地")
                .snippet("新北市五股區五工五路47號7樓"+'\n'+"02-89956399#2799"));
        makerOpt.position(IOT);

        LatLng SHU = new LatLng(25.226969, 121.451654);
        mMap.addMarker(new MarkerOptions()
                .position(SHU)
                .title("聖約翰科技大學3D設計列印中心")
                .snippet("新北市淡水區淡金路4段499號"+'\n'+"02-28013131"));
        makerOpt.position(SHU);

        LatLng RS = new LatLng(25.058565, 121.543935);
        mMap.addMarker(new MarkerOptions()
                .position(RS)
                .title("3D如水同學會")
                .snippet("台北市中山區復興北路272號2樓"+'\n'+"02-25076962"));
        makerOpt.position(RS);

        LatLng FCT = new LatLng(25.044150, 121.529441);
        mMap.addMarker(new MarkerOptions()
                .position(FCT)
                .title("FabCafe Taipei")
                .snippet("台北市中正區八德路一段1號"+'\n'+"02-33224749"));
        makerOpt.position(FCT);

        LatLng FBT = new LatLng(25.029191, 121.516080);
        mMap.addMarker(new MarkerOptions()
                .position(FBT)
                .title("Fablab Taipei")
                .snippet("台北市重慶南路三段15巷9號1樓"+'\n'+"02-23223387"));
        makerOpt.position(FBT);

        LatLng MBT = new LatLng(25.041241, 121.529483);
        mMap.addMarker(new MarkerOptions()
                .position(MBT)
                .title("Markerbar Taipei")
                .snippet("台北市中正區金山南路一段9號5樓"+'\n'+"02-23221772"));
        makerOpt.position(MBT);

        LatLng MP = new LatLng(25.025042, 121.523137);
        mMap.addMarker(new MarkerOptions()
                .position(MP)
                .title("MakerPro")
                .snippet("台北市南昌路二段146號2樓"+'\n'+"02-23679308"));
        makerOpt.position(MP);

        LatLng NTU = new LatLng(25.015200, 121.537509);
        mMap.addMarker(new MarkerOptions()
                .position(NTU)
                .title("NTUMaker台灣大學")
                .snippet("台北市大安區羅斯福路四段1號"+'\n'+"02-33663366"));
        makerOpt.position(NTU);

        LatLng OT = new LatLng(25.010834, 121.532407);
        mMap.addMarker(new MarkerOptions()
                .position(OT)
                .title("Openlab Taipei")
                .snippet("台北市中正區汀州路三段230巷37弄8號"+'\n'+"02-23645313"));
        makerOpt.position(OT);

        LatLng TH = new LatLng(25.052901, 121.516884);
        mMap.addMarker(new MarkerOptions()
                .position(TH)
                .title("Taipei Hackerspace")
                .snippet("台北市太原路133巷26號4樓"+'\n'+"02-25507630"));
        makerOpt.position(TH);

        LatLng TSE = new LatLng(24.990414, 121.559161);
        mMap.addMarker(new MarkerOptions()
                .position(TSE)
                .title("私立再興小學FabLab")
                .snippet("台北市文山區興隆路四段2號"+'\n'+"02-29371118"+'\n'+"02-29371119"));
        makerOpt.position(TSE);

        LatLng TTU = new LatLng(25.009193, 121.539071);
        mMap.addMarker(new MarkerOptions()
                .position(TTU)
                .title("國立台灣科技大學")
                .snippet("台北市羅斯福路四段113巷19弄3號"+'\n'+"02-27333141#7130"));
        makerOpt.position(TTU);

        LatLng TUD = new LatLng(25.024624, 121.544637);
        mMap.addMarker(new MarkerOptions()
                .position(TUD)
                .title("國立台北教育大學創意自造中心&創客實驗室")
                .snippet("台北市大安區和平東路二段134號"+'\n'+"02-27321104#63465/#70010"));
        makerOpt.position(TUD);

        LatLng TNU = new LatLng(25.025951, 121.527489);
        mMap.addMarker(new MarkerOptions()
                .position(TNU)
                .title("國立臺灣師範大學自造大師基地")
                .snippet("台北市和平東路一段162號"+'\n'+"02-77343430"+'\n'+"02-77341242"));
        makerOpt.position(TNU);

        LatLng DMC = new LatLng(25.071328, 121.595649);
        mMap.addMarker(new MarkerOptions()
                .position(DMC)
                .title("國防醫學院Fablab")
                .snippet("台北市內湖區民權東路六段161號"+'\n'+"0931-684-890"));
        makerOpt.position(DMC);

        LatLng SCU = new LatLng(25.083272, 121.545147);
        mMap.addMarker(new MarkerOptions()
                .position(SCU)
                .title("實踐大學媒體傳達設計學系FABLAB")
                .snippet("台北市大直街70號"+'\n'+"02-25381111#7328"));
        makerOpt.position(SCU);

        LatLng DTU = new LatLng(25.067154, 121.521804);
        mMap.addMarker(new MarkerOptions()
                .position(DTU)
                .title("大同大學未來產房")
                .snippet("台北市中山區中山北路三段40號"+'\n'+"02-55760311"));
        makerOpt.position(DTU);

        LatLng LDD = new LatLng(25.022494, 121.529927);
        mMap.addMarker(new MarkerOptions()
                .position(LDD)
                .title("綠點點點點 - 社區營造基地")
                .snippet("台北市大安區古風里雲和街72巷9號"+'\n'+"0963-928-391"));
        makerOpt.position(LDD);

        LatLng TY = new LatLng(25.038982, 121.522255);
        mMap.addMarker(new MarkerOptions()
                .position(TY)
                .title("台北市青少年發展處創新學習基地")
                .snippet("台北市中正區仁愛路一段17號9樓"+'\n'+"02-23514078#1113"));
        makerOpt.position(TY);

        LatLng YYD = new LatLng(25.085563, 121.523113);
        mMap.addMarker(new MarkerOptions()
                .position(YYD)
                .title("英業達雲豹1號夢工廠")
                .snippet("台北市士林區承德路四段166號"+'\n'+"02-28810721"));
        makerOpt.position(YYD);

        LatLng TNUH = new LatLng(25.033659, 121.540488);
        mMap.addMarker(new MarkerOptions()
                .position(TNUH)
                .title("師大附中附製工坊")
                .snippet("台北市大安區信義路三段143號"+'\n'+"02-27075215"));
        makerOpt.position(TNUH);

        LatLng MK = new LatLng(25.040631, 121.538083);
        mMap.addMarker(new MarkerOptions()
                .position(MK)
                .title("魅客空間")
                .snippet("台北市大安區建國南路一段177號"+'\n'+"02-77085090"));
        makerOpt.position(MK);

        LatLng IF = new LatLng(25.042729, 121.538529);
        mMap.addMarker(new MarkerOptions()
                .position(IF)
                .title("點子工場 / 自造工坊")
                .snippet("台北市忠孝東路三段193巷"+'\n'+"02-27712171#1460"));
        makerOpt.position(IF);

        LatLng DMS = new LatLng(25.135276, 121.729937);
        mMap.addMarker(new MarkerOptions()
                .position(DMS)
                .title("3D創客新學園")
                .snippet("基隆市安樂區安一路360號"+'\n'+"02-24236600"));
        makerOpt.position(DMS);

        LatLng CYU = new LatLng(25.131924, 121.754456);
        mMap.addMarker(new MarkerOptions()
                .position(CYU)
                .title("崇右技術學院創意商品設計系")
                .snippet("基隆市信義區義七路40號"+'\n'+"02-24237785#556#557"));
        makerOpt.position(CYU);

        LatLng AL = new LatLng(24.965604, 121.225492);
        mMap.addMarker(new MarkerOptions()
                .position(AL)
                .title("Ark Lab多旋翼工坊")
                .snippet("桃園市中壢區環北路390號"+'\n'+"0935-811-226"));
        makerOpt.position(AL);

        LatLng LHU = new LatLng(25.017519, 121.402853);
        mMap.addMarker(new MarkerOptions()
                .position(LHU)
                .title("龍華科技大學Fablab")
                .snippet("桃園市龜山區萬壽路一段300號"+'\n'+"02-82093211#3831"));
        makerOpt.position(LHU);

        LatLng NLU = new LatLng(24.978016, 121.255741);
        mMap.addMarker(new MarkerOptions()
                .position(NLU)
                .title("內壢高中FabLab")
                .snippet("桃園市中壢區成章四街120號"+'\n'+"03-4528080#211"));
        makerOpt.position(NLU);

        LatLng NCU = new LatLng(24.968420, 121.195666);
        mMap.addMarker(new MarkerOptions()
                .position(NCU)
                .title("中央大學創意園區")
                .snippet("桃園市中壢區中大路300號"+'\n'+"03-4227151"));
        makerOpt.position(NCU);

        LatLng CYM = new LatLng(24.957498, 121.240539);
        mMap.addMarker(new MarkerOptions()
                .position(CYM)
                .title("中原大學創客夢工廠")
                .snippet("桃園市中壢區中北路200號"+'\n'+"03-2654500"));
        makerOpt.position(CYM);

        LatLng NYU = new LatLng(24.936878, 121.251668);
        mMap.addMarker(new MarkerOptions()
                .position(NYU)
                .title("南亞技術學院 南工創客實驗室")
                .snippet("桃園市中壢區中山東路三段414號"+'\n'+"03-4361070#6933"));
        makerOpt.position(NYU);

        LatLng GTR = new LatLng(25.006105, 121.235557);
        mMap.addMarker(new MarkerOptions()
                .position(GTR)
                .title("鋼鐵人實作基地")
                .snippet("桃園市中壢區內定16街842號之1"+'\n'+"02-27075215"));
        makerOpt.position(GTR);

        LatLng YC = new LatLng(24.965753, 121.225882);
        mMap.addMarker(new MarkerOptions()
                .position(YC)
                .title("青創指揮部")
                .snippet("桃園市中壢區環北路390號3樓"+'\n'+"03-4225205"));
        makerOpt.position(YC);

        LatLng ICFA = new LatLng(24.888284, 121.133733);
        mMap.addMarker(new MarkerOptions()
                .position(ICFA)
                .title("衣啟飛翔創客基地")
                .snippet("桃園市楊梅區秀才路851號"+'\n'+"03-4855368#625#620"));
        makerOpt.position(ICFA);

        LatLng ICFB = new LatLng(24.815689, 120.962720);
        mMap.addMarker(new MarkerOptions()
                .position(ICFB)
                .title("衣啟飛翔創客基地")
                .snippet("新竹市北區武陵路10號"+'\n'+"03-4855368#625#620"));
        makerOpt.position(ICFB);

        LatLng CHU = new LatLng(24.796350, 120.995007);
        mMap.addMarker(new MarkerOptions()
                .position(CHU)
                .title("清華大學WeSchool維創工坊")
                .snippet("新竹市光復路二段101號"+'\n'+"03-5751201"));
        makerOpt.position(CHU);

        LatLng HCL = new LatLng(24.796936, 121.010941);
        mMap.addMarker(new MarkerOptions()
                .position(HCL)
                .title("新竹工具圖書館 / 般若來集成工程")
                .snippet("新竹市公道五路二段60巷8-1號"+'\n'+"03-6662325"));
        makerOpt.position(HCL);

        LatLng MSU = new LatLng(24.863851, 120.991217);
        mMap.addMarker(new MarkerOptions()
                .position(MSU)
                .title("明新科技大學")
                .snippet("新竹縣新豐鄉新興路1號"+'\n'+"03-5593142#2238"));
        makerOpt.position(MSU);

        LatLng CWC = new LatLng(24.803045, 120.953708);
        mMap.addMarker(new MarkerOptions()
                .position(CWC)
                .title("造物者工坊")
                .snippet("新竹市凌雲街38號1樓之5"+'\n'+"03-5262332"));
        makerOpt.position(CWC);

        LatLng MLH = new LatLng(24.556469, 120.834083);
        mMap.addMarker(new MarkerOptions()
                .position(MLH)
                .title("苗栗農工FabLab")
                .snippet("苗栗縣苗栗市經國路二段491號"+'\n'+"03-7329281#601"));
        makerOpt.position(MLH);

        LatLng LHM = new LatLng(24.545713, 120.812257);
        mMap.addMarker(new MarkerOptions()
                .position(LHM)
                .title("國立聯合大學創客空間")
                .snippet("苗栗縣苗栗市恭敬里聯大一號"+'\n'+"03-7381453"));
        makerOpt.position(LHM);

        LatLng TCH = new LatLng(24.113420, 120.661341);
        mMap.addMarker(new MarkerOptions()
                .position(TCH)
                .title("台中高工FabLab")
                .snippet("台中市南區高工路191號"+'\n'+"04-22613158#7010#7011"));
        makerOpt.position(TCH);

        LatLng FCU = new LatLng(24.181635, 120.646415);
        mMap.addMarker(new MarkerOptions()
                .position(FCU)
                .title("逢甲大學G-Print創客中心")
                .snippet("台中市西屯區文華路100號"+'\n'+"04-24517250"));
        makerOpt.position(FCU);

        LatLng LF = new LatLng(24.144772, 120.660387);
        mMap.addMarker(new MarkerOptions()
                .position(LF)
                .title("Linkin Factory聯合工廠")
                .snippet("台中市西區中美街102號"+'\n'+"04-23020112"));
        makerOpt.position(LF);

        LatLng TCN = new LatLng(24.152130, 120.683696);
        mMap.addMarker(new MarkerOptions()
                .position(TCN)
                .title("TCN創客基地")
                .snippet("台中市北區錦平街40號2樓"+'\n'+"04-37007777"));
        makerOpt.position(TCN);

        LatLng SPU = new LatLng(24.095313, 120.713765);
        mMap.addMarker(new MarkerOptions()
                .position(SPU)
                .title("修平科大智慧生活創新創業育成平台")
                .snippet("台中市大里區工業路11號"+'\n'+"04-24961100#2011"));
        makerOpt.position(SPU);

        LatLng CYF = new LatLng(24.146558, 120.733358);
        mMap.addMarker(new MarkerOptions()
                .position(CYF)
                .title("國立勤益科技大學多功能實習工場")
                .snippet("台中市太平區坪林里中山路二段57號"+'\n'+"04-23924505#2151"));
        makerOpt.position(CYF);

        LatLng CYT = new LatLng(24.072821, 120.715414);
        mMap.addMarker(new MarkerOptions()
                .position(CYT)
                .title("朝陽科技大學產學合作處創新創業發展中心")
                .snippet("台中市霧峰區吉峰東路168號"+'\n'+"04-23323000#6302"));
        makerOpt.position(CYT);

        LatLng THU = new LatLng(24.182416, 120.602728);
        mMap.addMarker(new MarkerOptions()
                .position(THU)
                .title("東海大學工業設計系Maker Studio")
                .snippet("台中市西屯區台灣大道四段1727號"+'\n'+"04-23594646#30"));
        makerOpt.position(THU);

        LatLng CSH = new LatLng(24.265249, 120.574098);
        mMap.addMarker(new MarkerOptions()
                .position(CSH)
                .title("清水高中自造實驗室")
                .snippet("台中市清水區中山路90號科學館2樓"+'\n'+"0935-387-268"));
        makerOpt.position(CSH);

        LatLng BRF = new LatLng(24.092317, 120.582854);
        mMap.addMarker(new MarkerOptions()
                .position(BRF)
                .title("百忍工坊 - 木工忍者的現代工坊")
                .snippet("彰化市聖安路563號"+'\n'+"0972-366-686"));
        makerOpt.position(BRF);

        LatLng DCH = new LatLng(23.948164, 120.601044);
        mMap.addMarker(new MarkerOptions()
                .position(DCH)
                .title("私立大慶商工職業學校")
                .snippet("彰化縣員林市山腳路二段206號"+'\n'+"04-8311005#212"));
        makerOpt.position(DCH);

        LatLng MOLI = new LatLng(23.950229, 120.930108);
        mMap.addMarker(new MarkerOptions()
                .position(MOLI)
                .title("MOLi創新自造者開放實驗室")
                .snippet("南投縣埔里鎮大學路 470 號"+'\n'+"管理學院 237 室"+'\n'+"0953-033-076"));
        makerOpt.position(MOLI);

        LatLng NTM = new LatLng(23.903614, 120.689637);
        mMap.addMarker(new MarkerOptions()
                .position(NTM)
                .title("南投創客基地")
                .snippet("南投縣南投市三和一路8號"+'\n'+"04-97008768"));
        makerOpt.position(NTM);

        LatLng TDH = new LatLng(23.998420, 120.695346);
        mMap.addMarker(new MarkerOptions()
                .position(TDH)
                .title("同德家商")
                .snippet("南投縣草屯鎮中正路培英巷8號"+'\n'+" 04-92553109"));
        makerOpt.position(TDH);

        LatLng NKU = new LatLng(23.979233, 120.696843);
        mMap.addMarker(new MarkerOptions()
                .position(NKU)
                .title("南開科技大學多媒體動畫應用系")
                .snippet("南投縣草屯鎮中正路568號"+'\n'+"04-92563489#2842"));
        makerOpt.position(NKU);

        LatLng HWU = new LatLng(23.703108, 120.430151);
        mMap.addMarker(new MarkerOptions()
                .position(HWU)
                .title("國立虎尾科技大學創意夢工場")
                .snippet("雲林縣虎尾鎮文化路64號"+'\n'+"05-6315913"));
        makerOpt.position(HWU);

        LatLng YKD = new LatLng(23.695850, 120.534012);
        mMap.addMarker(new MarkerOptions()
                .position(YKD)
                .title("雲科大自造者基地：跨領域創意工場")
                .snippet("雲林縣斗六市大學路三段123號"+'\n'+"05-5342601"));
        makerOpt.position(YKD);

        LatLng MV = new LatLng(23.561461, 120.473388);
        mMap.addMarker(new MarkerOptions()
                .position(MV)
                .title("Maker Village")
                .snippet("嘉義縣民雄鄉三興村7鄰大學路一段168號"+'\n'+"0958-065-568"));
        makerOpt.position(MV);

        LatLng NHU = new LatLng(23.569313, 120.494306);
        mMap.addMarker(new MarkerOptions()
                .position(NHU)
                .title("南華大學創意模型、造型設計、陶藝工坊" )
                .snippet("嘉義縣大林鎮中坑里南華路一段55號"+'\n'+"05-2721001#8641"));
        makerOpt.position(NHU);

        LatLng TTH = new LatLng(23.005492, 120.212414);
        mMap.addMarker(new MarkerOptions()
                .position(TTH)
                .title("台南二中FabLab" )
                .snippet("台南市北區北門路二段125號"+'\n'+"06-2514526#604#305"));
        makerOpt.position(TTH);

        LatLng THH = new LatLng(22.993590, 120.151774);
        mMap.addMarker(new MarkerOptions()
                .position(THH)
                .title("台南海事FabLab" )
                .snippet("台南市安平區世平路1號"+'\n'+"06-3910772#211"));
        makerOpt.position(THH);

        LatLng TOG = new LatLng(23.012698, 120.227942);
        mMap.addMarker(new MarkerOptions()
                .position(TOG)
                .title("TO.GATHER自造者樂園" )
                .snippet("台南市永康區中山南路81號"+'\n'+"06-2084879"));
        makerOpt.position(TOG);

        LatLng NFM = new LatLng(23.310677, 120.322653);
        mMap.addMarker(new MarkerOptions()
                .position(NFM)
                .title("南方創客基地" )
                .snippet("台南市新營區大同路32號"+'\n'+"06-6356583"));
        makerOpt.position(NFM);

        LatLng PD = new LatLng(22.991824, 120.205026);
        mMap.addMarker(new MarkerOptions()
                .position(PD)
                .title("台南胖地" )
                .snippet("台南市中西區南門路21號4樓"+'\n'+"06-2212245"));
        makerOpt.position(PD);

        LatLng KSU = new LatLng(22.998268, 120.253104);
        mMap.addMarker(new MarkerOptions()
                .position(KSU)
                .title("崑山科技大學3D列印實習工廠"+'\n'+"創新創意產品實作中心" )
                .snippet("台南市永康區崑大路195號"+'\n'+"工程一館2樓E1202/4樓"+'\n'+"06-2727175#329/#330"));
        makerOpt.position(KSU);

        LatLng CJCU = new LatLng(22.912056, 120.271943);
        mMap.addMarker(new MarkerOptions()
                .position(CJCU)
                .title("長榮大學O PLUS創新設計工坊" )
                .snippet("台南市歸仁區長大路1號第一宿舍地下一樓"+'\n'+"06-2785123"));
        makerOpt.position(CJCU);

        LatLng NCKU = new LatLng(22.996244, 120.222172);
        mMap.addMarker(new MarkerOptions()
                .position(NCKU)
                .title("成電創客學園" )
                .snippet("台南市東區大學路1號自強校區奇美樓1樓"+'\n'+"06-2372845"));
        makerOpt.position(NCKU);

        LatLng KSD = new LatLng(22.781978, 120.405125);
        mMap.addMarker(new MarkerOptions()
                .position(KSD)
                .title("高師大FabLab" )
                .snippet("高雄市燕巢區深中路62號"+'\n'+"07-7172930#7501/0933-304-689"));
        makerOpt.position(KSD);

        LatLng FSH = new LatLng(22.634185, 120.358030);
        mMap.addMarker(new MarkerOptions()
                .position(FSH)
                .title("鳳山商工FabLab" )
                .snippet("高雄市鳳山區文衡路51號"+'\n'+"07-7417823/0929-288-157"));
        makerOpt.position(FSH);

        LatLng FLM = new LatLng(22.756829, 120.335781);
        mMap.addMarker(new MarkerOptions()
                .position(FLM)
                .title("FI LAB創夢工場" )
                .snippet("高雄市燕巢區大學路1號"+'\n'+"07-6011000#1420-1422"));
        makerOpt.position(FLM);

        LatLng ML = new LatLng(22.660073, 120.303301);
        mMap.addMarker(new MarkerOptions()
                .position(ML)
                .title("MakerLab創客萊吧" )
                .snippet("高雄市左營區博愛二路202號地下一樓"+'\n'+"07-5564686/0932-882-942"));
        makerOpt.position(ML);

        LatLng MSC = new LatLng(22.593389, 120.308612);
        mMap.addMarker(new MarkerOptions()
                .position(MSC)
                .title("創客小棧" )
                .snippet("高雄市前鎮區凱旋四路105號"+'\n'+"07-8210171#2866"));
        makerOpt.position(MSC);

        LatLng YSU = new LatLng(22.727172, 120.405822);
        mMap.addMarker(new MarkerOptions()
                .position(YSU)
                .title("義守大學智慧型機器人中心" )
                .snippet("高雄市大樹區學城路一段1號科技大樓9樓"+'\n'+"07-6577711#2124"));
        makerOpt.position(YSU);

        LatLng NUK = new LatLng(22.734415, 120.285178);
        mMap.addMarker(new MarkerOptions()
                .position(NUK)
                .title("高雄大學應用物理學系" )
                .snippet("高雄市楠梓區高雄大學路700號518-1實驗室"+'\n'+"07-5918879"));
        makerOpt.position(NUK);

        LatLng CCU = new LatLng(22.586783, 120.319752);
        mMap.addMarker(new MarkerOptions()
                .position(CCU)
                .title("前鎮高中" )
                .snippet("高雄市前鎮區鎮中路132號"+'\n'+"07-8226841#106"));
        makerOpt.position(CCU);

        LatLng LCH = new LatLng(22.653742, 120.326524);
        mMap.addMarker(new MarkerOptions()
                .position(LCH)
                .title("立志高中" )
                .snippet("高雄市三民區大昌一路98號"+'\n'+"07-3922601#103"));
        makerOpt.position(LCH);

        LatLng RSH = new LatLng(22.601546, 120.325369);
        mMap.addMarker(new MarkerOptions()
                .position(RSH)
                .title("瑞祥高中" )
                .snippet("高雄市前鎮區班超路63號"+'\n'+"0920-921-815"));
        makerOpt.position(RSH);

        LatLng KSC = new LatLng(22.622877, 120.306988);
        mMap.addMarker(new MarkerOptions()
                .position(KSC)
                .title("高雄造物者" )
                .snippet("高雄市新興區忠孝一路40號二樓"+'\n'+"0986-320-959"));
        makerOpt.position(KSC);

        LatLng HOM = new LatLng(22.675092, 120.485182);
        mMap.addMarker(new MarkerOptions()
                .position(HOM)
                .title("HO覓藝文實驗研究所" )
                .snippet("屏東市中山路58-3號"+'\n'+"08-7666348"));
        makerOpt.position(HOM);

        LatLng PTU = new LatLng(22.669347, 120.504438);
        mMap.addMarker(new MarkerOptions()
                .position(PTU)
                .title("屏東大學動手作科學教育中心" )
                .snippet("屏東市林森路1號"+'\n'+"08-7663800#33002"));
        makerOpt.position(PTU);

        LatLng TFT = new LatLng(22.764905, 121.142299);
        mMap.addMarker(new MarkerOptions()
                .position(TFT)
                .title("台東大學Fablab Taitung台東自造" )
                .snippet("台東市四維路三段105巷25號"+'\n'+"08-9325918"));
        makerOpt.position(TFT);

        LatLng OZ = new LatLng(24.013355, 121.629540);
        mMap.addMarker(new MarkerOptions()
                .position(OZ)
                .title("工業技術研究院OMEGA ZONE" )
                .snippet("花蓮縣花蓮市精美路18號"+'\n'+"03-8239860"));
        makerOpt.position(OZ);

        LatLng CZU = new LatLng(23.996759, 121.564754);
        mMap.addMarker(new MarkerOptions()
                .position(CZU)
                .title("慈濟科技大學創客空間" )
                .snippet("花蓮縣花蓮市建國路二段880號"+'\n'+"研究發展處 智耕樓5樓"+'\n'+"03-8572158#2755"));
        makerOpt.position(CZU);

        LatLng HLH = new LatLng(23.998651, 121.620594);
        mMap.addMarker(new MarkerOptions()
                .position(HLH)
                .title("花蓮高工東區自造實驗室" )
                .snippet("花蓮縣花蓮市府前路27號"+'\n'+"03-8226108#661"));
        makerOpt.position(HLH);



        LatLng CENTER = new LatLng(23.973875,120.982024);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CENTER,7));

        CustomInfoWindowAdapter adapter = new CustomInfoWindowAdapter(MapsActivity.this);
        googleMap.setInfoWindowAdapter(adapter);
    }

}
