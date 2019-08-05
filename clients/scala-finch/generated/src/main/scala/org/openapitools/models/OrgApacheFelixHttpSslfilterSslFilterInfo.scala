package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixHttpSslfilterSslFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheFelixHttpSslfilterSslFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixHttpSslfilterSslFilterProperties]
                )

object OrgApacheFelixHttpSslfilterSslFilterInfo {
    /**
     * Creates the codec for converting OrgApacheFelixHttpSslfilterSslFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixHttpSslfilterSslFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixHttpSslfilterSslFilterInfo] = deriveEncoder
}
