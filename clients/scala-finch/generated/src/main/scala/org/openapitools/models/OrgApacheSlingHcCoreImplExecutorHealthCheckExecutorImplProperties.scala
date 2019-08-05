package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param timeoutInMs 
 * @param longRunningFutureThresholdForCriticalMs 
 * @param resultCacheTtlInMs 
 */
case class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties(timeoutInMs: Option[ConfigNodePropertyInteger],
                longRunningFutureThresholdForCriticalMs: Option[ConfigNodePropertyInteger],
                resultCacheTtlInMs: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties {
    /**
     * Creates the codec for converting OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties] = deriveEncoder
}
