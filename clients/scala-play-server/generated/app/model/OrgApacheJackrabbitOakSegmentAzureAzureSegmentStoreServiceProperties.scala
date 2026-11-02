package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(
  accountName: Option[ConfigNodePropertyString],
  containerName: Option[ConfigNodePropertyString],
  accessKey: Option[ConfigNodePropertyString],
  rootPath: Option[ConfigNodePropertyString],
  connectionURL: Option[ConfigNodePropertyString]
)

object OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties {
  implicit lazy val orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesJsonFormat: Format[OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties] = Json.format[OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties]
}

