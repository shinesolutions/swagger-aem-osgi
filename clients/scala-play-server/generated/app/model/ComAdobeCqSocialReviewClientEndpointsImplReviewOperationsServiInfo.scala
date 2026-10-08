package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties]
)

object ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo {
  implicit lazy val comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoJsonFormat: Format[ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo] = Json.format[ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo]
}

