package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param additionalProperties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo {
    /**
     * Creates the codec for converting ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo] = deriveEncoder
}
