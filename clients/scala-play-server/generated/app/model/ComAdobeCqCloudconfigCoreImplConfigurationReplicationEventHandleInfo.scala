package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties]
)

object ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo {
  implicit lazy val comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoJsonFormat: Format[ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo] = Json.format[ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo]
}

