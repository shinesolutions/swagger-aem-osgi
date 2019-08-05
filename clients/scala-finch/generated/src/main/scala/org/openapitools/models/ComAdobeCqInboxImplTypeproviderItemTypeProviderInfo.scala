package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties]
                )

object ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo {
    /**
     * Creates the codec for converting ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo] = deriveEncoder
}
