package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param isMemberCheck 
 */
case class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties(isMemberCheck: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties] = deriveEncoder
}
