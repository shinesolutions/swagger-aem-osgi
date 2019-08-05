package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties   {
  @JsonProperty("pattern.time")
  private ConfigNodePropertyString patternTime = null;

  @JsonProperty("pattern.newline")
  private ConfigNodePropertyString patternNewline = null;

  @JsonProperty("pattern.dayOfMonth")
  private ConfigNodePropertyString patternDayOfMonth = null;

  @JsonProperty("pattern.month")
  private ConfigNodePropertyString patternMonth = null;

  @JsonProperty("pattern.year")
  private ConfigNodePropertyString patternYear = null;

  @JsonProperty("pattern.date")
  private ConfigNodePropertyString patternDate = null;

  @JsonProperty("pattern.dateTime")
  private ConfigNodePropertyString patternDateTime = null;

  @JsonProperty("pattern.email")
  private ConfigNodePropertyString patternEmail = null;

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternTime(ConfigNodePropertyString patternTime) {
    this.patternTime = patternTime;
    return this;
  }

   /**
   * Get patternTime
   * @return patternTime
  **/
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

