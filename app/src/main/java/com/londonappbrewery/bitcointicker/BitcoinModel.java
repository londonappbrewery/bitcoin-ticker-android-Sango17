package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by alex on 23/06/2017.
 */

public class BitcoinModel {

    private int mPrice;

    public static BitcoinModel fromJson(JSONObject jsonObject) {
        BitcoinModel bitcoin = new BitcoinModel();

        try {
            bitcoin.mPrice = jsonObject.getJSONObject("averages").getInt("day");
            return bitcoin;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

    }

    public int getPrice() {
        return mPrice;
    }
}
