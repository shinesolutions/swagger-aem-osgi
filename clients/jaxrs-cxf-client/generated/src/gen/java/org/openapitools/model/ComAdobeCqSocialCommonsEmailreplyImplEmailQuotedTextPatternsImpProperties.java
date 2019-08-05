package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString patternTime = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString patternNewline = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString patternDayOfMonth = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString patternMonth = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString patternYear = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString patternDate = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString patternDateTime = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString patternEmail = null;
 /**
   * Get patternTime
   * @return patternTime
  **/
  @JsonProperty("pattern.time")
  public ConfigNodePropertyString getPatternTime() {
    return patternTime;
  }

  public void setPatternTime(ConfigNodePropertyString patternTime) {
    this.patternTime = patternTime;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternTime(ConfigNodePropertyString patternTime) {
    this.patternTime = patternTime;
    return this;
  }

 /**
   * Get patternNewline
   * @return patternNewline
  **/
  @JsonProperty("pattern.newline")
  public ConfigNodePropertyString getPatternNewline() {
    return patternNewline;
  }

  public void setPatternNewline(ConfigNodePropertyString patternNewline) {
    this.patternNewline = patternNewline;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternNewline(ConfigNodePropertyString patternNewline) {
    this.patternNewline = patternNewline;
    return this;
  }

 /**
   * Get patternDayOfMonth
   * @return patternDayOfMonth
  **/
  @JsonProperty("pattern.dayOfMonth")
  public ConfigNodePropertyString getPatternDayOfMonth() {
    return patternDayOfMonth;
  }

  public void setPatternDayOfMonth(ConfigNodePropertyString patternDayOfMonth) {
    this.patternDayOfMonth = patternDayOfMonth;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDayOfMonth(ConfigNodePropertyString patternDayOfMonth) {
    this.patternDayOfMonth = patternDayOfMonth;
    return this;
  }

 /**
   * Get patternMonth
   * @return patternMonth
  **/
  @JsonProperty("pattern.month")
  public ConfigNodePropertyString getPatternMonth() {
    return patternMonth;
  }

  public void setPatternMonth(ConfigNodePropertyString patternMonth) {
    this.patternMonth = patternMonth;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternMonth(ConfigNodePropertyString patternMonth) {
    this.patternMonth = patternMonth;
    return this;
  }

 /**
   * Get patternYear
   * @return patternYear
  **/
  @JsonProperty("pattern.year")
  public ConfigNodePropertyString getPatternYear() {
    return patternYear;
  }

  public void setPatternYear(ConfigNodePropertyString patternYear) {
    this.patternYear = patternYear;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternYear(ConfigNodePropertyString patternYear) {
    this.patternYear = patternYear;
    return this;
  }

 /**
   * Get patternDate
   * @return patternDate
  **/
  @JsonProperty("pattern.date")
  public ConfigNodePropertyString getPatternDate() {
    return patternDate;
  }

  public void setPatternDate(ConfigNodePropertyString patternDate) {
    this.patternDate = patternDate;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDate(ConfigNodePropertyString patternDate) {
    this.patternDate = patternDate;
    return this;
  }

 /**
   * Get patternDateTime
   * @return patternDateTime
  **/
  @JsonProperty("pattern.dateTime")
  public ConfigNodePropertyString getPatternDateTime() {
    return patternDateTime;
  }

  public void setPatternDateTime(ConfigNodePropertyString patternDateTime) {
    this.patternDateTime = patternDateTime;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDateTime(ConfigNodePropertyString patternDateTime) {
    this.patternDateTime = patternDateTime;
    return this;
  }

 /**
   * Get patternEmail
   * @return patternEmail
  **/
  @JsonProperty("pattern.email")
  public ConfigNodePropertyString getPatternEmail() {
    return patternEmail;
  }

  public void setPatternEmail(ConfigNodePropertyString patternEmail) {
    this.patternEmail = patternEmail;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternEmail(ConfigNodePropertyString patternEmail) {
    this.patternEmail = patternEmail;
    return this;
  }


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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

