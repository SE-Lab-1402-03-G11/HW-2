# HW-2
# Step1
<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phone Order Payment</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>Order Service</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phone Order Payment</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن کلاس سرویس تلفنی</p>
</td>
<td width="292">
<p>افزودن کلاس PhoneOrderService که واسط  OrderService را نیز پیاده‌سازی می‌کنند</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>با توجه به اینکه کلاس PhoneOrderService کلاس OrderService را پیاده‌سازی می‌کند، باید این تابع جدید phoneOrderPayment را نیز در آن پیاده‌سازی کنیم</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>با توجه به اینکه کلاس PhoneOrderService کلاس OrderService را پیاده‌سازی می‌کند، باید این تابع جدید phoneOrderRegister را نیز در آن پیاده‌سازی کنیم </p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت حضوری</p>
</td>
<td width="292">
<p>با توجه به اینکه کلاس PhoneOrderService کلاس OrderService را پیاده‌سازی می‌کند، باید این تابع جدید onSiteOrderPayment را نیز در آن پیاده‌سازی کنیم (که البته محتوای آن خالی خواهد بود)</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۷</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش حضوری</p>
</td>
<td width="292">
<p>با توجه به اینکه کلاس PhoneOrderService کلاس OrderService را پیاده‌سازی می‌کند، باید این تابع جدید onSiteOrderRegister را نیز در آن پیاده‌سازی کنیم (که البته محتوای آن خالی خواهد بود)
</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۸</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت آنلاین</p>
</td>
<td width="292">
<p>با توجه به اینکه کلاس PhoneOrderService کلاس OrderService را پیاده‌سازی می‌کند، باید این تابع جدید onlineOrderPayment را نیز در آن پیاده‌سازی کنیم (که البته محتوای آن خالی خواهد بود)</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۹</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش آنلاین</p>
</td>
<td width="292">
<p>با توجه به اینکه کلاس PhoneOrderService کلاس OrderService را پیاده‌سازی می‌کند، باید این تابع جدید onlineOrderRegister را نیز در آن پیاده‌سازی کنیم (که البته محتوای آن خالی خواهد بود)</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۰</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>با توجه به اینکه کلاس OnlineOrderService کلاس OrderService را پیاده‌سازی می‌کند، باید این تابع جدید phoneOrderPayment را نیز در آن پیاده‌سازی کنیم (که البته محتوای آن خالی خواهد بود)</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۱</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>با توجه به اینکه کلاس OnlineOrderService کلاس OrderService را پیاده‌سازی می‌کند، باید این تابع جدید phoneOrderRegister را نیز در آن پیاده‌سازی کنیم (که البته محتوای آن خالی خواهد بود)</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۲</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت تلفنی</p>
</td>
<td width="292">
<p>با توجه به اینکه کلاس OnsSiteOrderService کلاس OrderService را پیاده‌سازی می‌کند، باید این تابع جدید phoneOrderPayment را نیز در آن پیاده سازی کنیم (که البته محتوای آن خالی خواهد بود)</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۳</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>با توجه به این که کلاس OnSiteOrderService کلاس OrderService را پیاده‌سازی می‌کند، باید این تابع جدید phoneOrderRegister را نیز در آن پیاده‌سازی کنیم (که البته محتوای آن خالی خواهد بود)</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۴</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن حالت تلفنی پرداخت به مرحله‌ی پرداخت</p>
</td>
<td width="292">
<p>اگر کاربر عدد ۳ را وارد کند، یک نمونه از کلاس PhoneOrderService  ساخته می‌شود و تابع مربوط به ثبت سفارش تلفنی فراخوانی می‌شود.</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۵</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن حالت ثبت سفارش تلفنی به مرحله‌ی ثبت سفارش</p>
</td>
<td width="292">
<p>اگر نوع سرویس شناخته‌شده تلفنی ثبت شده‌بود، تابع مربوط به پرداخت تلفنی فراخوانی می‌شود.</p>
</td>
</tr>
</tbody>
</table>
<p> مجموع تعداد تغییرات: ۱۵ عدد</p>

