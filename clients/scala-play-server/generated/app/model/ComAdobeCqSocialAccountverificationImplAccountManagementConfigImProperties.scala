package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(
  enable: Option[ConfigNodePropertyBoolean],
  ttl1: Option[ConfigNodePropertyInteger],
  ttl2: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {
  implicit lazy val comAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesJsonFormat: Format[ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties] = Json.format[ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties]
}

