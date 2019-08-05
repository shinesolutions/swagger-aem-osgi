package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties]
                )

object ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo] = deriveEncoder
}
