package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString title;
    private ConfigNodePropertyString details;
    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyString serviceName;
    private ConfigNodePropertyDropDown logLevel;
    private ConfigNodePropertyArray allowedRoots;
    private ConfigNodePropertyBoolean queueProcessingEnabled;
    private ConfigNodePropertyArray packageImporterEndpoints;
    private ConfigNodePropertyArray passiveQueues;
    private ConfigNodePropertyArray priorityQueues;
    private ConfigNodePropertyDropDown retryStrategy;
    private ConfigNodePropertyInteger retryAttempts;
    private ConfigNodePropertyString requestAuthorizationStrategyTarget;
    private ConfigNodePropertyString transportSecretProviderTarget;
    private ConfigNodePropertyString packageBuilderTarget;
    private ConfigNodePropertyString triggersTarget;
    private ConfigNodePropertyDropDown queueProvider;
    private ConfigNodePropertyBoolean asyncDelivery;
    private ConfigNodePropertyInteger httpConnTimeout;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties.
     *
     * @param name name
     * @param title title
     * @param details details
     * @param enabled enabled
     * @param serviceName serviceName
     * @param logLevel logLevel
     * @param allowedRoots allowedRoots
     * @param queueProcessingEnabled queueProcessingEnabled
     * @param packageImporterEndpoints packageImporterEndpoints
     * @param passiveQueues passiveQueues
     * @param priorityQueues priorityQueues
     * @param retryStrategy retryStrategy
     * @param retryAttempts retryAttempts
     * @param requestAuthorizationStrategyTarget requestAuthorizationStrategyTarget
     * @param transportSecretProviderTarget transportSecretProviderTarget
     * @param packageBuilderTarget packageBuilderTarget
     * @param triggersTarget triggersTarget
     * @param queueProvider queueProvider
     * @param asyncDelivery asyncDelivery
     * @param httpConnTimeout httpConnTimeout
     */
    public OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString title, 
        ConfigNodePropertyString details, 
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyString serviceName, 
        ConfigNodePropertyDropDown logLevel, 
        ConfigNodePropertyArray allowedRoots, 
        ConfigNodePropertyBoolean queueProcessingEnabled, 
        ConfigNodePropertyArray packageImporterEndpoints, 
        ConfigNodePropertyArray passiveQueues, 
        ConfigNodePropertyArray priorityQueues, 
        ConfigNodePropertyDropDown retryStrategy, 
        ConfigNodePropertyInteger retryAttempts, 
        ConfigNodePropertyString requestAuthorizationStrategyTarget, 
        ConfigNodePropertyString transportSecretProviderTarget, 
        ConfigNodePropertyString packageBuilderTarget, 
        ConfigNodePropertyString triggersTarget, 
        ConfigNodePropertyDropDown queueProvider, 
        ConfigNodePropertyBoolean asyncDelivery, 
        ConfigNodePropertyInteger httpConnTimeout
    ) {
        this.name = name;
        this.title = title;
        this.details = details;
        this.enabled = enabled;
        this.serviceName = serviceName;
        this.logLevel = logLevel;
        this.allowedRoots = allowedRoots;
        this.queueProcessingEnabled = queueProcessingEnabled;
        this.packageImporterEndpoints = packageImporterEndpoints;
        this.passiveQueues = passiveQueues;
        this.priorityQueues = priorityQueues;
        this.retryStrategy = retryStrategy;
        this.retryAttempts = retryAttempts;
        this.requestAuthorizationStrategyTarget = requestAuthorizationStrategyTarget;
        this.transportSecretProviderTarget = transportSecretProviderTarget;
        this.packageBuilderTarget = packageBuilderTarget;
        this.triggersTarget = triggersTarget;
        this.queueProvider = queueProvider;
        this.asyncDelivery = asyncDelivery;
        this.httpConnTimeout = httpConnTimeout;
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
     * Get packageImporterEndpoints
     * @return packageImporterEndpoints
     */
    public ConfigNodePropertyArray getPackageImporterEndpoints() {
        return packageImporterEndpoints;
    }

    public void setPackageImporterEndpoints(ConfigNodePropertyArray packageImporterEndpoints) {
        this.packageImporterEndpoints = packageImporterEndpoints;
    }

    /**
     * Get passiveQueues
     * @return passiveQueues
     */
    public ConfigNodePropertyArray getPassiveQueues() {
        return passiveQueues;
    }

    public void setPassiveQueues(ConfigNodePropertyArray passiveQueues) {
        this.passiveQueues = passiveQueues;
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
     * Get retryStrategy
     * @return retryStrategy
     */
    public ConfigNodePropertyDropDown getRetryStrategy() {
        return retryStrategy;
    }

    public void setRetryStrategy(ConfigNodePropertyDropDown retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    /**
     * Get retryAttempts
     * @return retryAttempts
     */
    public ConfigNodePropertyInteger getRetryAttempts() {
        return retryAttempts;
    }

    public void setRetryAttempts(ConfigNodePropertyInteger retryAttempts) {
        this.retryAttempts = retryAttempts;
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
     * Get transportSecretProviderTarget
     * @return transportSecretProviderTarget
     */
    public ConfigNodePropertyString getTransportSecretProviderTarget() {
        return transportSecretProviderTarget;
    }

    public void setTransportSecretProviderTarget(ConfigNodePropertyString transportSecretProviderTarget) {
        this.transportSecretProviderTarget = transportSecretProviderTarget;
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
     * Get queueProvider
     * @return queueProvider
     */
    public ConfigNodePropertyDropDown getQueueProvider() {
        return queueProvider;
    }

    public void setQueueProvider(ConfigNodePropertyDropDown queueProvider) {
        this.queueProvider = queueProvider;
    }

    /**
     * Get asyncDelivery
     * @return asyncDelivery
     */
    public ConfigNodePropertyBoolean getAsyncDelivery() {
        return asyncDelivery;
    }

    public void setAsyncDelivery(ConfigNodePropertyBoolean asyncDelivery) {
        this.asyncDelivery = asyncDelivery;
    }

    /**
     * Get httpConnTimeout
     * @return httpConnTimeout
     */
    public ConfigNodePropertyInteger getHttpConnTimeout() {
        return httpConnTimeout;
    }

    public void setHttpConnTimeout(ConfigNodePropertyInteger httpConnTimeout) {
        this.httpConnTimeout = httpConnTimeout;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
        sb.append("    allowedRoots: ").append(toIndentedString(allowedRoots)).append("\n");
        sb.append("    queueProcessingEnabled: ").append(toIndentedString(queueProcessingEnabled)).append("\n");
        sb.append("    packageImporterEndpoints: ").append(toIndentedString(packageImporterEndpoints)).append("\n");
        sb.append("    passiveQueues: ").append(toIndentedString(passiveQueues)).append("\n");
        sb.append("    priorityQueues: ").append(toIndentedString(priorityQueues)).append("\n");
        sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
        sb.append("    retryAttempts: ").append(toIndentedString(retryAttempts)).append("\n");
        sb.append("    requestAuthorizationStrategyTarget: ").append(toIndentedString(requestAuthorizationStrategyTarget)).append("\n");
        sb.append("    transportSecretProviderTarget: ").append(toIndentedString(transportSecretProviderTarget)).append("\n");
        sb.append("    packageBuilderTarget: ").append(toIndentedString(packageBuilderTarget)).append("\n");
        sb.append("    triggersTarget: ").append(toIndentedString(triggersTarget)).append("\n");
        sb.append("    queueProvider: ").append(toIndentedString(queueProvider)).append("\n");
        sb.append("    asyncDelivery: ").append(toIndentedString(asyncDelivery)).append("\n");
        sb.append("    httpConnTimeout: ").append(toIndentedString(httpConnTimeout)).append("\n");
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

