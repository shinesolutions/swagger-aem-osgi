package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties]
                )

object ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo] = deriveEncoder
}
