package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties]
                )

object ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo] = deriveEncoder
}
