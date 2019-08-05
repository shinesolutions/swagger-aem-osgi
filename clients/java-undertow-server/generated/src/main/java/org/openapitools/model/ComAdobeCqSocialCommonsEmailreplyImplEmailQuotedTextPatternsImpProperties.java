package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties   {
  
  private ConfigNodePropertyString patternTime = null;
  private ConfigNodePropertyString patternNewline = null;
  private ConfigNodePropertyString patternDayOfMonth = null;
  private ConfigNodePropertyString patternMonth = null;
  private ConfigNodePropertyString patternYear = null;
  private ConfigNodePropertyString patternDate = null;
  private ConfigNodePropertyString patternDateTime = null;
  private ConfigNodePropertyString patternEmail = null;

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternTime(ConfigNodePropertyString patternTime) {
    this.patternTime = patternTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pattern.time")
  public ConfigNodePropertyString getPatternTime() {
    return patternTime;
  }
  public void setPatternTime(ConfigNodePropertyString patternTime) {
    this.patternTime = patternTime;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternNewline(ConfigNodePropertyString patternNewline) {
    this.patternNewline = patternNewline;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pattern.newline")
  public ConfigNodePropertyString getPatternNewline() {
    return patternNewline;
  }
  public void setPatternNewline(ConfigNodePropertyString patternNewline) {
    this.patternNewline = patternNewline;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDayOfMonth(ConfigNodePropertyString patternDayOfMonth) {
    this.patternDayOfMonth = patternDayOfMonth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pattern.dayOfMonth")
  public ConfigNodePropertyString getPatternDayOfMonth() {
    return patternDayOfMonth;
  }
  public void setPatternDayOfMonth(ConfigNodePropertyString patternDayOfMonth) {
    this.patternDayOfMonth = patternDayOfMonth;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternMonth(ConfigNodePropertyString patternMonth) {
    this.patternMonth = patternMonth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pattern.month")
  public ConfigNodePropertyString getPatternMonth() {
    return patternMonth;
  }
  public void setPatternMonth(ConfigNodePropertyString patternMonth) {
    this.patternMonth = patternMonth;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternYear(ConfigNodePropertyString patternYear) {
    this.patternYear = patternYear;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pattern.year")
  public ConfigNodePropertyString getPatternYear() {
    return patternYear;
  }
  public void setPatternYear(ConfigNodePropertyString patternYear) {
    this.patternYear = patternYear;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDate(ConfigNodePropertyString patternDate) {
    this.patternDate = patternDate;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pattern.date")
  public ConfigNodePropertyString getPatternDate() {
    return patternDate;
  }
  public void setPatternDate(ConfigNodePropertyString patternDate) {
    this.patternDate = patternDate;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDateTime(ConfigNodePropertyString patternDateTime) {
    this.patternDateTime = patternDateTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pattern.dateTime")
  public ConfigNodePropertyString getPatternDateTime() {
    return patternDateTime;
  }
  public void setPatternDateTime(ConfigNodePropertyString patternDateTime) {
    this.patternDateTime = patternDateTime;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternEmail(ConfigNodePropertyString patternEmail) {
    this.patternEmail = patternEmail;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pattern.email")
  public ConfigNodePropertyString getPatternEmail() {
    return patternEmail;
  }
  public void setPatternEmail(ConfigNodePropertyString patternEmail) {
    this.patternEmail = patternEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties = (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties) o;
    return Objects.equals(patternTime, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternTime) &&
        Objects.equals(patternNewline, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternNewline) &&
        Objects.equals(patternDayOfMonth, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDayOfMonth) &&
        Objects.equals(patternMonth, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternMonth) &&
        Objects.equals(patternYear, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternYear) &&
        Objects.equals(patternDate, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDate) &&
        Objects.equals(patternDateTime, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDateTime) &&
        Objects.equals(patternEmail, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patternTime, patternNewline, patternDayOfMonth, patternMonth, patternYear, patternDate, patternDateTime, patternEmail);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

