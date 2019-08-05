package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodservletPeriodpaths 
 * @param slingPeriodservletPeriodmethods 
 */
case class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties(slingPeriodservletPeriodpaths: Option[ConfigNodePropertyString],
                slingPeriodservletPeriodmethods: Option[ConfigNodePropertyString]
                )

object ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties] = deriveEncoder
}
