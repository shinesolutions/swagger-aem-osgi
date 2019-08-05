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
case class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties(fieldWhitelist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties] = deriveEncoder
}
