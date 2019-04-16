package pl.karolciuchy.ciuchyapp.dao.helpers;

import java.sql.Date;

public class StatisticHelper {

    public StatisticHelper(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private Date startDate;
    private Date endDate;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public StatisticHelper(){}
}
