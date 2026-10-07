package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties(
  enableScheduledPostsSearch: Option[ConfigNodePropertyBoolean],
  numberOfMinutes: Option[ConfigNodePropertyInteger],
  maxSearchLimit: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties {
  implicit lazy val comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesJsonFormat: Format[ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties] = Json.format[ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties]
}

