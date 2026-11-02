package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOffloadingImplOffloadingJobClonerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(
  offloadingJobclonerEnabled: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {
  implicit lazy val comAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesJsonFormat: Format[ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties] = Json.format[ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties]
}

