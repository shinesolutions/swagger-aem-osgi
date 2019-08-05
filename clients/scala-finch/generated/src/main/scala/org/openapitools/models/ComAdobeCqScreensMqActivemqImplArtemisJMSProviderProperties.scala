package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyFloat
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param servicePeriodranking 
 * @param globalPeriodsize 
 * @param maxPerioddiskPeriodusage 
 * @param persistencePeriodenabled 
 * @param threadPeriodpoolPeriodmaxPeriodsize 
 * @param scheduledPeriodthreadPeriodpoolPeriodmaxPeriodsize 
 * @param gracefulPeriodshutdownPeriodtimeout 
 * @param queues 
 * @param topics 
 * @param addressesPeriodmaxPerioddeliveryPeriodattempts 
 * @param addressesPeriodexpiryPerioddelay 
 * @param addressesPeriodaddressPeriodfullPeriodmessagePeriodpolicy 
 * @param addressesPeriodmaxPeriodsizePeriodbytes 
 * @param addressesPeriodpagePeriodsizePeriodbytes 
 * @param addressesPeriodpagePeriodcachePeriodmaxPeriodsize 
 * @param clusterPerioduser 
 * @param clusterPeriodpassword 
 * @param clusterPeriodcallPeriodtimeout 
 * @param clusterPeriodcallPeriodfailoverPeriodtimeout 
 * @param clusterPeriodclientPeriodfailurePeriodcheckPeriodperiod 
 * @param clusterPeriodnotificationPeriodattempts 
 * @param clusterPeriodnotificationPeriodinterval 
 * @param idPeriodcachePeriodsize 
 * @param clusterPeriodconfirmationPeriodwindowPeriodsize 
 * @param clusterPeriodconnectionPeriodttl 
 * @param clusterPeriodduplicatePerioddetection 
 * @param clusterPeriodinitialPeriodconnectPeriodattempts 
 * @param clusterPeriodmaxPeriodretryPeriodinterval 
 * @param clusterPeriodminPeriodlargePeriodmessagePeriodsize 
 * @param clusterPeriodproducerPeriodwindowPeriodsize 
 * @param clusterPeriodreconnectPeriodattempts 
 * @param clusterPeriodretryPeriodinterval 
 * @param clusterPeriodretryPeriodintervalPeriodmultiplier 
 */
case class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                globalPeriodsize: Option[ConfigNodePropertyInteger],
                maxPerioddiskPeriodusage: Option[ConfigNodePropertyInteger],
                persistencePeriodenabled: Option[ConfigNodePropertyBoolean],
                threadPeriodpoolPeriodmaxPeriodsize: Option[ConfigNodePropertyInteger],
                scheduledPeriodthreadPeriodpoolPeriodmaxPeriodsize: Option[ConfigNodePropertyInteger],
                gracefulPeriodshutdownPeriodtimeout: Option[ConfigNodePropertyInteger],
                queues: Option[ConfigNodePropertyArray],
                topics: Option[ConfigNodePropertyArray],
                addressesPeriodmaxPerioddeliveryPeriodattempts: Option[ConfigNodePropertyInteger],
                addressesPeriodexpiryPerioddelay: Option[ConfigNodePropertyInteger],
                addressesPeriodaddressPeriodfullPeriodmessagePeriodpolicy: Option[ConfigNodePropertyDropDown],
                addressesPeriodmaxPeriodsizePeriodbytes: Option[ConfigNodePropertyInteger],
                addressesPeriodpagePeriodsizePeriodbytes: Option[ConfigNodePropertyInteger],
                addressesPeriodpagePeriodcachePeriodmaxPeriodsize: Option[ConfigNodePropertyInteger],
                clusterPerioduser: Option[ConfigNodePropertyString],
                clusterPeriodpassword: Option[ConfigNodePropertyString],
                clusterPeriodcallPeriodtimeout: Option[ConfigNodePropertyInteger],
                clusterPeriodcallPeriodfailoverPeriodtimeout: Option[ConfigNodePropertyInteger],
                clusterPeriodclientPeriodfailurePeriodcheckPeriodperiod: Option[ConfigNodePropertyInteger],
                clusterPeriodnotificationPeriodattempts: Option[ConfigNodePropertyInteger],
                clusterPeriodnotificationPeriodinterval: Option[ConfigNodePropertyInteger],
                idPeriodcachePeriodsize: Option[ConfigNodePropertyInteger],
                clusterPeriodconfirmationPeriodwindowPeriodsize: Option[ConfigNodePropertyInteger],
                clusterPeriodconnectionPeriodttl: Option[ConfigNodePropertyInteger],
                clusterPeriodduplicatePerioddetection: Option[ConfigNodePropertyBoolean],
                clusterPeriodinitialPeriodconnectPeriodattempts: Option[ConfigNodePropertyInteger],
                clusterPeriodmaxPeriodretryPeriodinterval: Option[ConfigNodePropertyInteger],
                clusterPeriodminPeriodlargePeriodmessagePeriodsize: Option[ConfigNodePropertyInteger],
                clusterPeriodproducerPeriodwindowPeriodsize: Option[ConfigNodePropertyInteger],
                clusterPeriodreconnectPeriodattempts: Option[ConfigNodePropertyInteger],
                clusterPeriodretryPeriodinterval: Option[ConfigNodePropertyInteger],
                clusterPeriodretryPeriodintervalPeriodmultiplier: Option[ConfigNodePropertyFloat]
                )

object ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties] = deriveEncoder
}
