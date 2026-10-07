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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray messageProperties;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger messageBoxSizeLimit;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger messageCountLimit;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean notifyFailure;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString failureMessageFrom;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString failureTemplatePath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxRetries;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger minWaitBetweenRetries;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger countUpdatePoolSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString inboxPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString sentitemsPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean supportAttachments;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean supportGroupMessaging;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxTotalRecipients;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger batchSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger maxTotalAttachmentSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray attachmentTypeBlacklist;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray allowedAttachmentTypes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString serviceSelector;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray fieldWhitelist;

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageProperties(@Nullable ConfigNodePropertyArray messageProperties) {
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
  public @Nullable ConfigNodePropertyArray getMessageProperties() {
    return messageProperties;
  }

  @JsonProperty("message.properties")
  public void setMessageProperties(@Nullable ConfigNodePropertyArray messageProperties) {
    this.messageProperties = messageProperties;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageBoxSizeLimit(@Nullable ConfigNodePropertyInteger messageBoxSizeLimit) {
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
  public @Nullable ConfigNodePropertyInteger getMessageBoxSizeLimit() {
    return messageBoxSizeLimit;
  }

  @JsonProperty("messageBoxSizeLimit")
  public void setMessageBoxSizeLimit(@Nullable ConfigNodePropertyInteger messageBoxSizeLimit) {
    this.messageBoxSizeLimit = messageBoxSizeLimit;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties messageCountLimit(@Nullable ConfigNodePropertyInteger messageCountLimit) {
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
  public @Nullable ConfigNodePropertyInteger getMessageCountLimit() {
    return messageCountLimit;
  }

  @JsonProperty("messageCountLimit")
  public void setMessageCountLimit(@Nullable ConfigNodePropertyInteger messageCountLimit) {
    this.messageCountLimit = messageCountLimit;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties notifyFailure(@Nullable ConfigNodePropertyBoolean notifyFailure) {
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
  public @Nullable ConfigNodePropertyBoolean getNotifyFailure() {
    return notifyFailure;
  }

  @JsonProperty("notifyFailure")
  public void setNotifyFailure(@Nullable ConfigNodePropertyBoolean notifyFailure) {
    this.notifyFailure = notifyFailure;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties failureMessageFrom(@Nullable ConfigNodePropertyString failureMessageFrom) {
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
  public @Nullable ConfigNodePropertyString getFailureMessageFrom() {
    return failureMessageFrom;
  }

  @JsonProperty("failureMessageFrom")
  public void setFailureMessageFrom(@Nullable ConfigNodePropertyString failureMessageFrom) {
    this.failureMessageFrom = failureMessageFrom;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties failureTemplatePath(@Nullable ConfigNodePropertyString failureTemplatePath) {
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
  public @Nullable ConfigNodePropertyString getFailureTemplatePath() {
    return failureTemplatePath;
  }

  @JsonProperty("failureTemplatePath")
  public void setFailureTemplatePath(@Nullable ConfigNodePropertyString failureTemplatePath) {
    this.failureTemplatePath = failureTemplatePath;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxRetries(@Nullable ConfigNodePropertyInteger maxRetries) {
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
  public @Nullable ConfigNodePropertyInteger getMaxRetries() {
    return maxRetries;
  }

  @JsonProperty("maxRetries")
  public void setMaxRetries(@Nullable ConfigNodePropertyInteger maxRetries) {
    this.maxRetries = maxRetries;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties minWaitBetweenRetries(@Nullable ConfigNodePropertyInteger minWaitBetweenRetries) {
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
  public @Nullable ConfigNodePropertyInteger getMinWaitBetweenRetries() {
    return minWaitBetweenRetries;
  }

  @JsonProperty("minWaitBetweenRetries")
  public void setMinWaitBetweenRetries(@Nullable ConfigNodePropertyInteger minWaitBetweenRetries) {
    this.minWaitBetweenRetries = minWaitBetweenRetries;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties countUpdatePoolSize(@Nullable ConfigNodePropertyInteger countUpdatePoolSize) {
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
  public @Nullable ConfigNodePropertyInteger getCountUpdatePoolSize() {
    return countUpdatePoolSize;
  }

  @JsonProperty("countUpdatePoolSize")
  public void setCountUpdatePoolSize(@Nullable ConfigNodePropertyInteger countUpdatePoolSize) {
    this.countUpdatePoolSize = countUpdatePoolSize;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties inboxPath(@Nullable ConfigNodePropertyString inboxPath) {
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
  public @Nullable ConfigNodePropertyString getInboxPath() {
    return inboxPath;
  }

  @JsonProperty("inbox.path")
  public void setInboxPath(@Nullable ConfigNodePropertyString inboxPath) {
    this.inboxPath = inboxPath;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties sentitemsPath(@Nullable ConfigNodePropertyString sentitemsPath) {
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
  public @Nullable ConfigNodePropertyString getSentitemsPath() {
    return sentitemsPath;
  }

  @JsonProperty("sentitems.path")
  public void setSentitemsPath(@Nullable ConfigNodePropertyString sentitemsPath) {
    this.sentitemsPath = sentitemsPath;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties supportAttachments(@Nullable ConfigNodePropertyBoolean supportAttachments) {
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
  public @Nullable ConfigNodePropertyBoolean getSupportAttachments() {
    return supportAttachments;
  }

  @JsonProperty("supportAttachments")
  public void setSupportAttachments(@Nullable ConfigNodePropertyBoolean supportAttachments) {
    this.supportAttachments = supportAttachments;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties supportGroupMessaging(@Nullable ConfigNodePropertyBoolean supportGroupMessaging) {
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
  public @Nullable ConfigNodePropertyBoolean getSupportGroupMessaging() {
    return supportGroupMessaging;
  }

  @JsonProperty("supportGroupMessaging")
  public void setSupportGroupMessaging(@Nullable ConfigNodePropertyBoolean supportGroupMessaging) {
    this.supportGroupMessaging = supportGroupMessaging;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxTotalRecipients(@Nullable ConfigNodePropertyInteger maxTotalRecipients) {
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
  public @Nullable ConfigNodePropertyInteger getMaxTotalRecipients() {
    return maxTotalRecipients;
  }

  @JsonProperty("maxTotalRecipients")
  public void setMaxTotalRecipients(@Nullable ConfigNodePropertyInteger maxTotalRecipients) {
    this.maxTotalRecipients = maxTotalRecipients;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties batchSize(@Nullable ConfigNodePropertyInteger batchSize) {
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
  public @Nullable ConfigNodePropertyInteger getBatchSize() {
    return batchSize;
  }

  @JsonProperty("batchSize")
  public void setBatchSize(@Nullable ConfigNodePropertyInteger batchSize) {
    this.batchSize = batchSize;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties maxTotalAttachmentSize(@Nullable ConfigNodePropertyInteger maxTotalAttachmentSize) {
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
  public @Nullable ConfigNodePropertyInteger getMaxTotalAttachmentSize() {
    return maxTotalAttachmentSize;
  }

  @JsonProperty("maxTotalAttachmentSize")
  public void setMaxTotalAttachmentSize(@Nullable ConfigNodePropertyInteger maxTotalAttachmentSize) {
    this.maxTotalAttachmentSize = maxTotalAttachmentSize;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties attachmentTypeBlacklist(@Nullable ConfigNodePropertyArray attachmentTypeBlacklist) {
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
  public @Nullable ConfigNodePropertyArray getAttachmentTypeBlacklist() {
    return attachmentTypeBlacklist;
  }

  @JsonProperty("attachmentTypeBlacklist")
  public void setAttachmentTypeBlacklist(@Nullable ConfigNodePropertyArray attachmentTypeBlacklist) {
    this.attachmentTypeBlacklist = attachmentTypeBlacklist;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties allowedAttachmentTypes(@Nullable ConfigNodePropertyArray allowedAttachmentTypes) {
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
  public @Nullable ConfigNodePropertyArray getAllowedAttachmentTypes() {
    return allowedAttachmentTypes;
  }

  @JsonProperty("allowedAttachmentTypes")
  public void setAllowedAttachmentTypes(@Nullable ConfigNodePropertyArray allowedAttachmentTypes) {
    this.allowedAttachmentTypes = allowedAttachmentTypes;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties serviceSelector(@Nullable ConfigNodePropertyString serviceSelector) {
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
  public @Nullable ConfigNodePropertyString getServiceSelector() {
    return serviceSelector;
  }

  @JsonProperty("serviceSelector")
  public void setServiceSelector(@Nullable ConfigNodePropertyString serviceSelector) {
    this.serviceSelector = serviceSelector;
  }

  public ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties fieldWhitelist(@Nullable ConfigNodePropertyArray fieldWhitelist) {
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
  public @Nullable ConfigNodePropertyArray getFieldWhitelist() {
    return fieldWhitelist;
  }

  @JsonProperty("fieldWhitelist")
  public void setFieldWhitelist(@Nullable ConfigNodePropertyArray fieldWhitelist) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

