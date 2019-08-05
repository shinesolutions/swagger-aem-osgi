package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodservletPeriodselectors 
 * @param slingPeriodservletPeriodextensions 
 */
case class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties(slingPeriodservletPeriodselectors: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodextensions: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties] = deriveEncoder
}
