package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialScoringImplScoringEventListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialScoringImplScoringEventListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialScoringImplScoringEventListenerProperties]
                )

object ComAdobeCqSocialScoringImplScoringEventListenerInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialScoringImplScoringEventListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialScoringImplScoringEventListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialScoringImplScoringEventListenerInfo] = deriveEncoder
}
