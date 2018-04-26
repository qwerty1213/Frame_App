package com.dinghaoguoji.com.frame_app.entity;

import java.util.List;

/**
 * Created by pc on 2018/3/21.
 */

public class PeriodicalBean {

    /**
     * Status : 200
     * Total : 0
     * Datas : [{"id":13,"title":"河南科技","admin_id":null,"cat_id":null,"info":null,"flag":null,"thumb":"/Uploads/image/20170623/20170623210626_21406.jpg","img":null,"seotitle":null,"keywords":null,"description":null,"unit_charge":null,"unit_hold":null,"speedy_cat":null,"city":null,"issn":null,"cn":null,"create_magazine":null,"cycle":null,"insert_create":null,"include":null,"attr_id":null,"rank_id":null,"content":null,"content_notice":null,"onclick":null,"sort":null,"status":null,"create_time":null,"update_time":null,"attention":null,"comment":null},{"id":30,"title":"科研","admin_id":null,"cat_id":null,"info":null,"flag":null,"thumb":"/Uploads/image/20170623/20170623212403_27166.jpg","img":null,"seotitle":null,"keywords":null,"description":null,"unit_charge":null,"unit_hold":null,"speedy_cat":null,"city":null,"issn":null,"cn":null,"create_magazine":null,"cycle":null,"insert_create":null,"include":null,"attr_id":null,"rank_id":null,"content":null,"content_notice":null,"onclick":null,"sort":null,"status":null,"create_time":null,"update_time":null,"attention":null,"comment":null},{"id":14,"title":"自然科学","admin_id":null,"cat_id":null,"info":null,"flag":null,"thumb":"/Uploads/image/20170623/20170623203447_39193.jpg","img":null,"seotitle":null,"keywords":null,"description":null,"unit_charge":null,"unit_hold":null,"speedy_cat":null,"city":null,"issn":null,"cn":null,"create_magazine":null,"cycle":null,"insert_create":null,"include":null,"attr_id":null,"rank_id":null,"content":null,"content_notice":null,"onclick":null,"sort":null,"status":null,"create_time":null,"update_time":null,"attention":null,"comment":null},{"id":15,"title":"课程教育研究杂志","admin_id":null,"cat_id":null,"info":null,"flag":null,"thumb":"/Uploads/image/20170623/20170623204315_38526.jpg","img":null,"seotitle":null,"keywords":null,"description":null,"unit_charge":null,"unit_hold":null,"speedy_cat":null,"city":null,"issn":null,"cn":null,"create_magazine":null,"cycle":null,"insert_create":null,"include":null,"attr_id":null,"rank_id":null,"content":null,"content_notice":null,"onclick":null,"sort":null,"status":null,"create_time":null,"update_time":null,"attention":null,"comment":null},{"id":16,"title":"种子世界","admin_id":null,"cat_id":null,"info":null,"flag":null,"thumb":"/Uploads/image/20170623/20170623204937_91850.jpg","img":null,"seotitle":null,"keywords":null,"description":null,"unit_charge":null,"unit_hold":null,"speedy_cat":null,"city":null,"issn":null,"cn":null,"create_magazine":null,"cycle":null,"insert_create":null,"include":null,"attr_id":null,"rank_id":null,"content":null,"content_notice":null,"onclick":null,"sort":null,"status":null,"create_time":null,"update_time":null,"attention":null,"comment":null}]
     * Data : null
     * Msg : 请求成功
     */

