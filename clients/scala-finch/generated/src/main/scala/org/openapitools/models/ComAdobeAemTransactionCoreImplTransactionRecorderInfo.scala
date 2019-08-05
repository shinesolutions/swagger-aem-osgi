package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeAemTransactionCoreImplTransactionRecorderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeAemTransactionCoreImplTransactionRecorderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeAemTransactionCoreImplTransactionRecorderProperties]
                )

object ComAdobeAemTransactionCoreImplTransactionRecorderInfo {
    /**
     * Creates the codec for converting ComAdobeAemTransactionCoreImplTransactionRecorderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeAemTransactionCoreImplTransactionRecorderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeAemTransactionCoreImplTransactionRecorderInfo] = deriveEncoder
}
