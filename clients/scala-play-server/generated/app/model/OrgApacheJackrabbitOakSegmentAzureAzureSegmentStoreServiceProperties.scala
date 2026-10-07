package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

