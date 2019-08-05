package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param Flush agents 
 */
case class ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties(Flush agents: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties {
    /**
     * Creates the codec for converting ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties] = deriveEncoder
}
