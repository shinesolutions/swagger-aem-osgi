package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties]
                )

object ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo] = deriveEncoder
}
