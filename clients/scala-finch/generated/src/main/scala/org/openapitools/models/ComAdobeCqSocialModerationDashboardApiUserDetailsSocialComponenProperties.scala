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
case class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties(priority: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties] = deriveEncoder
}
