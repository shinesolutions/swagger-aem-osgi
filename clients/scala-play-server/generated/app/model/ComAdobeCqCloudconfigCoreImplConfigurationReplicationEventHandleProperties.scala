package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties(
  flushAgents: Option[ConfigNodePropertyArray]
)

object ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties {
  implicit lazy val comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesJsonFormat: Format[ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties] = Json.format[ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties]
}

