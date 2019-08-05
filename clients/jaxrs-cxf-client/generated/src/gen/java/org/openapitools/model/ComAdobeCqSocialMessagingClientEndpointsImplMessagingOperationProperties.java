package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray messageProperties = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger messageBoxSizeLimit = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger messageCountLimit = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean notifyFailure = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString failureMessageFrom = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString failureTemplatePath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxRetries = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger minWaitBetweenRetries = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger countUpdatePoolSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString inboxPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString sentitemsPath = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean supportAttachments = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean supportGroupMessaging = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxTotalRecipients = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger batchSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger maxTotalAttachmentSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray attachmentTypeBlacklist = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray allowedAttachmentTypes = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString serviceSelector = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray fieldWhitelist = null;
 /**
   * Get messageProperties
   * @return messageProperties
  **/
  @JsonProperty("message.properties")
  public ConfigNodePropertyArray getMessageProperties() {
    return messageProperties;
  }

  public void setMessageProperties(ConfigNodePropertyArray messageProperties) {
    this.messageProperties = messageProperties;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageProperties(ConfigNodePropertyArray messageProperties) {
    this.messageProperties = messageProperties;
    return this;
  }

 /**
   * Get messageBoxSizeLimit
   * @return messageBoxSizeLimit
  **/
  @JsonProperty("messageBoxSizeLimit")
  public ConfigNodePropertyInteger getMessageBoxSizeLimit() {
    return messageBoxSizeLimit;
  }

  public void setMessageBoxSizeLimit(ConfigNodePropertyInteger messageBoxSizeLimit) {
    this.messageBoxSizeLimit = messageBoxSizeLimit;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageBoxSizeLimit(ConfigNodePropertyInteger messageBoxSizeLimit) {
    this.messageBoxSizeLimit = messageBoxSizeLimit;
    return this;
  }

 /**
   * Get messageCountLimit
   * @return messageCountLimit
  **/
  @JsonProperty("messageCountLimit")
  public ConfigNodePropertyInteger getMessageCountLimit() {
    return messageCountLimit;
  }

  public void setMessageCountLimit(ConfigNodePropertyInteger messageCountLimit) {
    this.messageCountLimit = messageCountLimit;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageCountLimit(ConfigNodePropertyInteger messageCountLimit) {
    this.messageCountLimit = messageCountLimit;
    return this;
  }

 /**
   * Get notifyFailure
   * @return notifyFailure
  **/
  @JsonProperty("notifyFailure")
  public ConfigNodePropertyBoolean getNotifyFailure() {
    return notifyFailure;
  }

  public void setNotifyFailure(ConfigNodePropertyBoolean notifyFailure) {
    this.notifyFailure = notifyFailure;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties notifyFailure(ConfigNodePropertyBoolean notifyFailure) {
    this.notifyFailure = notifyFailure;
    return this;
  }

 /**
   * Get failureMessageFrom
   * @return failureMessageFrom
  **/
  @JsonProperty("failureMessageFrom")
  public ConfigNodePropertyString getFailureMessageFrom() {
    return failureMessageFrom;
  }

  public void setFailureMessageFrom(ConfigNodePropertyString failureMessageFrom) {
    this.failureMessageFrom = failureMessageFrom;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties failureMessageFrom(ConfigNodePropertyString failureMessageFrom) {
    this.failureMessageFrom = failureMessageFrom;
    return this;
  }

 /**
   * Get failureTemplatePath
   * @return failureTemplatePath
  **/
  @JsonProperty("failureTemplatePath")
  public ConfigNodePropertyString getFailureTemplatePath() {
    return failureTemplatePath;
  }

  public void setFailureTemplatePath(ConfigNodePropertyString failureTemplatePath) {
    this.failureTemplatePath = failureTemplatePath;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties failureTemplatePath(ConfigNodePropertyString failureTemplatePath) {
    this.failureTemplatePath = failureTemplatePath;
    return this;
  }

 /**
   * Get maxRetries
   * @return maxRetries
  **/
  @JsonProperty("maxRetries")
  public ConfigNodePropertyInteger getMaxRetries() {
    return maxRetries;
  }

  public void setMaxRetries(ConfigNodePropertyInteger maxRetries) {
    this.maxRetries = maxRetries;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxRetries(ConfigNodePropertyInteger maxRetries) {
    this.maxRetries = maxRetries;
    return this;
  }

 /**
   * Get minWaitBetweenRetries
   * @return minWaitBetweenRetries
  **/
  @JsonProperty("minWaitBetweenRetries")
  public ConfigNodePropertyInteger getMinWaitBetweenRetries() {
    return minWaitBetweenRetries;
  }

  public void setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties minWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
    return this;
  }

 /**
   * Get countUpdatePoolSize
   * @return countUpdatePoolSize
  **/
  @JsonProperty("countUpdatePoolSize")
  public ConfigNodePropertyInteger getCountUpdatePoolSize() {
    return countUpdatePoolSize;
  }

  public void setCountUpdatePoolSize(ConfigNodePropertyInteger countUpdatePoolSize) {
    this.countUpdatePoolSize = countUpdatePoolSize;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties countUpdatePoolSize(ConfigNodePropertyInteger countUpdatePoolSize) {
    this.countUpdatePoolSize = countUpdatePoolSize;
    return this;
  }

 /**
   * Get inboxPath
   * @return inboxPath
  **/
  @JsonProperty("inbox.path")
  public ConfigNodePropertyString getInboxPath() {
    return inboxPath;
  }

  public void setInboxPath(ConfigNodePropertyString inboxPath) {
    this.inboxPath = inboxPath;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties inboxPath(ConfigNodePropertyString inboxPath) {
    this.inboxPath = inboxPath;
    return this;
  }

 /**
   * Get sentitemsPath
   * @return sentitemsPath
  **/
  @JsonProperty("sentitems.path")
  public ConfigNodePropertyString getSentitemsPath() {
    return sentitemsPath;
  }

  public void setSentitemsPath(ConfigNodePropertyString sentitemsPath) {
    this.sentitemsPath = sentitemsPath;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties sentitemsPath(ConfigNodePropertyString sentitemsPath) {
    this.sentitemsPath = sentitemsPath;
    return this;
  }

 /**
   * Get supportAttachments
   * @return supportAttachments
  **/
  @JsonProperty("supportAttachments")
  public ConfigNodePropertyBoolean getSupportAttachments() {
    return supportAttachments;
  }

  public void setSupportAttachments(ConfigNodePropertyBoolean supportAttachments) {
    this.supportAttachments = supportAttachments;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties supportAttachments(ConfigNodePropertyBoolean supportAttachments) {
    this.supportAttachments = supportAttachments;
    return this;
  }

 /**
   * Get supportGroupMessaging
   * @return supportGroupMessaging
  **/
  @JsonProperty("supportGroupMessaging")
  public ConfigNodePropertyBoolean getSupportGroupMessaging() {
    return supportGroupMessaging;
  }

  public void setSupportGroupMessaging(ConfigNodePropertyBoolean supportGroupMessaging) {
    this.supportGroupMessaging = supportGroupMessaging;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties supportGroupMessaging(ConfigNodePropertyBoolean supportGroupMessaging) {
    this.supportGroupMessaging = supportGroupMessaging;
    return this;
  }

 /**
   * Get maxTotalRecipients
   * @return maxTotalRecipients
  **/
  @JsonProperty("maxTotalRecipients")
  public ConfigNodePropertyInteger getMaxTotalRecipients() {
    return maxTotalRecipients;
  }

  public void setMaxTotalRecipients(ConfigNodePropertyInteger maxTotalRecipients) {
    this.maxTotalRecipients = maxTotalRecipients;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxTotalRecipients(ConfigNodePropertyInteger maxTotalRecipients) {
    this.maxTotalRecipients = maxTotalRecipients;
    return this;
  }

 /**
   * Get batchSize
   * @return batchSize
  **/
  @JsonProperty("batchSize")
  public ConfigNodePropertyInteger getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties batchSize(ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
    return this;
  }

 /**
   * Get maxTotalAttachmentSize
   * @return maxTotalAttachmentSize
  **/
  @JsonProperty("maxTotalAttachmentSize")
  public ConfigNodePropertyInteger getMaxTotalAttachmentSize() {
    return maxTotalAttachmentSize;
  }

  public void setMaxTotalAttachmentSize(ConfigNodePropertyInteger maxTotalAttachmentSize) {
    this.maxTotalAttachmentSize = maxTotalAttachmentSize;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxTotalAttachmentSize(ConfigNodePropertyInteger maxTotalAttachmentSize) {
    this.maxTotalAttachmentSize = maxTotalAttachmentSize;
    return this;
  }

 /**
   * Get attachmentTypeBlacklist
   * @return attachmentTypeBlacklist
  **/
  @JsonProperty("attachmentTypeBlacklist")
  public ConfigNodePropertyArray getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }

  public void setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties attachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    return this;
  }

 /**
   * Get allowedAttachmentTypes
   * @return allowedAttachmentTypes
  **/
  @JsonProperty("allowedAttachmentTypes")
  public ConfigNodePropertyArray getAllowedAttachmentTypes() {
    return allowedAttachmentTypes;
  }

  public void setAllowedAttachmentTypes(ConfigNodePropertyArray allowedAttachmentTypes) {
    this.allowedAttachmentTypes = allowedAttachmentTypes;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties allowedAttachmentTypes(ConfigNodePropertyArray allowedAttachmentTypes) {
    this.allowedAttachmentTypes = allowedAttachmentTypes;
    return this;
  }

 /**
   * Get serviceSelector
   * @return serviceSelector
  **/
  @JsonProperty("serviceSelector")
  public ConfigNodePropertyString getServiceSelector() {
    return serviceSelector;
  }

  public void setServiceSelector(ConfigNodePropertyString serviceSelector) {
    this.serviceSelector = serviceSelector;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties serviceSelector(ConfigNodePropertyString serviceSelector) {
    this.serviceSelector = serviceSelector;
    return this;
  }

 /**
   * Get fieldWhitelist
   * @return fieldWhitelist
  **/
  @JsonProperty("fieldWhitelist")
  public ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }

  public void setFieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

