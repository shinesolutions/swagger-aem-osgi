/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T11:23:34.688Z[GMT]")
public class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {
  public static final String SERIALIZED_NAME_PATTERN_TIME = "pattern.time";
  @SerializedName(SERIALIZED_NAME_PATTERN_TIME)
  private ConfigNodePropertyString patternTime = null;

  public static final String SERIALIZED_NAME_PATTERN_NEWLINE = "pattern.newline";
  @SerializedName(SERIALIZED_NAME_PATTERN_NEWLINE)
  private ConfigNodePropertyString patternNewline = null;

  public static final String SERIALIZED_NAME_PATTERN_DAY_OF_MONTH = "pattern.dayOfMonth";
  @SerializedName(SERIALIZED_NAME_PATTERN_DAY_OF_MONTH)
  private ConfigNodePropertyString patternDayOfMonth = null;

  public static final String SERIALIZED_NAME_PATTERN_MONTH = "pattern.month";
  @SerializedName(SERIALIZED_NAME_PATTERN_MONTH)
  private ConfigNodePropertyString patternMonth = null;

  public static final String SERIALIZED_NAME_PATTERN_YEAR = "pattern.year";
  @SerializedName(SERIALIZED_NAME_PATTERN_YEAR)
  private ConfigNodePropertyString patternYear = null;

  public static final String SERIALIZED_NAME_PATTERN_DATE = "pattern.date";
  @SerializedName(SERIALIZED_NAME_PATTERN_DATE)
  private ConfigNodePropertyString patternDate = null;

  public static final String SERIALIZED_NAME_PATTERN_DATE_TIME = "pattern.dateTime";
  @SerializedName(SERIALIZED_NAME_PATTERN_DATE_TIME)
  private ConfigNodePropertyString patternDateTime = null;

  public static final String SERIALIZED_NAME_PATTERN_EMAIL = "pattern.email";
  @SerializedName(SERIALIZED_NAME_PATTERN_EMAIL)
  private ConfigNodePropertyString patternEmail = null;

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternTime(ConfigNodePropertyString patternTime) {
    this.patternTime = patternTime;
    return this;
  }

   /**
   * Get patternTime
   * @return patternTime
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternTime() {
    return patternTime;
  }

  public void setPatternTime(ConfigNodePropertyString patternTime) {
    this.patternTime = patternTime;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternNewline(ConfigNodePropertyString patternNewline) {
    this.patternNewline = patternNewline;
    return this;
  }

   /**
   * Get patternNewline
   * @return patternNewline
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternNewline() {
    return patternNewline;
  }

  public void setPatternNewline(ConfigNodePropertyString patternNewline) {
    this.patternNewline = patternNewline;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDayOfMonth(ConfigNodePropertyString patternDayOfMonth) {
    this.patternDayOfMonth = patternDayOfMonth;
    return this;
  }

   /**
   * Get patternDayOfMonth
   * @return patternDayOfMonth
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternDayOfMonth() {
    return patternDayOfMonth;
  }

  public void setPatternDayOfMonth(ConfigNodePropertyString patternDayOfMonth) {
    this.patternDayOfMonth = patternDayOfMonth;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternMonth(ConfigNodePropertyString patternMonth) {
    this.patternMonth = patternMonth;
    return this;
  }

   /**
   * Get patternMonth
   * @return patternMonth
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternMonth() {
    return patternMonth;
  }

  public void setPatternMonth(ConfigNodePropertyString patternMonth) {
    this.patternMonth = patternMonth;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternYear(ConfigNodePropertyString patternYear) {
    this.patternYear = patternYear;
    return this;
  }

   /**
   * Get patternYear
   * @return patternYear
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternYear() {
    return patternYear;
  }

  public void setPatternYear(ConfigNodePropertyString patternYear) {
    this.patternYear = patternYear;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDate(ConfigNodePropertyString patternDate) {
    this.patternDate = patternDate;
    return this;
  }

   /**
   * Get patternDate
   * @return patternDate
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternDate() {
    return patternDate;
  }

  public void setPatternDate(ConfigNodePropertyString patternDate) {
    this.patternDate = patternDate;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDateTime(ConfigNodePropertyString patternDateTime) {
    this.patternDateTime = patternDateTime;
    return this;
  }

   /**
   * Get patternDateTime
   * @return patternDateTime
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPatternDateTime() {
    return patternDateTime;
  }

  public void setPatternDateTime(ConfigNodePropertyString patternDateTime) {
    this.patternDateTime = patternDateTime;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternEmail(ConfigNodePropertyString patternEmail) {
    this.patternEmail = patternEmail;
    return this;
  }

   /**
   * Get patternEmail
   * @return patternEmail
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.patternTime, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternTime) &&
        Objects.equals(this.patternNewline, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternNewline) &&
        Objects.equals(this.patternDayOfMonth, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDayOfMonth) &&
        Objects.equals(this.patternMonth, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternMonth) &&
        Objects.equals(this.patternYear, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternYear) &&
        Objects.equals(this.patternDate, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDate) &&
        Objects.equals(this.patternDateTime, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternDateTime) &&
        Objects.equals(this.patternEmail, comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.patternEmail);
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
