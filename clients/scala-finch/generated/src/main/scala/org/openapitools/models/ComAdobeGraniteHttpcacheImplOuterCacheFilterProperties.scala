package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param comPeriodadobePeriodgranitePeriodhttpcachePeriodurlPeriodpaths 
 */
case class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties(comPeriodadobePeriodgranitePeriodhttpcachePeriodurlPeriodpaths: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties] = deriveEncoder
}
