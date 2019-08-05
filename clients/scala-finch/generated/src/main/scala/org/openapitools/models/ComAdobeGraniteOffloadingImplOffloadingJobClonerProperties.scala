package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param offloadingPeriodjobclonerPeriodenabled 
 */
case class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(offloadingPeriodjobclonerPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties] = deriveEncoder
}
