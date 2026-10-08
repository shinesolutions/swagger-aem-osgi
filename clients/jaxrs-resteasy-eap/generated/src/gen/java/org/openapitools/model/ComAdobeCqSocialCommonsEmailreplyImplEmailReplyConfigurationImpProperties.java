package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email.name")
  public ConfigNodePropertyString getEmailName() {
    return emailName;
  }
  public void setEmailName(ConfigNodePropertyString emailName) {
    this.emailName = emailName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email.createPostFromReply")
  public ConfigNodePropertyBoolean getEmailCreatePostFromReply() {
    return emailCreatePostFromReply;
  }
  public void setEmailCreatePostFromReply(ConfigNodePropertyBoolean emailCreatePostFromReply) {
    this.emailCreatePostFromReply = emailCreatePostFromReply;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email.addCommentIdTo")
  public ConfigNodePropertyDropDown getEmailAddCommentIdTo() {
    return emailAddCommentIdTo;
  }
  public void setEmailAddCommentIdTo(ConfigNodePropertyDropDown emailAddCommentIdTo) {
    this.emailAddCommentIdTo = emailAddCommentIdTo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email.subjectMaximumLength")
  public ConfigNodePropertyInteger getEmailSubjectMaximumLength() {
    return emailSubjectMaximumLength;
  }
  public void setEmailSubjectMaximumLength(ConfigNodePropertyInteger emailSubjectMaximumLength) {
    this.emailSubjectMaximumLength = emailSubjectMaximumLength;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email.replyToAddress")
  public ConfigNodePropertyString getEmailReplyToAddress() {
    return emailReplyToAddress;
  }
  public void setEmailReplyToAddress(ConfigNodePropertyString emailReplyToAddress) {
    this.emailReplyToAddress = emailReplyToAddress;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email.replyToDelimiter")
  public ConfigNodePropertyString getEmailReplyToDelimiter() {
    return emailReplyToDelimiter;
  }
  public void setEmailReplyToDelimiter(ConfigNodePropertyString emailReplyToDelimiter) {
    this.emailReplyToDelimiter = emailReplyToDelimiter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email.trackerIdPrefixInSubject")
  public ConfigNodePropertyString getEmailTrackerIdPrefixInSubject() {
    return emailTrackerIdPrefixInSubject;
  }
  public void setEmailTrackerIdPrefixInSubject(ConfigNodePropertyString emailTrackerIdPrefixInSubject) {
    this.emailTrackerIdPrefixInSubject = emailTrackerIdPrefixInSubject;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email.trackerIdPrefixInBody")
  public ConfigNodePropertyString getEmailTrackerIdPrefixInBody() {
    return emailTrackerIdPrefixInBody;
  }
  public void setEmailTrackerIdPrefixInBody(ConfigNodePropertyString emailTrackerIdPrefixInBody) {
    this.emailTrackerIdPrefixInBody = emailTrackerIdPrefixInBody;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email.asHTML")
  public ConfigNodePropertyBoolean getEmailAsHTML() {
    return emailAsHTML;
  }
  public void setEmailAsHTML(ConfigNodePropertyBoolean emailAsHTML) {
    this.emailAsHTML = emailAsHTML;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("email.defaultUserName")
  public ConfigNodePropertyString getEmailDefaultUserName() {
    return emailDefaultUserName;
  }
  public void setEmailDefaultUserName(ConfigNodePropertyString emailDefaultUserName) {
    this.emailDefaultUserName = emailDefaultUserName;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
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

