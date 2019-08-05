package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties]
                )

object ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo] = deriveEncoder
}
