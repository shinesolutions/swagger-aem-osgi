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
 * @param resourcePeriodresolverPeriodsearchpath 
 * @param resourcePeriodresolverPeriodmanglenamespaces 
 * @param resourcePeriodresolverPeriodallowDirect 
 * @param resourcePeriodresolverPeriodrequiredPeriodproviders 
 * @param resourcePeriodresolverPeriodrequiredPeriodprovidernames 
 * @param resourcePeriodresolverPeriodvirtual 
 * @param resourcePeriodresolverPeriodmapping 
 * @param resourcePeriodresolverPeriodmapPeriodlocation 
 * @param resourcePeriodresolverPeriodmapPeriodobservation 
 * @param resourcePeriodresolverPerioddefaultPeriodvanityPeriodredirectPeriodstatus 
 * @param resourcePeriodresolverPeriodenablePeriodvanitypath 
 * @param resourcePeriodresolverPeriodvanitypathPeriodmaxEntries 
 * @param resourcePeriodresolverPeriodvanitypathPeriodmaxEntriesPeriodstartup 
 * @param resourcePeriodresolverPeriodvanitypathPeriodbloomfilterPeriodmaxBytes 
 * @param resourcePeriodresolverPeriodoptimizePeriodaliasPeriodresolution 
 * @param resourcePeriodresolverPeriodvanitypathPeriodwhitelist 
 * @param resourcePeriodresolverPeriodvanitypathPeriodblacklist 
 * @param resourcePeriodresolverPeriodvanityPeriodprecedence 
 * @param resourcePeriodresolverPeriodproviderhandlingPeriodparanoid 
 * @param resourcePeriodresolverPeriodlogPeriodclosing 
 * @param resourcePeriodresolverPeriodlogPeriodunclosed 
 */
case class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(resourcePeriodresolverPeriodsearchpath: Option[ConfigNodePropertyArray],
                resourcePeriodresolverPeriodmanglenamespaces: Option[ConfigNodePropertyBoolean],
                resourcePeriodresolverPeriodallowDirect: Option[ConfigNodePropertyBoolean],
                resourcePeriodresolverPeriodrequiredPeriodproviders: Option[ConfigNodePropertyArray],
                resourcePeriodresolverPeriodrequiredPeriodprovidernames: Option[ConfigNodePropertyArray],
                resourcePeriodresolverPeriodvirtual: Option[ConfigNodePropertyArray],
                resourcePeriodresolverPeriodmapping: Option[ConfigNodePropertyArray],
                resourcePeriodresolverPeriodmapPeriodlocation: Option[ConfigNodePropertyString],
                resourcePeriodresolverPeriodmapPeriodobservation: Option[ConfigNodePropertyArray],
                resourcePeriodresolverPerioddefaultPeriodvanityPeriodredirectPeriodstatus: Option[ConfigNodePropertyInteger],
                resourcePeriodresolverPeriodenablePeriodvanitypath: Option[ConfigNodePropertyBoolean],
                resourcePeriodresolverPeriodvanitypathPeriodmaxEntries: Option[ConfigNodePropertyInteger],
                resourcePeriodresolverPeriodvanitypathPeriodmaxEntriesPeriodstartup: Option[ConfigNodePropertyBoolean],
                resourcePeriodresolverPeriodvanitypathPeriodbloomfilterPeriodmaxBytes: Option[ConfigNodePropertyInteger],
                resourcePeriodresolverPeriodoptimizePeriodaliasPeriodresolution: Option[ConfigNodePropertyBoolean],
                resourcePeriodresolverPeriodvanitypathPeriodwhitelist: Option[ConfigNodePropertyArray],
                resourcePeriodresolverPeriodvanitypathPeriodblacklist: Option[ConfigNodePropertyArray],
                resourcePeriodresolverPeriodvanityPeriodprecedence: Option[ConfigNodePropertyBoolean],
                resourcePeriodresolverPeriodproviderhandlingPeriodparanoid: Option[ConfigNodePropertyBoolean],
                resourcePeriodresolverPeriodlogPeriodclosing: Option[ConfigNodePropertyBoolean],
                resourcePeriodresolverPeriodlogPeriodunclosed: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties] = deriveEncoder
}
