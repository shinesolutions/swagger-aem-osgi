package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param numberPeriodofPeriodretriesPeriodallowed 
 * @param hcPeriodtags 
 */
case class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties(numberPeriodofPeriodretriesPeriodallowed: Option[ConfigNodePropertyInteger],
                hcPeriodtags: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties] = deriveEncoder
}
