package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties]
)

object ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo {
  implicit lazy val comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoJsonFormat: Format[ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo] = Json.format[ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo]
}

