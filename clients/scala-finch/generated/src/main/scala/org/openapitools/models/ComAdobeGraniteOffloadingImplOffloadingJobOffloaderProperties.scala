package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param offloadingPeriodoffloaderPeriodenabled 
 */
case class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties(offloadingPeriodoffloaderPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties] = deriveEncoder
}
