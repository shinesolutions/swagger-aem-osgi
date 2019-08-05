package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param comPeriodadobePerioddamPeriodmacPeriodsyncPeriodclientPeriodsoPeriodtimeout 
 */
case class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties(comPeriodadobePerioddamPeriodmacPeriodsyncPeriodclientPeriodsoPeriodtimeout: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties] = deriveEncoder
}
