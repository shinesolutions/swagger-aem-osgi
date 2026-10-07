package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties(
  operation: Option[ConfigNodePropertyString],
  operationIcon: Option[ConfigNodePropertyString],
  topicName: Option[ConfigNodePropertyString],
  emailEnabled: Option[ConfigNodePropertyBoolean]
)

object ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
  implicit lazy val comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesJsonFormat: Format[ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties] = Json.format[ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties]
}

