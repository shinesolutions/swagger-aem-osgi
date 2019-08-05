package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param TcpPort 
 * @param AllowRemoteAccess 
 * @param MaxRenderRgnPixels 
 * @param MaxMessageSize 
 * @param RandomAccessUrlTimeout 
 * @param WorkerThreads 
 */
case class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties(TcpPort: Option[ConfigNodePropertyString],
                AllowRemoteAccess: Option[ConfigNodePropertyBoolean],
                MaxRenderRgnPixels: Option[ConfigNodePropertyString],
                MaxMessageSize: Option[ConfigNodePropertyString],
                RandomAccessUrlTimeout: Option[ConfigNodePropertyInteger],
                WorkerThreads: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqDamS7imagingImplIsImageServerComponentProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamS7imagingImplIsImageServerComponentProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamS7imagingImplIsImageServerComponentProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamS7imagingImplIsImageServerComponentProperties] = deriveEncoder
}
