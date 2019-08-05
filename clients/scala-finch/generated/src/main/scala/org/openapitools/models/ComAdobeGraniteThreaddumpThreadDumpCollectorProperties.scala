package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param schedulerPeriodperiod 
 * @param schedulerPeriodrunOn 
 * @param granitePeriodthreaddumpPeriodenabled 
 * @param granitePeriodthreaddumpPerioddumpsPerFile 
 * @param granitePeriodthreaddumpPeriodenableGzipCompression 
 * @param granitePeriodthreaddumpPeriodenableDirectoriesCompression 
 * @param granitePeriodthreaddumpPeriodenableJStack 
 * @param granitePeriodthreaddumpPeriodmaxBackupDays 
 * @param granitePeriodthreaddumpPeriodbackupCleanTrigger 
 */
case class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(schedulerPeriodperiod: Option[ConfigNodePropertyInteger],
                schedulerPeriodrunOn: Option[ConfigNodePropertyDropDown],
                granitePeriodthreaddumpPeriodenabled: Option[ConfigNodePropertyBoolean],
                granitePeriodthreaddumpPerioddumpsPerFile: Option[ConfigNodePropertyInteger],
                granitePeriodthreaddumpPeriodenableGzipCompression: Option[ConfigNodePropertyBoolean],
                granitePeriodthreaddumpPeriodenableDirectoriesCompression: Option[ConfigNodePropertyBoolean],
                granitePeriodthreaddumpPeriodenableJStack: Option[ConfigNodePropertyBoolean],
                granitePeriodthreaddumpPeriodmaxBackupDays: Option[ConfigNodePropertyInteger],
                granitePeriodthreaddumpPeriodbackupCleanTrigger: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteThreaddumpThreadDumpCollectorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteThreaddumpThreadDumpCollectorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteThreaddumpThreadDumpCollectorProperties] = deriveEncoder
}
