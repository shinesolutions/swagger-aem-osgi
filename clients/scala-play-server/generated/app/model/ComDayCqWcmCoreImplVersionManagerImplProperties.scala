package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmCoreImplVersionManagerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmCoreImplVersionManagerImplProperties(
  versionmanagerCreateVersionOnActivation: Option[ConfigNodePropertyBoolean],
  versionmanagerPurgingEnabled: Option[ConfigNodePropertyBoolean],
  versionmanagerPurgePaths: Option[ConfigNodePropertyArray],
  versionmanagerIvPaths: Option[ConfigNodePropertyArray],
  versionmanagerMaxAgeDays: Option[ConfigNodePropertyInteger],
  versionmanagerMaxNumberVersions: Option[ConfigNodePropertyInteger],
  versionmanagerMinNumberVersions: Option[ConfigNodePropertyInteger]
)

object ComDayCqWcmCoreImplVersionManagerImplProperties {
  implicit lazy val comDayCqWcmCoreImplVersionManagerImplPropertiesJsonFormat: Format[ComDayCqWcmCoreImplVersionManagerImplProperties] = Json.format[ComDayCqWcmCoreImplVersionManagerImplProperties]
}

