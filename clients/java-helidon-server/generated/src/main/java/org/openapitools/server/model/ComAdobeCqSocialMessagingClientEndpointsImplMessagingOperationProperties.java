package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties   {

    private ConfigNodePropertyArray messageProperties;
    private ConfigNodePropertyInteger messageBoxSizeLimit;
    private ConfigNodePropertyInteger messageCountLimit;
    private ConfigNodePropertyBoolean notifyFailure;
    private ConfigNodePropertyString failureMessageFrom;
    private ConfigNodePropertyString failureTemplatePath;
    private ConfigNodePropertyInteger maxRetries;
    private ConfigNodePropertyInteger minWaitBetweenRetries;
    private ConfigNodePropertyInteger countUpdatePoolSize;
    private ConfigNodePropertyString inboxPath;
    private ConfigNodePropertyString sentitemsPath;
    private ConfigNodePropertyBoolean supportAttachments;
    private ConfigNodePropertyBoolean supportGroupMessaging;
    private ConfigNodePropertyInteger maxTotalRecipients;
    private ConfigNodePropertyInteger batchSize;
    private ConfigNodePropertyInteger maxTotalAttachmentSize;
    private ConfigNodePropertyArray attachmentTypeBlacklist;
    private ConfigNodePropertyArray allowedAttachmentTypes;
    private ConfigNodePropertyString serviceSelector;
    private ConfigNodePropertyArray fieldWhitelist;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.
     *
     * @param messageProperties messageProperties
     * @param messageBoxSizeLimit messageBoxSizeLimit
     * @param messageCountLimit messageCountLimit
     * @param notifyFailure notifyFailure
     * @param failureMessageFrom failureMessageFrom
     * @param failureTemplatePath failureTemplatePath
     * @param maxRetries maxRetries
     * @param minWaitBetweenRetries minWaitBetweenRetries
     * @param countUpdatePoolSize countUpdatePoolSize
     * @param inboxPath inboxPath
     * @param sentitemsPath sentitemsPath
     * @param supportAttachments supportAttachments
     * @param supportGroupMessaging supportGroupMessaging
     * @param maxTotalRecipients maxTotalRecipients
     * @param batchSize batchSize
     * @param maxTotalAttachmentSize maxTotalAttachmentSize
     * @param attachmentTypeBlacklist attachmentTypeBlacklist
     * @param allowedAttachmentTypes allowedAttachmentTypes
     * @param serviceSelector serviceSelector
     * @param fieldWhitelist fieldWhitelist
     */
    public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties(
        ConfigNodePropertyArray messageProperties, 
        ConfigNodePropertyInteger messageBoxSizeLimit, 
        ConfigNodePropertyInteger messageCountLimit, 
        ConfigNodePropertyBoolean notifyFailure, 
        ConfigNodePropertyString failureMessageFrom, 
        ConfigNodePropertyString failureTemplatePath, 
        ConfigNodePropertyInteger maxRetries, 
        ConfigNodePropertyInteger minWaitBetweenRetries, 
        ConfigNodePropertyInteger countUpdatePoolSize, 
        ConfigNodePropertyString inboxPath, 
        ConfigNodePropertyString sentitemsPath, 
        ConfigNodePropertyBoolean supportAttachments, 
        ConfigNodePropertyBoolean supportGroupMessaging, 
        ConfigNodePropertyInteger maxTotalRecipients, 
        ConfigNodePropertyInteger batchSize, 
        ConfigNodePropertyInteger maxTotalAttachmentSize, 
        ConfigNodePropertyArray attachmentTypeBlacklist, 
        ConfigNodePropertyArray allowedAttachmentTypes, 
        ConfigNodePropertyString serviceSelector, 
        ConfigNodePropertyArray fieldWhitelist
    ) {
        this.messageProperties = messageProperties;
        this.messageBoxSizeLimit = messageBoxSizeLimit;
        this.messageCountLimit = messageCountLimit;
        this.notifyFailure = notifyFailure;
        this.failureMessageFrom = failureMessageFrom;
        this.failureTemplatePath = failureTemplatePath;
        this.maxRetries = maxRetries;
        this.minWaitBetweenRetries = minWaitBetweenRetries;
        this.countUpdatePoolSize = countUpdatePoolSize;
        this.inboxPath = inboxPath;
        this.sentitemsPath = sentitemsPath;
        this.supportAttachments = supportAttachments;
        this.supportGroupMessaging = supportGroupMessaging;
        this.maxTotalRecipients = maxTotalRecipients;
        this.batchSize = batchSize;
        this.maxTotalAttachmentSize = maxTotalAttachmentSize;
        this.attachmentTypeBlacklist = attachmentTypeBlacklist;
        this.allowedAttachmentTypes = allowedAttachmentTypes;
        this.serviceSelector = serviceSelector;
        this.fieldWhitelist = fieldWhitelist;
    }



    /**
     * Get messageProperties
     * @return messageProperties
     */
    public ConfigNodePropertyArray getMessageProperties() {
        return messageProperties;
    }

    public void setMessageProperties(ConfigNodePropertyArray messageProperties) {
        this.messageProperties = messageProperties;
    }

    /**
     * Get messageBoxSizeLimit
     * @return messageBoxSizeLimit
     */
    public ConfigNodePropertyInteger getMessageBoxSizeLimit() {
        return messageBoxSizeLimit;
    }

    public void setMessageBoxSizeLimit(ConfigNodePropertyInteger messageBoxSizeLimit) {
        this.messageBoxSizeLimit = messageBoxSizeLimit;
    }

    /**
     * Get messageCountLimit
     * @return messageCountLimit
     */
    public ConfigNodePropertyInteger getMessageCountLimit() {
        return messageCountLimit;
    }

    public void setMessageCountLimit(ConfigNodePropertyInteger messageCountLimit) {
        this.messageCountLimit = messageCountLimit;
    }

    /**
     * Get notifyFailure
     * @return notifyFailure
     */
    public ConfigNodePropertyBoolean getNotifyFailure() {
        return notifyFailure;
    }

    public void setNotifyFailure(ConfigNodePropertyBoolean notifyFailure) {
        this.notifyFailure = notifyFailure;
    }

    /**
     * Get failureMessageFrom
     * @return failureMessageFrom
     */
    public ConfigNodePropertyString getFailureMessageFrom() {
        return failureMessageFrom;
    }

    public void setFailureMessageFrom(ConfigNodePropertyString failureMessageFrom) {
        this.failureMessageFrom = failureMessageFrom;
    }

    /**
     * Get failureTemplatePath
     * @return failureTemplatePath
     */
    public ConfigNodePropertyString getFailureTemplatePath() {
        return failureTemplatePath;
    }

    public void setFailureTemplatePath(ConfigNodePropertyString failureTemplatePath) {
        this.failureTemplatePath = failureTemplatePath;
    }

    /**
     * Get maxRetries
     * @return maxRetries
     */
    public ConfigNodePropertyInteger getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(ConfigNodePropertyInteger maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * Get minWaitBetweenRetries
     * @return minWaitBetweenRetries
     */
    public ConfigNodePropertyInteger getMinWaitBetweenRetries() {
        return minWaitBetweenRetries;
    }

    public void setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
        this.minWaitBetweenRetries = minWaitBetweenRetries;
    }

    /**
     * Get countUpdatePoolSize
     * @return countUpdatePoolSize
     */
    public ConfigNodePropertyInteger getCountUpdatePoolSize() {
        return countUpdatePoolSize;
    }

    public void setCountUpdatePoolSize(ConfigNodePropertyInteger countUpdatePoolSize) {
        this.countUpdatePoolSize = countUpdatePoolSize;
    }

    /**
     * Get inboxPath
     * @return inboxPath
     */
    public ConfigNodePropertyString getInboxPath() {
        return inboxPath;
    }

    public void setInboxPath(ConfigNodePropertyString inboxPath) {
        this.inboxPath = inboxPath;
    }

    /**
     * Get sentitemsPath
     * @return sentitemsPath
     */
    public ConfigNodePropertyString getSentitemsPath() {
        return sentitemsPath;
    }

    public void setSentitemsPath(ConfigNodePropertyString sentitemsPath) {
        this.sentitemsPath = sentitemsPath;
    }

    /**
     * Get supportAttachments
     * @return supportAttachments
     */
    public ConfigNodePropertyBoolean getSupportAttachments() {
        return supportAttachments;
    }

    public void setSupportAttachments(ConfigNodePropertyBoolean supportAttachments) {
        this.supportAttachments = supportAttachments;
    }

    /**
     * Get supportGroupMessaging
     * @return supportGroupMessaging
     */
    public ConfigNodePropertyBoolean getSupportGroupMessaging() {
        return supportGroupMessaging;
    }

    public void setSupportGroupMessaging(ConfigNodePropertyBoolean supportGroupMessaging) {
        this.supportGroupMessaging = supportGroupMessaging;
    }

    /**
     * Get maxTotalRecipients
     * @return maxTotalRecipients
     */
    public ConfigNodePropertyInteger getMaxTotalRecipients() {
        return maxTotalRecipients;
    }

    public void setMaxTotalRecipients(ConfigNodePropertyInteger maxTotalRecipients) {
        this.maxTotalRecipients = maxTotalRecipients;
    }

    /**
     * Get batchSize
     * @return batchSize
     */
    public ConfigNodePropertyInteger getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(ConfigNodePropertyInteger batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * Get maxTotalAttachmentSize
     * @return maxTotalAttachmentSize
     */
    public ConfigNodePropertyInteger getMaxTotalAttachmentSize() {
        return maxTotalAttachmentSize;
    }

    public void setMaxTotalAttachmentSize(ConfigNodePropertyInteger maxTotalAttachmentSize) {
        this.maxTotalAttachmentSize = maxTotalAttachmentSize;
    }

    /**
     * Get attachmentTypeBlacklist
     * @return attachmentTypeBlacklist
     */
    public ConfigNodePropertyArray getAttachmentTypeBlacklist() {
        return attachmentTypeBlacklist;
    }

    public void setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
        this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    }

    /**
     * Get allowedAttachmentTypes
     * @return allowedAttachmentTypes
     */
    public ConfigNodePropertyArray getAllowedAttachmentTypes() {
        return allowedAttachmentTypes;
    }

    public void setAllowedAttachmentTypes(ConfigNodePropertyArray allowedAttachmentTypes) {
        this.allowedAttachmentTypes = allowedAttachmentTypes;
    }

    /**
     * Get serviceSelector
     * @return serviceSelector
     */
    public ConfigNodePropertyString getServiceSelector() {
        return serviceSelector;
    }

    public void setServiceSelector(ConfigNodePropertyString serviceSelector) {
        this.serviceSelector = serviceSelector;
    }

    /**
     * Get fieldWhitelist
     * @return fieldWhitelist
     */
    public ConfigNodePropertyArray getFieldWhitelist() {
        return fieldWhitelist;
    }

    public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
        this.fieldWhitelist = fieldWhitelist;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties {\n");
        
        sb.append("    messageProperties: ").append(toIndentedString(messageProperties)).append("\n");
        sb.append("    messageBoxSizeLimit: ").append(toIndentedString(messageBoxSizeLimit)).append("\n");
        sb.append("    messageCountLimit: ").append(toIndentedString(messageCountLimit)).append("\n");
        sb.append("    notifyFailure: ").append(toIndentedString(notifyFailure)).append("\n");
        sb.append("    failureMessageFrom: ").append(toIndentedString(failureMessageFrom)).append("\n");
        sb.append("    failureTemplatePath: ").append(toIndentedString(failureTemplatePath)).append("\n");
        sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
        sb.append("    minWaitBetweenRetries: ").append(toIndentedString(minWaitBetweenRetries)).append("\n");
        sb.append("    countUpdatePoolSize: ").append(toIndentedString(countUpdatePoolSize)).append("\n");
        sb.append("    inboxPath: ").append(toIndentedString(inboxPath)).append("\n");
        sb.append("    sentitemsPath: ").append(toIndentedString(sentitemsPath)).append("\n");
        sb.append("    supportAttachments: ").append(toIndentedString(supportAttachments)).append("\n");
        sb.append("    supportGroupMessaging: ").append(toIndentedString(supportGroupMessaging)).append("\n");
        sb.append("    maxTotalRecipients: ").append(toIndentedString(maxTotalRecipients)).append("\n");
        sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
        sb.append("    maxTotalAttachmentSize: ").append(toIndentedString(maxTotalAttachmentSize)).append("\n");
        sb.append("    attachmentTypeBlacklist: ").append(toIndentedString(attachmentTypeBlacklist)).append("\n");
        sb.append("    allowedAttachmentTypes: ").append(toIndentedString(allowedAttachmentTypes)).append("\n");
        sb.append("    serviceSelector: ").append(toIndentedString(serviceSelector)).append("\n");
        sb.append("    fieldWhitelist: ").append(toIndentedString(fieldWhitelist)).append("\n");
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

