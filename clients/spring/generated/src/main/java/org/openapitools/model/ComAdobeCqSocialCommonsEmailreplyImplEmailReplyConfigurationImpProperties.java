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
import org.springframework.lang.Nullable;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString emailName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean emailCreatePostFromReply;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown emailAddCommentIdTo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger emailSubjectMaximumLength;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString emailReplyToAddress;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString emailReplyToDelimiter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString emailTrackerIdPrefixInSubject;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString emailTrackerIdPrefixInBody;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean emailAsHTML;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString emailDefaultUserName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString emailTemplatesRootPath;

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailName(@Nullable ConfigNodePropertyString emailName) {
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
  public @Nullable ConfigNodePropertyString getEmailName() {
    return emailName;
  }

  @JsonProperty("email.name")
  public void setEmailName(@Nullable ConfigNodePropertyString emailName) {
    this.emailName = emailName;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailCreatePostFromReply(@Nullable ConfigNodePropertyBoolean emailCreatePostFromReply) {
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
  public @Nullable ConfigNodePropertyBoolean getEmailCreatePostFromReply() {
    return emailCreatePostFromReply;
  }

  @JsonProperty("email.createPostFromReply")
  public void setEmailCreatePostFromReply(@Nullable ConfigNodePropertyBoolean emailCreatePostFromReply) {
    this.emailCreatePostFromReply = emailCreatePostFromReply;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailAddCommentIdTo(@Nullable ConfigNodePropertyDropDown emailAddCommentIdTo) {
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
  public @Nullable ConfigNodePropertyDropDown getEmailAddCommentIdTo() {
    return emailAddCommentIdTo;
  }

  @JsonProperty("email.addCommentIdTo")
  public void setEmailAddCommentIdTo(@Nullable ConfigNodePropertyDropDown emailAddCommentIdTo) {
    this.emailAddCommentIdTo = emailAddCommentIdTo;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailSubjectMaximumLength(@Nullable ConfigNodePropertyInteger emailSubjectMaximumLength) {
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
  public @Nullable ConfigNodePropertyInteger getEmailSubjectMaximumLength() {
    return emailSubjectMaximumLength;
  }

  @JsonProperty("email.subjectMaximumLength")
  public void setEmailSubjectMaximumLength(@Nullable ConfigNodePropertyInteger emailSubjectMaximumLength) {
    this.emailSubjectMaximumLength = emailSubjectMaximumLength;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailReplyToAddress(@Nullable ConfigNodePropertyString emailReplyToAddress) {
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
  public @Nullable ConfigNodePropertyString getEmailReplyToAddress() {
    return emailReplyToAddress;
  }

  @JsonProperty("email.replyToAddress")
  public void setEmailReplyToAddress(@Nullable ConfigNodePropertyString emailReplyToAddress) {
    this.emailReplyToAddress = emailReplyToAddress;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailReplyToDelimiter(@Nullable ConfigNodePropertyString emailReplyToDelimiter) {
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
  public @Nullable ConfigNodePropertyString getEmailReplyToDelimiter() {
    return emailReplyToDelimiter;
  }

  @JsonProperty("email.replyToDelimiter")
  public void setEmailReplyToDelimiter(@Nullable ConfigNodePropertyString emailReplyToDelimiter) {
    this.emailReplyToDelimiter = emailReplyToDelimiter;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTrackerIdPrefixInSubject(@Nullable ConfigNodePropertyString emailTrackerIdPrefixInSubject) {
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
  public @Nullable ConfigNodePropertyString getEmailTrackerIdPrefixInSubject() {
    return emailTrackerIdPrefixInSubject;
  }

  @JsonProperty("email.trackerIdPrefixInSubject")
  public void setEmailTrackerIdPrefixInSubject(@Nullable ConfigNodePropertyString emailTrackerIdPrefixInSubject) {
    this.emailTrackerIdPrefixInSubject = emailTrackerIdPrefixInSubject;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTrackerIdPrefixInBody(@Nullable ConfigNodePropertyString emailTrackerIdPrefixInBody) {
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
  public @Nullable ConfigNodePropertyString getEmailTrackerIdPrefixInBody() {
    return emailTrackerIdPrefixInBody;
  }

  @JsonProperty("email.trackerIdPrefixInBody")
  public void setEmailTrackerIdPrefixInBody(@Nullable ConfigNodePropertyString emailTrackerIdPrefixInBody) {
    this.emailTrackerIdPrefixInBody = emailTrackerIdPrefixInBody;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailAsHTML(@Nullable ConfigNodePropertyBoolean emailAsHTML) {
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
  public @Nullable ConfigNodePropertyBoolean getEmailAsHTML() {
    return emailAsHTML;
  }

  @JsonProperty("email.asHTML")
  public void setEmailAsHTML(@Nullable ConfigNodePropertyBoolean emailAsHTML) {
    this.emailAsHTML = emailAsHTML;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailDefaultUserName(@Nullable ConfigNodePropertyString emailDefaultUserName) {
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
  public @Nullable ConfigNodePropertyString getEmailDefaultUserName() {
    return emailDefaultUserName;
  }

  @JsonProperty("email.defaultUserName")
  public void setEmailDefaultUserName(@Nullable ConfigNodePropertyString emailDefaultUserName) {
    this.emailDefaultUserName = emailDefaultUserName;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTemplatesRootPath(@Nullable ConfigNodePropertyString emailTemplatesRootPath) {
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
  public @Nullable ConfigNodePropertyString getEmailTemplatesRootPath() {
    return emailTemplatesRootPath;
  }

  @JsonProperty("email.templates.rootPath")
  public void setEmailTemplatesRootPath(@Nullable ConfigNodePropertyString emailTemplatesRootPath) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

