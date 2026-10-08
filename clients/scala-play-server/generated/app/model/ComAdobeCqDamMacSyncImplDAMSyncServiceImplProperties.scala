package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(
  comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths: Option[ConfigNodePropertyArray],
  comAdobeCqDamMacSyncDamsyncserviceSyncRenditions: Option[ConfigNodePropertyBoolean],
  comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs: Option[ConfigNodePropertyInteger],
  comAdobeCqDamMacSyncDamsyncservicePlatform: Option[ConfigNodePropertyDropDown]
)

object ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties {
  implicit lazy val comAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesJsonFormat: Format[ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties] = Json.format[ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties]
}

