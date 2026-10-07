package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString title;
    private ConfigNodePropertyString details;
    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyString serviceName;
    private ConfigNodePropertyDropDown logLevel;
    private ConfigNodePropertyBoolean queueProcessingEnabled;
    private ConfigNodePropertyString packageExporterTarget;
    private ConfigNodePropertyString packageImporterTarget;
    private ConfigNodePropertyString requestAuthorizationStrategyTarget;
    private ConfigNodePropertyString triggersTarget;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties.
     *
     * @param name name
     * @param title title
     * @param details details
     * @param enabled enabled
     * @param serviceName serviceName
     * @param logLevel logLevel
     * @param queueProcessingEnabled queueProcessingEnabled
     * @param packageExporterTarget packageExporterTarget
     * @param packageImporterTarget packageImporterTarget
     * @param requestAuthorizationStrategyTarget requestAuthorizationStrategyTarget
     * @param triggersTarget triggersTarget
     */
    public OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString title, 
        ConfigNodePropertyString details, 
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyString serviceName, 
        ConfigNodePropertyDropDown logLevel, 
        ConfigNodePropertyBoolean queueProcessingEnabled, 
        ConfigNodePropertyString packageExporterTarget, 
        ConfigNodePropertyString packageImporterTarget, 
        ConfigNodePropertyString requestAuthorizationStrategyTarget, 
        ConfigNodePropertyString triggersTarget
    ) {
        this.name = name;
        this.title = title;
        this.details = details;
        this.enabled = enabled;
        this.serviceName = serviceName;
        this.logLevel = logLevel;
        this.queueProcessingEnabled = queueProcessingEnabled;
        this.packageExporterTarget = packageExporterTarget;
        this.packageImporterTarget = packageImporterTarget;
        this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
        this.triggersTarget = triggersTarget;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get title
     * @return title
     */
    public ConfigNodePropertyString getTitle() {
        return title;
    }

    public void setTitle(ConfigNodePropertyString title) {
        this.title = title;
    }

    /**
     * Get details
     * @return details
     */
    public ConfigNodePropertyString getDetails() {
        return details;
    }

    public void setDetails(ConfigNodePropertyString details) {
        this.details = details;
    }

    /**
     * Get enabled
     * @return enabled
     */
    public ConfigNodePropertyBoolean getEnabled() {
        return enabled;
    }

    public void setEnabled(ConfigNodePropertyBoolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get serviceName
     * @return serviceName
     */
    public ConfigNodePropertyString getServiceName() {
        return serviceName;
    }

    public void setServiceName(ConfigNodePropertyString serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Get logLevel
     * @return logLevel
     */
    public ConfigNodePropertyDropDown getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(ConfigNodePropertyDropDown logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * Get queueProcessingEnabled
     * @return queueProcessingEnabled
     */
    public ConfigNodePropertyBoolean getQueueProcessingEnabled() {
        return queueProcessingEnabled;
    }

    public void setQueueProcessingEnabled(ConfigNodePropertyBoolean queueProcessingEnabled) {
        this.queueProcessingEnabled = queueProcessingEnabled;
    }

    /**
     * Get packageExporterTarget
     * @return packageExporterTarget
     */
    public ConfigNodePropertyString getPackageExporterTarget() {
        return packageExporterTarget;
    }

    public void setPackageExporterTarget(ConfigNodePropertyString packageExporterTarget) {
        this.packageExporterTarget = packageExporterTarget;
    }

    /**
     * Get packageImporterTarget
     * @return packageImporterTarget
     */
    public ConfigNodePropertyString getPackageImporterTarget() {
        return packageImporterTarget;
    }

    public void setPackageImporterTarget(ConfigNodePropertyString packageImporterTarget) {
        this.packageImporterTarget = packageImporterTarget;
    }

    /**
     * Get requestAuthorizationStrategyTarget
     * @return requestAuthorizationStrategyTarget
     */
    public ConfigNodePropertyString getRequestAuthorizationStrategyTarget() {
        return requestAuthorizationStrategyTarget;
    }

    public void setRequestAuthorizationStrategyTarget(ConfigNodePropertyString requestAuthorizationStrategyTarget) {
        this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
    }

    /**
     * Get triggersTarget
     * @return triggersTarget
     */
    public ConfigNodePropertyString getTriggersTarget() {
        return triggersTarget;
    }

    public void setTriggersTarget(ConfigNodePropertyString triggersTarget) {
        this.triggersTarget = triggersTarget;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
        sb.append("    queueProcessingEnabled: ").append(toIndentedString(queueProcessingEnabled)).append("\n");
        sb.append("    packageExporterTarget: ").append(toIndentedString(packageExporterTarget)).append("\n");
        sb.append("    packageImporterTarget: ").append(toIndentedString(packageImporterTarget)).append("\n");
        sb.append("    requestAuthorizationStrategyTarget: ").append(toIndentedString(requestAuthorizationStrategyTarget)).append("\n");
        sb.append("    triggersTarget: ").append(toIndentedString(triggersTarget)).append("\n");
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

