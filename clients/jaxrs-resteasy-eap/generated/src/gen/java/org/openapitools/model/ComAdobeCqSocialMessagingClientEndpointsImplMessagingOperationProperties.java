package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties   {
  

  private ConfigNodePropertyArray messageProperties = null;

  private ConfigNodePropertyInteger messageBoxSizeLimit = null;

  private ConfigNodePropertyInteger messageCountLimit = null;

  private ConfigNodePropertyBoolean notifyFailure = null;

  private ConfigNodePropertyString failureMessageFrom = null;

  private ConfigNodePropertyString failureTemplatePath = null;

  private ConfigNodePropertyInteger maxRetries = null;

  private ConfigNodePropertyInteger minWaitBetweenRetries = null;

  private ConfigNodePropertyInteger countUpdatePoolSize = null;

  private ConfigNodePropertyString inboxPath = null;

  private ConfigNodePropertyString sentitemsPath = null;

  private ConfigNodePropertyBoolean supportAttachments = null;

  private ConfigNodePropertyBoolean supportGroupMessaging = null;

  private ConfigNodePropertyInteger maxTotalRecipients = null;

  private ConfigNodePropertyInteger batchSize = null;

  private ConfigNodePropertyInteger maxTotalAttachmentSize = null;

  private ConfigNodePropertyArray attachmentTypeBlacklist = null;

  private ConfigNodePropertyArray allowedAttachmentTypes = null;

  private ConfigNodePropertyString serviceSelector = null;

  private ConfigNodePropertyArray fieldWhitelist = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }
  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

