package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties]
)

object ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo {
  implicit lazy val comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoJsonFormat: Format[ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo] = Json.format[ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo]
}

