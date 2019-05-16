package com.yyq.strategy;

/**
 * @author: 布里巴
 * @review:
 * @date: 2019/5/14
 */
public enum VipEnum {
    VIP(1, new Vip()),
    SUPER_VIP(2, new SuperVip()),
    NIU_PI_VIP(3, new NiuPiVIP());
    private int code;
    private Preferential preferential;

    VipEnum(int code, Preferential preferential) {
        this.code = code;
        this.preferential = preferential;
    }

    public int getCode() {
        return code;
    }

    public Preferential getPreferential() {
        return preferential;
    }

    public static Preferential getPreferentialByCode(int code) {
        for (VipEnum value : VipEnum.values()) {
            if (value.code == code) {
                return value.preferential;
            }
        }
        return null;
    }
}
