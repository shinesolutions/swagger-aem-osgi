package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmCoreImplVersionPurgeTaskProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmCoreImplVersionPurgeTaskProperties(
  versionpurgePaths: Option[ConfigNodePropertyArray],
  versionpurgeRecursive: Option[ConfigNodePropertyBoolean],
  versionpurgeMaxVersions: Option[ConfigNodePropertyInteger],
  versionpurgeMinVersions: Option[ConfigNodePropertyInteger],
  versionpurgeMaxAgeDays: Option[ConfigNodePropertyInteger]
)

object ComDayCqWcmCoreImplVersionPurgeTaskProperties {
  implicit lazy val comDayCqWcmCoreImplVersionPurgeTaskPropertiesJsonFormat: Format[ComDayCqWcmCoreImplVersionPurgeTaskProperties] = Json.format[ComDayCqWcmCoreImplVersionPurgeTaskProperties]
}

