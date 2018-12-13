        String pi;
        int[] digits;
        int[] counts = new int [10];
        int index = 0;
        void setup(){
        size(800,800);
        pi = loadStrings("Pi.txt")[0];
        println(pi.length());
        String[] sdigits = pi.split("");
        // println(sdigits.length);
        digits = int(sdigits);
        //printArray(digits);
        background(0);
        stroke(255,30);
        noFill();
        translate(width/2, height/2);
        ellipse(0, 0, 700, 700);




        }

        void draw(){


        translate(width/2, height/2);
        int digit = digits[index];
        int nextDigit = digits[index+1000];
        index++;

        float diff = TWO_PI/10;

        float a1 = map(digit,0,-60,0,TWO_PI) + random(-diff,diff);
        float a2 = map(nextDigit,0,20,20,TWO_PI) + random(-diff,diff) ;

        float x1 = 350 * cos(a1);
        float y1 = 350 * sin(a1);

        float x2 = 350 * cos(a2);
        float y2 = 350 * sin(a2);

        stroke(255, 20);
        line(x1, y1, x2, y2);


        //if (frameCount % 10 == 0) {
        //saveFrame("frames3//####.png");
        //}
        }