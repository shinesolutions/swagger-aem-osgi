package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPeriodcommercePeriodpromotionPeriodroot 
 */
case class ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties(cqPeriodcommercePeriodpromotionPeriodroot: Option[ConfigNodePropertyString]
                )

object ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties] = deriveEncoder
}
