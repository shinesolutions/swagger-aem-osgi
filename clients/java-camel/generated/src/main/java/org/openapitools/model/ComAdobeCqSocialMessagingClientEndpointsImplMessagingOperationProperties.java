package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
 */

@JsonTypeName("comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties {

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

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageProperties(ConfigNodePropertyArray messageProperties) {
    this.messageProperties = messageProperties;
    return this;
  }

  /**
   * Get messageProperties
   * @return messageProperties
   */
  @Valid 
  @Schema(name = "message.properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message.properties")
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
   */
  @Valid 
  @Schema(name = "messageBoxSizeLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageBoxSizeLimit")
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
   */
  @Valid 
  @Schema(name = "messageCountLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageCountLimit")
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
   */
  @Valid 
  @Schema(name = "notifyFailure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifyFailure")
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
   */
  @Valid 
  @Schema(name = "failureMessageFrom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failureMessageFrom")
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
   */
  @Valid 
  @Schema(name = "failureTemplatePath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failureTemplatePath")
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
   */
  @Valid 
  @Schema(name = "maxRetries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxRetries")
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
   */
  @Valid 
  @Schema(name = "minWaitBetweenRetries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minWaitBetweenRetries")
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
   */
  @Valid 
  @Schema(name = "countUpdatePoolSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("countUpdatePoolSize")
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
   */
  @Valid 
  @Schema(name = "inbox.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inbox.path")
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
   */
  @Valid 
  @Schema(name = "sentitems.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sentitems.path")
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
   */
  @Valid 
  @Schema(name = "supportAttachments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportAttachments")
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
   */
  @Valid 
  @Schema(name = "supportGroupMessaging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportGroupMessaging")
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
   */
  @Valid 
  @Schema(name = "maxTotalRecipients", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxTotalRecipients")
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
   */
  @Valid 
  @Schema(name = "batchSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("batchSize")
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
   */
  @Valid 
  @Schema(name = "maxTotalAttachmentSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxTotalAttachmentSize")
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
   */
  @Valid 
  @Schema(name = "attachmentTypeBlacklist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attachmentTypeBlacklist")
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
   */
  @Valid 
  @Schema(name = "allowedAttachmentTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedAttachmentTypes")
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
   */
  @Valid 
  @Schema(name = "serviceSelector", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceSelector")
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
   */
  @Valid 
  @Schema(name = "fieldWhitelist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

