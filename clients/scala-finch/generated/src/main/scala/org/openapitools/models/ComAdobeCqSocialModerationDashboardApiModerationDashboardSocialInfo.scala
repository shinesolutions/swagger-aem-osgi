package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties]
                )

object ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo] = deriveEncoder
}
