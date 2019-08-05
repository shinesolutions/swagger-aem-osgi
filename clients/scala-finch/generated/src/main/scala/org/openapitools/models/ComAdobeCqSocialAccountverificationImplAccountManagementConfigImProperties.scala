package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param enable 
 * @param ttl1 
 * @param ttl2 
 */
case class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties(enable: Option[ConfigNodePropertyBoolean],
                ttl1: Option[ConfigNodePropertyInteger],
                ttl2: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties] = deriveEncoder
}