    private int Status;
    private int Total;
    private Object Data;
    private String Msg;
    private List<DatasBean> Datas;

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object Data) {
        this.Data = Data;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    public List<DatasBean> getDatas() {
        return Datas;
    }

    public void setDatas(List<DatasBean> Datas) {
        this.Datas = Datas;
    }

    public static class DatasBean {
        /**
         * id : 13
         * title : 河南科技
         * admin_id : null
         * cat_id : null
         * info : null
         * flag : null
         * thumb : /Uploads/image/20170623/20170623210626_21406.jpg
         * img : null
         * seotitle : null
         * keywords : null
         * description : null
         * unit_charge : null
         * unit_hold : null
         * speedy_cat : null
         * city : null
         * issn : null
         * cn : null
         * create_magazine : null
         * cycle : null
         * insert_create : null
         * include : null
         * attr_id : null
         * rank_id : null
         * content : null
         * content_notice : null
         * onclick : null
         * sort : null
         * status : null
         * create_time : null
         * update_time : null
         * attention : null
         * comment : null
         */

        private int id;
        private String title;
        private Object admin_id;
        private Object cat_id;
        private Object info;
        private Object flag;
        private String thumb;
        private Object img;
        private Object seotitle;
        private Object keywords;
        private Object description;
        private Object unit_charge;
        private Object unit_hold;
        private Object speedy_cat;
        private Object city;
        private Object issn;
        private Object cn;
        private Object create_magazine;
        private Object cycle;
        private Object insert_create;
        private Object include;
        private Object attr_id;
        private Object rank_id;
        private Object content;
        private Object content_notice;
        private Object onclick;
        private Object sort;
        private Object status;
        private Object create_time;
        private Object update_time;
        private Object attention;
        private Object comment;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Object getAdmin_id() {
            return admin_id;
        }

        public void setAdmin_id(Object admin_id) {
            this.admin_id = admin_id;
        }

        public Object getCat_id() {
            return cat_id;
        }

        public void setCat_id(Object cat_id) {
            this.cat_id = cat_id;
        }

        public Object getInfo() {
            return info;
        }

        public void setInfo(Object info) {
            this.info = info;
        }

        public Object getFlag() {
            return flag;
        }

        public void setFlag(Object flag) {
            this.flag = flag;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public Object getImg() {
            return img;
        }

        public void setImg(Object img) {
            this.img = img;
        }

        public Object getSeotitle() {
            return seotitle;
        }

        public void setSeotitle(Object seotitle) {
            this.seotitle = seotitle;
        }

        public Object getKeywords() {
            return keywords;
        }

        public void setKeywords(Object keywords) {
            this.keywords = keywords;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public Object getUnit_charge() {
            return unit_charge;
        }

        public void setUnit_charge(Object unit_charge) {
            this.unit_charge = unit_charge;
        }

        public Object getUnit_hold() {
            return unit_hold;
        }

        public void setUnit_hold(Object unit_hold) {
            this.unit_hold = unit_hold;
        }

        public Object getSpeedy_cat() {
            return speedy_cat;
        }

        public void setSpeedy_cat(Object speedy_cat) {
            this.speedy_cat = speedy_cat;
        }

        public Object getCity() {
            return city;
        }

        public void setCity(Object city) {
            this.city = city;
        }

        public Object getIssn() {
            return issn;
        }

        public void setIssn(Object issn) {
            this.issn = issn;
        }

        public Object getCn() {
            return cn;
        }

        public void setCn(Object cn) {
            this.cn = cn;
        }

        public Object getCreate_magazine() {
            return create_magazine;
        }

        public void setCreate_magazine(Object create_magazine) {
            this.create_magazine = create_magazine;
        }

        public Object getCycle() {
            return cycle;
        }

        public void setCycle(Object cycle) {
            this.cycle = cycle;
        }

        public Object getInsert_create() {
            return insert_create;
        }

        public void setInsert_create(Object insert_create) {
            this.insert_create = insert_create;
        }

        public Object getInclude() {
            return include;
        }

        public void setInclude(Object include) {
            this.include = include;
        }

        public Object getAttr_id() {
            return attr_id;
        }

        public void setAttr_id(Object attr_id) {
            this.attr_id = attr_id;
        }

        public Object getRank_id() {
            return rank_id;
        }

        public void setRank_id(Object rank_id) {
            this.rank_id = rank_id;
        }

        public Object getContent() {
            return content;
        }

        public void setContent(Object content) {
            this.content = content;
        }

        public Object getContent_notice() {
            return content_notice;
        }

        public void setContent_notice(Object content_notice) {
            this.content_notice = content_notice;
        }

        public Object getOnclick() {
            return onclick;
        }

        public void setOnclick(Object onclick) {
            this.onclick = onclick;
        }

        public Object getSort() {
            return sort;
        }

        public void setSort(Object sort) {
            this.sort = sort;
        }

        public Object getStatus() {
            return status;
        }

        public void setStatus(Object status) {
            this.status = status;
        }

        public Object getCreate_time() {
            return create_time;
        }

        public void setCreate_time(Object create_time) {
            this.create_time = create_time;
        }

        public Object getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(Object update_time) {
            this.update_time = update_time;
        }

        public Object getAttention() {
            return attention;
        }

        public void setAttention(Object attention) {
            this.attention = attention;
        }

        public Object getComment() {
            return comment;
        }

        public void setComment(Object comment) {
            this.comment = comment;
        }
    }
}
