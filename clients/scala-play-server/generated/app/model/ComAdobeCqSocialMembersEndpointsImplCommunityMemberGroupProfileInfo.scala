package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties]
)

object ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo {
  implicit lazy val comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoJsonFormat: Format[ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo] = Json.format[ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo]
}

