package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param enableFallback 
 */
case class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties(enableFallback: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties] = deriveEncoder
}
