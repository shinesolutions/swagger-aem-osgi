package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString emailName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean emailCreatePostFromReply;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown emailAddCommentIdTo;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger emailSubjectMaximumLength;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString emailReplyToAddress;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString emailReplyToDelimiter;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString emailTrackerIdPrefixInSubject;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString emailTrackerIdPrefixInBody;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean emailAsHTML;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString emailDefaultUserName;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString emailTemplatesRootPath;
 /**
  * Get emailName
  * @return emailName
  */
  @JsonProperty("email.name")
  public ConfigNodePropertyString getEmailName() {
    return emailName;
  }

  /**
   * Sets the <code>emailName</code> property.
   */
 public void setEmailName(ConfigNodePropertyString emailName) {
    this.emailName = emailName;
  }

  /**
   * Sets the <code>emailName</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailName(ConfigNodePropertyString emailName) {
    this.emailName = emailName;
    return this;
  }

 /**
  * Get emailCreatePostFromReply
  * @return emailCreatePostFromReply
  */
  @JsonProperty("email.createPostFromReply")
  public ConfigNodePropertyBoolean getEmailCreatePostFromReply() {
    return emailCreatePostFromReply;
  }

  /**
   * Sets the <code>emailCreatePostFromReply</code> property.
   */
 public void setEmailCreatePostFromReply(ConfigNodePropertyBoolean emailCreatePostFromReply) {
    this.emailCreatePostFromReply = emailCreatePostFromReply;
  }

  /**
   * Sets the <code>emailCreatePostFromReply</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailCreatePostFromReply(ConfigNodePropertyBoolean emailCreatePostFromReply) {
    this.emailCreatePostFromReply = emailCreatePostFromReply;
    return this;
  }

 /**
  * Get emailAddCommentIdTo
  * @return emailAddCommentIdTo
  */
  @JsonProperty("email.addCommentIdTo")
  public ConfigNodePropertyDropDown getEmailAddCommentIdTo() {
    return emailAddCommentIdTo;
  }

  /**
   * Sets the <code>emailAddCommentIdTo</code> property.
   */
 public void setEmailAddCommentIdTo(ConfigNodePropertyDropDown emailAddCommentIdTo) {
    this.emailAddCommentIdTo = emailAddCommentIdTo;
  }

  /**
   * Sets the <code>emailAddCommentIdTo</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailAddCommentIdTo(ConfigNodePropertyDropDown emailAddCommentIdTo) {
    this.emailAddCommentIdTo = emailAddCommentIdTo;
    return this;
  }

 /**
  * Get emailSubjectMaximumLength
  * @return emailSubjectMaximumLength
  */
  @JsonProperty("email.subjectMaximumLength")
  public ConfigNodePropertyInteger getEmailSubjectMaximumLength() {
    return emailSubjectMaximumLength;
  }

  /**
   * Sets the <code>emailSubjectMaximumLength</code> property.
   */
 public void setEmailSubjectMaximumLength(ConfigNodePropertyInteger emailSubjectMaximumLength) {
    this.emailSubjectMaximumLength = emailSubjectMaximumLength;
  }

  /**
   * Sets the <code>emailSubjectMaximumLength</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailSubjectMaximumLength(ConfigNodePropertyInteger emailSubjectMaximumLength) {
    this.emailSubjectMaximumLength = emailSubjectMaximumLength;
    return this;
  }

 /**
  * Get emailReplyToAddress
  * @return emailReplyToAddress
  */
  @JsonProperty("email.replyToAddress")
  public ConfigNodePropertyString getEmailReplyToAddress() {
    return emailReplyToAddress;
  }

  /**
   * Sets the <code>emailReplyToAddress</code> property.
   */
 public void setEmailReplyToAddress(ConfigNodePropertyString emailReplyToAddress) {
    this.emailReplyToAddress = emailReplyToAddress;
  }

  /**
   * Sets the <code>emailReplyToAddress</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailReplyToAddress(ConfigNodePropertyString emailReplyToAddress) {
    this.emailReplyToAddress = emailReplyToAddress;
    return this;
  }

 /**
  * Get emailReplyToDelimiter
  * @return emailReplyToDelimiter
  */
  @JsonProperty("email.replyToDelimiter")
  public ConfigNodePropertyString getEmailReplyToDelimiter() {
    return emailReplyToDelimiter;
  }

  /**
   * Sets the <code>emailReplyToDelimiter</code> property.
   */
 public void setEmailReplyToDelimiter(ConfigNodePropertyString emailReplyToDelimiter) {
    this.emailReplyToDelimiter = emailReplyToDelimiter;
  }

  /**
   * Sets the <code>emailReplyToDelimiter</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailReplyToDelimiter(ConfigNodePropertyString emailReplyToDelimiter) {
    this.emailReplyToDelimiter = emailReplyToDelimiter;
    return this;
  }

 /**
  * Get emailTrackerIdPrefixInSubject
  * @return emailTrackerIdPrefixInSubject
  */
  @JsonProperty("email.trackerIdPrefixInSubject")
  public ConfigNodePropertyString getEmailTrackerIdPrefixInSubject() {
    return emailTrackerIdPrefixInSubject;
  }

  /**
   * Sets the <code>emailTrackerIdPrefixInSubject</code> property.
   */
 public void setEmailTrackerIdPrefixInSubject(ConfigNodePropertyString emailTrackerIdPrefixInSubject) {
    this.emailTrackerIdPrefixInSubject = emailTrackerIdPrefixInSubject;
  }

  /**
   * Sets the <code>emailTrackerIdPrefixInSubject</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTrackerIdPrefixInSubject(ConfigNodePropertyString emailTrackerIdPrefixInSubject) {
    this.emailTrackerIdPrefixInSubject = emailTrackerIdPrefixInSubject;
    return this;
  }

 /**
  * Get emailTrackerIdPrefixInBody
  * @return emailTrackerIdPrefixInBody
  */
  @JsonProperty("email.trackerIdPrefixInBody")
  public ConfigNodePropertyString getEmailTrackerIdPrefixInBody() {
    return emailTrackerIdPrefixInBody;
  }

  /**
   * Sets the <code>emailTrackerIdPrefixInBody</code> property.
   */
 public void setEmailTrackerIdPrefixInBody(ConfigNodePropertyString emailTrackerIdPrefixInBody) {
    this.emailTrackerIdPrefixInBody = emailTrackerIdPrefixInBody;
  }

  /**
   * Sets the <code>emailTrackerIdPrefixInBody</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTrackerIdPrefixInBody(ConfigNodePropertyString emailTrackerIdPrefixInBody) {
    this.emailTrackerIdPrefixInBody = emailTrackerIdPrefixInBody;
    return this;
  }

 /**
  * Get emailAsHTML
  * @return emailAsHTML
  */
  @JsonProperty("email.asHTML")
  public ConfigNodePropertyBoolean getEmailAsHTML() {
    return emailAsHTML;
  }

  /**
   * Sets the <code>emailAsHTML</code> property.
   */
 public void setEmailAsHTML(ConfigNodePropertyBoolean emailAsHTML) {
    this.emailAsHTML = emailAsHTML;
  }

  /**
   * Sets the <code>emailAsHTML</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailAsHTML(ConfigNodePropertyBoolean emailAsHTML) {
    this.emailAsHTML = emailAsHTML;
    return this;
  }

 /**
  * Get emailDefaultUserName
  * @return emailDefaultUserName
  */
  @JsonProperty("email.defaultUserName")
  public ConfigNodePropertyString getEmailDefaultUserName() {
    return emailDefaultUserName;
  }

  /**
   * Sets the <code>emailDefaultUserName</code> property.
   */
 public void setEmailDefaultUserName(ConfigNodePropertyString emailDefaultUserName) {
    this.emailDefaultUserName = emailDefaultUserName;
  }

  /**
   * Sets the <code>emailDefaultUserName</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailDefaultUserName(ConfigNodePropertyString emailDefaultUserName) {
    this.emailDefaultUserName = emailDefaultUserName;
    return this;
  }

 /**
  * Get emailTemplatesRootPath
  * @return emailTemplatesRootPath
  */
  @JsonProperty("email.templates.rootPath")
  public ConfigNodePropertyString getEmailTemplatesRootPath() {
    return emailTemplatesRootPath;
  }

  /**
   * Sets the <code>emailTemplatesRootPath</code> property.
   */
 public void setEmailTemplatesRootPath(ConfigNodePropertyString emailTemplatesRootPath) {
    this.emailTemplatesRootPath = emailTemplatesRootPath;
  }

  /**
   * Sets the <code>emailTemplatesRootPath</code> property.
   */
  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties emailTemplatesRootPath(ConfigNodePropertyString emailTemplatesRootPath) {
    this.emailTemplatesRootPath = emailTemplatesRootPath;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

