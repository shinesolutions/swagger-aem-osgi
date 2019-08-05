package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteCorsImplCORSPolicyImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteCorsImplCORSPolicyImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteCorsImplCORSPolicyImplProperties]
                )

object ComAdobeGraniteCorsImplCORSPolicyImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteCorsImplCORSPolicyImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCorsImplCORSPolicyImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCorsImplCORSPolicyImplInfo] = deriveEncoder
}
