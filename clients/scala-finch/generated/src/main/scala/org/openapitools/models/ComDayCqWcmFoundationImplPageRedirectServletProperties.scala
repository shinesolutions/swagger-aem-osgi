package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param excludedPeriodresourcePeriodtypes 
 */
case class ComDayCqWcmFoundationImplPageRedirectServletProperties(excludedPeriodresourcePeriodtypes: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmFoundationImplPageRedirectServletProperties {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationImplPageRedirectServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationImplPageRedirectServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationImplPageRedirectServletProperties] = deriveEncoder
}
