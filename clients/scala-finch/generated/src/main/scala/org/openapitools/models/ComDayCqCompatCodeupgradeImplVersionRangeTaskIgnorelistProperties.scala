package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param effectiveBundleListPath 
 */
case class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties(effectiveBundleListPath: Option[ConfigNodePropertyString]
                )

object ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties {
    /**
     * Creates the codec for converting ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties] = deriveEncoder
}
