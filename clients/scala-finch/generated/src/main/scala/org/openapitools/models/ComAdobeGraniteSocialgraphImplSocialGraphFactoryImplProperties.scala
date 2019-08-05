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
 * @param group2memberPeriodrelationshipPeriodoutgoing 
 * @param group2memberPeriodexcludedPeriodoutgoing 
 * @param group2memberPeriodrelationshipPeriodincoming 
 * @param group2memberPeriodexcludedPeriodincoming 
 */
case class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(group2memberPeriodrelationshipPeriodoutgoing: Option[ConfigNodePropertyString],
                group2memberPeriodexcludedPeriodoutgoing: Option[ConfigNodePropertyArray],
                group2memberPeriodrelationshipPeriodincoming: Option[ConfigNodePropertyString],
                group2memberPeriodexcludedPeriodincoming: Option[ConfigNodePropertyArray]
                )

object ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties] = deriveEncoder
}
