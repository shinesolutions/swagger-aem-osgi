package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqJcrclustersupportClusterStartLevelControllerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqJcrclustersupportClusterStartLevelControllerProperties(
  clusterLevelEnable: Option[ConfigNodePropertyBoolean],
  clusterMasterLevel: Option[ConfigNodePropertyInteger],
  clusterSlaveLevel: Option[ConfigNodePropertyInteger]
)

object ComDayCqJcrclustersupportClusterStartLevelControllerProperties {
  implicit lazy val comDayCqJcrclustersupportClusterStartLevelControllerPropertiesJsonFormat: Format[ComDayCqJcrclustersupportClusterStartLevelControllerProperties] = Json.format[ComDayCqJcrclustersupportClusterStartLevelControllerProperties]
}

