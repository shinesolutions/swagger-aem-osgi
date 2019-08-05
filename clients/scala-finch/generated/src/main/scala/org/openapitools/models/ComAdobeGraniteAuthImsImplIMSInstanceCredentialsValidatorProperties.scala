package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param oauthPeriodproviderPeriodid 
 */
case class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties(oauthPeriodproviderPeriodid: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties] = deriveEncoder
}
