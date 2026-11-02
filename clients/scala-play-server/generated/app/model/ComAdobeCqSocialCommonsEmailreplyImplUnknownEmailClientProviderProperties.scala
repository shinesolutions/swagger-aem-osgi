package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties(
  replyEmailPatterns: Option[ConfigNodePropertyArray],
  priorityOrder: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties {
  implicit lazy val comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesJsonFormat: Format[ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties] = Json.format[ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties]
}

