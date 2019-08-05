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
case class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties(resourceTypePeriodfilters: Option[ConfigNodePropertyArray],
                priority: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties] = deriveEncoder
}
