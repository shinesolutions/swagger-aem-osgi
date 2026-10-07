package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplExpiryNotificationJobImplProperties   {

    private ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased;
    private ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule;
    private ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule;
    private ConfigNodePropertyBoolean sendEmail;
    private ConfigNodePropertyInteger assetExpiredLimit;
    private ConfigNodePropertyInteger priorNotificationSeconds;
    private ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplExpiryNotificationJobImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplExpiryNotificationJobImplProperties.
     *
     * @param cqDamExpiryNotificationSchedulerIstimebased cqDamExpiryNotificationSchedulerIstimebased
     * @param cqDamExpiryNotificationSchedulerTimebasedRule cqDamExpiryNotificationSchedulerTimebasedRule
     * @param cqDamExpiryNotificationSchedulerPeriodRule cqDamExpiryNotificationSchedulerPeriodRule
     * @param sendEmail sendEmail
     * @param assetExpiredLimit assetExpiredLimit
     * @param priorNotificationSeconds priorNotificationSeconds
     * @param cqDamExpiryNotificationUrlProtocol cqDamExpiryNotificationUrlProtocol
     */
    public ComDayCqDamCoreImplExpiryNotificationJobImplProperties(
        ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased, 
        ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule, 
        ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule, 
        ConfigNodePropertyBoolean sendEmail, 
        ConfigNodePropertyInteger assetExpiredLimit, 
        ConfigNodePropertyInteger priorNotificationSeconds, 
        ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol
    ) {
        this.cqDamExpiryNotificationSchedulerIstimebased = cqDamExpiryNotificationSchedulerIstimebased;
        this.cqDamExpiryNotificationSchedulerTimebasedRule = cqDamExpiryNotificationSchedulerTimebasedRule;
        this.cqDamExpiryNotificationSchedulerPeriodRule = cqDamExpiryNotificationSchedulerPeriodRule;
        this.sendEmail = sendEmail;
        this.assetExpiredLimit = assetExpiredLimit;
        this.priorNotificationSeconds = priorNotificationSeconds;
        this.cqDamExpiryNotificationUrlProtocol = cqDamExpiryNotificationUrlProtocol;
    }



    /**
     * Get cqDamExpiryNotificationSchedulerIstimebased
     * @return cqDamExpiryNotificationSchedulerIstimebased
     */
    public ConfigNodePropertyBoolean getCqDamExpiryNotificationSchedulerIstimebased() {
        return cqDamExpiryNotificationSchedulerIstimebased;
    }

    public void setCqDamExpiryNotificationSchedulerIstimebased(ConfigNodePropertyBoolean cqDamExpiryNotificationSchedulerIstimebased) {
        this.cqDamExpiryNotificationSchedulerIstimebased = cqDamExpiryNotificationSchedulerIstimebased;
    }

    /**
     * Get cqDamExpiryNotificationSchedulerTimebasedRule
     * @return cqDamExpiryNotificationSchedulerTimebasedRule
     */
    public ConfigNodePropertyString getCqDamExpiryNotificationSchedulerTimebasedRule() {
        return cqDamExpiryNotificationSchedulerTimebasedRule;
    }

    public void setCqDamExpiryNotificationSchedulerTimebasedRule(ConfigNodePropertyString cqDamExpiryNotificationSchedulerTimebasedRule) {
        this.cqDamExpiryNotificationSchedulerTimebasedRule = cqDamExpiryNotificationSchedulerTimebasedRule;
    }

    /**
     * Get cqDamExpiryNotificationSchedulerPeriodRule
     * @return cqDamExpiryNotificationSchedulerPeriodRule
     */
    public ConfigNodePropertyInteger getCqDamExpiryNotificationSchedulerPeriodRule() {
        return cqDamExpiryNotificationSchedulerPeriodRule;
    }

    public void setCqDamExpiryNotificationSchedulerPeriodRule(ConfigNodePropertyInteger cqDamExpiryNotificationSchedulerPeriodRule) {
        this.cqDamExpiryNotificationSchedulerPeriodRule = cqDamExpiryNotificationSchedulerPeriodRule;
    }

    /**
     * Get sendEmail
     * @return sendEmail
     */
    public ConfigNodePropertyBoolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(ConfigNodePropertyBoolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    /**
     * Get assetExpiredLimit
     * @return assetExpiredLimit
     */
    public ConfigNodePropertyInteger getAssetExpiredLimit() {
        return assetExpiredLimit;
    }

    public void setAssetExpiredLimit(ConfigNodePropertyInteger assetExpiredLimit) {
        this.assetExpiredLimit = assetExpiredLimit;
    }

    /**
     * Get priorNotificationSeconds
     * @return priorNotificationSeconds
     */
    public ConfigNodePropertyInteger getPriorNotificationSeconds() {
        return priorNotificationSeconds;
    }

    public void setPriorNotificationSeconds(ConfigNodePropertyInteger priorNotificationSeconds) {
        this.priorNotificationSeconds = priorNotificationSeconds;
    }

    /**
     * Get cqDamExpiryNotificationUrlProtocol
     * @return cqDamExpiryNotificationUrlProtocol
     */
    public ConfigNodePropertyString getCqDamExpiryNotificationUrlProtocol() {
        return cqDamExpiryNotificationUrlProtocol;
    }

    public void setCqDamExpiryNotificationUrlProtocol(ConfigNodePropertyString cqDamExpiryNotificationUrlProtocol) {
        this.cqDamExpiryNotificationUrlProtocol = cqDamExpiryNotificationUrlProtocol;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

