package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param communitiesPeriodintegrationPeriodlivefyrePeriodslingPeriodeventPeriodfilter 
 */
case class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties(communitiesPeriodintegrationPeriodlivefyrePeriodslingPeriodeventPeriodfilter: Option[ConfigNodePropertyString]
                )

object ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties {
    /**
     * Creates the codec for converting ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties] = deriveEncoder
}
