package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param liverelationshipmgrPeriodrelationsconfigPerioddefault 
 */
case class ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties(liverelationshipmgrPeriodrelationsconfigPerioddefault: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties] = deriveEncoder
}
