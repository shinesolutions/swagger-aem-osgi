package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties   {
  @JsonProperty("message.properties")
  private ConfigNodePropertyArray messageProperties = null;

  @JsonProperty("messageBoxSizeLimit")
  private ConfigNodePropertyInteger messageBoxSizeLimit = null;

  @JsonProperty("messageCountLimit")
  private ConfigNodePropertyInteger messageCountLimit = null;

  @JsonProperty("notifyFailure")
  private ConfigNodePropertyBoolean notifyFailure = null;

  @JsonProperty("failureMessageFrom")
  private ConfigNodePropertyString failureMessageFrom = null;

  @JsonProperty("failureTemplatePath")
  private ConfigNodePropertyString failureTemplatePath = null;

  @JsonProperty("maxRetries")
  private ConfigNodePropertyInteger maxRetries = null;

  @JsonProperty("minWaitBetweenRetries")
  private ConfigNodePropertyInteger minWaitBetweenRetries = null;

  @JsonProperty("countUpdatePoolSize")
  private ConfigNodePropertyInteger countUpdatePoolSize = null;

  @JsonProperty("inbox.path")
  private ConfigNodePropertyString inboxPath = null;

  @JsonProperty("sentitems.path")
  private ConfigNodePropertyString sentitemsPath = null;

  @JsonProperty("supportAttachments")
  private ConfigNodePropertyBoolean supportAttachments = null;

  @JsonProperty("supportGroupMessaging")
  private ConfigNodePropertyBoolean supportGroupMessaging = null;

  @JsonProperty("maxTotalRecipients")
  private ConfigNodePropertyInteger maxTotalRecipients = null;

  @JsonProperty("batchSize")
  private ConfigNodePropertyInteger batchSize = null;

  @JsonProperty("maxTotalAttachmentSize")
  private ConfigNodePropertyInteger maxTotalAttachmentSize = null;

  @JsonProperty("attachmentTypeBlacklist")
  private ConfigNodePropertyArray attachmentTypeBlacklist = null;

  @JsonProperty("allowedAttachmentTypes")
  private ConfigNodePropertyArray allowedAttachmentTypes = null;

  @JsonProperty("serviceSelector")
  private ConfigNodePropertyString serviceSelector = null;

  @JsonProperty("fieldWhitelist")
  private ConfigNodePropertyArray fieldWhitelist = null;

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageProperties(ConfigNodePropertyArray messageProperties) {
    this.messageProperties = messageProperties;
    return this;
  }

   /**
   * Get messageProperties
   * @return messageProperties
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getMessageProperties() {
    return messageProperties;
  }

  public void setMessageProperties(ConfigNodePropertyArray messageProperties) {
    this.messageProperties = messageProperties;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageBoxSizeLimit(ConfigNodePropertyInteger messageBoxSizeLimit) {
    this.messageBoxSizeLimit = messageBoxSizeLimit;
    return this;
  }

   /**
   * Get messageBoxSizeLimit
   * @return messageBoxSizeLimit
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMessageBoxSizeLimit() {
    return messageBoxSizeLimit;
  }

  public void setMessageBoxSizeLimit(ConfigNodePropertyInteger messageBoxSizeLimit) {
    this.messageBoxSizeLimit = messageBoxSizeLimit;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageCountLimit(ConfigNodePropertyInteger messageCountLimit) {
    this.messageCountLimit = messageCountLimit;
    return this;
  }

   /**
   * Get messageCountLimit
   * @return messageCountLimit
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMessageCountLimit() {
    return messageCountLimit;
  }

  public void setMessageCountLimit(ConfigNodePropertyInteger messageCountLimit) {
    this.messageCountLimit = messageCountLimit;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties notifyFailure(ConfigNodePropertyBoolean notifyFailure) {
    this.notifyFailure = notifyFailure;
    return this;
  }

   /**
   * Get notifyFailure
   * @return notifyFailure
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getNotifyFailure() {
    return notifyFailure;
  }

  public void setNotifyFailure(ConfigNodePropertyBoolean notifyFailure) {
    this.notifyFailure = notifyFailure;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties failureMessageFrom(ConfigNodePropertyString failureMessageFrom) {
    this.failureMessageFrom = failureMessageFrom;
    return this;
  }

   /**
   * Get failureMessageFrom
   * @return failureMessageFrom
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFailureMessageFrom() {
    return failureMessageFrom;
  }

  public void setFailureMessageFrom(ConfigNodePropertyString failureMessageFrom) {
    this.failureMessageFrom = failureMessageFrom;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties failureTemplatePath(ConfigNodePropertyString failureTemplatePath) {
    this.failureTemplatePath = failureTemplatePath;
    return this;
  }

   /**
   * Get failureTemplatePath
   * @return failureTemplatePath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFailureTemplatePath() {
    return failureTemplatePath;
  }

  public void setFailureTemplatePath(ConfigNodePropertyString failureTemplatePath) {
    this.failureTemplatePath = failureTemplatePath;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxRetries(ConfigNodePropertyInteger maxRetries) {
    this.maxRetries = maxRetries;
    return this;
  }

   /**
   * Get maxRetries
   * @return maxRetries
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxRetries() {
    return maxRetries;
  }

  public void setMaxRetries(ConfigNodePropertyInteger maxRetries) {
    this.maxRetries = maxRetries;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties minWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
    return this;
  }

   /**
   * Get minWaitBetweenRetries
   * @return minWaitBetweenRetries
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMinWaitBetweenRetries() {
    return minWaitBetweenRetries;
  }

  public void setMinWaitBetweenRetries(ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties countUpdatePoolSize(ConfigNodePropertyInteger countUpdatePoolSize) {
    this.countUpdatePoolSize = countUpdatePoolSize;
    return this;
  }

   /**
   * Get countUpdatePoolSize
   * @return countUpdatePoolSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCountUpdatePoolSize() {
    return countUpdatePoolSize;
  }

  public void setCountUpdatePoolSize(ConfigNodePropertyInteger countUpdatePoolSize) {
    this.countUpdatePoolSize = countUpdatePoolSize;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties inboxPath(ConfigNodePropertyString inboxPath) {
    this.inboxPath = inboxPath;
    return this;
  }

   /**
   * Get inboxPath
   * @return inboxPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getInboxPath() {
    return inboxPath;
  }

  public void setInboxPath(ConfigNodePropertyString inboxPath) {
    this.inboxPath = inboxPath;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties sentitemsPath(ConfigNodePropertyString sentitemsPath) {
    this.sentitemsPath = sentitemsPath;
    return this;
  }

   /**
   * Get sentitemsPath
   * @return sentitemsPath
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSentitemsPath() {
    return sentitemsPath;
  }

  public void setSentitemsPath(ConfigNodePropertyString sentitemsPath) {
    this.sentitemsPath = sentitemsPath;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties supportAttachments(ConfigNodePropertyBoolean supportAttachments) {
    this.supportAttachments = supportAttachments;
    return this;
  }

   /**
   * Get supportAttachments
   * @return supportAttachments
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSupportAttachments() {
    return supportAttachments;
  }

  public void setSupportAttachments(ConfigNodePropertyBoolean supportAttachments) {
    this.supportAttachments = supportAttachments;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties supportGroupMessaging(ConfigNodePropertyBoolean supportGroupMessaging) {
    this.supportGroupMessaging = supportGroupMessaging;
    return this;
  }

   /**
   * Get supportGroupMessaging
   * @return supportGroupMessaging
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getSupportGroupMessaging() {
    return supportGroupMessaging;
  }

  public void setSupportGroupMessaging(ConfigNodePropertyBoolean supportGroupMessaging) {
    this.supportGroupMessaging = supportGroupMessaging;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxTotalRecipients(ConfigNodePropertyInteger maxTotalRecipients) {
    this.maxTotalRecipients = maxTotalRecipients;
    return this;
  }

   /**
   * Get maxTotalRecipients
   * @return maxTotalRecipients
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxTotalRecipients() {
    return maxTotalRecipients;
  }

  public void setMaxTotalRecipients(ConfigNodePropertyInteger maxTotalRecipients) {
    this.maxTotalRecipients = maxTotalRecipients;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties batchSize(ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Get batchSize
   * @return batchSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getBatchSize() {
    return batchSize;
  }

  public void setBatchSize(ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxTotalAttachmentSize(ConfigNodePropertyInteger maxTotalAttachmentSize) {
    this.maxTotalAttachmentSize = maxTotalAttachmentSize;
    return this;
  }

   /**
   * Get maxTotalAttachmentSize
   * @return maxTotalAttachmentSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getMaxTotalAttachmentSize() {
    return maxTotalAttachmentSize;
  }

  public void setMaxTotalAttachmentSize(ConfigNodePropertyInteger maxTotalAttachmentSize) {
    this.maxTotalAttachmentSize = maxTotalAttachmentSize;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties attachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
    return this;
  }

   /**
   * Get attachmentTypeBlacklist
   * @return attachmentTypeBlacklist
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }

  public void setAttachmentTypeBlacklist(ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties allowedAttachmentTypes(ConfigNodePropertyArray allowedAttachmentTypes) {
    this.allowedAttachmentTypes = allowedAttachmentTypes;
    return this;
  }

   /**
   * Get allowedAttachmentTypes
   * @return allowedAttachmentTypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getAllowedAttachmentTypes() {
    return allowedAttachmentTypes;
  }

  public void setAllowedAttachmentTypes(ConfigNodePropertyArray allowedAttachmentTypes) {
    this.allowedAttachmentTypes = allowedAttachmentTypes;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties serviceSelector(ConfigNodePropertyString serviceSelector) {
    this.serviceSelector = serviceSelector;
    return this;
  }

   /**
   * Get serviceSelector
   * @return serviceSelector
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getServiceSelector() {
    return serviceSelector;
  }

  public void setServiceSelector(ConfigNodePropertyString serviceSelector) {
    this.serviceSelector = serviceSelector;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties fieldWhitelist(ConfigNodePropertyArray fieldWhitelist) {
    this.fieldWhitelist = fieldWhitelist;
    return this;
  }

   /**
   * Get fieldWhitelist
   * @return fieldWhitelist
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.messageProperties, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.messageProperties) &&
        Objects.equals(this.messageBoxSizeLimit, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.messageBoxSizeLimit) &&
        Objects.equals(this.messageCountLimit, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.messageCountLimit) &&
        Objects.equals(this.notifyFailure, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.notifyFailure) &&
        Objects.equals(this.failureMessageFrom, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.failureMessageFrom) &&
        Objects.equals(this.failureTemplatePath, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.failureTemplatePath) &&
        Objects.equals(this.maxRetries, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.maxRetries) &&
        Objects.equals(this.minWaitBetweenRetries, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.minWaitBetweenRetries) &&
        Objects.equals(this.countUpdatePoolSize, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.countUpdatePoolSize) &&
        Objects.equals(this.inboxPath, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.inboxPath) &&
        Objects.equals(this.sentitemsPath, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.sentitemsPath) &&
        Objects.equals(this.supportAttachments, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.supportAttachments) &&
        Objects.equals(this.supportGroupMessaging, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.supportGroupMessaging) &&
        Objects.equals(this.maxTotalRecipients, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.maxTotalRecipients) &&
        Objects.equals(this.batchSize, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.batchSize) &&
        Objects.equals(this.maxTotalAttachmentSize, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.maxTotalAttachmentSize) &&
        Objects.equals(this.attachmentTypeBlacklist, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.attachmentTypeBlacklist) &&
        Objects.equals(this.allowedAttachmentTypes, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.allowedAttachmentTypes) &&
        Objects.equals(this.serviceSelector, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.serviceSelector) &&
        Objects.equals(this.fieldWhitelist, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.fieldWhitelist);
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

