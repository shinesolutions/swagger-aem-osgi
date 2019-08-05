package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param comPerioddayPeriodcqPeriodwcmPeriodscriptingPeriodbvpPeriodscriptPeriodengines 
 */
case class ComDayCqWcmScriptingImplBVPManagerProperties(comPerioddayPeriodcqPeriodwcmPeriodscriptingPeriodbvpPeriodscriptPeriodengines: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmScriptingImplBVPManagerProperties {
    /**
     * Creates the codec for converting ComDayCqWcmScriptingImplBVPManagerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmScriptingImplBVPManagerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmScriptingImplBVPManagerProperties] = deriveEncoder
}
