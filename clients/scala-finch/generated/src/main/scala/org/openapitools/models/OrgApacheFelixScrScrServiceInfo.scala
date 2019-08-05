package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixScrScrServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheFelixScrScrServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixScrScrServiceProperties]
                )

object OrgApacheFelixScrScrServiceInfo {
    /**
     * Creates the codec for converting OrgApacheFelixScrScrServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixScrScrServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixScrScrServiceInfo] = deriveEncoder
}
