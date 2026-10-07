package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties(
  schedulerExpression: Option[ConfigNodePropertyString],
  schedulerConcurrent: Option[ConfigNodePropertyBoolean],
  chunkCleanupAge: Option[ConfigNodePropertyInteger]
)

object OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {
  implicit lazy val orgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesJsonFormat: Format[OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties] = Json.format[OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties]
}

