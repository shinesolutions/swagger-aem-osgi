package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties]
                )

object ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo] = deriveEncoder
}
