package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param size 
 */
case class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties(size: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties] = deriveEncoder
}
