package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties(
  priorityOrder: Option[ConfigNodePropertyInteger],
  replyEmailPatterns: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties {
  implicit lazy val comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesJsonFormat: Format[ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties] = Json.format[ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties]
}

