package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties]
                )

object ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo] = deriveEncoder
}
