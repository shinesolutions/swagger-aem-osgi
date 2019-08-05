package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties]
                )

object ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo {
    /**
     * Creates the codec for converting ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo] = deriveEncoder
}
