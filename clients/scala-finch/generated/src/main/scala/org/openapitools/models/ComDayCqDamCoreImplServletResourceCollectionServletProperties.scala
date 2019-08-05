package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodservletPeriodresourceTypes 
 * @param slingPeriodservletPeriodmethods 
 * @param slingPeriodservletPeriodselectors 
 * @param downloadPeriodconfig 
 * @param viewPeriodselector 
 * @param sendUnderscoreemail 
 */
case class ComDayCqDamCoreImplServletResourceCollectionServletProperties(slingPeriodservletPeriodresourceTypes: Option[ConfigNodePropertyArray],
                slingPeriodservletPeriodmethods: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodselectors: Option[ConfigNodePropertyString],
                downloadPeriodconfig: Option[ConfigNodePropertyString],
                viewPeriodselector: Option[ConfigNodePropertyString],
                sendUnderscoreemail: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamCoreImplServletResourceCollectionServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletResourceCollectionServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletResourceCollectionServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletResourceCollectionServletProperties] = deriveEncoder
}
