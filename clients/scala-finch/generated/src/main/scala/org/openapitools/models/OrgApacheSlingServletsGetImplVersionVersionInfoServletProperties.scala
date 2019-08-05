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
 * @param slingPeriodservletPeriodselectors 
 * @param ecmaSuport 
 */
case class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties(slingPeriodservletPeriodselectors: Option[ConfigNodePropertyArray],
                ecmaSuport: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties {
    /**
     * Creates the codec for converting OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties] = deriveEncoder
}
