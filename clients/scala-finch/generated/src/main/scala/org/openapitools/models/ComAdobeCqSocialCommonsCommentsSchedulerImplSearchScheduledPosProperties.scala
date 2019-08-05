package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param enableScheduledPostsSearch 
 * @param numberOfMinutes 
 * @param maxSearchLimit 
 */
case class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties(enableScheduledPostsSearch: Option[ConfigNodePropertyBoolean],
                numberOfMinutes: Option[ConfigNodePropertyInteger],
                maxSearchLimit: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties] = deriveEncoder
}
