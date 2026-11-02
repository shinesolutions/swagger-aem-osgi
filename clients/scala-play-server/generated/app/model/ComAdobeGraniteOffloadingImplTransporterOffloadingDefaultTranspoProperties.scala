package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(
  defaultTransportAgentToWorkerPrefix: Option[ConfigNodePropertyString],
  defaultTransportAgentToMasterPrefix: Option[ConfigNodePropertyString],
  defaultTransportInputPackage: Option[ConfigNodePropertyString],
  defaultTransportOutputPackage: Option[ConfigNodePropertyString],
  defaultTransportReplicationSynchronous: Option[ConfigNodePropertyBoolean],
  defaultTransportContentpackage: Option[ConfigNodePropertyBoolean],
  offloadingTransporterDefaultEnabled: Option[ConfigNodePropertyBoolean]
)

object ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties {
  implicit lazy val comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesJsonFormat: Format[ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties] = Json.format[ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties]
}

