package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param excerptPeriodproperties 
 * @param cachePeriodmaxPeriodentries 
 * @param cachePeriodentryPeriodlifetime 
 * @param xpathPeriodunion 
 */
case class ComDayCqSearchImplBuilderQueryBuilderImplProperties(excerptPeriodproperties: Option[ConfigNodePropertyArray],
                cachePeriodmaxPeriodentries: Option[ConfigNodePropertyInteger],
                cachePeriodentryPeriodlifetime: Option[ConfigNodePropertyInteger],
                xpathPeriodunion: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqSearchImplBuilderQueryBuilderImplProperties {
    /**
     * Creates the codec for converting ComDayCqSearchImplBuilderQueryBuilderImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqSearchImplBuilderQueryBuilderImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqSearchImplBuilderQueryBuilderImplProperties] = deriveEncoder
}
