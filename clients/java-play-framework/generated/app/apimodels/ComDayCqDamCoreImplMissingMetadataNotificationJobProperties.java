package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreImplMissingMetadataNotificationJobProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties   {
  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.istimebased")
  private ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased = null;

  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.timebased.rule")
  private ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule = null;

  @JsonProperty("cq.dam.missingmetadata.notification.scheduler.period.rule")
  private ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule = null;

  @JsonProperty("cq.dam.missingmetadata.notification.recipient")
  private ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient = null;

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased) {
    this.cqDamMissingmetadataNotificationSchedulerIstimebased = cqDamMissingmetadataNotificationSchedulerIstimebased;
    return this;
  }

   /**
   * Get cqDamMissingmetadataNotificationSchedulerIstimebased
   * @return cqDamMissingmetadataNotificationSchedulerIstimebased
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqDamMissingmetadataNotificationSchedulerIstimebased() {
    return cqDamMissingmetadataNotificationSchedulerIstimebased;
  }

  public void setCqDamMissingmetadataNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased) {
    this.cqDamMissingmetadataNotificationSchedulerIstimebased = cqDamMissingmetadataNotificationSchedulerIstimebased;
  }

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule) {
    this.cqDamMissingmetadataNotificationSchedulerTimebasedRule = cqDamMissingmetadataNotificationSchedulerTimebasedRule;
    return this;
  }

   /**
   * Get cqDamMissingmetadataNotificationSchedulerTimebasedRule
   * @return cqDamMissingmetadataNotificationSchedulerTimebasedRule
  **/
  @Valid
  public ConfigNodePropertyString getCqDamMissingmetadataNotificationSchedulerTimebasedRule() {
    return cqDamMissingmetadataNotificationSchedulerTimebasedRule;
  }

  public void setCqDamMissingmetadataNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule) {
    this.cqDamMissingmetadataNotificationSchedulerTimebasedRule = cqDamMissingmetadataNotificationSchedulerTimebasedRule;
  }

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule) {
    this.cqDamMissingmetadataNotificationSchedulerPeriodRule = cqDamMissingmetadataNotificationSchedulerPeriodRule;
    return this;
  }

   /**
   * Get cqDamMissingmetadataNotificationSchedulerPeriodRule
   * @return cqDamMissingmetadataNotificationSchedulerPeriodRule
  **/
  @Valid
  public ConfigNodePropertyInteger getCqDamMissingmetadataNotificationSchedulerPeriodRule() {
    return cqDamMissingmetadataNotificationSchedulerPeriodRule;
  }

  public void setCqDamMissingmetadataNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule) {
    this.cqDamMissingmetadataNotificationSchedulerPeriodRule = cqDamMissingmetadataNotificationSchedulerPeriodRule;
  }

  public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties cqDamMissingmetadataNotificationRecipient(ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient) {
    this.cqDamMissingmetadataNotificationRecipient = cqDamMissingmetadataNotificationRecipient;
    return this;
  }

   /**
   * Get cqDamMissingmetadataNotificationRecipient
   * @return cqDamMissingmetadataNotificationRecipient
  **/
  @Valid
  public ConfigNodePropertyString getCqDamMissingmetadataNotificationRecipient() {
    return cqDamMissingmetadataNotificationRecipient;
  }

  public void setCqDamMissingmetadataNotificationRecipient(ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient) {
    this.cqDamMissingmetadataNotificationRecipient = cqDamMissingmetadataNotificationRecipient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplMissingMetadataNotificationJobProperties comDayCqDamCoreImplMissingMetadataNotificationJobProperties = (ComDayCqDamCoreImplMissingMetadataNotificationJobProperties) o;
    return Objects.equals(cqDamMissingmetadataNotificationSchedulerIstimebased, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationSchedulerIstimebased) &&
        Objects.equals(cqDamMissingmetadataNotificationSchedulerTimebasedRule, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationSchedulerTimebasedRule) &&
        Objects.equals(cqDamMissingmetadataNotificationSchedulerPeriodRule, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationSchedulerPeriodRule) &&
        Objects.equals(cqDamMissingmetadataNotificationRecipient, comDayCqDamCoreImplMissingMetadataNotificationJobProperties.cqDamMissingmetadataNotificationRecipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamMissingmetadataNotificationSchedulerIstimebased, cqDamMissingmetadataNotificationSchedulerTimebasedRule, cqDamMissingmetadataNotificationSchedulerPeriodRule, cqDamMissingmetadataNotificationRecipient);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties {\n");
    
    sb.append("    cqDamMissingmetadataNotificationSchedulerIstimebased: ").append(toIndentedString(cqDamMissingmetadataNotificationSchedulerIstimebased)).append("\n");
    sb.append("    cqDamMissingmetadataNotificationSchedulerTimebasedRule: ").append(toIndentedString(cqDamMissingmetadataNotificationSchedulerTimebasedRule)).append("\n");
    sb.append("    cqDamMissingmetadataNotificationSchedulerPeriodRule: ").append(toIndentedString(cqDamMissingmetadataNotificationSchedulerPeriodRule)).append("\n");
    sb.append("    cqDamMissingmetadataNotificationRecipient: ").append(toIndentedString(cqDamMissingmetadataNotificationRecipient)).append("\n");
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

