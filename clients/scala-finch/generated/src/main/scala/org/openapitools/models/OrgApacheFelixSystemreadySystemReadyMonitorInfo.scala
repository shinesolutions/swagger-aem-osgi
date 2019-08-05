package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixSystemreadySystemReadyMonitorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheFelixSystemreadySystemReadyMonitorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixSystemreadySystemReadyMonitorProperties]
                )

object OrgApacheFelixSystemreadySystemReadyMonitorInfo {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadySystemReadyMonitorInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadySystemReadyMonitorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadySystemReadyMonitorInfo] = deriveEncoder
}
