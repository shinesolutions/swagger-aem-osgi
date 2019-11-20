/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {
  
  @SerializedName("pattern.time")
  private ConfigNodePropertyString patternTime = null;
  @SerializedName("pattern.newline")
  private ConfigNodePropertyString patternNewline = null;
  @SerializedName("pattern.dayOfMonth")
  private ConfigNodePropertyString patternDayOfMonth = null;
  @SerializedName("pattern.month")
  private ConfigNodePropertyString patternMonth = null;
  @SerializedName("pattern.year")
  private ConfigNodePropertyString patternYear = null;
  @SerializedName("pattern.date")
  private ConfigNodePropertyString patternDate = null;
  @SerializedName("pattern.dateTime")
  private ConfigNodePropertyString patternDateTime = null;
  @SerializedName("pattern.email")
  private ConfigNodePropertyString patternEmail = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternTime() {
    return patternTime;
  }
  public void setPatternTime(ConfigNodePropertyString patternTime) {
    this.patternTime = patternTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternNewline() {
    return patternNewline;
  }
  public void setPatternNewline(ConfigNodePropertyString patternNewline) {
    this.patternNewline = patternNewline;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternDayOfMonth() {
    return patternDayOfMonth;
  }
  public void setPatternDayOfMonth(ConfigNodePropertyString patternDayOfMonth) {
    this.patternDayOfMonth = patternDayOfMonth;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternMonth() {
    return patternMonth;
  }
  public void setPatternMonth(ConfigNodePropertyString patternMonth) {
    this.patternMonth = patternMonth;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternYear() {
    return patternYear;
  }
  public void setPatternYear(ConfigNodePropertyString patternYear) {
    this.patternYear = patternYear;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternDate() {
    return patternDate;
  }
  public void setPatternDate(ConfigNodePropertyString patternDate) {
    this.patternDate = patternDate;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternDateTime() {
    return patternDateTime;
  }
  public void setPatternDateTime(ConfigNodePropertyString patternDateTime) {
    this.patternDateTime = patternDateTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternEmail() {
    return patternEmail;
  }
  public void setPatternEmail(ConfigNodePropertyString patternEmail) {
    this.patternEmail = patternEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties = (ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties) o;
    return (this.patternTime == null ? comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternTime == null : this.patternTime.equals(comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternTime)) &&
        (this.patternNewline == null ? comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternNewline == null : this.patternNewline.equals(comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternNewline)) &&
        (this.patternDayOfMonth == null ? comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDayOfMonth == null : this.patternDayOfMonth.equals(comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDayOfMonth)) &&
        (this.patternMonth == null ? comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternMonth == null : this.patternMonth.equals(comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternMonth)) &&
        (this.patternYear == null ? comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternYear == null : this.patternYear.equals(comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternYear)) &&
        (this.patternDate == null ? comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDate == null : this.patternDate.equals(comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDate)) &&
        (this.patternDateTime == null ? comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDateTime == null : this.patternDateTime.equals(comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDateTime)) &&
        (this.patternEmail == null ? comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternEmail == null : this.patternEmail.equals(comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternEmail));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.patternTime == null ? 0: this.patternTime.hashCode());
    result = 31 * result + (this.patternNewline == null ? 0: this.patternNewline.hashCode());
    result = 31 * result + (this.patternDayOfMonth == null ? 0: this.patternDayOfMonth.hashCode());
    result = 31 * result + (this.patternMonth == null ? 0: this.patternMonth.hashCode());
    result = 31 * result + (this.patternYear == null ? 0: this.patternYear.hashCode());
    result = 31 * result + (this.patternDate == null ? 0: this.patternDate.hashCode());
    result = 31 * result + (this.patternDateTime == null ? 0: this.patternDateTime.hashCode());
    result = 31 * result + (this.patternEmail == null ? 0: this.patternEmail.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {\n");
    
    sb.append("  patternTime: ").append(patternTime).append("\n");
    sb.append("  patternNewline: ").append(patternNewline).append("\n");
    sb.append("  patternDayOfMonth: ").append(patternDayOfMonth).append("\n");
    sb.append("  patternMonth: ").append(patternMonth).append("\n");
    sb.append("  patternYear: ").append(patternYear).append("\n");
    sb.append("  patternDate: ").append(patternDate).append("\n");
    sb.append("  patternDateTime: ").append(patternDateTime).append("\n");
    sb.append("  patternEmail: ").append(patternEmail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}