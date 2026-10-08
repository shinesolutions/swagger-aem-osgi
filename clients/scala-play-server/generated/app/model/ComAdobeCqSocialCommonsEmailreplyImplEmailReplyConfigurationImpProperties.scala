package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(
  emailName: Option[ConfigNodePropertyString],
  emailCreatePostFromReply: Option[ConfigNodePropertyBoolean],
  emailAddCommentIdTo: Option[ConfigNodePropertyDropDown],
  emailSubjectMaximumLength: Option[ConfigNodePropertyInteger],
  emailReplyToAddress: Option[ConfigNodePropertyString],
  emailReplyToDelimiter: Option[ConfigNodePropertyString],
  emailTrackerIdPrefixInSubject: Option[ConfigNodePropertyString],
  emailTrackerIdPrefixInBody: Option[ConfigNodePropertyString],
  emailAsHTML: Option[ConfigNodePropertyBoolean],
  emailDefaultUserName: Option[ConfigNodePropertyString],
  emailTemplatesRootPath: Option[ConfigNodePropertyString]
)

object ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {
  implicit lazy val comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesJsonFormat: Format[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties] = Json.format[ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties]
}

