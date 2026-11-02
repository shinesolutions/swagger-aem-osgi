package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqDamS7imagingImplIsImageServerComponentProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(
  tcpPort: Option[ConfigNodePropertyString],
  allowRemoteAccess: Option[ConfigNodePropertyBoolean],
  maxRenderRgnPixels: Option[ConfigNodePropertyString],
  maxMessageSize: Option[ConfigNodePropertyString],
  randomAccessUrlTimeout: Option[ConfigNodePropertyInteger],
  workerThreads: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqDamS7imagingImplIsImageServerComponentProperties {
  implicit lazy val comAdobeCqDamS7imagingImplIsImageServerComponentPropertiesJsonFormat: Format[ComAdobeCqDamS7imagingImplIsImageServerComponentProperties] = Json.format[ComAdobeCqDamS7imagingImplIsImageServerComponentProperties]
}

