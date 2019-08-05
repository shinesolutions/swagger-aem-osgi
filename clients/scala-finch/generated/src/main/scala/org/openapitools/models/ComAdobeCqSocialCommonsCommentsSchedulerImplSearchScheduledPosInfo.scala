package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties]
                )

object ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo] = deriveEncoder
}
