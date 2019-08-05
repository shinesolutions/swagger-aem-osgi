package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialSyncImplUserSyncListenerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialSyncImplUserSyncListenerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialSyncImplUserSyncListenerImplProperties]
                )

object ComAdobeCqSocialSyncImplUserSyncListenerImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialSyncImplUserSyncListenerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSyncImplUserSyncListenerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSyncImplUserSyncListenerImplInfo] = deriveEncoder
}
