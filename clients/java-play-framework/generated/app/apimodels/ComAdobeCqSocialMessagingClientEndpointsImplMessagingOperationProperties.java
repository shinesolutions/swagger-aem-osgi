package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

