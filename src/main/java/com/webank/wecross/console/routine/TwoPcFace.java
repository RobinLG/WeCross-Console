package com.webank.wecross.console.routine;

import com.webank.wecrosssdk.rpc.WeCrossRPC;
import java.util.Map;

public interface TwoPcFace {
    void setWeCrossRPC(WeCrossRPC weCrossRPC);

    void callTransaction(String[] params, Map<String, String> pathMaps) throws Exception;

    void execTransaction(String[] params, Map<String, String> pathMaps) throws Exception;

    void startTransaction(String[] params) throws Exception;

    void commitTransaction(String[] params) throws Exception;

    void rollbackTransaction(String[] params) throws Exception;

    void getTransactionInfo(String[] params) throws Exception;

    void getTransactionIDs(String[] params) throws Exception;
}
