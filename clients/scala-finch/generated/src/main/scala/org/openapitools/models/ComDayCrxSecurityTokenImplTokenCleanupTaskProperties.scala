package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param enablePeriodtokenPeriodcleanupPeriodtask 
 * @param schedulerPeriodexpression 
 * @param batchPeriodsize 
 */
case class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties(enablePeriodtokenPeriodcleanupPeriodtask: Option[ConfigNodePropertyBoolean],
                schedulerPeriodexpression: Option[ConfigNodePropertyString],
                batchPeriodsize: Option[ConfigNodePropertyInteger]
                )

object ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {
    /**
     * Creates the codec for converting ComDayCrxSecurityTokenImplTokenCleanupTaskProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCrxSecurityTokenImplTokenCleanupTaskProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCrxSecurityTokenImplTokenCleanupTaskProperties] = deriveEncoder
}
