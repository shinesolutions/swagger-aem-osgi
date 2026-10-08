package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties]
)

object ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo {
  implicit lazy val comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoJsonFormat: Format[ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo] = Json.format[ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo]
}

