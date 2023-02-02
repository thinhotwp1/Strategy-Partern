Strategy Partern (Mẫu chiến lược):  Chương 1: Strategy Pattern (Mẫu chiến lược)
 (Chương 1 Head First Design Patterns)
Link github: https://github.com/thinhotwp1/Strategy-Partern.git
 
Quan hệ giữa extends là is-a: RotbotDuck là Duck
Quan hệ giữa implement là has-a: RotbotDuck có hành vi FlyDuck 
Mối quan hệ HAS-A là một mối quan hệ thú vị: mỗi con vịt CÓ MỘT hành vi bay và hành vi kêu mà nó ủy nhiệm bay và kêu.

nói chung, tách hành vi riêng, mỗi class vịt con extends vịt sử dụng có thể thay đổi linh hoạt hành vi bay và kêu ngay trong lúc runtime

Mẫu Strategy xác định một họ các thuật toán, gói gọn từng cái và làm cho chúng có thể hoán đổi cho nhau. Strategy cho phép thuật toán thay đổi độc lập với các client sử dụng nó.


