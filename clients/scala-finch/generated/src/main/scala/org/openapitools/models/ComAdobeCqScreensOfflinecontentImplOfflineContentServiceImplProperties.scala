package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param disableSmartSync 
 */
case class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties(disableSmartSync: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties] = deriveEncoder
}
