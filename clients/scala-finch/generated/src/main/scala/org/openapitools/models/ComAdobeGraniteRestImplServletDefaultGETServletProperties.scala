package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param defaultPeriodlimit 
 * @param usePeriodabsolutePerioduri 
 */
case class ComAdobeGraniteRestImplServletDefaultGETServletProperties(defaultPeriodlimit: Option[ConfigNodePropertyInteger],
                usePeriodabsolutePerioduri: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteRestImplServletDefaultGETServletProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteRestImplServletDefaultGETServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRestImplServletDefaultGETServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRestImplServletDefaultGETServletProperties] = deriveEncoder
}
