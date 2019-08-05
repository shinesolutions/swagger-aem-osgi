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
 * @param cugPeriodexemptedPeriodprincipals 
 * @param cugPeriodenabled 
 * @param cugPeriodprincipalsPeriodregex 
 * @param cugPeriodprincipalsPeriodreplacement 
 */
case class ComDayCqAuthImplCugCugSupportImplProperties(cugPeriodexemptedPeriodprincipals: Option[ConfigNodePropertyArray],
                cugPeriodenabled: Option[ConfigNodePropertyBoolean],
                cugPeriodprincipalsPeriodregex: Option[ConfigNodePropertyString],
                cugPeriodprincipalsPeriodreplacement: Option[ConfigNodePropertyString]
                )

object ComDayCqAuthImplCugCugSupportImplProperties {
    /**
     * Creates the codec for converting ComDayCqAuthImplCugCugSupportImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAuthImplCugCugSupportImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAuthImplCugCugSupportImplProperties] = deriveEncoder
}
