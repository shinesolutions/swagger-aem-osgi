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

/**
 * 
 * @param comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodregisteredUnderscorepaths 
 * @param comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodsyncPeriodrenditions 
 * @param comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodreplicatePeriodthreadPeriodwaitPeriodms 
 * @param comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodplatform 
 */
case class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodregisteredUnderscorepaths: Option[ConfigNodePropertyArray],
                comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodsyncPeriodrenditions: Option[ConfigNodePropertyBoolean],
                comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodreplicatePeriodthreadPeriodwaitPeriodms: Option[ConfigNodePropertyInteger],
                comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodplatform: Option[ConfigNodePropertyDropDown]
                )

object ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties] = deriveEncoder
}
