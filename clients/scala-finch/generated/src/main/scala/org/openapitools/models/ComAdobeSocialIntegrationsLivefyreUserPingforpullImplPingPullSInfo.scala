package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties]
                )

object ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo {
    /**
     * Creates the codec for converting ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo] = deriveEncoder
}
