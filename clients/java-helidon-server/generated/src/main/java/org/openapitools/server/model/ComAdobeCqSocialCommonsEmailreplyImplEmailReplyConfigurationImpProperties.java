package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.
     *
     * @param emailName emailName
     * @param emailCreatePostFromReply emailCreatePostFromReply
     * @param emailAddCommentIdTo emailAddCommentIdTo
     * @param emailSubjectMaximumLength emailSubjectMaximumLength
     * @param emailReplyToAddress emailReplyToAddress
     * @param emailReplyToDelimiter emailReplyToDelimiter
     * @param emailTrackerIdPrefixInSubject emailTrackerIdPrefixInSubject
     * @param emailTrackerIdPrefixInBody emailTrackerIdPrefixInBody
     * @param emailAsHTML emailAsHTML
     * @param emailDefaultUserName emailDefaultUserName
     * @param emailTemplatesRootPath emailTemplatesRootPath
     */
    public ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(
        ConfigNodePropertyString emailName, 
        ConfigNodePropertyBoolean emailCreatePostFromReply, 
        ConfigNodePropertyDropDown emailAddCommentIdTo, 
        ConfigNodePropertyInteger emailSubjectMaximumLength, 
        ConfigNodePropertyString emailReplyToAddress, 
        ConfigNodePropertyString emailReplyToDelimiter, 
        ConfigNodePropertyString emailTrackerIdPrefixInSubject, 
        ConfigNodePropertyString emailTrackerIdPrefixInBody, 
        ConfigNodePropertyBoolean emailAsHTML, 
        ConfigNodePropertyString emailDefaultUserName, 
        ConfigNodePropertyString emailTemplatesRootPath
    ) {
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



    /**
     * Get emailName
     * @return emailName
     */
    public ConfigNodePropertyString getEmailName() {
        return emailName;
    }

    public void setEmailName(ConfigNodePropertyString emailName) {
        this.emailName = emailName;
    }

    /**
     * Get emailCreatePostFromReply
     * @return emailCreatePostFromReply
     */
    public ConfigNodePropertyBoolean getEmailCreatePostFromReply() {
        return emailCreatePostFromReply;
    }

    public void setEmailCreatePostFromReply(ConfigNodePropertyBoolean emailCreatePostFromReply) {
        this.emailCreatePostFromReply = emailCreatePostFromReply;
    }

    /**
     * Get emailAddCommentIdTo
     * @return emailAddCommentIdTo
     */
    public ConfigNodePropertyDropDown getEmailAddCommentIdTo() {
        return emailAddCommentIdTo;
    }

    public void setEmailAddCommentIdTo(ConfigNodePropertyDropDown emailAddCommentIdTo) {
        this.emailAddCommentIdTo = emailAddCommentIdTo;
    }

    /**
     * Get emailSubjectMaximumLength
     * @return emailSubjectMaximumLength
     */
    public ConfigNodePropertyInteger getEmailSubjectMaximumLength() {
        return emailSubjectMaximumLength;
    }

    public void setEmailSubjectMaximumLength(ConfigNodePropertyInteger emailSubjectMaximumLength) {
        this.emailSubjectMaximumLength = emailSubjectMaximumLength;
    }

    /**
     * Get emailReplyToAddress
     * @return emailReplyToAddress
     */
    public ConfigNodePropertyString getEmailReplyToAddress() {
        return emailReplyToAddress;
    }

    public void setEmailReplyToAddress(ConfigNodePropertyString emailReplyToAddress) {
        this.emailReplyToAddress = emailReplyToAddress;
    }

    /**
     * Get emailReplyToDelimiter
     * @return emailReplyToDelimiter
     */
    public ConfigNodePropertyString getEmailReplyToDelimiter() {
        return emailReplyToDelimiter;
    }

    public void setEmailReplyToDelimiter(ConfigNodePropertyString emailReplyToDelimiter) {
        this.emailReplyToDelimiter = emailReplyToDelimiter;
    }

    /**
     * Get emailTrackerIdPrefixInSubject
     * @return emailTrackerIdPrefixInSubject
     */
    public ConfigNodePropertyString getEmailTrackerIdPrefixInSubject() {
        return emailTrackerIdPrefixInSubject;
    }

    public void setEmailTrackerIdPrefixInSubject(ConfigNodePropertyString emailTrackerIdPrefixInSubject) {
        this.emailTrackerIdPrefixInSubject = emailTrackerIdPrefixInSubject;
    }

    /**
     * Get emailTrackerIdPrefixInBody
     * @return emailTrackerIdPrefixInBody
     */
    public ConfigNodePropertyString getEmailTrackerIdPrefixInBody() {
        return emailTrackerIdPrefixInBody;
    }

    public void setEmailTrackerIdPrefixInBody(ConfigNodePropertyString emailTrackerIdPrefixInBody) {
        this.emailTrackerIdPrefixInBody = emailTrackerIdPrefixInBody;
    }

    /**
     * Get emailAsHTML
     * @return emailAsHTML
     */
    public ConfigNodePropertyBoolean getEmailAsHTML() {
        return emailAsHTML;
    }

    public void setEmailAsHTML(ConfigNodePropertyBoolean emailAsHTML) {
        this.emailAsHTML = emailAsHTML;
    }

    /**
     * Get emailDefaultUserName
     * @return emailDefaultUserName
     */
    public ConfigNodePropertyString getEmailDefaultUserName() {
        return emailDefaultUserName;
    }

    public void setEmailDefaultUserName(ConfigNodePropertyString emailDefaultUserName) {
        this.emailDefaultUserName = emailDefaultUserName;
    }

    /**
     * Get emailTemplatesRootPath
     * @return emailTemplatesRootPath
     */
    public ConfigNodePropertyString getEmailTemplatesRootPath() {
        return emailTemplatesRootPath;
    }

    public void setEmailTemplatesRootPath(ConfigNodePropertyString emailTemplatesRootPath) {
        this.emailTemplatesRootPath = emailTemplatesRootPath;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

