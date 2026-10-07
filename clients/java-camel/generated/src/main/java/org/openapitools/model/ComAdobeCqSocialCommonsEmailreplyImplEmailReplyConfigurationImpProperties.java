package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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
 * ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties
 */

@JsonTypeName("comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {

  private ConfigNodePropertyString emailName;

  private ConfigNodePropertyBoolean emailCreatePostFromReply;

  private ConfigNodePropertyDropDown emailAddCommentIdTo;

  private ConfigNodePropertyInteger emailSubjectMaximumLength;

  private ConfigNodePropertyString emailReplyToAddress;

  private ConfigNodePropertyString emailReplyToDelimiter;

  private ConfigNodePropertyString emailTrackerIdPrefixInSubject;

  private ConfigNodePropertyString emailTrackerIdPrefixInBody;

  private ConfigNodePropertyBoolean emailAsHTML;

  private ConfigNodePropertyString emailDefaultUserName;

  private ConfigNodePropertyString emailTemplatesRootPath;

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailName(ConfigNodePropertyString emailName) {
    this.emailName = emailName;
    return this;
  }

  /**
   * Get emailName
   * @return emailName
   */
  @Valid 
  @Schema(name = "email.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email.name")
  public ConfigNodePropertyString getEmailName() {
    return emailName;
  }

  public void setEmailName(ConfigNodePropertyString emailName) {
    this.emailName = emailName;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailCreatePostFromReply(ConfigNodePropertyBoolean emailCreatePostFromReply) {
    this.emailCreatePostFromReply = emailCreatePostFromReply;
    return this;
  }

  /**
   * Get emailCreatePostFromReply
   * @return emailCreatePostFromReply
   */
  @Valid 
  @Schema(name = "email.createPostFromReply", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email.createPostFromReply")
  public ConfigNodePropertyBoolean getEmailCreatePostFromReply() {
    return emailCreatePostFromReply;
  }

  public void setEmailCreatePostFromReply(ConfigNodePropertyBoolean emailCreatePostFromReply) {
    this.emailCreatePostFromReply = emailCreatePostFromReply;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailAddCommentIdTo(ConfigNodePropertyDropDown emailAddCommentIdTo) {
    this.emailAddCommentIdTo = emailAddCommentIdTo;
    return this;
  }

  /**
   * Get emailAddCommentIdTo
   * @return emailAddCommentIdTo
   */
  @Valid 
  @Schema(name = "email.addCommentIdTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email.addCommentIdTo")
  public ConfigNodePropertyDropDown getEmailAddCommentIdTo() {
    return emailAddCommentIdTo;
  }

  public void setEmailAddCommentIdTo(ConfigNodePropertyDropDown emailAddCommentIdTo) {
    this.emailAddCommentIdTo = emailAddCommentIdTo;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailSubjectMaximumLength(ConfigNodePropertyInteger emailSubjectMaximumLength) {
    this.emailSubjectMaximumLength = emailSubjectMaximumLength;
    return this;
  }

  /**
   * Get emailSubjectMaximumLength
   * @return emailSubjectMaximumLength
   */
  @Valid 
  @Schema(name = "email.subjectMaximumLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email.subjectMaximumLength")
  public ConfigNodePropertyInteger getEmailSubjectMaximumLength() {
    return emailSubjectMaximumLength;
  }

  public void setEmailSubjectMaximumLength(ConfigNodePropertyInteger emailSubjectMaximumLength) {
    this.emailSubjectMaximumLength = emailSubjectMaximumLength;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailReplyToAddress(ConfigNodePropertyString emailReplyToAddress) {
    this.emailReplyToAddress = emailReplyToAddress;
    return this;
  }

  /**
   * Get emailReplyToAddress
   * @return emailReplyToAddress
   */
  @Valid 
  @Schema(name = "email.replyToAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email.replyToAddress")
  public ConfigNodePropertyString getEmailReplyToAddress() {
    return emailReplyToAddress;
  }

  public void setEmailReplyToAddress(ConfigNodePropertyString emailReplyToAddress) {
    this.emailReplyToAddress = emailReplyToAddress;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailReplyToDelimiter(ConfigNodePropertyString emailReplyToDelimiter) {
    this.emailReplyToDelimiter = emailReplyToDelimiter;
    return this;
  }

  /**
   * Get emailReplyToDelimiter
   * @return emailReplyToDelimiter
   */
  @Valid 
  @Schema(name = "email.replyToDelimiter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email.replyToDelimiter")
  public ConfigNodePropertyString getEmailReplyToDelimiter() {
    return emailReplyToDelimiter;
  }

  public void setEmailReplyToDelimiter(ConfigNodePropertyString emailReplyToDelimiter) {
    this.emailReplyToDelimiter = emailReplyToDelimiter;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTrackerIdPrefixInSubject(ConfigNodePropertyString emailTrackerIdPrefixInSubject) {
    this.emailTrackerIdPrefixInSubject = emailTrackerIdPrefixInSubject;
    return this;
  }

  /**
   * Get emailTrackerIdPrefixInSubject
   * @return emailTrackerIdPrefixInSubject
   */
  @Valid 
  @Schema(name = "email.trackerIdPrefixInSubject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email.trackerIdPrefixInSubject")
  public ConfigNodePropertyString getEmailTrackerIdPrefixInSubject() {
    return emailTrackerIdPrefixInSubject;
  }

  public void setEmailTrackerIdPrefixInSubject(ConfigNodePropertyString emailTrackerIdPrefixInSubject) {
    this.emailTrackerIdPrefixInSubject = emailTrackerIdPrefixInSubject;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTrackerIdPrefixInBody(ConfigNodePropertyString emailTrackerIdPrefixInBody) {
    this.emailTrackerIdPrefixInBody = emailTrackerIdPrefixInBody;
    return this;
  }

  /**
   * Get emailTrackerIdPrefixInBody
   * @return emailTrackerIdPrefixInBody
   */
  @Valid 
  @Schema(name = "email.trackerIdPrefixInBody", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email.trackerIdPrefixInBody")
  public ConfigNodePropertyString getEmailTrackerIdPrefixInBody() {
    return emailTrackerIdPrefixInBody;
  }

  public void setEmailTrackerIdPrefixInBody(ConfigNodePropertyString emailTrackerIdPrefixInBody) {
    this.emailTrackerIdPrefixInBody = emailTrackerIdPrefixInBody;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailAsHTML(ConfigNodePropertyBoolean emailAsHTML) {
    this.emailAsHTML = emailAsHTML;
    return this;
  }

  /**
   * Get emailAsHTML
   * @return emailAsHTML
   */
  @Valid 
  @Schema(name = "email.asHTML", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email.asHTML")
  public ConfigNodePropertyBoolean getEmailAsHTML() {
    return emailAsHTML;
  }

  public void setEmailAsHTML(ConfigNodePropertyBoolean emailAsHTML) {
    this.emailAsHTML = emailAsHTML;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailDefaultUserName(ConfigNodePropertyString emailDefaultUserName) {
    this.emailDefaultUserName = emailDefaultUserName;
    return this;
  }

  /**
   * Get emailDefaultUserName
   * @return emailDefaultUserName
   */
  @Valid 
  @Schema(name = "email.defaultUserName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email.defaultUserName")
  public ConfigNodePropertyString getEmailDefaultUserName() {
    return emailDefaultUserName;
  }

  public void setEmailDefaultUserName(ConfigNodePropertyString emailDefaultUserName) {
    this.emailDefaultUserName = emailDefaultUserName;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTemplatesRootPath(ConfigNodePropertyString emailTemplatesRootPath) {
    this.emailTemplatesRootPath = emailTemplatesRootPath;
    return this;
  }

  /**
   * Get emailTemplatesRootPath
   * @return emailTemplatesRootPath
   */
  @Valid 
  @Schema(name = "email.templates.rootPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email.templates.rootPath")
  public ConfigNodePropertyString getEmailTemplatesRootPath() {
    return emailTemplatesRootPath;
  }

  public void setEmailTemplatesRootPath(ConfigNodePropertyString emailTemplatesRootPath) {
    this.emailTemplatesRootPath = emailTemplatesRootPath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties = (ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties) o;
    return Objects.equals(this.emailName, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailName) &&
        Objects.equals(this.emailCreatePostFromReply, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailCreatePostFromReply) &&
        Objects.equals(this.emailAddCommentIdTo, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailAddCommentIdTo) &&
        Objects.equals(this.emailSubjectMaximumLength, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailSubjectMaximumLength) &&
        Objects.equals(this.emailReplyToAddress, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailReplyToAddress) &&
        Objects.equals(this.emailReplyToDelimiter, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailReplyToDelimiter) &&
        Objects.equals(this.emailTrackerIdPrefixInSubject, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTrackerIdPrefixInSubject) &&
        Objects.equals(this.emailTrackerIdPrefixInBody, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTrackerIdPrefixInBody) &&
        Objects.equals(this.emailAsHTML, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailAsHTML) &&
        Objects.equals(this.emailDefaultUserName, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailDefaultUserName) &&
        Objects.equals(this.emailTemplatesRootPath, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTemplatesRootPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailName, emailCreatePostFromReply, emailAddCommentIdTo, emailSubjectMaximumLength, emailReplyToAddress, emailReplyToDelimiter, emailTrackerIdPrefixInSubject, emailTrackerIdPrefixInBody, emailAsHTML, emailDefaultUserName, emailTemplatesRootPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {\n");
    sb.append("    emailName: ").append(toIndentedString(emailName)).append("\n");
    sb.append("    emailCreatePostFromReply: ").append(toIndentedString(emailCreatePostFromReply)).append("\n");
    sb.append("    emailAddCommentIdTo: ").append(toIndentedString(emailAddCommentIdTo)).append("\n");
    sb.append("    emailSubjectMaximumLength: ").append(toIndentedString(emailSubjectMaximumLength)).append("\n");
    sb.append("    emailReplyToAddress: ").append(toIndentedString(emailReplyToAddress)).append("\n");
    sb.append("    emailReplyToDelimiter: ").append(toIndentedString(emailReplyToDelimiter)).append("\n");
    sb.append("    emailTrackerIdPrefixInSubject: ").append(toIndentedString(emailTrackerIdPrefixInSubject)).append("\n");
    sb.append("    emailTrackerIdPrefixInBody: ").append(toIndentedString(emailTrackerIdPrefixInBody)).append("\n");
    sb.append("    emailAsHTML: ").append(toIndentedString(emailAsHTML)).append("\n");
    sb.append("    emailDefaultUserName: ").append(toIndentedString(emailDefaultUserName)).append("\n");
    sb.append("    emailTemplatesRootPath: ").append(toIndentedString(emailTemplatesRootPath)).append("\n");
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

