package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param featurePeriodname 
 * @param featurePerioddescription 
 * @param httpPeriodheaderPeriodname 
 * @param httpPeriodheaderPeriodvaluepattern 
 */
case class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties(featurePeriodname: Option[ConfigNodePropertyString],
                featurePerioddescription: Option[ConfigNodePropertyString],
                httpPeriodheaderPeriodname: Option[ConfigNodePropertyString],
                httpPeriodheaderPeriodvaluepattern: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties] = deriveEncoder
}
