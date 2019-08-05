package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties]
                )

object ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo] = deriveEncoder
}
