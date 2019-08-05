package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties]
                )

object ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo] = deriveEncoder
}
