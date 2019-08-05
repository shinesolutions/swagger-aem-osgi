package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param pollPeriodinterval 
 */
case class OrgApacheFelixSystemreadySystemReadyMonitorProperties(pollPeriodinterval: Option[ConfigNodePropertyInteger]
                )

object OrgApacheFelixSystemreadySystemReadyMonitorProperties {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadySystemReadyMonitorProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadySystemReadyMonitorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadySystemReadyMonitorProperties] = deriveEncoder
}
