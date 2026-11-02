package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties(
  everyoneLimit: Option[ConfigNodePropertyInteger],
  priority: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties {
  implicit lazy val comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesJsonFormat: Format[ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties] = Json.format[ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties]
}

