package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodminsizePeriodname 
 * @param cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodpartsizePeriodname 
 * @param cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodnumthreadPeriodname 
 * @param cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodreadtimeoutPeriodname 
 * @param cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodconnectiontimeoutPeriodname 
 * @param cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodmaxretrycountPeriodname 
 * @param cqPerioddamPeriods7damPeriodvideoproxyclientservicePerioduploadprogressPeriodintervalPeriodname 
 */
case class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties(cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodminsizePeriodname: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodpartsizePeriodname: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodnumthreadPeriodname: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodreadtimeoutPeriodname: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodconnectiontimeoutPeriodname: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodmaxretrycountPeriodname: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriods7damPeriodvideoproxyclientservicePerioduploadprogressPeriodintervalPeriodname: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties] = deriveEncoder
}
