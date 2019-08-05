package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param defaultPeriodattachmentPeriodtypePeriodblacklist 
 * @param baselinePeriodattachmentPeriodtypePeriodblacklist 
 */
case class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties(defaultPeriodattachmentPeriodtypePeriodblacklist: Option[ConfigNodePropertyArray],
                baselinePeriodattachmentPeriodtypePeriodblacklist: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties {
    /**
     * Creates the codec for converting ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties] = deriveEncoder
}
