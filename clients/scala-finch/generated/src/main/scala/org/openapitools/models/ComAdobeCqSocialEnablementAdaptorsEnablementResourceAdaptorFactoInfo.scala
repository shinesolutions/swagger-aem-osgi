package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties]
                )

object ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo] = deriveEncoder
}
