package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param fieldWhitelist 
 */
case class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties(fieldWhitelist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties] = deriveEncoder
}
