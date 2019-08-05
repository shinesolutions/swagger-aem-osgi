package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param pathPerioddescPeriodfield 
 * @param pathPeriodchildPeriodfield 
 * @param pathPeriodparentPeriodfield 
 * @param pathPeriodexactPeriodfield 
 * @param catchPeriodallPeriodfield 
 * @param collapsedPeriodpathPeriodfield 
 * @param pathPerioddepthPeriodfield 
 * @param commitPeriodpolicy 
 * @param rows 
 * @param pathPeriodrestrictions 
 * @param propertyPeriodrestrictions 
 * @param primarytypesPeriodrestrictions 
 * @param ignoredPeriodproperties 
 * @param usedPeriodproperties 
 * @param typePeriodmappings 
 * @param propertyPeriodmappings 
 * @param collapsePeriodjcrcontentPeriodnodes 
 */
case class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties(pathPerioddescPeriodfield: Option[ConfigNodePropertyString],
                pathPeriodchildPeriodfield: Option[ConfigNodePropertyString],
                pathPeriodparentPeriodfield: Option[ConfigNodePropertyString],
                pathPeriodexactPeriodfield: Option[ConfigNodePropertyString],
                catchPeriodallPeriodfield: Option[ConfigNodePropertyString],
                collapsedPeriodpathPeriodfield: Option[ConfigNodePropertyString],
                pathPerioddepthPeriodfield: Option[ConfigNodePropertyString],
                commitPeriodpolicy: Option[ConfigNodePropertyDropDown],
                rows: Option[ConfigNodePropertyInteger],
                pathPeriodrestrictions: Option[ConfigNodePropertyBoolean],
                propertyPeriodrestrictions: Option[ConfigNodePropertyBoolean],
                primarytypesPeriodrestrictions: Option[ConfigNodePropertyBoolean],
                ignoredPeriodproperties: Option[ConfigNodePropertyArray],
                usedPeriodproperties: Option[ConfigNodePropertyArray],
                typePeriodmappings: Option[ConfigNodePropertyArray],
                propertyPeriodmappings: Option[ConfigNodePropertyArray],
                collapsePeriodjcrcontentPeriodnodes: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties {
    /**
     * Creates the codec for converting OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties] = deriveEncoder
}
