package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties]
                )

object ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo] = deriveEncoder
}
