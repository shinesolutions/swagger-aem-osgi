package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties]
                )

object ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo {
    /**
     * Creates the codec for converting ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo] = deriveEncoder
}
