package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString title;
    private ConfigNodePropertyString details;
    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyString serviceName;
    private ConfigNodePropertyDropDown logLevel;
    private ConfigNodePropertyArray allowedRoots;
    private ConfigNodePropertyString requestAuthorizationStrategyTarget;
    private ConfigNodePropertyString queueProviderFactoryTarget;
    private ConfigNodePropertyString packageBuilderTarget;
    private ConfigNodePropertyString triggersTarget;
    private ConfigNodePropertyArray priorityQueues;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties.
     *
     * @param name name
     * @param title title
     * @param details details
     * @param enabled enabled
     * @param serviceName serviceName
     * @param logLevel logLevel
     * @param allowedRoots allowedRoots
     * @param requestAuthorizationStrategyTarget requestAuthorizationStrategyTarget
     * @param queueProviderFactoryTarget queueProviderFactoryTarget
     * @param packageBuilderTarget packageBuilderTarget
     * @param triggersTarget triggersTarget
     * @param priorityQueues priorityQueues
     */
    public OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString title, 
        ConfigNodePropertyString details, 
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyString serviceName, 
        ConfigNodePropertyDropDown logLevel, 
        ConfigNodePropertyArray allowedRoots, 
        ConfigNodePropertyString requestAuthorizationStrategyTarget, 
        ConfigNodePropertyString queueProviderFactoryTarget, 
        ConfigNodePropertyString packageBuilderTarget, 
        ConfigNodePropertyString triggersTarget, 
        ConfigNodePropertyArray priorityQueues
    ) {
        this.name = name;
        this.title = title;
        this.details = details;
        this.enabled = enabled;
        this.serviceName = serviceName;
        this.logLevel = logLevel;
        this.allowedRoots = allowedRoots;
        this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
        this.queueProviderFactoryTarget = queueProviderFactoryTarget;
        this.packageBuilderTarget = packageBuilderTarget;
        this.triggersTarget = triggersTarget;
        this.priorityQueues = priorityQueues;
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
     * Get allowedRoots
     * @return allowedRoots
     */
    public ConfigNodePropertyArray getAllowedRoots() {
        return allowedRoots;
    }

    public void setAllowedRoots(ConfigNodePropertyArray allowedRoots) {
        this.allowedRoots = allowedRoots;
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
     * Get queueProviderFactoryTarget
     * @return queueProviderFactoryTarget
     */
    public ConfigNodePropertyString getQueueProviderFactoryTarget() {
        return queueProviderFactoryTarget;
    }

    public void setQueueProviderFactoryTarget(ConfigNodePropertyString queueProviderFactoryTarget) {
        this.queueProviderFactoryTarget = queueProviderFactoryTarget;
    }

    /**
     * Get packageBuilderTarget
     * @return packageBuilderTarget
     */
    public ConfigNodePropertyString getPackageBuilderTarget() {
        return packageBuilderTarget;
    }

    public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
        this.packageBuilderTarget = packageBuilderTarget;
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
     * Get priorityQueues
     * @return priorityQueues
     */
    public ConfigNodePropertyArray getPriorityQueues() {
        return priorityQueues;
    }

    public void setPriorityQueues(ConfigNodePropertyArray priorityQueues) {
        this.priorityQueues = priorityQueues;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
        sb.append("    allowedRoots: ").append(toIndentedString(allowedRoots)).append("\n");
        sb.append("    requestAuthorizationStrategyTarget: ").append(toIndentedString(requestAuthorizationStrategyTarget)).append("\n");
        sb.append("    queueProviderFactoryTarget: ").append(toIndentedString(queueProviderFactoryTarget)).append("\n");
        sb.append("    packageBuilderTarget: ").append(toIndentedString(packageBuilderTarget)).append("\n");
        sb.append("    triggersTarget: ").append(toIndentedString(triggersTarget)).append("\n");
        sb.append("    priorityQueues: ").append(toIndentedString(priorityQueues)).append("\n");
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

