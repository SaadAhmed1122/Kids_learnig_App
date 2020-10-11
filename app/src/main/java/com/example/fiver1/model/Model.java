package com.example.fiver1.model;

public class Model {

    int trueAnswer;
    int main_pro_images;
    int f_img;
    int s_img;
    int th_img;

    public Model(int trueAnswer, int main_pro_images, int f_img, int s_img, int th_img) {
        this.trueAnswer = trueAnswer;
        this.main_pro_images = main_pro_images;
        this.f_img = f_img;
        this.s_img = s_img;
        this.th_img = th_img;
    }

    public Model(int trueAnswer, int main_pro_images) {
        this.trueAnswer = trueAnswer;
        this.main_pro_images = main_pro_images;
    }

    public int getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(int trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

    public int getMain_pro_images() {
        return main_pro_images;
    }

    public void setMain_pro_images(int main_pro_images) {
        this.main_pro_images = main_pro_images;
    }

    public int getF_img() {
        return f_img;
    }

    public void setF_img(int f_img) {
        this.f_img = f_img;
    }

    public int getS_img() {
        return s_img;
    }

    public void setS_img(int s_img) {
        this.s_img = s_img;
    }

    public int getTh_img() {
        return th_img;
    }

    public void setTh_img(int th_img) {
        this.th_img = th_img;
    }
}
