package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param sslMinusforwardPeriodheader 
 * @param sslMinusforwardPeriodvalue 
 * @param sslMinusforwardMinuscertPeriodheader 
 * @param rewritePeriodabsolutePeriodurls 
 */
case class OrgApacheFelixHttpSslfilterSslFilterProperties(sslMinusforwardPeriodheader: Option[ConfigNodePropertyString],
                sslMinusforwardPeriodvalue: Option[ConfigNodePropertyString],
                sslMinusforwardMinuscertPeriodheader: Option[ConfigNodePropertyString],
                rewritePeriodabsolutePeriodurls: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheFelixHttpSslfilterSslFilterProperties {
    /**
     * Creates the codec for converting OrgApacheFelixHttpSslfilterSslFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixHttpSslfilterSslFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixHttpSslfilterSslFilterProperties] = deriveEncoder
}
