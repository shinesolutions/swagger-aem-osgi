package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialGroupImplGroupServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialGroupImplGroupServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialGroupImplGroupServiceImplProperties]
                )

object ComAdobeCqSocialGroupImplGroupServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialGroupImplGroupServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialGroupImplGroupServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialGroupImplGroupServiceImplInfo] = deriveEncoder
}
