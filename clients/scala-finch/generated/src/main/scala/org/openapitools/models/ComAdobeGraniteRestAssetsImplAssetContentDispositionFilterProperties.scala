package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param mimePeriodallowEmpty 
 * @param mimePeriodallowed 
 */
case class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties(mimePeriodallowEmpty: Option[ConfigNodePropertyBoolean],
                mimePeriodallowed: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties] = deriveEncoder
}
