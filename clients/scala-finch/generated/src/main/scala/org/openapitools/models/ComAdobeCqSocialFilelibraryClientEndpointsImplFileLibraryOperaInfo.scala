package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties]
                )

object ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo] = deriveEncoder
}
