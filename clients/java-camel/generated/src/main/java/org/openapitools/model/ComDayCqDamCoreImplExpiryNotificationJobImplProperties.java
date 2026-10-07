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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplExpiryNotificationJobImplProperties {

  private ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased;

  private ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule;

  private ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule;

  private ConfigNodePropertyBoolean sendEmail;

  private ConfigNodePropertyInteger assetExpiredLimit;

  private ConfigNodePropertyInteger priorNotificationSeconds;

  private ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol;

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased) {
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
  public ConfigNodePropertyBoolean getCqDamExpiryNotificationSchedulerIstimebased() {
    return cqDamExpiryNotificationSchedulerIstimebased;
  }

  public void setCqDamExpiryNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased) {
    this.cqDamExpiryNotificationSchedulerIstimebased = cqDamExpiryNotificationSchedulerIstimebased;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule) {
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
  public ConfigNodePropertyString getCqDamExpiryNotificationSchedulerTimebasedRule() {
    return cqDamExpiryNotificationSchedulerTimebasedRule;
  }

  public void setCqDamExpiryNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule) {
    this.cqDamExpiryNotificationSchedulerTimebasedRule = cqDamExpiryNotificationSchedulerTimebasedRule;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule) {
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
  public ConfigNodePropertyInteger getCqDamExpiryNotificationSchedulerPeriodRule() {
    return cqDamExpiryNotificationSchedulerPeriodRule;
  }

  public void setCqDamExpiryNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule) {
    this.cqDamExpiryNotificationSchedulerPeriodRule = cqDamExpiryNotificationSchedulerPeriodRule;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties sendEmail(ConfigNodePropertyBoolean sendEmail) {
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
  public ConfigNodePropertyBoolean getSendEmail() {
    return sendEmail;
  }

  public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
    this.sendEmail = sendEmail;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties assetExpiredLimit(ConfigNodePropertyInteger assetExpiredLimit) {
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
  public ConfigNodePropertyInteger getAssetExpiredLimit() {
    return assetExpiredLimit;
  }

  public void setAssetExpiredLimit(ConfigNodePropertyInteger assetExpiredLimit) {
    this.assetExpiredLimit = assetExpiredLimit;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties priorNotificationSeconds(ConfigNodePropertyInteger priorNotificationSeconds) {
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
  public ConfigNodePropertyInteger getPriorNotificationSeconds() {
    return priorNotificationSeconds;
  }

  public void setPriorNotificationSeconds(ConfigNodePropertyInteger priorNotificationSeconds) {
    this.priorNotificationSeconds = priorNotificationSeconds;
  }

  public ComDayCqDamCoreImplExpiryNotificationJobImplProperties cqDamExpiryNotificationUrlProtocol(ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol) {
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
  public ConfigNodePropertyString getCqDamExpiryNotificationUrlProtocol() {
    return cqDamExpiryNotificationUrlProtocol;
  }

  public void setCqDamExpiryNotificationUrlProtocol(ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

