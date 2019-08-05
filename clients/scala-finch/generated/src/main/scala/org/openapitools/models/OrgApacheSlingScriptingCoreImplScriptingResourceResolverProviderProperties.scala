package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param logPeriodstacktracePeriodonclose 
 */
case class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties(logPeriodstacktracePeriodonclose: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties {
    /**
     * Creates the codec for converting OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties] = deriveEncoder
}
