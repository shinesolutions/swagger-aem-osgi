package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties]
                )

object ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo] = deriveEncoder
}
