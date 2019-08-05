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
 * @param felixPeriodmemoryusagePerioddumpPeriodthreshold 
 * @param felixPeriodmemoryusagePerioddumpPeriodinterval 
 * @param felixPeriodmemoryusagePerioddumpPeriodlocation 
 */
case class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties(felixPeriodmemoryusagePerioddumpPeriodthreshold: Option[ConfigNodePropertyInteger],
                felixPeriodmemoryusagePerioddumpPeriodinterval: Option[ConfigNodePropertyInteger],
                felixPeriodmemoryusagePerioddumpPeriodlocation: Option[ConfigNodePropertyString]
                )

object OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties {
    /**
     * Creates the codec for converting OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties] = deriveEncoder
}
