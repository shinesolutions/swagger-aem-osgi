package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties]
                )

object ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo] = deriveEncoder
}
