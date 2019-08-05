package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPerioddamPeriodscene7PeriodconfigurationeventlistenerPeriodenabled 
 */
case class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties(cqPerioddamPeriodscene7PeriodconfigurationeventlistenerPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties {
    /**
     * Creates the codec for converting ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties] = deriveEncoder
}
