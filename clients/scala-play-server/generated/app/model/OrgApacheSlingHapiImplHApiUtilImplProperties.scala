package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingHapiImplHApiUtilImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingHapiImplHApiUtilImplProperties(
  orgApacheSlingHapiToolsResourcetype: Option[ConfigNodePropertyString],
  orgApacheSlingHapiToolsCollectionresourcetype: Option[ConfigNodePropertyString],
  orgApacheSlingHapiToolsSearchpaths: Option[ConfigNodePropertyArray],
  orgApacheSlingHapiToolsExternalurl: Option[ConfigNodePropertyString],
  orgApacheSlingHapiToolsEnabled: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingHapiImplHApiUtilImplProperties {
  implicit lazy val orgApacheSlingHapiImplHApiUtilImplPropertiesJsonFormat: Format[OrgApacheSlingHapiImplHApiUtilImplProperties] = Json.format[OrgApacheSlingHapiImplHApiUtilImplProperties]
}

