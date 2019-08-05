package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param aggregatePeriodrelationships 
 * @param aggregatePerioddescendPeriodvirtual 
 */
case class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties(aggregatePeriodrelationships: Option[ConfigNodePropertyArray],
                aggregatePerioddescendPeriodvirtual: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties] = deriveEncoder
}
