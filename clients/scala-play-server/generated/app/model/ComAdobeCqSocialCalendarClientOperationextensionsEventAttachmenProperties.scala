package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties(
  attachmentTypeBlacklist: Option[ConfigNodePropertyString],
  extensionOrder: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties {
  implicit lazy val comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesJsonFormat: Format[ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties] = Json.format[ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties]
}

