package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(
  enable: Option[ConfigNodePropertyBoolean],
  uGCLimit: Option[ConfigNodePropertyInteger],
  ugcLimitDuration: Option[ConfigNodePropertyInteger],
  domains: Option[ConfigNodePropertyArray],
  toList: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {
  implicit lazy val comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesJsonFormat: Format[ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties] = Json.format[ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties]
}

