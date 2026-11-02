package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(
  enabled: Option[ConfigNodePropertyBoolean],
  agentName: Option[ConfigNodePropertyString],
  diffPath: Option[ConfigNodePropertyString],
  observedPath: Option[ConfigNodePropertyString],
  serviceName: Option[ConfigNodePropertyString],
  propertyNames: Option[ConfigNodePropertyString],
  distributionDelay: Option[ConfigNodePropertyInteger],
  serviceUserTarget: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties {
  implicit lazy val comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesJsonFormat: Format[ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties] = Json.format[ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties]
}

