package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties]
                )

object ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo] = deriveEncoder
}
