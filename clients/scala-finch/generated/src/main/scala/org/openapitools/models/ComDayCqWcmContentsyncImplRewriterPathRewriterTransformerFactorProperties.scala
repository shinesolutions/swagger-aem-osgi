package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodlinks 
 * @param cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodclientlibs 
 * @param cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodimages 
 * @param cqPeriodcontentsyncPeriodpathrewritertransformerPeriodattributePeriodpattern 
 * @param cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodpattern 
 * @param cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodreplace 
 */
case class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties(cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodlinks: Option[ConfigNodePropertyArray],
                cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodclientlibs: Option[ConfigNodePropertyArray],
                cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodimages: Option[ConfigNodePropertyArray],
                cqPeriodcontentsyncPeriodpathrewritertransformerPeriodattributePeriodpattern: Option[ConfigNodePropertyString],
                cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodpattern: Option[ConfigNodePropertyString],
                cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodreplace: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties {
    /**
     * Creates the codec for converting ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties] = deriveEncoder
}
