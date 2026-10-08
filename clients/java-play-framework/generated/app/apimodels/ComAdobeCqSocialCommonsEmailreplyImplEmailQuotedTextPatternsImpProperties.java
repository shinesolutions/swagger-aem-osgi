package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties   {
  @JsonProperty("pattern.time")
  @Valid

  private ConfigNodePropertyString patternTime;

  @JsonProperty("pattern.newline")
  @Valid

  private ConfigNodePropertyString patternNewline;

  @JsonProperty("pattern.dayOfMonth")
  @Valid

  private ConfigNodePropertyString patternDayOfMonth;

  @JsonProperty("pattern.month")
  @Valid

  private ConfigNodePropertyString patternMonth;

  @JsonProperty("pattern.year")
  @Valid

  private ConfigNodePropertyString patternYear;

  @JsonProperty("pattern.date")
  @Valid

  private ConfigNodePropertyString patternDate;

  @JsonProperty("pattern.dateTime")
  @Valid

  private ConfigNodePropertyString patternDateTime;

  @JsonProperty("pattern.email")
  @Valid

  private ConfigNodePropertyString patternEmail;

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternTime(ConfigNodePropertyString patternTime) {
    this.patternTime = patternTime;
    return this;
  }

   /**
   * Get patternTime
   * @return patternTime
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

