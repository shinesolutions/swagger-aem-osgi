package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(
  graniteMaintenanceMandatory: Option[ConfigNodePropertyBoolean],
  jobTopics: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties {
  implicit lazy val comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesJsonFormat: Format[ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties] = Json.format[ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties]
}

