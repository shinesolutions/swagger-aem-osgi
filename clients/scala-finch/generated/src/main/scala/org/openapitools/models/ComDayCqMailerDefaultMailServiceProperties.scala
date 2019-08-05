package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param smtpPeriodhost 
 * @param smtpPeriodport 
 * @param smtpPerioduser 
 * @param smtpPeriodpassword 
 * @param fromPeriodaddress 
 * @param smtpPeriodssl 
 * @param smtpPeriodstarttls 
 * @param debugPeriodemail 
 */
case class ComDayCqMailerDefaultMailServiceProperties(smtpPeriodhost: Option[ConfigNodePropertyString],
                smtpPeriodport: Option[ConfigNodePropertyInteger],
                smtpPerioduser: Option[ConfigNodePropertyString],
                smtpPeriodpassword: Option[ConfigNodePropertyString],
                fromPeriodaddress: Option[ConfigNodePropertyString],
                smtpPeriodssl: Option[ConfigNodePropertyBoolean],
                smtpPeriodstarttls: Option[ConfigNodePropertyBoolean],
                debugPeriodemail: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqMailerDefaultMailServiceProperties {
    /**
     * Creates the codec for converting ComDayCqMailerDefaultMailServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMailerDefaultMailServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMailerDefaultMailServiceProperties] = deriveEncoder
}
