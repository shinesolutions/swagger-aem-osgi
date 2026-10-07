package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * ComDayCqDamCoreImplExpiryNotificationJobImplProperties
 */

@JsonTypeName("comDayCqDamCoreImplExpiryNotificationJobImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplExpiryNotificationJobImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean sendEmail;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger assetExpiredLimit;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger priorNotificationSeconds;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol;

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerIstimebased(@Nullable ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased) {
    this.cqDamExpiryNotificationSchedulerIstimebased = cqDamExpiryNotificationSchedulerIstimebased;
    return this;
  }

  /**
   * Get cqDamExpiryNotificationSchedulerIstimebased
   * @return cqDamExpiryNotificationSchedulerIstimebased
   */
  @Valid 
  @Schema(name = "cq.dam.expiry.notification.scheduler.istimebased", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.expiry.notification.scheduler.istimebased")
  public @Nullable ConfigNodePropertyBoolean getCqDamExpiryNotificationSchedulerIstimebased() {
    return cqDamExpiryNotificationSchedulerIstimebased;
  }

  @JsonProperty("cq.dam.expiry.notification.scheduler.istimebased")
  public void setCqDamExpiryNotificationSchedulerIstimebased(@Nullable ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased) {
    this.cqDamExpiryNotificationSchedulerIstimebased = cqDamExpiryNotificationSchedulerIstimebased;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerTimebasedRule(@Nullable ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule) {
    this.cqDamExpiryNotificationSchedulerTimebasedRule = cqDamExpiryNotificationSchedulerTimebasedRule;
    return this;
  }

  /**
   * Get cqDamExpiryNotificationSchedulerTimebasedRule
   * @return cqDamExpiryNotificationSchedulerTimebasedRule
   */
  @Valid 
  @Schema(name = "cq.dam.expiry.notification.scheduler.timebased.rule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.expiry.notification.scheduler.timebased.rule")
  public @Nullable ConfigNodePropertyString getCqDamExpiryNotificationSchedulerTimebasedRule() {
    return cqDamExpiryNotificationSchedulerTimebasedRule;
  }

  @JsonProperty("cq.dam.expiry.notification.scheduler.timebased.rule")
  public void setCqDamExpiryNotificationSchedulerTimebasedRule(@Nullable ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule) {
    this.cqDamExpiryNotificationSchedulerTimebasedRule = cqDamExpiryNotificationSchedulerTimebasedRule;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerPeriodRule(@Nullable ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule) {
    this.cqDamExpiryNotificationSchedulerPeriodRule = cqDamExpiryNotificationSchedulerPeriodRule;
    return this;
  }

  /**
   * Get cqDamExpiryNotificationSchedulerPeriodRule
   * @return cqDamExpiryNotificationSchedulerPeriodRule
   */
  @Valid 
  @Schema(name = "cq.dam.expiry.notification.scheduler.period.rule", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.expiry.notification.scheduler.period.rule")
  public @Nullable ConfigNodePropertyInteger getCqDamExpiryNotificationSchedulerPeriodRule() {
    return cqDamExpiryNotificationSchedulerPeriodRule;
  }

  @JsonProperty("cq.dam.expiry.notification.scheduler.period.rule")
  public void setCqDamExpiryNotificationSchedulerPeriodRule(@Nullable ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule) {
    this.cqDamExpiryNotificationSchedulerPeriodRule = cqDamExpiryNotificationSchedulerPeriodRule;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties sendEmail(@Nullable ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
    return this;
  }

  /**
   * Get sendEmail
   * @return sendEmail
   */
  @Valid 
  @Schema(name = "send_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("send_email")
  public @Nullable ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }

  @JsonProperty("send_email")
  public void setSendEmail(@Nullable ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties assetExpiredLimit(@Nullable ConfigNodePropertyInteger assetExpiredLimit) {
    this.assetExpiredLimit = assetExpiredLimit;
    return this;
  }

  /**
   * Get assetExpiredLimit
   * @return assetExpiredLimit
   */
  @Valid 
  @Schema(name = "asset_expired_limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_expired_limit")
  public @Nullable ConfigNodePropertyInteger getAssetExpiredLimit() {
    return assetExpiredLimit;
  }

  @JsonProperty("asset_expired_limit")
  public void setAssetExpiredLimit(@Nullable ConfigNodePropertyInteger assetExpiredLimit) {
    this.assetExpiredLimit = assetExpiredLimit;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties priorNotificationSeconds(@Nullable ConfigNodePropertyInteger priorNotificationSeconds) {
    this.priorNotificationSeconds = priorNotificationSeconds;
    return this;
  }

  /**
   * Get priorNotificationSeconds
   * @return priorNotificationSeconds
   */
  @Valid 
  @Schema(name = "prior_notification_seconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prior_notification_seconds")
  public @Nullable ConfigNodePropertyInteger getPriorNotificationSeconds() {
    return priorNotificationSeconds;
  }

  @JsonProperty("prior_notification_seconds")
  public void setPriorNotificationSeconds(@Nullable ConfigNodePropertyInteger priorNotificationSeconds) {
    this.priorNotificationSeconds = priorNotificationSeconds;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationUrlProtocol(@Nullable ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol) {
    this.cqDamExpiryNotificationUrlProtocol = cqDamExpiryNotificationUrlProtocol;
    return this;
  }

  /**
   * Get cqDamExpiryNotificationUrlProtocol
   * @return cqDamExpiryNotificationUrlProtocol
   */
  @Valid 
  @Schema(name = "cq.dam.expiry.notification.url.protocol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.expiry.notification.url.protocol")
  public @Nullable ConfigNodePropertyString getCqDamExpiryNotificationUrlProtocol() {
    return cqDamExpiryNotificationUrlProtocol;
  }

  @JsonProperty("cq.dam.expiry.notification.url.protocol")
  public void setCqDamExpiryNotificationUrlProtocol(@Nullable ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol) {
    this.cqDamExpiryNotificationUrlProtocol = cqDamExpiryNotificationUrlProtocol;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplExpiryNotificationJobImplProperties comDayCqDamCoreImplExpiryNotificationJobImplProperties = (ComDayCqDamCoreImplExpiryNotificationJobImplProperties) o;
    return Objects.equals(this.cqDamExpiryNotificationSchedulerIstimebased, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationSchedulerIstimebased) &&
        Objects.equals(this.cqDamExpiryNotificationSchedulerTimebasedRule, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationSchedulerTimebasedRule) &&
        Objects.equals(this.cqDamExpiryNotificationSchedulerPeriodRule, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationSchedulerPeriodRule) &&
        Objects.equals(this.sendEmail, comDayCqDamCoreImplExpiryNotificationJobImplProperties.sendEmail) &&
        Objects.equals(this.assetExpiredLimit, comDayCqDamCoreImplExpiryNotificationJobImplProperties.assetExpiredLimit) &&
        Objects.equals(this.priorNotificationSeconds, comDayCqDamCoreImplExpiryNotificationJobImplProperties.priorNotificationSeconds) &&
        Objects.equals(this.cqDamExpiryNotificationUrlProtocol, comDayCqDamCoreImplExpiryNotificationJobImplProperties.cqDamExpiryNotificationUrlProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamExpiryNotificationSchedulerIstimebased, cqDamExpiryNotificationSchedulerTimebasedRule, cqDamExpiryNotificationSchedulerPeriodRule, sendEmail, assetExpiredLimit, priorNotificationSeconds, cqDamExpiryNotificationUrlProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplExpiryNotificationJobImplProperties {\n");
    sb.append("    cqDamExpiryNotificationSchedulerIstimebased: ").append(toIndentedString(cqDamExpiryNotificationSchedulerIstimebased)).append("\n");
    sb.append("    cqDamExpiryNotificationSchedulerTimebasedRule: ").append(toIndentedString(cqDamExpiryNotificationSchedulerTimebasedRule)).append("\n");
    sb.append("    cqDamExpiryNotificationSchedulerPeriodRule: ").append(toIndentedString(cqDamExpiryNotificationSchedulerPeriodRule)).append("\n");
    sb.append("    sendEmail: ").append(toIndentedString(sendEmail)).append("\n");
    sb.append("    assetExpiredLimit: ").append(toIndentedString(assetExpiredLimit)).append("\n");
    sb.append("    priorNotificationSeconds: ").append(toIndentedString(priorNotificationSeconds)).append("\n");
    sb.append("    cqDamExpiryNotificationUrlProtocol: ").append(toIndentedString(cqDamExpiryNotificationUrlProtocol)).append("\n");
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

