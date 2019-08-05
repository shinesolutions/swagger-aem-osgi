package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties]
                )

object ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo] = deriveEncoder
}
