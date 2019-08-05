package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties]
                )

object ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo {
    /**
     * Creates the codec for converting ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo] = deriveEncoder
}
