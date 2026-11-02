package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialSyncImplDiffChangesObserverProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialSyncImplDiffChangesObserverProperties(
  enabled: Option[ConfigNodePropertyBoolean],
  agentName: Option[ConfigNodePropertyString],
  diffPath: Option[ConfigNodePropertyString],
  propertyNames: Option[ConfigNodePropertyString]
)

object ComAdobeCqSocialSyncImplDiffChangesObserverProperties {
  implicit lazy val comAdobeCqSocialSyncImplDiffChangesObserverPropertiesJsonFormat: Format[ComAdobeCqSocialSyncImplDiffChangesObserverProperties] = Json.format[ComAdobeCqSocialSyncImplDiffChangesObserverProperties]
}

