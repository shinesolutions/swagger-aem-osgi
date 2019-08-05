package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties]
                )

object ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo {
    /**
     * Creates the codec for converting ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo] = deriveEncoder
}
