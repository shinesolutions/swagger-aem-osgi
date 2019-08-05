package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param enablePeriodmultisession 
 * @param idsPeriodccPeriodenable 
 * @param enablePeriodretry 
 * @param enablePeriodretryPeriodscripterror 
 * @param externalizerPerioddomainPeriodcqhost 
 * @param externalizerPerioddomainPeriodhttp 
 */
case class ComDayCqDamIdsImplIDSJobProcessorProperties(enablePeriodmultisession: Option[ConfigNodePropertyBoolean],
                idsPeriodccPeriodenable: Option[ConfigNodePropertyBoolean],
                enablePeriodretry: Option[ConfigNodePropertyBoolean],
                enablePeriodretryPeriodscripterror: Option[ConfigNodePropertyBoolean],
                externalizerPerioddomainPeriodcqhost: Option[ConfigNodePropertyString],
                externalizerPerioddomainPeriodhttp: Option[ConfigNodePropertyString]
                )

object ComDayCqDamIdsImplIDSJobProcessorProperties {
    /**
     * Creates the codec for converting ComDayCqDamIdsImplIDSJobProcessorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamIdsImplIDSJobProcessorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamIdsImplIDSJobProcessorProperties] = deriveEncoder
}
