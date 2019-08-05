package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties]
                )

object ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo] = deriveEncoder
}
