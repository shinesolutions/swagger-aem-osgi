package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param repconfPeriodtimezone 
 * @param repconfPeriodlocale 
 * @param repconfPeriodsnapshots 
 * @param repconfPeriodrepdir 
 * @param repconfPeriodhourofday 
 * @param repconfPeriodminofhour 
 * @param repconfPeriodmaxrows 
 * @param repconfPeriodfakedata 
 * @param repconfPeriodsnapshotuser 
 * @param repconfPeriodenforcesnapshotuser 
 */
case class ComDayCqReportingImplConfigServiceImplProperties(repconfPeriodtimezone: Option[ConfigNodePropertyString],
                repconfPeriodlocale: Option[ConfigNodePropertyString],
                repconfPeriodsnapshots: Option[ConfigNodePropertyString],
                repconfPeriodrepdir: Option[ConfigNodePropertyString],
                repconfPeriodhourofday: Option[ConfigNodePropertyInteger],
                repconfPeriodminofhour: Option[ConfigNodePropertyInteger],
                repconfPeriodmaxrows: Option[ConfigNodePropertyInteger],
                repconfPeriodfakedata: Option[ConfigNodePropertyBoolean],
                repconfPeriodsnapshotuser: Option[ConfigNodePropertyString],
                repconfPeriodenforcesnapshotuser: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqReportingImplConfigServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqReportingImplConfigServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReportingImplConfigServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReportingImplConfigServiceImplProperties] = deriveEncoder
}
