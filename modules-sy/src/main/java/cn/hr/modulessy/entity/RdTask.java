package cn.hr.modulessy.entity;

public class RdTask {
    private Integer id;

    private Integer readYear;

    private Integer readMonth;

    private Integer volumeid;

    private Integer empId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReadYear() {
        return readYear;
    }

    public void setReadYear(Integer readYear) {
        this.readYear = readYear;
    }

    public Integer getReadMonth() {
        return readMonth;
    }

    public void setReadMonth(Integer readMonth) {
        this.readMonth = readMonth;
    }

    public Integer getVolumeid() {
        return volumeid;
    }

    public void setVolumeid(Integer volumeid) {
        this.volumeid = volumeid;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", readYear=").append(readYear);
        sb.append(", readMonth=").append(readMonth);
        sb.append(", volumeid=").append(volumeid);
        sb.append(", empId=").append(empId);
        sb.append("]");
        return sb.toString();
    }
}