package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties(
  priority: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties {
  implicit lazy val comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesJsonFormat: Format[ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties] = Json.format[ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties]
}

