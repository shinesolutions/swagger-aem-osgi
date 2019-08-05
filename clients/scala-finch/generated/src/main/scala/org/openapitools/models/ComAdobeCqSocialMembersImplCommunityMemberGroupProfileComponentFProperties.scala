package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param everyoneLimit 
 * @param priority 
 */
case class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties(everyoneLimit: Option[ConfigNodePropertyInteger],
                priority: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties] = deriveEncoder
}
