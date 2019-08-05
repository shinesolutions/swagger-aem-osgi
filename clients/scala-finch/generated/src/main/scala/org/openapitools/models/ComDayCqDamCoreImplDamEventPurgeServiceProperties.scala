package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param schedulerPeriodexpression 
 * @param maxSavedActivities 
 * @param saveInterval 
 * @param enableActivityPurge 
 * @param eventTypes 
 */
case class ComDayCqDamCoreImplDamEventPurgeServiceProperties(schedulerPeriodexpression: Option[ConfigNodePropertyString],
                maxSavedActivities: Option[ConfigNodePropertyInteger],
                saveInterval: Option[ConfigNodePropertyInteger],
                enableActivityPurge: Option[ConfigNodePropertyBoolean],
                eventTypes: Option[ConfigNodePropertyDropDown]
                )

object ComDayCqDamCoreImplDamEventPurgeServiceProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplDamEventPurgeServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplDamEventPurgeServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplDamEventPurgeServiceProperties] = deriveEncoder
}
