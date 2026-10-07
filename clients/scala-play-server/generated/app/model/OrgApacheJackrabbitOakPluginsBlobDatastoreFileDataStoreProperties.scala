package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties(
  path: Option[ConfigNodePropertyString]
)

object OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties {
  implicit lazy val orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesJsonFormat: Format[OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties] = Json.format[OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties]
}

