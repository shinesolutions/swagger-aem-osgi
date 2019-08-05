package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPeriodwcmPeriodundoPeriodenabled 
 * @param cqPeriodwcmPeriodundoPeriodpath 
 * @param cqPeriodwcmPeriodundoPeriodvalidity 
 * @param cqPeriodwcmPeriodundoPeriodsteps 
 * @param cqPeriodwcmPeriodundoPeriodpersistence 
 * @param cqPeriodwcmPeriodundoPeriodpersistencePeriodmode 
 * @param cqPeriodwcmPeriodundoPeriodmarkermode 
 * @param cqPeriodwcmPeriodundoPeriodwhitelist 
 * @param cqPeriodwcmPeriodundoPeriodblacklist 
 */
case class ComDayCqWcmUndoUndoConfigProperties(cqPeriodwcmPeriodundoPeriodenabled: Option[ConfigNodePropertyBoolean],
                cqPeriodwcmPeriodundoPeriodpath: Option[ConfigNodePropertyString],
                cqPeriodwcmPeriodundoPeriodvalidity: Option[ConfigNodePropertyInteger],
                cqPeriodwcmPeriodundoPeriodsteps: Option[ConfigNodePropertyInteger],
                cqPeriodwcmPeriodundoPeriodpersistence: Option[ConfigNodePropertyString],
                cqPeriodwcmPeriodundoPeriodpersistencePeriodmode: Option[ConfigNodePropertyBoolean],
                cqPeriodwcmPeriodundoPeriodmarkermode: Option[ConfigNodePropertyString],
                cqPeriodwcmPeriodundoPeriodwhitelist: Option[ConfigNodePropertyArray],
                cqPeriodwcmPeriodundoPeriodblacklist: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmUndoUndoConfigProperties {
    /**
     * Creates the codec for converting ComDayCqWcmUndoUndoConfigProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmUndoUndoConfigProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmUndoUndoConfigProperties] = deriveEncoder
}
