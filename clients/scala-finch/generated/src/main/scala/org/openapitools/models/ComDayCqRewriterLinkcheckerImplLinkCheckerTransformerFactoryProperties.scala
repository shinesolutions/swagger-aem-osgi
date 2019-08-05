package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param linkcheckertransformerPerioddisableRewriting 
 * @param linkcheckertransformerPerioddisableChecking 
 * @param linkcheckertransformerPeriodmapCacheSize 
 * @param linkcheckertransformerPeriodstrictExtensionCheck 
 * @param linkcheckertransformerPeriodstripHtmltExtension 
 * @param linkcheckertransformerPeriodrewriteElements 
 * @param linkcheckertransformerPeriodstripExtensionPathBlacklist 
 */
case class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(linkcheckertransformerPerioddisableRewriting: Option[ConfigNodePropertyBoolean],
                linkcheckertransformerPerioddisableChecking: Option[ConfigNodePropertyBoolean],
                linkcheckertransformerPeriodmapCacheSize: Option[ConfigNodePropertyInteger],
                linkcheckertransformerPeriodstrictExtensionCheck: Option[ConfigNodePropertyBoolean],
                linkcheckertransformerPeriodstripHtmltExtension: Option[ConfigNodePropertyBoolean],
                linkcheckertransformerPeriodrewriteElements: Option[ConfigNodePropertyArray],
                linkcheckertransformerPeriodstripExtensionPathBlacklist: Option[ConfigNodePropertyArray]
                )

object ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    /**
     * Creates the codec for converting ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties] = deriveEncoder
}
