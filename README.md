Strategy Partern (Mẫu chiến lược):  https://toihocdesignpattern.com/chuong-1-strategy-pattern-chao-mung-den-voi-design-patterns.html
 
Link github: https://github.com/thinhotwp1/Strategy-Partern.git

Mẫu Strategy xác định một họ các thuật toán, gói gọn từng cái và làm cho chúng có thể hoán đổi cho nhau. Strategy cho phép thuật toán thay đổi độc lập với các client sử dụng nó.

:accessibility: Ở ví dụ trên, một người có thể là doctor hoặc teacher có thể thay đổi linh hoạt cách mặc quần áo ngay trong quá trình runtime, pattern này rất có ích với các hành vi (hay method) có biến thể, với nguyên lý tách hành vi ra khỏi object sẽ giúp tăng tính linh hoạt và dễ bảo trì vì khi cần thêm một method không cần đụng tới đối tượng gốc, cũng như mở rộng dễ dàng mà không phải thay đổi cấu trúc của đối tượng. 


💠 Một số trường hợp sử dụng strategy pattern: 

1. Tối ưu hóa hiệu suất: Khi bạn muốn tối ưu hóa hiệu suất của ứng dụng bằng cách chọn một hành vi tùy chỉnh hoặc cách thực hiện tùy thuộc vào tình huống cụ thể.

2. Thuật toán động (Dynamic Algorithms): Khi bạn có nhiều thuật toán có thể được áp dụng cho một tác vụ cụ thể, và bạn muốn cho phép đối tượng chọn thuật toán thích hợp tại thời điểm runtime. Ví dụ: thuật toán tìm kiếm, sắp xếp.

3. Điều kiện thay đổi hành vi: Khi bạn cần thay đổi cách một đối tượng hoạt động dựa trên một điều kiện nào đó. Thay vì viết nhiều điều kiện if-else trong cùng một phương thức, bạn có thể sử dụng Strategy để áp dụng các hành vi khác nhau tương ứng với từng điều kiện.


⚠️ Strategy Pattern không phải lúc nào cũng là lựa chọn tốt. Nếu số lượng các hành vi (strategies) là cố định và không thay đổi thường xuyên, hoặc không có sự thay đổi quá lớn trong hành vi của đối tượng, việc sử dụng Strategy Pattern có thể là quá phức tạp và không cần thiết.
