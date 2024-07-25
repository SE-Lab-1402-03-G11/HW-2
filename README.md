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
<p>با توجه به اینکه کلاس OnSiteOrderService کلاس OrderService را پیاده‌سازی می‌کند، باید این تابع جدید phoneOrderRegister را نیز در آن پیاده‌سازی کنیم (که البته محتوای آن خالی خواهد بود)</p>
</td>
</tr>
</tbody>
</table>