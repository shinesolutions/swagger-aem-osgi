package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties   {

    private ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased;
    private ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule;
    private ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule;
    private ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.
     *
     * @param cqDamMissingmetadataNotificationSchedulerIstimebased cqDamMissingmetadataNotificationSchedulerIstimebased
     * @param cqDamMissingmetadataNotificationSchedulerTimebasedRule cqDamMissingmetadataNotificationSchedulerTimebasedRule
     * @param cqDamMissingmetadataNotificationSchedulerPeriodRule cqDamMissingmetadataNotificationSchedulerPeriodRule
     * @param cqDamMissingmetadataNotificationRecipient cqDamMissingmetadataNotificationRecipient
     */
    public ComDayCqDamCoreImplMissingMetadataNotificationJobProperties(
        ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased, 
        ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule, 
        ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule, 
        ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient
    ) {
        this.cqDamMissingmetadataNotificationSchedulerIstimebased = cqDamMissingmetadataNotificationSchedulerIstimebased;
        this.cqDamMissingmetadataNotificationSchedulerTimebasedRule = cqDamMissingmetadataNotificationSchedulerTimebasedRule;
        this.cqDamMissingmetadataNotificationSchedulerPeriodRule = cqDamMissingmetadataNotificationSchedulerPeriodRule;
        this.cqDamMissingmetadataNotificationRecipient = cqDamMissingmetadataNotificationRecipient;
    }



    /**
     * Get cqDamMissingmetadataNotificationSchedulerIstimebased
     * @return cqDamMissingmetadataNotificationSchedulerIstimebased
     */
    public ConfigNodePropertyBoolean getCqDamMissingmetadataNotificationSchedulerIstimebased() {
        return cqDamMissingmetadataNotificationSchedulerIstimebased;
    }

    public void setCqDamMissingmetadataNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamMissingmetadataNotificationSchedulerIstimebased) {
        this.cqDamMissingmetadataNotificationSchedulerIstimebased = cqDamMissingmetadataNotificationSchedulerIstimebased;
    }

    /**
     * Get cqDamMissingmetadataNotificationSchedulerTimebasedRule
     * @return cqDamMissingmetadataNotificationSchedulerTimebasedRule
     */
    public ConfigNodePropertyString getCqDamMissingmetadataNotificationSchedulerTimebasedRule() {
        return cqDamMissingmetadataNotificationSchedulerTimebasedRule;
    }

    public void setCqDamMissingmetadataNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamMissingmetadataNotificationSchedulerTimebasedRule) {
        this.cqDamMissingmetadataNotificationSchedulerTimebasedRule = cqDamMissingmetadataNotificationSchedulerTimebasedRule;
    }

    /**
     * Get cqDamMissingmetadataNotificationSchedulerPeriodRule
     * @return cqDamMissingmetadataNotificationSchedulerPeriodRule
     */
    public ConfigNodePropertyInteger getCqDamMissingmetadataNotificationSchedulerPeriodRule() {
        return cqDamMissingmetadataNotificationSchedulerPeriodRule;
    }

    public void setCqDamMissingmetadataNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamMissingmetadataNotificationSchedulerPeriodRule) {
        this.cqDamMissingmetadataNotificationSchedulerPeriodRule = cqDamMissingmetadataNotificationSchedulerPeriodRule;
    }

    /**
     * Get cqDamMissingmetadataNotificationRecipient
     * @return cqDamMissingmetadataNotificationRecipient
     */
    public ConfigNodePropertyString getCqDamMissingmetadataNotificationRecipient() {
        return cqDamMissingmetadataNotificationRecipient;
    }

    public void setCqDamMissingmetadataNotificationRecipient(ConfigNodePropertyString cqDamMissingmetadataNotificationRecipient) {
        this.cqDamMissingmetadataNotificationRecipient = cqDamMissingmetadataNotificationRecipient;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

