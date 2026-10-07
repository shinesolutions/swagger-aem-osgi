package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties   {

    private ConfigNodePropertyString patternTime;
    private ConfigNodePropertyString patternNewline;
    private ConfigNodePropertyString patternDayOfMonth;
    private ConfigNodePropertyString patternMonth;
    private ConfigNodePropertyString patternYear;
    private ConfigNodePropertyString patternDate;
    private ConfigNodePropertyString patternDateTime;
    private ConfigNodePropertyString patternEmail;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.
     *
     * @param patternTime patternTime
     * @param patternNewline patternNewline
     * @param patternDayOfMonth patternDayOfMonth
     * @param patternMonth patternMonth
     * @param patternYear patternYear
     * @param patternDate patternDate
     * @param patternDateTime patternDateTime
     * @param patternEmail patternEmail
     */
    public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(
        ConfigNodePropertyString patternTime, 
        ConfigNodePropertyString patternNewline, 
        ConfigNodePropertyString patternDayOfMonth, 
        ConfigNodePropertyString patternMonth, 
        ConfigNodePropertyString patternYear, 
        ConfigNodePropertyString patternDate, 
        ConfigNodePropertyString patternDateTime, 
        ConfigNodePropertyString patternEmail
    ) {
        this.patternTime = patternTime;
        this.patternNewline = patternNewline;
        this.patternDayOfMonth = patternDayOfMonth;
        this.patternMonth = patternMonth;
        this.patternYear = patternYear;
        this.patternDate = patternDate;
        this.patternDateTime = patternDateTime;
        this.patternEmail = patternEmail;
    }



    /**
     * Get patternTime
     * @return patternTime
     */
    public ConfigNodePropertyString getPatternTime() {
        return patternTime;
    }

    public void setPatternTime(ConfigNodePropertyString patternTime) {
        this.patternTime = patternTime;
    }

    /**
     * Get patternNewline
     * @return patternNewline
     */
    public ConfigNodePropertyString getPatternNewline() {
        return patternNewline;
    }

    public void setPatternNewline(ConfigNodePropertyString patternNewline) {
        this.patternNewline = patternNewline;
    }

    /**
     * Get patternDayOfMonth
     * @return patternDayOfMonth
     */
    public ConfigNodePropertyString getPatternDayOfMonth() {
        return patternDayOfMonth;
    }

    public void setPatternDayOfMonth(ConfigNodePropertyString patternDayOfMonth) {
        this.patternDayOfMonth = patternDayOfMonth;
    }

    /**
     * Get patternMonth
     * @return patternMonth
     */
    public ConfigNodePropertyString getPatternMonth() {
        return patternMonth;
    }

    public void setPatternMonth(ConfigNodePropertyString patternMonth) {
        this.patternMonth = patternMonth;
    }

    /**
     * Get patternYear
     * @return patternYear
     */
    public ConfigNodePropertyString getPatternYear() {
        return patternYear;
    }

    public void setPatternYear(ConfigNodePropertyString patternYear) {
        this.patternYear = patternYear;
    }

    /**
     * Get patternDate
     * @return patternDate
     */
    public ConfigNodePropertyString getPatternDate() {
        return patternDate;
    }

    public void setPatternDate(ConfigNodePropertyString patternDate) {
        this.patternDate = patternDate;
    }

    /**
     * Get patternDateTime
     * @return patternDateTime
     */
    public ConfigNodePropertyString getPatternDateTime() {
        return patternDateTime;
    }

    public void setPatternDateTime(ConfigNodePropertyString patternDateTime) {
        this.patternDateTime = patternDateTime;
    }

    /**
     * Get patternEmail
     * @return patternEmail
     */
    public ConfigNodePropertyString getPatternEmail() {
        return patternEmail;
    }

    public void setPatternEmail(ConfigNodePropertyString patternEmail) {
        this.patternEmail = patternEmail;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {\n");
        
        sb.append("    patternTime: ").append(toIndentedString(patternTime)).append("\n");
        sb.append("    patternNewline: ").append(toIndentedString(patternNewline)).append("\n");
        sb.append("    patternDayOfMonth: ").append(toIndentedString(patternDayOfMonth)).append("\n");
        sb.append("    patternMonth: ").append(toIndentedString(patternMonth)).append("\n");
        sb.append("    patternYear: ").append(toIndentedString(patternYear)).append("\n");
        sb.append("    patternDate: ").append(toIndentedString(patternDate)).append("\n");
        sb.append("    patternDateTime: ").append(toIndentedString(patternDateTime)).append("\n");
        sb.append("    patternEmail: ").append(toIndentedString(patternEmail)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

