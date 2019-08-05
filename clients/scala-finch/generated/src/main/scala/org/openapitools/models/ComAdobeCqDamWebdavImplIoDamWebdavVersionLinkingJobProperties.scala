package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodenable 
 * @param cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodschedulerPeriodperiod 
 * @param cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodstagingPeriodtimeout 
 */
case class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodenable: Option[ConfigNodePropertyBoolean],
                cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodschedulerPeriodperiod: Option[ConfigNodePropertyInteger],
                cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodstagingPeriodtimeout: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties] = deriveEncoder
}
