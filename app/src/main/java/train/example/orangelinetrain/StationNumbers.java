package train.example.orangelinetrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class StationNumbers extends AppCompatActivity {

    CardView dashboard,station1,station2,station3,station4,station5,station6,station7,station8,station9,station10,station11,station12,station13;
    CardView station14,station15,station16,station17,station18,station19,station20,station21,station22,station23,station24,station25,station26;
    private AdView adView,adView1,adView2,adView3;
    AdRequest adRequest,adRequest1,adRequest2,adRequest3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_numbers);

        adView = (AdView) findViewById(R.id.ad_View);
        adView1 = (AdView) findViewById(R.id.ad_View1);
        adView2 = (AdView) findViewById(R.id.ad_View2);
        adView3 = (AdView) findViewById(R.id.ad_View3);
        adRequest = new AdRequest.Builder().build();
        adRequest1 = new AdRequest.Builder().build();
        adRequest2 = new AdRequest.Builder().build();
        adRequest3 = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        adView1.loadAd(adRequest1);
        adView2.loadAd(adRequest2);
        adView3.loadAd(adRequest3);
    }

    // start of banner ads
    @Override
    public void onPause() {
        if (adView != null) {
            adView.pause();
        }
        if (adView1 != null) {
            adView1.pause();
        }
        if (adView2 != null) {
            adView2.pause();
        }if (adView3 != null) {
            adView3.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (adView != null) {
            adView.resume();
        }
        if (adView1 != null) {
            adView1.resume();
        }
        if (adView2 != null) {
            adView2.resume();
        } if (adView3 != null) {
            adView3.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }if (adView1 != null) {
            adView1.destroy();
        }if (adView2 != null) {
            adView2.destroy();
        }if (adView3 != null) {
            adView3.destroy();
        }
        super.onDestroy();
    }
    // end of banner


    public void onClicks(View v) {
        Intent intent = new Intent(StationNumbers.this,Ali_Town.class);

        switch (v.getId()) {
            case R.id.st1:
//                Toast.makeText(StationNumbers.this, "Ali Town", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Ali Town");
                intent.putExtra("stationLocation","Raiwind Rd, Ali Town Thokar Niaz Baig, Lahore, Punjab, Pakistan");
                intent.putExtra("station_roads", "Raiwind road,Aitchison Street,Gourmet street,Shan Bhatti Road,Total pump street,Hashmi Street,Sultan Town street");
                intent.putExtra("station_Education","University of Lahore,University College Lahore,Rana Academy of Science,The Punjab Schools,KIPS Academy,Govt Special Education,LACAS boys campus,Al Quaid College,Institute of CA");
                intent.putExtra("station_shoping","Metro Cash & Carry,Diamond Supreme Foam,Mian Plaza,Nishat Factory Outlet,55th Avenue,Mobile Market");
                intent.putExtra("station_restaurent","Tandoor restaurant,PUBG Restaurant,Dal Daal,Yasir Broast,Signature Teahouse & Rooftop Restaurant, Al Khan Restaurant, Ilyas Dumba Karahi, Musa Tawazo Chinese restaurant, Mast Mahool Café, Fri-Chiks Raiwind,grilled thrilled burgers, Marhaba restaurant, Galito’s–flame Grilled Chicken,Captain cook restaurant & naan shop, Buddies fast Food & restaurant, Al-Desi Restaurant, Ravi Restaurant, Al-Madina Family Restauran, Zafar Restaurant, Jhalandri hotel");
                //intent.putExtra("stationLocation","Raiwind Rd, علی ٹاؤن Thokar Niaz Baig, لاہور, Lahore, پنجاب");
                startActivity(intent);
                break;

            case R.id.st2:
//                Toast.makeText(StationNumbers.this, "Thokar Niaz Baig", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Thokar Niaz Baig");
                intent.putExtra("stationLocation","Multan Rd, Sarai, Lahore, Punjab, Pakistan");
                intent.putExtra("station_roads", "Multan Road,Niaz Baig Road,Canal Road,Katar Bund Road, IMT Stop,ASA Pakistan LTD, Post office");
                intent.putExtra("station_Education","Lahore Computer College,Prime Education School,The Gets Knowledge School and academy,CAPS School,Muhamdia public high school,Institute of Maritime Studies");
                intent.putExtra("station_shoping","Metro Cash & Carry,Diamond Supreme Foam,Mian Plaza,Nishat Factory Outlet,Emporium Mall by Nishat Group");
                intent.putExtra("station_restaurent","Choorahi Nan Shop & Koozi Haleem,Choorahi Nan Shop & Koozi Haleem,Chaman bar Ice Cream");

                // intent.putExtra("stationLocation","مُلتان روڈ، Sarai, لاہور, Lahore, پنجاب");
                startActivity(intent);
                break;

            case R.id.st3:
//                Toast.makeText(this, "Canal View", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Canal View");
                intent.putExtra("stationLocation","Munsoora Multan Rd, Canal View, Lahore, Punjab, Pakistan");
                intent.putExtra("station_roads", "Canal View Main Road,Ahbab Colony Road,Mustafa Town Road,Mansora Multan Road,Alhamdulilah Stop");
                intent.putExtra("station_Education","STEAM international college,Allama Iqbal School,Superior group of Clg,Allied School canal view campus");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Zinger Point,Chaudhry Merriage Hall");

                //                intent.putExtra("stationLocation","مُلتان روڈ، Sarai, لاہور, Lahore, پنجاب");
                startActivity(intent);
                break;

            case R.id.st4:
//                Toast.makeText(this, "Hanjarwal", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Hanjarwal");
                intent.putExtra("stationLocation","Multan Rd, Mustafa Town, Lahore, Punjab, Pakistan");
                intent.putExtra("station_roads", "Hanjarwal Road,Samsani Road,Chenab Road,Azam Garden Road,Waves Factory Street");
                intent.putExtra("station_Education","Govt High School,Superior Group of Clg,Lahore College of Pharmacy Technisian,Allied School,The smart school,Islamia Pre School,EFA School,NR School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Khan Akhtar Kaka Khel Hotel,Caspian Sea,Sichuan Chinese Resturant,Rajasthani BBQ. Family Restaurant,Zain Food Point,");

//                intent.putExtra("stationLocation","مُلتان روڈ، مُصطفی ٹاؤن، لاہور, Lahore, پنجاب");
                startActivity(intent);

                break;
            case R.id.st5:
//                Toast.makeText(this, "Wahdat Road", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Wahdat Road");
                intent.putExtra("stationLocation","Mian stop, Multan Chungi road lahore،, Multan Rd, Mustafa Town, Lahore, Punjab, Pakistan");
                intent.putExtra("station_roads", "Wahdat Road,Cinema Wali Street,Multan chungi Niaz baig Rd,P.S.S Hospital Road,Mansorah and Mustafa Town");
                intent.putExtra("station_Education","Al-Noor School System,Idara Taleemul Quran,Khansa Academy,Dawn Academy,READ Internasional Academy,Govt middle School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Malmo sweets and bakers,Muhammad Ali BBQ Family Restaurant,Vicky Fast Food,Al-Waris Fast Food,Babar Samosa Shop");

//                intent.putExtra("stationLocation","پنجاب، Lahore, لاہور، مُصطفی ٹاؤن، مُلتان روڈ Main");
                startActivity(intent);

                break;
            case R.id.st6:
//                Toast.makeText(this, "Awan Town", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Awan Town");
                intent.putExtra("stationLocation","Mehran Block Allama Iqbal Town, Lahore, Punjab, Pakistan");
                intent.putExtra("station_roads", "Allama Iqbal Town,Awan Town,Mian Road,Mehran Block Road,Kharak Road");
                intent.putExtra("station_Education","Virtual University,The Namal Academy of science,Unique Science Academy,Iqra Judicial Academy,Online Quran Academy,Technichal College for Girl,Pak british School,Straight Light School,Allied School junior,Govt Primary School,Govt Primary School,Govt High School,Mayfair Junior Public School,Lahore Public School,Jameel Science School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Dhaba Khaba,Spicy Burger Point,KWC Grill Burgers,McDonald's,WIMPY,Muhammad Ali BBQ Family Restaurant,Al-Waris Fresh Food Point,Bhutto Tikka Restaurant");

                intent.putExtra("stationLocation","Mehran Block Allama Iqbal Town, لاہور, Lahore, پنجاب");
                startActivity(intent);

                break;
            case R.id.st7:
//                Toast.makeText(this, "Sabzazar", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Sabzazar");
                intent.putExtra("stationLocation","Sabzazar station orange line, Multan Rd, Lahore, Pakistan");
                intent.putExtra("station_roads", "Marghazar Road,Fazal e Huq Road,Ravi Block Street,Madni Street,Boston Road");
                intent.putExtra("station_Education","University of Lahore,Concordia College,Got Islamia Clg,Govt College of Science,Prime group of college,City District Goverment School,EFA School System,The Savvy School,Lincoln's Home School,Sir Syed School hassan town,Govt High School boys,Madrassa Azmatul Furqan");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","WIMPY,Pizza 21,Pizza Maestro,Data Darbar BBQ,Noshe Khas Restaurnt,Simki Sweets and Restaurants,Bundu Khan Restaurant,");

                intent.putExtra("stationLocation","Sabzazar station orange line, مُلتان روڈ، لاہور");
                startActivity(intent);

                break;
            case R.id.st8:
//                Toast.makeText(this, "Shahnoor", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Shahnoor");
                intent.putExtra("stationLocation","Plot 231, Badar Block Allama Iqbal Town, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Badar block Road,Anwar e Madina Street, Sabzazar Road,Ch Diaf Gujjar Rd,Saeed pur Road");
                intent.putExtra("station_Education","Concordia college,Govt.Islamia Clg of Commerece,The Brains Academy,Al Sultan Science Academy,Ravians Science acadeemy,International Teachers Academy,Unique academy,KIPS School girls,Edlink School Lahore,The City School,Reliance School,Allied School,Beaconhouse");
                intent.putExtra("station_shoping","Fiza Mega Mall,Tayyaba Outlet,Emporium Mall,Khan Plaza,Paper Planet,Front Shoping centre,Fashion Avenue");
                intent.putExtra("station_restaurent","Jawa Karahi & Fish,Siddique Fish Corner,Muhammadi Nihari");

//                intent.putExtra("stationLocation","Shahnoor, مُلتان روڈ، سبزہ زار Block A Sabzazar Housing Scheme Phase 1 & 2 علامہ اقبال ٹاؤن، لاہور, ضلع لاہور, پنجاب 54000");
                startActivity(intent);

                break;
            case R.id.st9:
//                Toast.makeText(this, "Salahuddin Road", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Salahuddin Road");
                intent.putExtra("stationLocation","Multan Rd, Muslim Block Allama Iqbal Town, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Main Boulevard Sabzazar Rd,Jahanzeb Block Rd,Muslim Block Rd,Tipu Street,Shah Fareed Park Rd");
                intent.putExtra("station_Education","Apex Group of college,Prime Group of college,Art Academy,AEPS academy,EFOS Academy,Al huda School,Dar-e-Arqam School,Govt Primary School,PIPS School System,Madinah Aims Schools,Beaconhouse AIT senior campus");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Jawa karahi & Fish,Shahi Restaurant,Siddique Fish Corner,Goga Naqeeba murgh Chanay,Pizza Max");

//                intent.putExtra("stationLocation","مُلتان روڈ، Muslim Block Allama Iqbal Town, لاہور, Lahore, پنجاب 54000");
                startActivity(intent);

                break;
            case R.id.st10:
//                Toast.makeText(this, "Bund Road", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Bund Road");
                intent.putExtra("stationLocation","Band Rd, Samanabad Town, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Bund Road, AL-Mumtaz Road,Islamia School Street,Jadoo Street,Dholanwan Road");
                intent.putExtra("station_Education","Govt Islmia School,Lahore Polytecnic Institute,Anjuman Himayat-e-Islam,Garison Public School Sharif Park,HMAS Academy,Gateway Academy,Stars Science academy,Scholars Academy");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Hajvery Restaurant,Taste Factory Restaurant");

//                intent.putExtra("stationLocation","بند روڈ، سمن آباد ٹاؤن، لاہور, ضلع لاہور, پنجاب 54000");
                startActivity(intent);

                break;
            case R.id.st11:
//                Toast.makeText(this, "Samanabad", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Samanabad");
                intent.putExtra("stationLocation","Samanabad Town, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Samnabad town Road,New Shalimar Road,Mahira Abad Road,Noor Street,Abu Bakar Street");
                intent.putExtra("station_Education","Hussain Model School,ALi Academy,Majid Academy,MACS Academy,Study Connections Academy,APEX Academy,Axiom Academy,Habib LYCEUM School,MicroEsol,LGS Samnabad campus");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Ni Hao Chinese Restaurant,Butt Chicken Karahi,Malik Nan & Nashta shop");

                startActivity(intent);

                break;
            case R.id.st12:
//                Toast.makeText(this, "Gulshan-e-Ravi", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Gulshan-e-Ravi");
                intent.putExtra("stationLocation","49 Multan Rd, Nawankot Samanabad Town, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Samanabad main Boulevard,Main Blvd gulshan ravi,Link Ferozpur Road,Muhammadi Street,Nalay Wali Sreet ");
                intent.putExtra("station_Education","Central College,IBL College,PACS Academy,Al Asr Academy,The Rising Science Acadmy,City District Govt junior High School,Excel School,Bright Foundation School,Allied School,Govt Primary School,Hajveri Lyceum School,Excellence School System,Eden Rose School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Dogar Restaurat and Barbeque,Sardar Foods");

                startActivity(intent);

                break;
            case R.id.st13:
//                Toast.makeText(this, "Chauburji", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Chauburji");
                intent.putExtra("stationLocation","Multan Rd, Pounch House Colony Chauburji Quarters, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Chauburji Park Road,Poonch Road,Shamnagar Road,Bhalwapur Road,Bhawal Sher Road");
                intent.putExtra("station_Education","Virtual University,Kipling college,VTI,MAO College,Goverment School For Physical Disable,Allied School,TF School,Old Ravians Public School,Govt Girls High School,Govt boys High School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Big Bite One Tikka,Khan Baba Restaurant");

                startActivity(intent);

                break;
            case R.id.st14:
//                Toast.makeText(this, "Anarkali", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Anarkali");
                intent.putExtra("stationLocation","Syed Mauj Darya Rd, Anarkali Bazaar Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Syed Mauj Darya Rd,Farid Court Road,Mazang Road,Lodge Road,Lake Road");
                intent.putExtra("station_Education","Shaheen College of Short Hand,Edge College,Unique College,Govt technical Clg for women,Concordia College,University of Education,PMDC Academy,Punjab Judicial Academy,Dar e Arqam New Campus,Govt Fatima Girls High School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Sam's Kitchen,Yasir Broast");

//                intent.putExtra("stationLocation","Syed Mauj Darya Rd, انارکلی بازار لاہور, ضلع لاہور, پنجاب 54000");
                startActivity(intent);

                break;
            case R.id.st15:
//                Toast.makeText(this, "GPO", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","GPO");
                intent.putExtra("stationLocation","Anarkali Bazaar Lahore, Punjab 54000, Pakistan, Mall Rd, Mozang Chungi, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Mall Road,McLeaod Road,Mayo Hospital Road,Thronton Road,Ustad Allah Baksh Rd");
                intent.putExtra("station_Education","National Clg of Arts,Toppers Academy,Unique City Academy,Learning Place Academy,Grace English High School,PICS School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Yasir Broast,Pardise Restaurant,Champion fruit chat");

//                intent.putExtra("stationLocation",",مال روڈ، مزنگ چونگی، لاہور, ضلع لاہور, پنجاب 54000انارکلی بازار لاہور, ضلع لاہور, پنجاب 54000");
                startActivity(intent);

                break;
            case R.id.st16:
//                Toast.makeText(this, "Lakshami", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Lakshami");
                intent.putExtra("stationLocation","102 McLeod Rd, Qila Gujjar Singh, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "McLeod Road,Shah abu al Mali Rd,Police Line Road,Flemking Road,Montgomnery Road");
                intent.putExtra("station_Education","Govt Islamia Clg,Allied school city campus,The Spectrum School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Sheefa restaurat,Savour food,Lasani Restaurant,Tabaaq Restaurat,Asia Restaurant");

//                intent.putExtra("stationLocation","102 میکلوڈ روڈ، قلعہ گُجر سنگھ، لاہور, Lahore, پنجاب 54000");
                startActivity(intent);

                break;
            case R.id.st17:
//                Toast.makeText(this, "Railway Station", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Railway Station");
                intent.putExtra("stationLocation","Nicholson Rd, Garhi Shahu, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Nicholson Rd,Empress Road,Bogi Road,Gari Shaho Road,Allama Iqbal Road");
                intent.putExtra("station_Education","Kinaired Academy,Ayesha Siddiqua Model Degree College,Grace English High School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Kaka Restaurant,Al-Labiq Family Restaurant,Shifa Karahi Tikka,United Fast Food,Tabaaq Restaurant");

//                intent.putExtra("stationLocation","نکلسن روڈ، گڑہی شاہو، لاہور, Lahore, پنجاب 54000");
                startActivity(intent);

                break;
            case R.id.st18:
//                Toast.makeText(this, "Sultanpura", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Sultanpura");
                intent.putExtra("stationLocation","G.T Road, Mughalpura, Lahore, Punjab, Pakistan");
                intent.putExtra("station_roads", "G.T Road,Mughalpura Road,UET road,Street 15,Al-Khawarizmi institute Rd");
                intent.putExtra("station_Education","PR Axis college for women,Government Primary School,Bluebells foundation School & Academy,Allied School,P.R High School,BSM Academy,Uni Science Academy,Premier Academy");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Muhammadi Nahari House,SHASKA BURGERS,Pizza House,Lal Badshah Restaurant,bhola jalebi corner");

//                intent.putExtra("stationLocation","جی ٹی روڈ، مغلپورہ، لاہور, Lahore, پنجاب");
                startActivity(intent);

                break;
            case R.id.st19:
//                Toast.makeText(this, "UET", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","UET");
                intent.putExtra("stationLocation","G.T. Rd, Mughalpura, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "G.T Road,UET Auditorium Road,UET Physics Department,Gulabi Bagh street,FS Corporation street");
                intent.putExtra("station_Education","University of Eng. & Tech,Lahore College of Commerce & Computer Sciences,Ravi College for Women");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Shahi Tikka,Best Shwarma,Khan Shinwari Hotel");

//                intent.putExtra("stationLocation","جی ٹی روڈ، مغلپورہ، لاہور, Lahore, پنجاب 54000");
                startActivity(intent);

                break;
            case R.id.st20:
//                Toast.makeText(this, "Baghbanpura", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Baghbanpura");
                intent.putExtra("stationLocation","G. T. Road, Baghbanpura, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Sehar Road,Baghbanpura Road,G.T Road,Singhpura Road,Post Office Street ");
                intent.putExtra("station_Education","Oxford College of Science,Radiant Academy,Al-Sheikh Academy,GreenLand Grammer School,Honors School System,Royal Grammer School System,The Nation Grammer School,New Lahore Grammer School,Naveed Foundtion School,Stamford Grammer School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","KFC Baghbanpura,Happy fast Food,Rehman Tikka");

//                intent.putExtra("stationLocation","جی ٹی روڈ، باغبان پُورہ، لاہور, Lahore, پنجاب 54000");

                startActivity(intent);

                break;
            case R.id.st21:
//                Toast.makeText(this, "Shalimar Garden", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Shalimar Garden");
                intent.putExtra("stationLocation","Singhpura, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Major Jameel Shaheed Rd,Shalimar Link Road,Huq Nawaz Road,Daras Road,Milap Street");
                intent.putExtra("station_Education","Cant College for women,Masters Academy,Start Academy,METS Academy,Laurel Grammar School,The Stream School,New Light Public High School,Allied School,The Smart School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Fine Burger,Royal Saver Food,Butt Sweets & Bakers");

//                intent.putExtra("stationLocation","Singhpura, لاہور, Lahore, پنجاب 54000");

                startActivity(intent);

                break;
            case R.id.st22:
//                Toast.makeText(this, "Pakistan Mint", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Pakistan Mint");
                intent.putExtra("stationLocation","G. T. Road, Shalamar Town, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Mint Gate Pkwy,Wapda Road,Dilshad Road,Rasheed Pura Road,G.T Road");
                intent.putExtra("station_Education","New Kashmir College,Al-Hassan Academy,Readers Academy,The Torch Bariers Acadmy,3 Star Academy,The Educators School,Thanet Hall School,Allied School,The Spirtual School,Daffodi kids School,Iqra ublic high School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Gourmet Family Restaurant,Food City,Ahmad Fried Chicken,Shinkiari Chapal Kabab,Burger UP");

//                intent.putExtra("stationLocation","جی ٹی روڈ، Shalamar Town, لاہور, Lahore, پنجاب 54000");
                startActivity(intent);

                break;
            case R.id.st23:
//                Toast.makeText(this, "Mahmood Booti", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Mahmood Booti");
                intent.putExtra("stationLocation","AH1, Daroghe Wala, Lahore, Punjab 54000, Pakistan");
                intent.putExtra("station_roads", "Theri Road,Post Office Street,Bund Road,Police Station st,G.T Road");
                intent.putExtra("station_Education","Al-Raheem Academy,Smart Brain Academy,Taha Academy,City College,Al-Falah College,Allied School,Cmbridge School,Paragon Model High School,The Grammer School,M.N.SECONDARY SCHOOL");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Chamman Ice Cream Parlour,Pizza Queen,Karmanwala Restaurant,Gourmet Food,Liaquat Hotel,Rafiq Sweets and Bakers,Rafiq Sweets and Bakers");

//                intent.putExtra("stationLocation","AH1, Daroghe Wala, لاہور, پنجاب 54000");
                startActivity(intent);

                break;
            case R.id.st24:
//                Toast.makeText(this, "Salamat Pura", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Salamat Pura");
                intent.putExtra("stationLocation","Islam Park Orange line station, 343/H2 Grand Trunk Rd, Wagha Town, Lahore, Punjab, Pakistan");
                intent.putExtra("station_roads", "Salamat Pura Road,Sharif Garden street,Shama Park Street,Wagha Town,G.T Road");
                intent.putExtra("station_Education","Malaysian Insitute Of Technology College,Oxford Academy,Allied School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","ALLAH HOO Family Restaurant Branch#2,Lasani muna bhai siri paye & biryani,Nafees biryani,Poppy Chargha House G.T Road");

//                intent.putExtra("stationLocation","Islam Park Orange line station, 343/H2 جی ٹی روڈ، Wagha Town, لاہور, Lahore, پنجاب");
                startActivity(intent);

                break;
            case R.id.st25:
//                Toast.makeText(this, "Islam Park", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Islam Park");
                intent.putExtra("stationLocation","343/H2 Grand Trunk Rd, Wagha Town, Lahore, Punjab, Pakistan");
                intent.putExtra("station_roads", " Sharif Garden Road,G.T Road,Wagah Town road,Zaitoon Colony Road,Salamat Pura Road");
                intent.putExtra("station_Education","Oxford Academy,Star Academy,National Public School,Government Girls School,Eden High School,Laurelbank Public School,Adbistane awesia school");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Ahmad Hamid Dahi Bhaly,Baba Ji Foods,Baloch Food Station");

//                intent.putExtra("stationLocation","343/H2 جی ٹی روڈ، Wagha Town, لاہور, Lahore, پنجاب");
                startActivity(intent);

                break;
            case R.id.st26:
//                Toast.makeText(this, "Dera Gujran", Toast.LENGTH_SHORT).show();
                intent.putExtra("stationName","Dera Gujran");
                intent.putExtra("stationLocation","Grand Trunk Rd, Wagha Town, Lahore, Punjab, Pakistan");
                intent.putExtra("station_roads", "Quid-e-Azam Interchange, Ring Road,Rajba Road,Wagha Town Road,Wara Sittar");
                intent.putExtra("station_Education","Al-RAZI Group of Colleges,intetnational Community School,RIET Lahore,Aden Grammer School,Youngs Scholars School,Little Scholars School");
                intent.putExtra("station_shoping","");
                intent.putExtra("station_restaurent","Pizza Attac time,Raheem khan fast foods and Bar B.Q,The Second Wife B.B.Q");

//                intent.putExtra("stationLocation","جی ٹی روڈ، Wagha Town, لاہور, Lahore, پنجاب");
                startActivity(intent);
                break;
        }
    }
}