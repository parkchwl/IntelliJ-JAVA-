class Tv1 {
            //Tv의 속성(멤버변수)
            String color;       // 색상
            boolean power;      // 전원상태(on/off)
            int channel;        // 채널               멤버변수(속성) : 색상, 전원상태, 채널을 선언했다.

            // Tv의 기능(메서드)
            void power() {
                power = !power;
            }     // TV를 켜거나 끄는 기능을 하는 메서드이다.   power의 값이 true면 not이기 때문에 false

            void channelUp() {
                ++channel;
            }    // TV의 채널을 높이는 기능을 하는 메서드이다.

            void channelDown() {
                --channel;
            }      // TV의 채널을 낮추는 기능을 하는 메서드이다.         메서드 : 기능을 선언했다.
        }   // 멤버변수와 메서드를 선언하는데 있어서 순서는 관계없지만, 일반적으로 메서드보다는 멤버변수를 먼저 선언하고
            // 멤버변수는 멤버변수끼리, 메서드는 메서드끼리 모아 놓는 것이 일반적이다.

        class Test {
            public static void main(String[] args) {
                Tv1 t;                  // Tv인스턴스를 참조하기 위한 변수 t를 선언한다. : 참조변수 t를 선언했다.(메모리에 t를 위한 공간이 마련됨)
                t = new Tv1();         // Tv인스턴스를 생성한다.
                t.channel = 7;       // Tv인스턴스의 멤버변수 channel의 값을 7로한다.
                t.channelDown();    // Tv인스턴스의 메서드 channelDown()을 호출한다.
                //to_ channel Down 메서드는 멤버 변수 channel에 저장되어 있는 값을 1 감소시킨다. { --channel; }, channel의 값은 6이 된다.
                System.out.println("현재 채널은 " + t.channel + " 입니다.");

            }
        }
        //to__ 인스턴스는 참조변수를 통해서만 다를 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야한다.