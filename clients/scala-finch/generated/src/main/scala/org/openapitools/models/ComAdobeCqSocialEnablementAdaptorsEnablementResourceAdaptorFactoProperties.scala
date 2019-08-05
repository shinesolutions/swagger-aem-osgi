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
case class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties(isMemberCheck: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties] = deriveEncoder
}
