package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param isTransactionRecordingEnabled 
 */
case class ComAdobeAemTransactionCoreImplTransactionRecorderProperties(isTransactionRecordingEnabled: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeAemTransactionCoreImplTransactionRecorderProperties {
    /**
     * Creates the codec for converting ComAdobeAemTransactionCoreImplTransactionRecorderProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeAemTransactionCoreImplTransactionRecorderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeAemTransactionCoreImplTransactionRecorderProperties] = deriveEncoder
}
