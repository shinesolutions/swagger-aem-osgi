package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param brightedgePeriodurl 
 */
case class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties(brightedgePeriodurl: Option[ConfigNodePropertyString]
                )

object ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties {
    /**
     * Creates the codec for converting ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties] = deriveEncoder
}
