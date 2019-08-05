package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param enabled 
 * @param disabledForGroups 
 */
case class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties(enabled: Option[ConfigNodePropertyBoolean],
                disabledForGroups: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties {
    /**
     * Creates the codec for converting ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties] = deriveEncoder
}
