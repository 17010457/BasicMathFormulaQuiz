package sg.edu.rp.dmsd.basicmathformula;

/**
 * Created by 17010457 on 7/18/2018.
 */

public class mathFormula {
    private String tvName;
    private String tvFormula;
    private String tvType;

    public mathFormula(String tvName, String tvFormula, String tvType) {
        this.tvName = tvName;
        this.tvFormula = tvFormula;
        this.tvType = tvType;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getTvFormula() {
        return tvFormula;
    }

    public void setTvFormula(String tvFormula) {
        this.tvFormula = tvFormula;
    }

    public String getTvType() {
        return tvType;
    }

    public void setTvType(String tvType) {
        this.tvType = tvType;
    }

    @Override
    public String toString() {
        return "mathFormula{" +
                "tvName='" + tvName + '\'' +
                ", tvFormula='" + tvFormula + '\'' +
                ", tvType='" + tvType + '\'' +
                '}';
    }
}