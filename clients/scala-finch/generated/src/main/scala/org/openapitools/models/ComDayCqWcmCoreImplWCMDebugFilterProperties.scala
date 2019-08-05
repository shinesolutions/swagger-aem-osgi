package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param wcmdbgfilterPeriodenabled 
 * @param wcmdbgfilterPeriodjspDebug 
 */
case class ComDayCqWcmCoreImplWCMDebugFilterProperties(wcmdbgfilterPeriodenabled: Option[ConfigNodePropertyBoolean],
                wcmdbgfilterPeriodjspDebug: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWcmCoreImplWCMDebugFilterProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplWCMDebugFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplWCMDebugFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplWCMDebugFilterProperties] = deriveEncoder
}
