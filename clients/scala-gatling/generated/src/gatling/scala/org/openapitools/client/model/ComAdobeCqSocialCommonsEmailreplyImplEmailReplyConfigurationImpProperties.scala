
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties (
    _emailName: Option[ConfigNodePropertyString],
    _emailCreatePostFromReply: Option[ConfigNodePropertyBoolean],
    _emailAddCommentIdTo: Option[ConfigNodePropertyDropDown],
    _emailSubjectMaximumLength: Option[ConfigNodePropertyInteger],
    _emailReplyToAddress: Option[ConfigNodePropertyString],
    _emailReplyToDelimiter: Option[ConfigNodePropertyString],
    _emailTrackerIdPrefixInSubject: Option[ConfigNodePropertyString],
    _emailTrackerIdPrefixInBody: Option[ConfigNodePropertyString],
    _emailAsHTML: Option[ConfigNodePropertyBoolean],
    _emailDefaultUserName: Option[ConfigNodePropertyString],
    _emailTemplatesRootPath: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {
    def toStringBody(var_emailName: Object, var_emailCreatePostFromReply: Object, var_emailAddCommentIdTo: Object, var_emailSubjectMaximumLength: Object, var_emailReplyToAddress: Object, var_emailReplyToDelimiter: Object, var_emailTrackerIdPrefixInSubject: Object, var_emailTrackerIdPrefixInBody: Object, var_emailAsHTML: Object, var_emailDefaultUserName: Object, var_emailTemplatesRootPath: Object) =
        s"""
        | {
        | "emailName":$var_emailName,"emailCreatePostFromReply":$var_emailCreatePostFromReply,"emailAddCommentIdTo":$var_emailAddCommentIdTo,"emailSubjectMaximumLength":$var_emailSubjectMaximumLength,"emailReplyToAddress":$var_emailReplyToAddress,"emailReplyToDelimiter":$var_emailReplyToDelimiter,"emailTrackerIdPrefixInSubject":$var_emailTrackerIdPrefixInSubject,"emailTrackerIdPrefixInBody":$var_emailTrackerIdPrefixInBody,"emailAsHTML":$var_emailAsHTML,"emailDefaultUserName":$var_emailDefaultUserName,"emailTemplatesRootPath":$var_emailTemplatesRootPath
        | }
        """.stripMargin
}
