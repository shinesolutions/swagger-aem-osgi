package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialSyncImplDiffChangesObserverProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialSyncImplDiffChangesObserverInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialSyncImplDiffChangesObserverProperties]
                )

object ComAdobeCqSocialSyncImplDiffChangesObserverInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialSyncImplDiffChangesObserverInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSyncImplDiffChangesObserverInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSyncImplDiffChangesObserverInfo] = deriveEncoder
}
