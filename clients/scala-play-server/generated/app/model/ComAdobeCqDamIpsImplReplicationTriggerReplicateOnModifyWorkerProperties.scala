package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties(
  dmreplicateonmodifyEnabled: Option[ConfigNodePropertyBoolean],
  dmreplicateonmodifyForcesyncdeletes: Option[ConfigNodePropertyBoolean]
)

object ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties {
  implicit lazy val comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesJsonFormat: Format[ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties] = Json.format[ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties]
}

