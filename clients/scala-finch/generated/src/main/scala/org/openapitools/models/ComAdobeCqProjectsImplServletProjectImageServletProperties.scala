package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param imagePeriodquality 
 * @param imagePeriodsupportedPeriodresolutions 
 */
case class ComAdobeCqProjectsImplServletProjectImageServletProperties(imagePeriodquality: Option[ConfigNodePropertyString],
                imagePeriodsupportedPeriodresolutions: Option[ConfigNodePropertyString]
                )

object ComAdobeCqProjectsImplServletProjectImageServletProperties {
    /**
     * Creates the codec for converting ComAdobeCqProjectsImplServletProjectImageServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqProjectsImplServletProjectImageServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqProjectsImplServletProjectImageServletProperties] = deriveEncoder
}
