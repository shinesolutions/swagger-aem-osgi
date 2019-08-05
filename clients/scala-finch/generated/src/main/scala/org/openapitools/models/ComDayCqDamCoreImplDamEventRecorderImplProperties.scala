package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param eventPeriodfilter 
 * @param eventPeriodqueuePeriodlength 
 * @param eventrecorderPeriodenabled 
 * @param eventrecorderPeriodblacklist 
 * @param eventrecorderPeriodeventtypes 
 */
case class ComDayCqDamCoreImplDamEventRecorderImplProperties(eventPeriodfilter: Option[ConfigNodePropertyString],
                eventPeriodqueuePeriodlength: Option[ConfigNodePropertyInteger],
                eventrecorderPeriodenabled: Option[ConfigNodePropertyBoolean],
                eventrecorderPeriodblacklist: Option[ConfigNodePropertyArray],
                eventrecorderPeriodeventtypes: Option[ConfigNodePropertyDropDown]
                )

object ComDayCqDamCoreImplDamEventRecorderImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplDamEventRecorderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplDamEventRecorderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplDamEventRecorderImplProperties] = deriveEncoder
}
