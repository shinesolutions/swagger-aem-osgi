package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param mimePeriodtypes 
 */
case class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties(mimePeriodtypes: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties] = deriveEncoder
}
