package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param schedulerPeriodexpression 
 */
case class ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties(schedulerPeriodexpression: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties] = deriveEncoder
}
