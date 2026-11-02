package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(
  preserveHierarchyNodes: Option[ConfigNodePropertyBoolean],
  ignoreVersioning: Option[ConfigNodePropertyBoolean],
  importAcl: Option[ConfigNodePropertyBoolean],
  saveThreshold: Option[ConfigNodePropertyInteger],
  preserveUserPaths: Option[ConfigNodePropertyBoolean],
  preserveUuid: Option[ConfigNodePropertyBoolean],
  preserveUuidNodetypes: Option[ConfigNodePropertyArray],
  preserveUuidSubtrees: Option[ConfigNodePropertyArray],
  autoCommit: Option[ConfigNodePropertyBoolean]
)

object ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {
  implicit lazy val comDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesJsonFormat: Format[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties] = Json.format[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties]
}

