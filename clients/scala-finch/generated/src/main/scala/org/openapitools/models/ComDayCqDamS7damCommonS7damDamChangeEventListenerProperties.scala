package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPerioddamPeriods7damPerioddamchangeeventlistenerPeriodenabled 
 */
case class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties(cqPerioddamPeriods7damPerioddamchangeeventlistenerPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties] = deriveEncoder
}
