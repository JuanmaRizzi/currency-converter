package com.alura.currencyconverter.model;

public record ConvertionRates(Float USD, Float ARS, Float BOB, Float BRL) {

    public ConvertionRates(Float USD, Float ARS, Float BOB, Float BRL) {
        this.USD = USD;
        this.ARS = ARS;
        this.BOB = BOB;
        this.BRL = BRL;
    }



    @Override
    public Float USD() {
        return USD;
    }

    @Override
    public Float ARS() {
        return ARS;
    }

    @Override
    public Float BOB() {
        return BOB;
    }

    @Override
    public Float BRL() {
        return BRL;
    }
}
