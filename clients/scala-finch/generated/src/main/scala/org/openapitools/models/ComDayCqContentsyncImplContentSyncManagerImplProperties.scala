package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param contentsyncPeriodfallbackPeriodauthorizable 
 * @param contentsyncPeriodfallbackPeriodupdateuser 
 */
case class ComDayCqContentsyncImplContentSyncManagerImplProperties(contentsyncPeriodfallbackPeriodauthorizable: Option[ConfigNodePropertyString],
                contentsyncPeriodfallbackPeriodupdateuser: Option[ConfigNodePropertyString]
                )

object ComDayCqContentsyncImplContentSyncManagerImplProperties {
    /**
     * Creates the codec for converting ComDayCqContentsyncImplContentSyncManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqContentsyncImplContentSyncManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqContentsyncImplContentSyncManagerImplProperties] = deriveEncoder
}
