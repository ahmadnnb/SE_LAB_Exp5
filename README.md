مراحل انجام پروژه 
یک : ساخت کلاس های مستطیل و مربع
new >> class >> Rectangle
new >> class >> Square
دو: افزودن ویژگی های مورد نیاز مانند طول و عرض
double height , width , side
سه: نوشتن توابع مورد نیاز مانند محاسبه مساحت
computeArea
چهار: افزودن dependency مربوط به تست
<dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-engine</artifactId>
<version>${junit-jupiter.version}</version>
<scope>test</scope>
</dependency>
پنج: افزودن کلاس تست 
MainTest
شش: افزودن توابع در کلاس تست
@Test
@DisplayName("5*3 = 15")
void computeAreaEqualsFourRectangle() {
Rectangle rectangle=new Rectangle();
assertEquals(15,rectangle.computeArea(2,4), "Something went wrong!");
}



اصول solid
اصل اول
این اصل به ما میگه که هر کلاسی که توی برنامه‌ی ما وجود داره،
باید یک مسئولیت خاص و مشخص داشته. در واقع این کلاس باید فقط و فقط مسئول یک عملکرد توی برنامه باشه.

اصل دوم:
دومین اصل از اصول SOLID،
اصل باز/بسته یا Open/Closed Principle هست که به اختصار OCP گفته میشه. تعریف رسمی این اصل به این صورت هست:
موجودیت‌های یک نرم‌افزار (کلاس‌ها، ماژول‌ها، توابع و ...) باید برای توسعه داده شدن،
باز و برای تغییر دادن، بسته باشن

اصل سوم:
سومین اصل از اصول SOLID، اصل جایگزینی لیسکوف یا Liskov Substitution Principle هست که به اختصار LSP گفته میشه. 
این اصل خیلی ساده هست. هم درک کردنش و هم پیاده سازیش. تعریف آکادمیک این اصل بصورت زیر هست:
    اگر S یک زیر کلاس از  T باشه،
آبجکت‌های نوع T باید بتونن بدون تغییر دادن کد برنامه با آبجکت‌های نوع S جایگزین بشن

اصل چهارم:
اصل چهارم از SOLID اصل جداسازی اینترفیس‌ها یا Interface Segregation Principle 
هست که به اختصار ISP گفته میشه. توضیح رسمی و آکادمیک این اصل بصورت زیر هست:
    کلاس‌ها نباید مجبور باشن متدهایی که به اونها احتیاجی ندارن رو پیاده‌سازی کنن
این اصل میگه که ما باید اینترفیس (Interface) ها رو جوری بنویسیم که وقتی یک کلاس از اون استفاده میکنه،
مجبور نباشه متدهایی که لازم نداره رو پیاده‌سازی کنه. یعنی متدهای بی‌ربط نباید توی یک اینترفیس کنار هم باشن. 

اصل پنجم:
اصل پنجم و آخر SOLID، اصل وارونگی وابستگی (Dependency Inversion Principle) نام داره که به اختصار DIP گفته میشه.
توضیح رسمی و آکادمیک این اصل به صورت زیر هست. این توضیح رو بخونید تا با هم ریز به ریز جزییاتش رو بررسی کنیم:
کلاس‌های سطح بالا نباید به کلاس‌های سطح پایین وابسته باشن؛ هر دو باید وابسته به انتزاع (Abstractions) باشن. 
موارد انتزاعی نباید وابسته به جزییات باشن. جزییات باید وابسته به انتزاع باشن


سوال دوم :
سه اصل اول در پیاده سازی استفاده میشوند چون در رابطه با پیاده سازی روابط و توابع هستند
دو اصل دیگر در طرااحی بهتراست استفاده شوند چون باید قبل از پیاده سازی تکلیف این قسمت ها مشخص شوند

سوال سوم:
خیر این دو باهم تناقضی ندارند چون همزمان میتوان این کار را جلو برد و با نوشتن هر تابع
میتوان تابع تستی ان را نیز نوشت و ایجاد کرد
و این تست را ارزیابی کرد


سوال چهارم:
دراین حالت باید  مقادیر ثابت می ماندند و طراحی درستی اتفاق نمی افتد چون طراحی باید تمام مولفه
هارا دربر بگیرد