# STEP2

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>در کلاس Food تمامی توابع و قابلیت های پیاده سازی شده مرتبط با آن هستند و این کلاس تنها مسئولیت مدیریت فرایند های مربوط به غذا را دارد. </p>
<p>در کلاس Order تمامی توابع و قابلیت های پیاده سازی شده مرتبط با آن هستند و این کلاس تنها مسئولیت مدیریت فرایند های مربوط به سفارش را دارد. </p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>در کلاس Main تمامی فرایندهای عملیاتی برنامه تنها در یک تابع main پیاده سازی شده اند که این به خودی خود موجب نقض این اصل است و می بایست در توابع جداگانه هر کدام از این فرایند ها مدیریت می شدند و در نهایت در یک تابع کلی آن توابع اتمیک و تک کار فراخوانی می شدند.</p>
<p>پیاده سازی تابع onSiteOrderRegister برای کلاس های PhoneOrderService و OnlineOrderService این اصل را نقض می‌کند چرا که مسئولیت متفرقه‌ای از این کلاس به آنها نسبت داده شده و در آن ها پیاده سازی شده است.</p>
<p> پیاده سازی تابع onSiteOrderPeyment برای کلاس های PhoneOrderService و OnlineOrderService این اصل را نقض می‌کند چرا که مسئولیت متفرقه‌ای از این کلاس به آنها نسبت داده شده و در آن ها پیاده سازی شده است.</p>
<p>پیاده سازی تابع onlineOrderRegister برای کلاس های PhoneOrderService و OnSiteOrderService این اصل را نقض می‌کند چرا که مسئولیت متفرقه‌ای از این کلاس به آنها نسبت داده شده و در آن ها پیاده سازی شده است.</p>
<p>پیاده سازی تابع onlineOrderPayment برای کلاس های PhoneOrderService و OnSiteOrderService این اصل را نقض می‌کند چرا که مسئولیت متفرقه‌ای از این کلاس به آنها نسبت داده شده و در آن ها پیاده سازی شده است.</p>
<p>پیاده سازی تابع phoneOrderRegister برای کلاس های OnlineOrderService و OnSiteOrderService این اصل را نقض می‌کند چرا که مسئولیت متفرقه‌ای از این کلاس به آنها نسبت داده شده و در آن ها پیاده سازی شده است.</p>
<p>پیاده سازی تابع phoneOrderPayment برای کلاس های OnlineOrderService و OnSiteOrderService این اصل را نقض می‌کند چرا که مسئولیت متفرقه‌ای از این کلاس به آنها نسبت داده شده و در آن ها پیاده سازی شده است.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس Food برای توسعه باز و مناسب و برای اصلاح بسته است.</p>
<p>کلاس Order برای توسعه باز و مناسب و برای اصلاح بسته است.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>کلاس های PhoneOrderService و OnSiteOrderService با ایجاد یک کلاس جدید PhoneOrderService که کاملا به آن ها بی ربط بود و کارکرد جداگانه ای داشت، تغییر کردند.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>تمامی کلاس های PhoneOrderService - OnlineOrderService - OnSiteOrderService ماهیتی مشابه از جنبه ی واسط OrderService دارند که این واسط را نیز پیاده سازی کرده اند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>---</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>---</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>پیاده سازی تابع onSiteOrderRegister برای کلاس های PhoneOrderService و OnlineOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)</p>
<p> پیاده سازی تابع onSiteOrderPeyment برای کلاس های PhoneOrderService و OnlineOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)</p>
<p>پیاده سازی تابع onlineOrderRegister برای کلاس های PhoneOrderService و OnSiteOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)</p>
<p>پیاده سازی تابع onlineOrderPayment برای کلاس های PhoneOrderService و OnSiteOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)</p>
<p>پیاده سازی تابع phoneOrderRegister برای کلاس های OnlineOrderService و OnSiteOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)</p>
<p>پیاده سازی تابع phoneOrderPayment برای کلاس های OnlineOrderService و OnSiteOrderService (که عملکرد این تابع به هیچ کدام از این دو کلاس مربوط نیست و این بسیار نامناسب است)</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>کلاس های Food - Main - Order و کلیت Payment Service ها coupling کمی نسبت به هم دارند. (به جز موارد نام برده شده در قسمت های نقض شده)</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>با افزودن کلاس PhoneOrderService مجبور شدیم که توابعی جدید به واسط کلی OrderService اضافه کنیم که این مساله به خودی خود موجب شد که ما ناچار به تغییر کلاس هایی که این واسط را پیاده سازی میکردند شویم.</p>
<p>با افزودن کلاس PhoneOrderService مجبور شدیم کلاس Main در بخش Payment را تغییر دهیم</p>
</td>
</tr>
</tbody>
</table>

