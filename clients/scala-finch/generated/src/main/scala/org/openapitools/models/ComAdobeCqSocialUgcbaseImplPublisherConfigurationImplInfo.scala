package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties]
                )

object ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo] = deriveEncoder
}
