package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param featurePeriodname 
 * @param featurePerioddescription 
 * @param activePeriodpercentage 
 * @param cookiePeriodname 
 * @param cookiePeriodmaxAge 
 */
case class ComAdobeGraniteFragsImplRandomFeatureProperties(featurePeriodname: Option[ConfigNodePropertyString],
                featurePerioddescription: Option[ConfigNodePropertyString],
                activePeriodpercentage: Option[ConfigNodePropertyString],
                cookiePeriodname: Option[ConfigNodePropertyString],
                cookiePeriodmaxAge: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteFragsImplRandomFeatureProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteFragsImplRandomFeatureProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteFragsImplRandomFeatureProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteFragsImplRandomFeatureProperties] = deriveEncoder
}
