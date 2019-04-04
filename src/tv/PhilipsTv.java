package tv;

import tv.drivers.Philips;

public class PhilipsTv implements Tv {

    private Philips tvPhilips;

    public PhilipsTv() {
        tvPhilips = new Philips();
    }


    @Override
    public void showTheChanel(String showTheChanel) {
        tvPhilips.Philips(showTheChanel);
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {

    }
}
