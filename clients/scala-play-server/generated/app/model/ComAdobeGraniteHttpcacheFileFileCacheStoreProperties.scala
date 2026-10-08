package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteHttpcacheFileFileCacheStoreProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties(
  comAdobeGraniteHttpcacheFileDocumentRoot: Option[ConfigNodePropertyString],
  comAdobeGraniteHttpcacheFileIncludeHost: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {
  implicit lazy val comAdobeGraniteHttpcacheFileFileCacheStorePropertiesJsonFormat: Format[ComAdobeGraniteHttpcacheFileFileCacheStoreProperties] = Json.format[ComAdobeGraniteHttpcacheFileFileCacheStoreProperties]
}

