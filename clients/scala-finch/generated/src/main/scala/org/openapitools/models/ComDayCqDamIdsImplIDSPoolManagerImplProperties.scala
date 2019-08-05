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
 * @param maxPerioderrorsPeriodtoPeriodblacklist 
 * @param retryPeriodintervalPeriodtoPeriodwhitelist 
 * @param connectPeriodtimeout 
 * @param socketPeriodtimeout 
 * @param processPeriodlabel 
 * @param connectionPeriodusePeriodmax 
 */
case class ComDayCqDamIdsImplIDSPoolManagerImplProperties(maxPerioderrorsPeriodtoPeriodblacklist: Option[ConfigNodePropertyInteger],
                retryPeriodintervalPeriodtoPeriodwhitelist: Option[ConfigNodePropertyInteger],
                connectPeriodtimeout: Option[ConfigNodePropertyInteger],
                socketPeriodtimeout: Option[ConfigNodePropertyInteger],
                processPeriodlabel: Option[ConfigNodePropertyString],
                connectionPeriodusePeriodmax: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamIdsImplIDSPoolManagerImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamIdsImplIDSPoolManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamIdsImplIDSPoolManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamIdsImplIDSPoolManagerImplProperties] = deriveEncoder
}
