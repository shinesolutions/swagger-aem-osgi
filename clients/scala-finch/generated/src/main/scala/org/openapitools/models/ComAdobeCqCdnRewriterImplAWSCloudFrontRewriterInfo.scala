package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties]
                )

object ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo {
    /**
     * Creates the codec for converting ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo] = deriveEncoder
}
