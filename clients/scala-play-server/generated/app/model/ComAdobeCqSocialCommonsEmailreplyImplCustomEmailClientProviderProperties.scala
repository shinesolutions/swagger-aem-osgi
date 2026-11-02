package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties(
  priorityOrder: Option[ConfigNodePropertyInteger],
  replyEmailPatterns: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties {
  implicit lazy val comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPropertiesJsonFormat: Format[ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties] = Json.format[ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties]
}

