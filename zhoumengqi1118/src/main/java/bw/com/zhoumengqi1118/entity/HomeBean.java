package bw.com.zhoumengqi1118.entity;

import java.util.List;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public class HomeBean {
    /**
     * result : [{"id":50,"releaseTime":1539582903000,"source":"全天候科技","title":"行业薪酬\u201c大跳水\u201d，区块链真的凉了？"},{"id":49,"releaseTime":1539582707000,"source":"蓝狐笔记","title":"为什么说区块链没那么简单？"},{"id":48,"releaseTime":1539582496000,"source":"网事风云","title":"区块链落地实体经济，这个领域可能是先锋"},{"id":47,"releaseTime":1539582250000,"source":"蓝狐笔记","title":"为什么说区块链\u201c无需信任\u201d？"},{"id":46,"releaseTime":1539582121000,"source":"懂懂笔记","title":"\u201c大会\u201d要开、\u201c大屏\u201d要占：区块链\u201c药\u201d不能停"}]
     * message : 查询成功
     * status : 0000
     */

    public String message;
    public String status;
    public List<ResultBean> result;

    public static class ResultBean {
        /**
         * id : 50
         * releaseTime : 1539582903000
         * source : 全天候科技
         * title : 行业薪酬“大跳水”，区块链真的凉了？
         */

        public int id;
        public long releaseTime;
        public String source;
        public String title;
    }
}
