package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param granitePeriodinfocollectorPeriodincludeThreadDumps 
 * @param granitePeriodinfocollectorPeriodincludeHeapDump 
 */
case class ComAdobeGraniteInfocollectorInfoCollectorProperties(granitePeriodinfocollectorPeriodincludeThreadDumps: Option[ConfigNodePropertyBoolean],
                granitePeriodinfocollectorPeriodincludeHeapDump: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteInfocollectorInfoCollectorProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteInfocollectorInfoCollectorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteInfocollectorInfoCollectorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteInfocollectorInfoCollectorProperties] = deriveEncoder
}
