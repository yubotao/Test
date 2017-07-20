package daomain;

/**
 * Created by Administrator on 2017/07/17.
 */
public class Student {
    private String SName;
    private Integer QQ;
    private String Style;
    private String Time;
    private String School;
    private Integer SNumber;
    private String Link;
    private String Dream;
    private String FBro;
    private String YBro;
    private String WhereKnow;
    private Integer ID;
    private Integer create_at;
    private Integer update_at;

    public Student(){
        super();
        //TODO Auto-generated constructor stub
    }
    public Student(String SName,Integer QQ,String Style,String Time,String School,Integer SNumber,String Link,String Dream,
                   String FBro,String YBro,String WhereKnow,Integer ID,Integer create_at,Integer update_at){
        super();
        this.SName = SName;
        this.QQ = QQ;
        this.Style = Style;
        this.Time = Time;
        this.School = School;
        this.SNumber = SNumber;
        this.Link = Link;
        this.Dream = Dream;
        this.FBro = FBro;
        this.YBro = YBro;
        this.WhereKnow = WhereKnow;
        this.ID = ID;
        this.create_at = create_at;
        this.update_at = update_at;
    }
    public String getSName(){
        return SName;
    }
    public void setSName(String SName){
        this.SName = SName;
    }
    public Integer getQQ(){
        return QQ;
    }
    public void setQQ(Integer QQ){
        this.QQ = QQ;
    }
    public String getStyle(){
        return Style;
    }
    public void setStyle(String Style){
        this.Style = Style;
    }
    public String getTime(){
        return Time;
    }
    public void setTime(String Time){
        this.Time = Time;
    }
    public String getSchool(){
        return School;
    }
    public void setSchool(String School){
        this.School = School;
    }
    public Integer getSNumber(){
        return SNumber;
    }
    public void setSNumber(Integer SNumber){
        this.SNumber = SNumber;
    }
    public String getLink(){
        return Link;
    }
    public void setLink(String Link){
        this.Link = Link;
    }
    public String getDream(){
        return Dream;
    }
    public void setDream(String Dream){
        this.Dream = Dream;
    }
    public String getFBro(){
        return FBro;
    }
    public void setFBro(String FBro){
        this.FBro = FBro;
    }
    public String getYBro(){
        return YBro;
    }
    public void setYBro(String YBro){
        this.YBro = YBro;
    }
    public String getWhereKnow(){
        return WhereKnow;
    }
    public void setWhereKnow(String WhereKnow){
        this.WhereKnow = WhereKnow;
    }
    public Integer getID(){
        return ID;
    }
    public void setID(Integer ID){
        this.ID = ID;
    }
    public Integer getCreate_at(){
        return create_at;
    }
    public void setCreate_at(Integer create_at){
        this.create_at = create_at;
    }
    public Integer getUpdate_at(){
        return update_at;
    }
    public void setUpdate_at(Integer update_at){
        this.update_at = update_at;
    }
    @Override
    public String toString(){
        return "Student[SName="+SName+",QQ="+QQ+",Style="+Style+",Time="+Time+",School="+School+",SNumber="+SNumber+",Link="+Link+",Dream="+Dream+"," +
                "FBro="+FBro+",YBro="+YBro+",WhereKnow="+WhereKnow+",ID="+ID+",create_at="+create_at+",update_at="+update_at+"]";
    }
}
