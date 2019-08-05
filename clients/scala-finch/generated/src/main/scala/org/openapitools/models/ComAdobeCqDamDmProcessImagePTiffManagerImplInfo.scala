package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDamDmProcessImagePTiffManagerImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDamDmProcessImagePTiffManagerImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDamDmProcessImagePTiffManagerImplProperties]
                )

object ComAdobeCqDamDmProcessImagePTiffManagerImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqDamDmProcessImagePTiffManagerImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamDmProcessImagePTiffManagerImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamDmProcessImagePTiffManagerImplInfo] = deriveEncoder
}
