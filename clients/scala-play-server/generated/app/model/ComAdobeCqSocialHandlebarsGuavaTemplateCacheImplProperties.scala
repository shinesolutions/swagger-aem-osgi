package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(
  parameterGuavaCacheEnabled: Option[ConfigNodePropertyBoolean],
  parameterGuavaCacheParams: Option[ConfigNodePropertyString],
  parameterGuavaCacheReload: Option[ConfigNodePropertyBoolean],
  serviceRanking: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties {
  implicit lazy val comAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesJsonFormat: Format[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties] = Json.format[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties]
}

