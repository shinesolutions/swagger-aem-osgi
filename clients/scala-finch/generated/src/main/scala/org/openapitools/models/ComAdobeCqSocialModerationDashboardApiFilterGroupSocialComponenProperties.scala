package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param resourceTypePeriodfilters 
 * @param priority 
 */
case class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties(resourceTypePeriodfilters: Option[ConfigNodePropertyArray],
                priority: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties] = deriveEncoder
}
