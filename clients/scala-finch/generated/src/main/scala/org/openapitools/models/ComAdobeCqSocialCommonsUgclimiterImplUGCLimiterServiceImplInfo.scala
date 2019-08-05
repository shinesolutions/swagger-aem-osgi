package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties]
                )

object ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo] = deriveEncoder
}
