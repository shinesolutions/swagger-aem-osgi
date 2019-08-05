package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties   {
  @JsonProperty("email.name")
  private ConfigNodePropertyString emailName = null;

  @JsonProperty("email.createPostFromReply")
  private ConfigNodePropertyBoolean emailCreatePostFromReply = null;

  @JsonProperty("email.addCommentIdTo")
  private ConfigNodePropertyDropDown emailAddCommentIdTo = null;

  @JsonProperty("email.subjectMaximumLength")
  private ConfigNodePropertyInteger emailSubjectMaximumLength = null;

  @JsonProperty("email.replyToAddress")
  private ConfigNodePropertyString emailReplyToAddress = null;

  @JsonProperty("email.replyToDelimiter")
  private ConfigNodePropertyString emailReplyToDelimiter = null;

  @JsonProperty("email.trackerIdPrefixInSubject")
  private ConfigNodePropertyString emailTrackerIdPrefixInSubject = null;

  @JsonProperty("email.trackerIdPrefixInBody")
  private ConfigNodePropertyString emailTrackerIdPrefixInBody = null;

  @JsonProperty("email.asHTML")
  private ConfigNodePropertyBoolean emailAsHTML = null;

  @JsonProperty("email.defaultUserName")
  private ConfigNodePropertyString emailDefaultUserName = null;

  @JsonProperty("email.templates.rootPath")
  private ConfigNodePropertyString emailTemplatesRootPath = null;

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailName(ConfigNodePropertyString emailName) {
    this.emailName = emailName;
    return this;
  }

   /**
   * Get emailName
   * @return emailName
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getEmailTemplatesRootPath() {
    return emailTemplatesRootPath;
  }

  public void setEmailTemplatesRootPath(ConfigNodePropertyString emailTemplatesRootPath) {
    this.emailTemplatesRootPath = emailTemplatesRootPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

