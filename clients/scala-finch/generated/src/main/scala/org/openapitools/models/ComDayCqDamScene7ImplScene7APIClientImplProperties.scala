package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodnofilterPeriodname 
 * @param cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodwithfilterPeriodname 
 */
case class ComDayCqDamScene7ImplScene7APIClientImplProperties(cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodnofilterPeriodname: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodwithfilterPeriodname: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamScene7ImplScene7APIClientImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamScene7ImplScene7APIClientImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamScene7ImplScene7APIClientImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamScene7ImplScene7APIClientImplProperties] = deriveEncoder
}
