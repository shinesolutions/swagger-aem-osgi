package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param jobPeriodtopics 
 * @param serviceUserPeriodtarget 
 * @param agentProviderPeriodtarget 
 */
case class ComDayCqReplicationImplAgentManagerImplProperties(jobPeriodtopics: Option[ConfigNodePropertyString],
                serviceUserPeriodtarget: Option[ConfigNodePropertyString],
                agentProviderPeriodtarget: Option[ConfigNodePropertyString]
                )

object ComDayCqReplicationImplAgentManagerImplProperties {
    /**
     * Creates the codec for converting ComDayCqReplicationImplAgentManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplAgentManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplAgentManagerImplProperties] = deriveEncoder
}
