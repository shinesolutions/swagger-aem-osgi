package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param maxMemory 
 */
case class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties(maxMemory: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqDamDmProcessImagePTiffManagerImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamDmProcessImagePTiffManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamDmProcessImagePTiffManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamDmProcessImagePTiffManagerImplProperties] = deriveEncoder
}
