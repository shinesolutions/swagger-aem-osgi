package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties]
                )

object ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo] = deriveEncoder
}
