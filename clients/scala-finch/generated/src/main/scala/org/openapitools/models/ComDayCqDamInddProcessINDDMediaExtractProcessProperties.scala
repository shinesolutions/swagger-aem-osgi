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
 * @param processPeriodlabel 
 * @param cqPerioddamPeriodinddPeriodpagesPeriodregex 
 * @param idsPeriodjobPerioddecoupled 
 * @param idsPeriodjobPeriodworkflowPeriodmodel 
 */
case class ComDayCqDamInddProcessINDDMediaExtractProcessProperties(processPeriodlabel: Option[ConfigNodePropertyString],
                cqPerioddamPeriodinddPeriodpagesPeriodregex: Option[ConfigNodePropertyString],
                idsPeriodjobPerioddecoupled: Option[ConfigNodePropertyBoolean],
                idsPeriodjobPeriodworkflowPeriodmodel: Option[ConfigNodePropertyString]
                )

object ComDayCqDamInddProcessINDDMediaExtractProcessProperties {
    /**
     * Creates the codec for converting ComDayCqDamInddProcessINDDMediaExtractProcessProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamInddProcessINDDMediaExtractProcessProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamInddProcessINDDMediaExtractProcessProperties] = deriveEncoder
}
