package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param screensPeriodchannelsPeriodpropertiesPeriodtoPeriodremove 
 */
case class ComAdobeCqScreensImplScreensChannelPostProcessorProperties(screensPeriodchannelsPeriodpropertiesPeriodtoPeriodremove: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqScreensImplScreensChannelPostProcessorProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensImplScreensChannelPostProcessorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensImplScreensChannelPostProcessorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensImplScreensChannelPostProcessorProperties] = deriveEncoder
}
