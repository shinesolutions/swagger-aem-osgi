package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param eventPeriodfilter 
 * @param rolloutmgrPeriodexcludedpropsPerioddefault 
 * @param rolloutmgrPeriodexcludedparagraphpropsPerioddefault 
 * @param rolloutmgrPeriodexcludednodetypesPerioddefault 
 * @param rolloutmgrPeriodthreadpoolPeriodmaxsize 
 * @param rolloutmgrPeriodthreadpoolPeriodmaxshutdowntime 
 * @param rolloutmgrPeriodthreadpoolPeriodpriority 
 * @param rolloutmgrPeriodcommitPeriodsize 
 * @param rolloutmgrPeriodconflicthandlingPeriodenabled 
 */
case class ComDayCqWcmMsmImplRolloutManagerImplProperties(eventPeriodfilter: Option[ConfigNodePropertyString],
                rolloutmgrPeriodexcludedpropsPerioddefault: Option[ConfigNodePropertyArray],
                rolloutmgrPeriodexcludedparagraphpropsPerioddefault: Option[ConfigNodePropertyArray],
                rolloutmgrPeriodexcludednodetypesPerioddefault: Option[ConfigNodePropertyArray],
                rolloutmgrPeriodthreadpoolPeriodmaxsize: Option[ConfigNodePropertyInteger],
                rolloutmgrPeriodthreadpoolPeriodmaxshutdowntime: Option[ConfigNodePropertyInteger],
                rolloutmgrPeriodthreadpoolPeriodpriority: Option[ConfigNodePropertyDropDown],
                rolloutmgrPeriodcommitPeriodsize: Option[ConfigNodePropertyInteger],
                rolloutmgrPeriodconflicthandlingPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWcmMsmImplRolloutManagerImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmMsmImplRolloutManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMsmImplRolloutManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMsmImplRolloutManagerImplProperties] = deriveEncoder
}
