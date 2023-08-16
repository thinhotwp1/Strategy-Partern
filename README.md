Strategy Partern (Mẫu chiến lược):  Chương 1: Strategy Pattern (Mẫu chiến lược)
 (Chương 1 Head First Design Patterns)
Link github: https://github.com/thinhotwp1/Strategy-Partern.git

Mẫu Strategy xác định một họ các thuật toán, gói gọn từng cái và làm cho chúng có thể hoán đổi cho nhau. Strategy cho phép thuật toán thay đổi độc lập với các client sử dụng nó.

:accessibility: Ở ví dụ trên, một người có thể là doctor hoặc teacher có thể thay đổi linh hoạt cách mặc quần áo ngay trong quá trình runtime, pattern này rất có ích với các hành vi (hay method) có biến thể, với nguyên lý tách hành vi ra khỏi object sẽ giúp tăng tính linh hoạt và dễ bảo trì vì khi cần thêm một method không cần đụng tới đối tượng gốc, cũng như mở rộng dễ dàng mà không phải thay đổi cấu trúc của đối tượng. 


Một số trường hợp sử dụng strategy pattern: 

1. Xử lý sự kiện (Event Handling): Khi bạn cần xử lý các sự kiện khác nhau một cách linh hoạt trong các ứng dụng GUI hoặc hệ thống.

2. Tối ưu hóa hiệu suất: Khi bạn muốn tối ưu hóa hiệu suất của ứng dụng bằng cách chọn một hành vi tùy chỉnh hoặc cách thực hiện tùy thuộc vào tình huống cụ thể.

3. Thuật toán động (Dynamic Algorithms): Khi bạn có nhiều thuật toán có thể được áp dụng cho một tác vụ cụ thể, và bạn muốn cho phép đối tượng chọn thuật toán thích hợp tại thời điểm runtime. Ví dụ: thuật toán tìm kiếm, sắp xếp.

4. Điều kiện thay đổi hành vi: Khi bạn cần thay đổi cách một đối tượng hoạt động dựa trên một điều kiện nào đó. Thay vì viết nhiều điều kiện if-else trong cùng một phương thức, bạn có thể sử dụng Strategy để áp dụng các hành vi khác nhau tương ứng với từng điều kiện.
