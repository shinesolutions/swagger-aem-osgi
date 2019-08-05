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
 * @param schedulerPeriodexpression 
 * @param jobPeriodpurgePeriodthreshold 
 * @param jobPeriodpurgePeriodmaxPeriodjobs 
 */
case class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(schedulerPeriodexpression: Option[ConfigNodePropertyString],
                jobPeriodpurgePeriodthreshold: Option[ConfigNodePropertyInteger],
                jobPeriodpurgePeriodmaxPeriodjobs: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties {
    /**
     * Creates the codec for converting ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties] = deriveEncoder
}
