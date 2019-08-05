package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param comPeriodadobePeriodgranitePeriodcontexthubPeriodsilentUnderscoremode 
 * @param comPeriodadobePeriodgranitePeriodcontexthubPeriodshowUnderscoreui 
 */
case class ComAdobeGraniteContexthubImplContextHubImplProperties(comPeriodadobePeriodgranitePeriodcontexthubPeriodsilentUnderscoremode: Option[ConfigNodePropertyBoolean],
                comPeriodadobePeriodgranitePeriodcontexthubPeriodshowUnderscoreui: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteContexthubImplContextHubImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteContexthubImplContextHubImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteContexthubImplContextHubImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteContexthubImplContextHubImplProperties] = deriveEncoder
}
