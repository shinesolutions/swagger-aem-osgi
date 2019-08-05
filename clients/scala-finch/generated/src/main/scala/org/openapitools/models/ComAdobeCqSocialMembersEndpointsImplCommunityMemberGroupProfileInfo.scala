package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties]
                )

object ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo] = deriveEncoder
}
