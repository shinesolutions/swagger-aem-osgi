package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePerioddocumentRoot 
 * @param comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePeriodincludeHost 
 */
case class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties(comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePerioddocumentRoot: Option[ConfigNodePropertyString],
                comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePeriodincludeHost: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteHttpcacheFileFileCacheStoreProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteHttpcacheFileFileCacheStoreProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteHttpcacheFileFileCacheStoreProperties] = deriveEncoder
}
