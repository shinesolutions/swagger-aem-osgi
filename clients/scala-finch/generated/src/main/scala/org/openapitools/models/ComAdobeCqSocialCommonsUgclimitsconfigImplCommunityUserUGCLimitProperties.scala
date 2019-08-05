package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param enable 
 * @param UGCLimit 
 * @param ugcLimitDuration 
 * @param domains 
 * @param toList 
 */
case class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties(enable: Option[ConfigNodePropertyBoolean],
                UGCLimit: Option[ConfigNodePropertyInteger],
                ugcLimitDuration: Option[ConfigNodePropertyInteger],
                domains: Option[ConfigNodePropertyArray],
                toList: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties] = deriveEncoder
}
