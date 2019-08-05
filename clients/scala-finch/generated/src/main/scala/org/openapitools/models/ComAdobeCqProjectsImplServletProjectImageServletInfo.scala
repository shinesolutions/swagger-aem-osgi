package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqProjectsImplServletProjectImageServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqProjectsImplServletProjectImageServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqProjectsImplServletProjectImageServletProperties]
                )

object ComAdobeCqProjectsImplServletProjectImageServletInfo {
    /**
     * Creates the codec for converting ComAdobeCqProjectsImplServletProjectImageServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqProjectsImplServletProjectImageServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqProjectsImplServletProjectImageServletInfo] = deriveEncoder
}
