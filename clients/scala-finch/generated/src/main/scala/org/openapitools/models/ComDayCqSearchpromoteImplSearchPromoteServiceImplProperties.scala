package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPeriodsearchpromotePeriodconfigurationPeriodserverPerioduri 
 * @param cqPeriodsearchpromotePeriodconfigurationPeriodenvironment 
 * @param connectionPeriodtimeout 
 * @param socketPeriodtimeout 
 */
case class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties(cqPeriodsearchpromotePeriodconfigurationPeriodserverPerioduri: Option[ConfigNodePropertyString],
                cqPeriodsearchpromotePeriodconfigurationPeriodenvironment: Option[ConfigNodePropertyString],
                connectionPeriodtimeout: Option[ConfigNodePropertyInteger],
                socketPeriodtimeout: Option[ConfigNodePropertyInteger]
                )

object ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties] = deriveEncoder
}
