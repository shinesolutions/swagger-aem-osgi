package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties]
                )

object ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo] = deriveEncoder
}
