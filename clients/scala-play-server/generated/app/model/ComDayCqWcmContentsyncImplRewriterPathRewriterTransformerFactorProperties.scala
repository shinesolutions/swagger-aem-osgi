package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties(
  cqContentsyncPathrewritertransformerMappingLinks: Option[ConfigNodePropertyArray],
  cqContentsyncPathrewritertransformerMappingClientlibs: Option[ConfigNodePropertyArray],
  cqContentsyncPathrewritertransformerMappingImages: Option[ConfigNodePropertyArray],
  cqContentsyncPathrewritertransformerAttributePattern: Option[ConfigNodePropertyString],
  cqContentsyncPathrewritertransformerClientlibraryPattern: Option[ConfigNodePropertyString],
  cqContentsyncPathrewritertransformerClientlibraryReplace: Option[ConfigNodePropertyString]
)

object ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties {
  implicit lazy val comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesJsonFormat: Format[ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties] = Json.format[ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties]
}

