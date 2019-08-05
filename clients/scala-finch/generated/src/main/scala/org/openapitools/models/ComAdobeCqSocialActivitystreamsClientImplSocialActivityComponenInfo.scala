package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties]
                )

object ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo] = deriveEncoder
}
