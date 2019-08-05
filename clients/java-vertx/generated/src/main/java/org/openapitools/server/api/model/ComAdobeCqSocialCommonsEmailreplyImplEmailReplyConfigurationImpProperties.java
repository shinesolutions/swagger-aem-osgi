package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties   {
  
  private ConfigNodePropertyString emailName = null;
  private ConfigNodePropertyBoolean emailCreatePostFromReply = null;
  private ConfigNodePropertyDropDown emailAddCommentIdTo = null;
  private ConfigNodePropertyInteger emailSubjectMaximumLength = null;
  private ConfigNodePropertyString emailReplyToAddress = null;
  private ConfigNodePropertyString emailReplyToDelimiter = null;
  private ConfigNodePropertyString emailTrackerIdPrefixInSubject = null;
  private ConfigNodePropertyString emailTrackerIdPrefixInBody = null;
  private ConfigNodePropertyBoolean emailAsHTML = null;
  private ConfigNodePropertyString emailDefaultUserName = null;
  private ConfigNodePropertyString emailTemplatesRootPath = null;

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties () {

  }

  public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties (ConfigNodePropertyString emailName, ConfigNodePropertyBoolean emailCreatePostFromReply, ConfigNodePropertyDropDown emailAddCommentIdTo, ConfigNodePropertyInteger emailSubjectMaximumLength, ConfigNodePropertyString emailReplyToAddress, ConfigNodePropertyString emailReplyToDelimiter, ConfigNodePropertyString emailTrackerIdPrefixInSubject, ConfigNodePropertyString emailTrackerIdPrefixInBody, ConfigNodePropertyBoolean emailAsHTML, ConfigNodePropertyString emailDefaultUserName, ConfigNodePropertyString emailTemplatesRootPath) {
    this.emailName = emailName;
    this.emailCreatePostFromReply = emailCreatePostFromReply;
    this.emailAddCommentIdTo = emailAddCommentIdTo;
    this.emailSubjectMaximumLength = emailSubjectMaximumLength;
    this.emailReplyToAddress = emailReplyToAddress;
    this.emailReplyToDelimiter = emailReplyToDelimiter;
    this.emailTrackerIdPrefixInSubject = emailTrackerIdPrefixInSubject;
    this.emailTrackerIdPrefixInBody = emailTrackerIdPrefixInBody;
    this.emailAsHTML = emailAsHTML;
    this.emailDefaultUserName = emailDefaultUserName;
    this.emailTemplatesRootPath = emailTemplatesRootPath;
  }

    
  @JsonProperty("email.name")
  public ConfigNodePropertyString getEmailName() {
    return emailName;
  }
  public void setEmailName(ConfigNodePropertyString emailName) {
    this.emailName = emailName;
  }

    
  @JsonProperty("email.createPostFromReply")
  public ConfigNodePropertyBoolean getEmailCreatePostFromReply() {
    return emailCreatePostFromReply;
  }
  public void setEmailCreatePostFromReply(ConfigNodePropertyBoolean emailCreatePostFromReply) {
    this.emailCreatePostFromReply = emailCreatePostFromReply;
  }

    
  @JsonProperty("email.addCommentIdTo")
  public ConfigNodePropertyDropDown getEmailAddCommentIdTo() {
    return emailAddCommentIdTo;
  }
  public void setEmailAddCommentIdTo(ConfigNodePropertyDropDown emailAddCommentIdTo) {
    this.emailAddCommentIdTo = emailAddCommentIdTo;
  }

    
  @JsonProperty("email.subjectMaximumLength")
  public ConfigNodePropertyInteger getEmailSubjectMaximumLength() {
    return emailSubjectMaximumLength;
  }
  public void setEmailSubjectMaximumLength(ConfigNodePropertyInteger emailSubjectMaximumLength) {
    this.emailSubjectMaximumLength = emailSubjectMaximumLength;
  }

    
  @JsonProperty("email.replyToAddress")
  public ConfigNodePropertyString getEmailReplyToAddress() {
    return emailReplyToAddress;
  }
  public void setEmailReplyToAddress(ConfigNodePropertyString emailReplyToAddress) {
    this.emailReplyToAddress = emailReplyToAddress;
  }

    
  @JsonProperty("email.replyToDelimiter")
  public ConfigNodePropertyString getEmailReplyToDelimiter() {
    return emailReplyToDelimiter;
  }
  public void setEmailReplyToDelimiter(ConfigNodePropertyString emailReplyToDelimiter) {
    this.emailReplyToDelimiter = emailReplyToDelimiter;
  }

    
  @JsonProperty("email.trackerIdPrefixInSubject")
  public ConfigNodePropertyString getEmailTrackerIdPrefixInSubject() {
    return emailTrackerIdPrefixInSubject;
  }
  public void setEmailTrackerIdPrefixInSubject(ConfigNodePropertyString emailTrackerIdPrefixInSubject) {
    this.emailTrackerIdPrefixInSubject = emailTrackerIdPrefixInSubject;
  }

    
  @JsonProperty("email.trackerIdPrefixInBody")
  public ConfigNodePropertyString getEmailTrackerIdPrefixInBody() {
    return emailTrackerIdPrefixInBody;
  }
  public void setEmailTrackerIdPrefixInBody(ConfigNodePropertyString emailTrackerIdPrefixInBody) {
    this.emailTrackerIdPrefixInBody = emailTrackerIdPrefixInBody;
  }

    
  @JsonProperty("email.asHTML")
  public ConfigNodePropertyBoolean getEmailAsHTML() {
    return emailAsHTML;
  }
  public void setEmailAsHTML(ConfigNodePropertyBoolean emailAsHTML) {
    this.emailAsHTML = emailAsHTML;
  }

    
  @JsonProperty("email.defaultUserName")
  public ConfigNodePropertyString getEmailDefaultUserName() {
    return emailDefaultUserName;
  }
  public void setEmailDefaultUserName(ConfigNodePropertyString emailDefaultUserName) {
    this.emailDefaultUserName = emailDefaultUserName;
  }

    
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
    return Objects.equals(emailName, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailName) &&
        Objects.equals(emailCreatePostFromReply, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailCreatePostFromReply) &&
        Objects.equals(emailAddCommentIdTo, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailAddCommentIdTo) &&
        Objects.equals(emailSubjectMaximumLength, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailSubjectMaximumLength) &&
        Objects.equals(emailReplyToAddress, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailReplyToAddress) &&
        Objects.equals(emailReplyToDelimiter, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailReplyToDelimiter) &&
        Objects.equals(emailTrackerIdPrefixInSubject, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTrackerIdPrefixInSubject) &&
        Objects.equals(emailTrackerIdPrefixInBody, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTrackerIdPrefixInBody) &&
        Objects.equals(emailAsHTML, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailAsHTML) &&
        Objects.equals(emailDefaultUserName, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailDefaultUserName) &&
        Objects.equals(emailTemplatesRootPath, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTemplatesRootPath);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
