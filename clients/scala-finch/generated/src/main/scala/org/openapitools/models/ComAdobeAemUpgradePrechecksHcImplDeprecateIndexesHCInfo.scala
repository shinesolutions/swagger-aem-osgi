package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties]
                )

object ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo {
    /**
     * Creates the codec for converting ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo] = deriveEncoder
}
