package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqSearchImplBuilderQueryBuilderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqSearchImplBuilderQueryBuilderImplProperties(
  excerptProperties: Option[ConfigNodePropertyArray],
  cacheMaxEntries: Option[ConfigNodePropertyInteger],
  cacheEntryLifetime: Option[ConfigNodePropertyInteger],
  xpathUnion: Option[ConfigNodePropertyBoolean]
)

object ComDayCqSearchImplBuilderQueryBuilderImplProperties {
  implicit lazy val comDayCqSearchImplBuilderQueryBuilderImplPropertiesJsonFormat: Format[ComDayCqSearchImplBuilderQueryBuilderImplProperties] = Json.format[ComDayCqSearchImplBuilderQueryBuilderImplProperties]
}

