package cn.itrip.pojo;

import java.io.Serializable;
/***
*   
*/
public class Funct implements Serializable {
        //
        private Integer functid;
        //
        private String name;
        //get set 方法
            public void setFunctid (Integer  functid){
                this.functid=functid;
            }
            public  Integer getFunctid(){
                return this.functid;
            }
            public void setName (String  name){
                this.name=name;
            }
            public  String getName(){
                return this.name;
            }
}
