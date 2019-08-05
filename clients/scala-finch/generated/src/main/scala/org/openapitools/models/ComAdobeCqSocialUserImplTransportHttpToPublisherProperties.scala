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
 * @param enable 
 * @param agentPeriodconfiguration 
 * @param contextPeriodpath 
 * @param disabledPeriodcipherPeriodsuites 
 * @param enabledPeriodcipherPeriodsuites 
 */
case class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(enable: Option[ConfigNodePropertyBoolean],
                agentPeriodconfiguration: Option[ConfigNodePropertyArray],
                contextPeriodpath: Option[ConfigNodePropertyString],
                disabledPeriodcipherPeriodsuites: Option[ConfigNodePropertyArray],
                enabledPeriodcipherPeriodsuites: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialUserImplTransportHttpToPublisherProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialUserImplTransportHttpToPublisherProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUserImplTransportHttpToPublisherProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUserImplTransportHttpToPublisherProperties] = deriveEncoder
}
