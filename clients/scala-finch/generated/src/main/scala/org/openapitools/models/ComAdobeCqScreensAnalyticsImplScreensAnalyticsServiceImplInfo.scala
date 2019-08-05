package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties]
                )

object ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo] = deriveEncoder
}
