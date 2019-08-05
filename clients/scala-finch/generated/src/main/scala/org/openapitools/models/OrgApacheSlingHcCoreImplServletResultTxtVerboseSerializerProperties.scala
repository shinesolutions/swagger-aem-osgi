package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param totalWidth 
 * @param colWidthName 
 * @param colWidthResult 
 * @param colWidthTiming 
 */
case class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(totalWidth: Option[ConfigNodePropertyInteger],
                colWidthName: Option[ConfigNodePropertyInteger],
                colWidthResult: Option[ConfigNodePropertyInteger],
                colWidthTiming: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {
    /**
     * Creates the codec for converting OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties] = deriveEncoder
}
