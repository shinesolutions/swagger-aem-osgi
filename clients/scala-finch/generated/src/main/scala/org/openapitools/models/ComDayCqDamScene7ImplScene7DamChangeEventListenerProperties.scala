package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodenabled 
 * @param cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodobservedPeriodpaths 
 */
case class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodenabled: Option[ConfigNodePropertyBoolean],
                cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodobservedPeriodpaths: Option[ConfigNodePropertyArray]
                )

object ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {
    /**
     * Creates the codec for converting ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties] = deriveEncoder
}
