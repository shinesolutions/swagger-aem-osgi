/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OAS-api/OAS-codegen.git
 * Do not edit the class manually.
 */

/**
 * OASComAdobeCqSocialCommonsEmailreply
 */
public class OASComAdobeCqSocialCommonsEmailreply implements OAS.MappedProperties {
    /**
     * Get emailName
     * @return emailName
     */
    public OASConfigNodePropertyString emailName { get; set; }

    /**
     * Get emailCreatePostFromReply
     * @return emailCreatePostFromReply
     */
    public OASConfigNodePropertyBoolean emailCreatePostFromReply { get; set; }

    /**
     * Get emailAddCommentIdTo
     * @return emailAddCommentIdTo
     */
    public OASConfigNodePropertyDropDown emailAddCommentIdTo { get; set; }

    /**
     * Get emailSubjectMaximumLength
     * @return emailSubjectMaximumLength
     */
    public OASConfigNodePropertyInteger emailSubjectMaximumLength { get; set; }

    /**
     * Get emailReplyToAddress
     * @return emailReplyToAddress
     */
    public OASConfigNodePropertyString emailReplyToAddress { get; set; }

    /**
     * Get emailReplyToDelimiter
     * @return emailReplyToDelimiter
     */
    public OASConfigNodePropertyString emailReplyToDelimiter { get; set; }

    /**
     * Get emailTrackerIdPrefixInSubject
     * @return emailTrackerIdPrefixInSubject
     */
    public OASConfigNodePropertyString emailTrackerIdPrefixInSubject { get; set; }

    /**
     * Get emailTrackerIdPrefixInBody
     * @return emailTrackerIdPrefixInBody
     */
    public OASConfigNodePropertyString emailTrackerIdPrefixInBody { get; set; }

    /**
     * Get emailAsHTML
     * @return emailAsHTML
     */
    public OASConfigNodePropertyBoolean emailAsHTML { get; set; }

    /**
     * Get emailDefaultUserName
     * @return emailDefaultUserName
     */
    public OASConfigNodePropertyString emailDefaultUserName { get; set; }

    /**
     * Get emailTemplatesRootPath
     * @return emailTemplatesRootPath
     */
    public OASConfigNodePropertyString emailTemplatesRootPath { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'email.name' => 'emailName',
        'email.createPostFromReply' => 'emailCreatePostFromReply',
        'email.addCommentIdTo' => 'emailAddCommentIdTo',
        'email.subjectMaximumLength' => 'emailSubjectMaximumLength',
        'email.replyToAddress' => 'emailReplyToAddress',
        'email.replyToDelimiter' => 'emailReplyToDelimiter',
        'email.trackerIdPrefixInSubject' => 'emailTrackerIdPrefixInSubject',
        'email.trackerIdPrefixInBody' => 'emailTrackerIdPrefixInBody',
        'email.asHTML' => 'emailAsHTML',
        'email.defaultUserName' => 'emailDefaultUserName',
        'email.templates.rootPath' => 'emailTemplatesRootPath'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeCqSocialCommonsEmailreply getExample() {
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties = new OASComAdobeCqSocialCommonsEmailreply();
          comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailName = OASConfigNodePropertyString.getExample();
          comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailCreatePostFromReply = OASConfigNodePropertyBoolean.getExample();
          comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailAddCommentIdTo = OASConfigNodePropertyDropDown.getExample();
          comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailSubjectMaximumLength = OASConfigNodePropertyInteger.getExample();
          comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailReplyToAddress = OASConfigNodePropertyString.getExample();
          comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailReplyToDelimiter = OASConfigNodePropertyString.getExample();
          comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTrackerIdPrefixInSubject = OASConfigNodePropertyString.getExample();
          comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTrackerIdPrefixInBody = OASConfigNodePropertyString.getExample();
          comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailAsHTML = OASConfigNodePropertyBoolean.getExample();
          comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailDefaultUserName = OASConfigNodePropertyString.getExample();
          comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTemplatesRootPath = OASConfigNodePropertyString.getExample();
        return comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeCqSocialCommonsEmailreply) {           
            OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties = (OASComAdobeCqSocialCommonsEmailreply) obj;
            return this.emailName == comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailName
                && this.emailCreatePostFromReply == comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailCreatePostFromReply
                && this.emailAddCommentIdTo == comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailAddCommentIdTo
                && this.emailSubjectMaximumLength == comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailSubjectMaximumLength
                && this.emailReplyToAddress == comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailReplyToAddress
                && this.emailReplyToDelimiter == comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailReplyToDelimiter
                && this.emailTrackerIdPrefixInSubject == comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTrackerIdPrefixInSubject
                && this.emailTrackerIdPrefixInBody == comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTrackerIdPrefixInBody
                && this.emailAsHTML == comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailAsHTML
                && this.emailDefaultUserName == comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailDefaultUserName
                && this.emailTemplatesRootPath == comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.emailTemplatesRootPath;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (emailName == null ? 0 : System.hashCode(emailName));
        hashCode = (17 * hashCode) + (emailCreatePostFromReply == null ? 0 : System.hashCode(emailCreatePostFromReply));
        hashCode = (17 * hashCode) + (emailAddCommentIdTo == null ? 0 : System.hashCode(emailAddCommentIdTo));
        hashCode = (17 * hashCode) + (emailSubjectMaximumLength == null ? 0 : System.hashCode(emailSubjectMaximumLength));
        hashCode = (17 * hashCode) + (emailReplyToAddress == null ? 0 : System.hashCode(emailReplyToAddress));
        hashCode = (17 * hashCode) + (emailReplyToDelimiter == null ? 0 : System.hashCode(emailReplyToDelimiter));
        hashCode = (17 * hashCode) + (emailTrackerIdPrefixInSubject == null ? 0 : System.hashCode(emailTrackerIdPrefixInSubject));
        hashCode = (17 * hashCode) + (emailTrackerIdPrefixInBody == null ? 0 : System.hashCode(emailTrackerIdPrefixInBody));
        hashCode = (17 * hashCode) + (emailAsHTML == null ? 0 : System.hashCode(emailAsHTML));
        hashCode = (17 * hashCode) + (emailDefaultUserName == null ? 0 : System.hashCode(emailDefaultUserName));
        hashCode = (17 * hashCode) + (emailTemplatesRootPath == null ? 0 : System.hashCode(emailTemplatesRootPath));
        return hashCode;
    }
}
