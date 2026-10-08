package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties   {
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

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties() {
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailName(ConfigNodePropertyString emailName) {
    this.emailName = emailName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.name")
  @Valid public ConfigNodePropertyString getEmailName() {
    return emailName;
  }

  @JsonProperty("email.name")
  public void setEmailName(ConfigNodePropertyString emailName) {
    this.emailName = emailName;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailCreatePostFromReply(ConfigNodePropertyBoolean emailCreatePostFromReply) {
    this.emailCreatePostFromReply = emailCreatePostFromReply;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.createPostFromReply")
  @Valid public ConfigNodePropertyBoolean getEmailCreatePostFromReply() {
    return emailCreatePostFromReply;
  }

  @JsonProperty("email.createPostFromReply")
  public void setEmailCreatePostFromReply(ConfigNodePropertyBoolean emailCreatePostFromReply) {
    this.emailCreatePostFromReply = emailCreatePostFromReply;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailAddCommentIdTo(ConfigNodePropertyDropDown emailAddCommentIdTo) {
    this.emailAddCommentIdTo = emailAddCommentIdTo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.addCommentIdTo")
  @Valid public ConfigNodePropertyDropDown getEmailAddCommentIdTo() {
    return emailAddCommentIdTo;
  }

  @JsonProperty("email.addCommentIdTo")
  public void setEmailAddCommentIdTo(ConfigNodePropertyDropDown emailAddCommentIdTo) {
    this.emailAddCommentIdTo = emailAddCommentIdTo;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailSubjectMaximumLength(ConfigNodePropertyInteger emailSubjectMaximumLength) {
    this.emailSubjectMaximumLength = emailSubjectMaximumLength;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.subjectMaximumLength")
  @Valid public ConfigNodePropertyInteger getEmailSubjectMaximumLength() {
    return emailSubjectMaximumLength;
  }

  @JsonProperty("email.subjectMaximumLength")
  public void setEmailSubjectMaximumLength(ConfigNodePropertyInteger emailSubjectMaximumLength) {
    this.emailSubjectMaximumLength = emailSubjectMaximumLength;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailReplyToAddress(ConfigNodePropertyString emailReplyToAddress) {
    this.emailReplyToAddress = emailReplyToAddress;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.replyToAddress")
  @Valid public ConfigNodePropertyString getEmailReplyToAddress() {
    return emailReplyToAddress;
  }

  @JsonProperty("email.replyToAddress")
  public void setEmailReplyToAddress(ConfigNodePropertyString emailReplyToAddress) {
    this.emailReplyToAddress = emailReplyToAddress;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailReplyToDelimiter(ConfigNodePropertyString emailReplyToDelimiter) {
    this.emailReplyToDelimiter = emailReplyToDelimiter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.replyToDelimiter")
  @Valid public ConfigNodePropertyString getEmailReplyToDelimiter() {
    return emailReplyToDelimiter;
  }

  @JsonProperty("email.replyToDelimiter")
  public void setEmailReplyToDelimiter(ConfigNodePropertyString emailReplyToDelimiter) {
    this.emailReplyToDelimiter = emailReplyToDelimiter;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTrackerIdPrefixInSubject(ConfigNodePropertyString emailTrackerIdPrefixInSubject) {
    this.emailTrackerIdPrefixInSubject = emailTrackerIdPrefixInSubject;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.trackerIdPrefixInSubject")
  @Valid public ConfigNodePropertyString getEmailTrackerIdPrefixInSubject() {
    return emailTrackerIdPrefixInSubject;
  }

  @JsonProperty("email.trackerIdPrefixInSubject")
  public void setEmailTrackerIdPrefixInSubject(ConfigNodePropertyString emailTrackerIdPrefixInSubject) {
    this.emailTrackerIdPrefixInSubject = emailTrackerIdPrefixInSubject;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTrackerIdPrefixInBody(ConfigNodePropertyString emailTrackerIdPrefixInBody) {
    this.emailTrackerIdPrefixInBody = emailTrackerIdPrefixInBody;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.trackerIdPrefixInBody")
  @Valid public ConfigNodePropertyString getEmailTrackerIdPrefixInBody() {
    return emailTrackerIdPrefixInBody;
  }

  @JsonProperty("email.trackerIdPrefixInBody")
  public void setEmailTrackerIdPrefixInBody(ConfigNodePropertyString emailTrackerIdPrefixInBody) {
    this.emailTrackerIdPrefixInBody = emailTrackerIdPrefixInBody;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailAsHTML(ConfigNodePropertyBoolean emailAsHTML) {
    this.emailAsHTML = emailAsHTML;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.asHTML")
  @Valid public ConfigNodePropertyBoolean getEmailAsHTML() {
    return emailAsHTML;
  }

  @JsonProperty("email.asHTML")
  public void setEmailAsHTML(ConfigNodePropertyBoolean emailAsHTML) {
    this.emailAsHTML = emailAsHTML;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailDefaultUserName(ConfigNodePropertyString emailDefaultUserName) {
    this.emailDefaultUserName = emailDefaultUserName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.defaultUserName")
  @Valid public ConfigNodePropertyString getEmailDefaultUserName() {
    return emailDefaultUserName;
  }

  @JsonProperty("email.defaultUserName")
  public void setEmailDefaultUserName(ConfigNodePropertyString emailDefaultUserName) {
    this.emailDefaultUserName = emailDefaultUserName;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTemplatesRootPath(ConfigNodePropertyString emailTemplatesRootPath) {
    this.emailTemplatesRootPath = emailTemplatesRootPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("email.templates.rootPath")
  @Valid public ConfigNodePropertyString getEmailTemplatesRootPath() {
    return emailTemplatesRootPath;
  }

  @JsonProperty("email.templates.rootPath")
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
