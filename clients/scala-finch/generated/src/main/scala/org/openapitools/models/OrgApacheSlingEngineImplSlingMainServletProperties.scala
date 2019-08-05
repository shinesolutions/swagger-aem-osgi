package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param slingPeriodmaxPeriodcalls 
 * @param slingPeriodmaxPeriodinclusions 
 * @param slingPeriodtracePeriodallow 
 * @param slingPeriodmaxPeriodrecordPeriodrequests 
 * @param slingPeriodstorePeriodpatternPeriodrequests 
 * @param slingPeriodserverinfo 
 * @param slingPeriodadditionalPeriodresponsePeriodheaders 
 */
case class OrgApacheSlingEngineImplSlingMainServletProperties(slingPeriodmaxPeriodcalls: Option[ConfigNodePropertyInteger],
                slingPeriodmaxPeriodinclusions: Option[ConfigNodePropertyInteger],
                slingPeriodtracePeriodallow: Option[ConfigNodePropertyBoolean],
                slingPeriodmaxPeriodrecordPeriodrequests: Option[ConfigNodePropertyInteger],
                slingPeriodstorePeriodpatternPeriodrequests: Option[ConfigNodePropertyArray],
                slingPeriodserverinfo: Option[ConfigNodePropertyString],
                slingPeriodadditionalPeriodresponsePeriodheaders: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingEngineImplSlingMainServletProperties {
    /**
     * Creates the codec for converting OrgApacheSlingEngineImplSlingMainServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineImplSlingMainServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineImplSlingMainServletProperties] = deriveEncoder
}
