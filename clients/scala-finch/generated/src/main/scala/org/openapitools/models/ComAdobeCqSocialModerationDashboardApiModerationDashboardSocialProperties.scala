package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param priority 
 */
case class ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties(priority: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties] = deriveEncoder
}
