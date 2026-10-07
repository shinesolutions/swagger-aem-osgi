package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties(
  eventTopics: Option[ConfigNodePropertyString],
  eventFilter: Option[ConfigNodePropertyString],
  verbs: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties {
  implicit lazy val comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesJsonFormat: Format[ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties] = Json.format[ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties]
}

