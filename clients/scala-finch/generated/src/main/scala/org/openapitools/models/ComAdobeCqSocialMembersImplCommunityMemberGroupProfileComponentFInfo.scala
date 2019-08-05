package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties]
                )

object ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo] = deriveEncoder
}
