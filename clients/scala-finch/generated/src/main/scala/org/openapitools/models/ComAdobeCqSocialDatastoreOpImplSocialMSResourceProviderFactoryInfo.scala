package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties]
                )

object ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo] = deriveEncoder
}
