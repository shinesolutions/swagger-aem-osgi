package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties]
                )

object ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo] = deriveEncoder
}
