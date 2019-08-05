package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param proxyPeriodenabled 
 * @param proxyPeriodhost 
 * @param proxyPerioduser 
 * @param proxyPeriodpassword 
 * @param proxyPeriodntlmPeriodhost 
 * @param proxyPeriodntlmPerioddomain 
 * @param proxyPeriodexceptions 
 */
case class ComDayCommonsHttpclientProperties(proxyPeriodenabled: Option[ConfigNodePropertyBoolean],
                proxyPeriodhost: Option[ConfigNodePropertyString],
                proxyPerioduser: Option[ConfigNodePropertyString],
                proxyPeriodpassword: Option[ConfigNodePropertyString],
                proxyPeriodntlmPeriodhost: Option[ConfigNodePropertyString],
                proxyPeriodntlmPerioddomain: Option[ConfigNodePropertyString],
                proxyPeriodexceptions: Option[ConfigNodePropertyArray]
                )

object ComDayCommonsHttpclientProperties {
    /**
     * Creates the codec for converting ComDayCommonsHttpclientProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCommonsHttpclientProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCommonsHttpclientProperties] = deriveEncoder
}
