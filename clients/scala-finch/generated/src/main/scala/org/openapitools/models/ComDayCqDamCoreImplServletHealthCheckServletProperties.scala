package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPerioddamPeriodsyncPeriodworkflowPeriodid 
 * @param cqPerioddamPeriodsyncPeriodfolderPeriodtypes 
 */
case class ComDayCqDamCoreImplServletHealthCheckServletProperties(cqPerioddamPeriodsyncPeriodworkflowPeriodid: Option[ConfigNodePropertyString],
                cqPerioddamPeriodsyncPeriodfolderPeriodtypes: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamCoreImplServletHealthCheckServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletHealthCheckServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletHealthCheckServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletHealthCheckServletProperties] = deriveEncoder
}
