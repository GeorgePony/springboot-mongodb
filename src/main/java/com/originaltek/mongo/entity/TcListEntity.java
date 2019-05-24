package com.originaltek.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : chen.zhangchao
 * @date 2019/5/24 15:49
 * @todo 出口收费流水的Entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TcListEntity {
    /**
     * 主键
     */
    private String listId;

    private int inRoadNetId;

    private int inRoadId;

    private int inSubRoadId;

    private int inStationId;

    private int inLaneId;

    private String inOprId;

    private int inIsTruck;

    private int inVehType;

    private int inVehClass;

    private String inOperateOn;

    private int inDirection;

    private String inVehPlate;

    private String   inVehPlateAuto;

    private int inVehTypeAuto;

    private int roadNetId;

    private int roadId;

    private int subRoadId;

    private int stationId;

    private int laneId;

    private String squadon;

    private int listNo;

    private String oprId;

    private int isTruck;

    private int vehType;

    private int vehClass;

    private int vehCount;

    private String operateOn;

    private String vehPlate;

    private String vehPlateAuto;

    private int vehTypeAuto;

    private int rateVer;

    private int calcType;

    private double crMoney;

    private double payMoney;

    private double tollIndepUnit01;
    private double tollIndepUnit02;
    private double tollIndepUnit03;
    private double tollIndepUnit04;
    private double tollIndepUnit05;
    private double tollIndepUnit06;
    private double tollIndepUnit07;
    private double tollIndepUnit08;
    private double tollIndepUnit09;
    private double tollIndepUnit10;

    private int payWay;

    private int miles;

    private int weight;

    private int allQlty;

    private String axleType;

    private int axleNumber;

    private int axleLimit;

    private int qltyLimit;

    private int limitLoad;

    private double baseToll;

    private double addToll;

    private int inVoiceNo;

    private int inVprintCnt;

    private int ticketType;

    private int cardVerId;

    private int cardId;

    private int cardNo;

    private int cardOpNum;

    private int cardCnt;

    private int cardBoxNo;

    private int spEvents;

    private String spGranter;

    private int dealStatus;

    private int deviceStatus;

    private int degradeDevice;

    private String degradeGranter;

    private int invalidKeyCnt;

    private int cancelKeyCnt;

    private int existLpCnt;

    private int existLpDegradeCnt;

    private int existLpSimulateCnt;

    private int passLpCnt;

    private int passLpDegradeCnt;

    private int passLpSimulateCnt;

    private int guardDwCnt;

    private int guardUpCnt;

    private String guardUpDt;

    private String guardDwDt;

    private int modifyCnt;

    private int vehType1;
    private int vehType2;
    private int vehType3;

    private int vehClass1;
    private int vehClass2;
    private int vehClass3;

    private int isTruck1;
    private int isTruck2;
    private int isTruck3;

    private String vehPlateModify;

    private String vehConflictDt;

    private int opResult;

    private String grantOprId;

    private int prePrice;

    private String finDt;

    private int shiftId;

    private int uploaded;

    private double roadToll;

    private double ucrMoney;

    private int laneType;

    private int inLaneType;

    private int eCardType;

    private int eCardVer;

    private int eCardId;

    private int eCardNetNo;


    private int eCardNo;

    private String terminalNo;

    private int terTranNo;

    private String obuId;

    private String isSuerId;

    private int tranNo;

    private int tranType;

    private int tac;

    private double eCardBal;

    private double eCardMny;

    private int userType;

    private String cardVehPlate;

    private String verifyCode;

    private int discountType;

    private String obuVendorId;

    private double eCardAtrBal;



}
