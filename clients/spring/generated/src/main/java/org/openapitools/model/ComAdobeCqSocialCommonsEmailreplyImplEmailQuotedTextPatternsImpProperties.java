package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties
 */

@JsonTypeName("comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString patternTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString patternNewline;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString patternDayOfMonth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString patternMonth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString patternYear;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString patternDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString patternDateTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString patternEmail;

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternTime(@Nullable ConfigNodePropertyString patternTime) {
    this.patternTime = patternTime;
    return this;
  }

  /**
   * Get patternTime
   * @return patternTime
   */
  @Valid 
  @Schema(name = "pattern.time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern.time")
  public @Nullable ConfigNodePropertyString getPatternTime() {
    return patternTime;
  }

  @JsonProperty("pattern.time")
  public void setPatternTime(@Nullable ConfigNodePropertyString patternTime) {
    this.patternTime = patternTime;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternNewline(@Nullable ConfigNodePropertyString patternNewline) {
    this.patternNewline = patternNewline;
    return this;
  }

  /**
   * Get patternNewline
   * @return patternNewline
   */
  @Valid 
  @Schema(name = "pattern.newline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern.newline")
  public @Nullable ConfigNodePropertyString getPatternNewline() {
    return patternNewline;
  }

  @JsonProperty("pattern.newline")
  public void setPatternNewline(@Nullable ConfigNodePropertyString patternNewline) {
    this.patternNewline = patternNewline;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDayOfMonth(@Nullable ConfigNodePropertyString patternDayOfMonth) {
    this.patternDayOfMonth = patternDayOfMonth;
    return this;
  }

  /**
   * Get patternDayOfMonth
   * @return patternDayOfMonth
   */
  @Valid 
  @Schema(name = "pattern.dayOfMonth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern.dayOfMonth")
  public @Nullable ConfigNodePropertyString getPatternDayOfMonth() {
    return patternDayOfMonth;
  }

  @JsonProperty("pattern.dayOfMonth")
  public void setPatternDayOfMonth(@Nullable ConfigNodePropertyString patternDayOfMonth) {
    this.patternDayOfMonth = patternDayOfMonth;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternMonth(@Nullable ConfigNodePropertyString patternMonth) {
    this.patternMonth = patternMonth;
    return this;
  }

  /**
   * Get patternMonth
   * @return patternMonth
   */
  @Valid 
  @Schema(name = "pattern.month", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern.month")
  public @Nullable ConfigNodePropertyString getPatternMonth() {
    return patternMonth;
  }

  @JsonProperty("pattern.month")
  public void setPatternMonth(@Nullable ConfigNodePropertyString patternMonth) {
    this.patternMonth = patternMonth;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternYear(@Nullable ConfigNodePropertyString patternYear) {
    this.patternYear = patternYear;
    return this;
  }

  /**
   * Get patternYear
   * @return patternYear
   */
  @Valid 
  @Schema(name = "pattern.year", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern.year")
  public @Nullable ConfigNodePropertyString getPatternYear() {
    return patternYear;
  }

  @JsonProperty("pattern.year")
  public void setPatternYear(@Nullable ConfigNodePropertyString patternYear) {
    this.patternYear = patternYear;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDate(@Nullable ConfigNodePropertyString patternDate) {
    this.patternDate = patternDate;
    return this;
  }

  /**
   * Get patternDate
   * @return patternDate
   */
  @Valid 
  @Schema(name = "pattern.date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern.date")
  public @Nullable ConfigNodePropertyString getPatternDate() {
    return patternDate;
  }

  @JsonProperty("pattern.date")
  public void setPatternDate(@Nullable ConfigNodePropertyString patternDate) {
    this.patternDate = patternDate;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternDateTime(@Nullable ConfigNodePropertyString patternDateTime) {
    this.patternDateTime = patternDateTime;
    return this;
  }

  /**
   * Get patternDateTime
   * @return patternDateTime
   */
  @Valid 
  @Schema(name = "pattern.dateTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern.dateTime")
  public @Nullable ConfigNodePropertyString getPatternDateTime() {
    return patternDateTime;
  }

  @JsonProperty("pattern.dateTime")
  public void setPatternDateTime(@Nullable ConfigNodePropertyString patternDateTime) {
    this.patternDateTime = patternDateTime;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties patternEmail(@Nullable ConfigNodePropertyString patternEmail) {
    this.patternEmail = patternEmail;
    return this;
  }

  /**
   * Get patternEmail
   * @return patternEmail
   */
  @Valid 
  @Schema(name = "pattern.email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern.email")
  public @Nullable ConfigNodePropertyString getPatternEmail() {
    return patternEmail;
  }

  @JsonProperty("pattern.email")
  public void setPatternEmail(@Nullable ConfigNodePropertyString patternEmail) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

