package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties   {
  
  private @Valid ConfigNodePropertyArray messageProperties = null;
  private @Valid ConfigNodePropertyInteger messageBoxSizeLimit = null;
  private @Valid ConfigNodePropertyInteger messageCountLimit = null;
  private @Valid ConfigNodePropertyBoolean notifyFailure = null;
  private @Valid ConfigNodePropertyString failureMessageFrom = null;
  private @Valid ConfigNodePropertyString failureTemplatePath = null;
  private @Valid ConfigNodePropertyInteger maxRetries = null;
  private @Valid ConfigNodePropertyInteger minWaitBetweenRetries = null;
  private @Valid ConfigNodePropertyInteger countUpdatePoolSize = null;
  private @Valid ConfigNodePropertyString inboxPath = null;
  private @Valid ConfigNodePropertyString sentitemsPath = null;
  private @Valid ConfigNodePropertyBoolean supportAttachments = null;
  private @Valid ConfigNodePropertyBoolean supportGroupMessaging = null;
  private @Valid ConfigNodePropertyInteger maxTotalRecipients = null;
  private @Valid ConfigNodePropertyInteger batchSize = null;
  private @Valid ConfigNodePropertyInteger maxTotalAttachmentSize = null;
  private @Valid ConfigNodePropertyArray attachmentTypeBlacklist = null;
  private @Valid ConfigNodePropertyArray allowedAttachmentTypes = null;
  private @Valid ConfigNodePropertyString serviceSelector = null;
  private @Valid ConfigNodePropertyArray fieldWhitelist = null;

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageProperties(ConfigNodePropertyArray messageProperties) {
    this.messageProperties = messageProperties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("message.properties")
  public ConfigNodePropertyArray getMessageProperties() {
    return messageProperties;
  }
  public void setMessageProperties(ConfigNodePropertyArray messageProperties) {
    this.messageProperties = messageProperties;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageBoxSizeLimit(ConfigNodePropertyInteger messageBoxSizeLimit) {
    this.messageBoxSizeLimit = messageBoxSizeLimit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("messageBoxSizeLimit")
  public ConfigNodePropertyInteger getMessageBoxSizeLimit() {
    return messageBoxSizeLimit;
  }
  public void setMessageBoxSizeLimit(ConfigNodePropertyInteger messageBoxSizeLimit) {
    this.messageBoxSizeLimit = messageBoxSizeLimit;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageCountLimit(ConfigNodePropertyInteger messageCountLimit) {
    this.messageCountLimit = messageCountLimit;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("messageCountLimit")
  public ConfigNodePropertyInteger getMessageCountLimit() {
    return messageCountLimit;
  }
  public void setMessageCountLimit(ConfigNodePropertyInteger messageCountLimit) {
    this.messageCountLimit = messageCountLimit;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties notifyFailure(ConfigNodePropertyBoolean notifyFailure) {
    this.notifyFailure = notifyFailure;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("notifyFailure")
  public ConfigNodePropertyBoolean getNotifyFailure() {
    return notifyFailure;
  }
  public void setNotifyFailure(ConfigNodePropertyBoolean notifyFailure) {
    this.notifyFailure = notifyFailure;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties failureMessageFrom(ConfigNodePropertyString failureMessageFrom) {
    this.failureMessageFrom = failureMessageFrom;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("failureMessageFrom")
  public ConfigNodePropertyString getFailureMessageFrom() {
    return failureMessageFrom;
  }
  public void setFailureMessageFrom(ConfigNodePropertyString failureMessageFrom) {
    this.failureMessageFrom = failureMessageFrom;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties failureTemplatePath(ConfigNodePropertyString failureTemplatePath) {
    this.failureTemplatePath = failureTemplatePath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("failureTemplatePath")
  public ConfigNodePropertyString getFailureTemplatePath() {
    return failureTemplatePath;
  }
  public void setFailureTemplatePath(ConfigNodePropertyString failureTemplatePath) {
    this.failureTemplatePath = failureTemplatePath;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxRetries(ConfigNodePropertyInteger maxRetries) {
    this.maxRetries = maxRetries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxRetries")
  public ConfigNodePropertyInteger getMaxRetries() {
    return maxRetries;
  }
  public void setMaxRetries(ConfigNodePropertyInteger maxRetries) {
    this.maxRetries = maxRetries;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties minWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("minWaitBetweenRetries")
  public ConfigNodePropertyInteger getMinWaitBetweenRetries() {
    return minWaitBetweenRetries;
  }
  public void setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties countUpdatePoolSize(ConfigNodePropertyInteger countUpdatePoolSize) {
    this.countUpdatePoolSize = countUpdatePoolSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("countUpdatePoolSize")
  public ConfigNodePropertyInteger getCountUpdatePoolSize() {
    return countUpdatePoolSize;
  }
  public void setCountUpdatePoolSize(ConfigNodePropertyInteger countUpdatePoolSize) {
    this.countUpdatePoolSize = countUpdatePoolSize;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties inboxPath(ConfigNodePropertyString inboxPath) {
    this.inboxPath = inboxPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("inbox.path")
  public ConfigNodePropertyString getInboxPath() {
    return inboxPath;
  }
  public void setInboxPath(ConfigNodePropertyString inboxPath) {
    this.inboxPath = inboxPath;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties sentitemsPath(ConfigNodePropertyString sentitemsPath) {
    this.sentitemsPath = sentitemsPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sentitems.path")
  public ConfigNodePropertyString getSentitemsPath() {
    return sentitemsPath;
  }
  public void setSentitemsPath(ConfigNodePropertyString sentitemsPath) {
    this.sentitemsPath = sentitemsPath;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties supportAttachments(ConfigNodePropertyBoolean supportAttachments) {
    this.supportAttachments = supportAttachments;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("supportAttachments")
  public ConfigNodePropertyBoolean getSupportAttachments() {
    return supportAttachments;
  }
  public void setSupportAttachments(ConfigNodePropertyBoolean supportAttachments) {
    this.supportAttachments = supportAttachments;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties supportGroupMessaging(ConfigNodePropertyBoolean supportGroupMessaging) {
    this.supportGroupMessaging = supportGroupMessaging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("supportGroupMessaging")
  public ConfigNodePropertyBoolean getSupportGroupMessaging() {
    return supportGroupMessaging;
  }
  public void setSupportGroupMessaging(ConfigNodePropertyBoolean supportGroupMessaging) {
    this.supportGroupMessaging = supportGroupMessaging;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxTotalRecipients(ConfigNodePropertyInteger maxTotalRecipients) {
    this.maxTotalRecipients = maxTotalRecipients;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxTotalRecipients")
  public ConfigNodePropertyInteger getMaxTotalRecipients() {
    return maxTotalRecipients;
  }
  public void setMaxTotalRecipients(ConfigNodePropertyInteger maxTotalRecipients) {
    this.maxTotalRecipients = maxTotalRecipients;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties batchSize(ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("batchSize")
  public ConfigNodePropertyInteger getBatchSize() {
    return batchSize;
  }
  public void setBatchSize(ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxTotalAttachmentSize(ConfigNodePropertyInteger maxTotalAttachmentSize) {
    this.maxTotalAttachmentSize = maxTotalAttachmentSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxTotalAttachmentSize")
  public ConfigNodePropertyInteger getMaxTotalAttachmentSize() {
    return maxTotalAttachmentSize;
  }
  public void setMaxTotalAttachmentSize(ConfigNodePropertyInteger maxTotalAttachmentSize) {
    this.maxTotalAttachmentSize = maxTotalAttachmentSize;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties attachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("attachmentTypeBlacklist")
  public ConfigNodePropertyArray getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }
  public void setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties allowedAttachmentTypes(ConfigNodePropertyArray allowedAttachmentTypes) {
    this.allowedAttachmentTypes = allowedAttachmentTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("allowedAttachmentTypes")
  public ConfigNodePropertyArray getAllowedAttachmentTypes() {
    return allowedAttachmentTypes;
  }
  public void setAllowedAttachmentTypes(ConfigNodePropertyArray allowedAttachmentTypes) {
    this.allowedAttachmentTypes = allowedAttachmentTypes;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties serviceSelector(ConfigNodePropertyString serviceSelector) {
    this.serviceSelector = serviceSelector;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceSelector")
  public ConfigNodePropertyString getServiceSelector() {
    return serviceSelector;
  }
  public void setServiceSelector(ConfigNodePropertyString serviceSelector) {
    this.serviceSelector = serviceSelector;
  }

  /**
   **/
  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }
  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties = (ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties) o;
    return Objects.equals(messageProperties, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.messageProperties) &&
        Objects.equals(messageBoxSizeLimit, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.messageBoxSizeLimit) &&
        Objects.equals(messageCountLimit, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.messageCountLimit) &&
        Objects.equals(notifyFailure, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.notifyFailure) &&
        Objects.equals(failureMessageFrom, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.failureMessageFrom) &&
        Objects.equals(failureTemplatePath, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.failureTemplatePath) &&
        Objects.equals(maxRetries, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.maxRetries) &&
        Objects.equals(minWaitBetweenRetries, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.minWaitBetweenRetries) &&
        Objects.equals(countUpdatePoolSize, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.countUpdatePoolSize) &&
        Objects.equals(inboxPath, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.inboxPath) &&
        Objects.equals(sentitemsPath, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.sentitemsPath) &&
        Objects.equals(supportAttachments, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.supportAttachments) &&
        Objects.equals(supportGroupMessaging, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.supportGroupMessaging) &&
        Objects.equals(maxTotalRecipients, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.maxTotalRecipients) &&
        Objects.equals(batchSize, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.batchSize) &&
        Objects.equals(maxTotalAttachmentSize, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.maxTotalAttachmentSize) &&
        Objects.equals(attachmentTypeBlacklist, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.attachmentTypeBlacklist) &&
        Objects.equals(allowedAttachmentTypes, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.allowedAttachmentTypes) &&
        Objects.equals(serviceSelector, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.serviceSelector) &&
        Objects.equals(fieldWhitelist, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.fieldWhitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageProperties, messageBoxSizeLimit, messageCountLimit, notifyFailure, failureMessageFrom, failureTemplatePath, maxRetries, minWaitBetweenRetries, countUpdatePoolSize, inboxPath, sentitemsPath, supportAttachments, supportGroupMessaging, maxTotalRecipients, batchSize, maxTotalAttachmentSize, attachmentTypeBlacklist, allowedAttachmentTypes, serviceSelector, fieldWhitelist);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

