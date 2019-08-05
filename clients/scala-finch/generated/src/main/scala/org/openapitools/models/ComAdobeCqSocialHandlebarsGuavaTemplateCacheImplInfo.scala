package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo] = deriveEncoder
}
