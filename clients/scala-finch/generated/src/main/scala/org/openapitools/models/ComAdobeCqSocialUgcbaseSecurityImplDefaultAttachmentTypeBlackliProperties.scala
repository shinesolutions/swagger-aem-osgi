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
case class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties(defaultPeriodattachmentPeriodtypePeriodblacklist: Option[ConfigNodePropertyArray],
                baselinePeriodattachmentPeriodtypePeriodblacklist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties] = deriveEncoder
}
