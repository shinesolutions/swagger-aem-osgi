/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.h
 *
 * 
 */

#ifndef OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties_H_
#define OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties
    : public ModelBase
{
public:
    OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties();
    virtual ~OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getResourceResolverSearchpath() const;
    void setResourceResolverSearchpath(ConfigNodePropertyArray const& value);
    bool resourceResolverSearchpathIsSet() const;
    void unsetResource_resolver_searchpath();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getResourceResolverManglenamespaces() const;
    void setResourceResolverManglenamespaces(ConfigNodePropertyBoolean const& value);
    bool resourceResolverManglenamespacesIsSet() const;
    void unsetResource_resolver_manglenamespaces();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getResourceResolverAllowDirect() const;
    void setResourceResolverAllowDirect(ConfigNodePropertyBoolean const& value);
    bool resourceResolverAllowDirectIsSet() const;
    void unsetResource_resolver_allowDirect();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getResourceResolverRequiredProviders() const;
    void setResourceResolverRequiredProviders(ConfigNodePropertyArray const& value);
    bool resourceResolverRequiredProvidersIsSet() const;
    void unsetResource_resolver_required_providers();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getResourceResolverRequiredProvidernames() const;
    void setResourceResolverRequiredProvidernames(ConfigNodePropertyArray const& value);
    bool resourceResolverRequiredProvidernamesIsSet() const;
    void unsetResource_resolver_required_providernames();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getResourceResolverVirtual() const;
    void setResourceResolverVirtual(ConfigNodePropertyArray const& value);
    bool resourceResolverVirtualIsSet() const;
    void unsetResource_resolver_virtual();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getResourceResolverMapping() const;
    void setResourceResolverMapping(ConfigNodePropertyArray const& value);
    bool resourceResolverMappingIsSet() const;
    void unsetResource_resolver_mapping();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getResourceResolverMapLocation() const;
    void setResourceResolverMapLocation(ConfigNodePropertyString const& value);
    bool resourceResolverMapLocationIsSet() const;
    void unsetResource_resolver_map_location();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getResourceResolverMapObservation() const;
    void setResourceResolverMapObservation(ConfigNodePropertyArray const& value);
    bool resourceResolverMapObservationIsSet() const;
    void unsetResource_resolver_map_observation();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getResourceResolverDefaultVanityRedirectStatus() const;
    void setResourceResolverDefaultVanityRedirectStatus(ConfigNodePropertyInteger const& value);
    bool resourceResolverDefaultVanityRedirectStatusIsSet() const;
    void unsetResource_resolver_default_vanity_redirect_status();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getResourceResolverEnableVanitypath() const;
    void setResourceResolverEnableVanitypath(ConfigNodePropertyBoolean const& value);
    bool resourceResolverEnableVanitypathIsSet() const;
    void unsetResource_resolver_enable_vanitypath();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getResourceResolverVanitypathMaxEntries() const;
    void setResourceResolverVanitypathMaxEntries(ConfigNodePropertyInteger const& value);
    bool resourceResolverVanitypathMaxEntriesIsSet() const;
    void unsetResource_resolver_vanitypath_maxEntries();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getResourceResolverVanitypathMaxEntriesStartup() const;
    void setResourceResolverVanitypathMaxEntriesStartup(ConfigNodePropertyBoolean const& value);
    bool resourceResolverVanitypathMaxEntriesStartupIsSet() const;
    void unsetResource_resolver_vanitypath_maxEntries_startup();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getResourceResolverVanitypathBloomfilterMaxBytes() const;
    void setResourceResolverVanitypathBloomfilterMaxBytes(ConfigNodePropertyInteger const& value);
    bool resourceResolverVanitypathBloomfilterMaxBytesIsSet() const;
    void unsetResource_resolver_vanitypath_bloomfilter_maxBytes();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getResourceResolverOptimizeAliasResolution() const;
    void setResourceResolverOptimizeAliasResolution(ConfigNodePropertyBoolean const& value);
    bool resourceResolverOptimizeAliasResolutionIsSet() const;
    void unsetResource_resolver_optimize_alias_resolution();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getResourceResolverVanitypathWhitelist() const;
    void setResourceResolverVanitypathWhitelist(ConfigNodePropertyArray const& value);
    bool resourceResolverVanitypathWhitelistIsSet() const;
    void unsetResource_resolver_vanitypath_whitelist();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getResourceResolverVanitypathBlacklist() const;
    void setResourceResolverVanitypathBlacklist(ConfigNodePropertyArray const& value);
    bool resourceResolverVanitypathBlacklistIsSet() const;
    void unsetResource_resolver_vanitypath_blacklist();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getResourceResolverVanityPrecedence() const;
    void setResourceResolverVanityPrecedence(ConfigNodePropertyBoolean const& value);
    bool resourceResolverVanityPrecedenceIsSet() const;
    void unsetResource_resolver_vanity_precedence();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getResourceResolverProviderhandlingParanoid() const;
    void setResourceResolverProviderhandlingParanoid(ConfigNodePropertyBoolean const& value);
    bool resourceResolverProviderhandlingParanoidIsSet() const;
    void unsetResource_resolver_providerhandling_paranoid();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getResourceResolverLogClosing() const;
    void setResourceResolverLogClosing(ConfigNodePropertyBoolean const& value);
    bool resourceResolverLogClosingIsSet() const;
    void unsetResource_resolver_log_closing();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getResourceResolverLogUnclosed() const;
    void setResourceResolverLogUnclosed(ConfigNodePropertyBoolean const& value);
    bool resourceResolverLogUnclosedIsSet() const;
    void unsetResource_resolver_log_unclosed();

protected:
    ConfigNodePropertyArray m_Resource_resolver_searchpath;
    bool m_Resource_resolver_searchpathIsSet;
    ConfigNodePropertyBoolean m_Resource_resolver_manglenamespaces;
    bool m_Resource_resolver_manglenamespacesIsSet;
    ConfigNodePropertyBoolean m_Resource_resolver_allowDirect;
    bool m_Resource_resolver_allowDirectIsSet;
    ConfigNodePropertyArray m_Resource_resolver_required_providers;
    bool m_Resource_resolver_required_providersIsSet;
    ConfigNodePropertyArray m_Resource_resolver_required_providernames;
    bool m_Resource_resolver_required_providernamesIsSet;
    ConfigNodePropertyArray m_Resource_resolver_virtual;
    bool m_Resource_resolver_virtualIsSet;
    ConfigNodePropertyArray m_Resource_resolver_mapping;
    bool m_Resource_resolver_mappingIsSet;
    ConfigNodePropertyString m_Resource_resolver_map_location;
    bool m_Resource_resolver_map_locationIsSet;
    ConfigNodePropertyArray m_Resource_resolver_map_observation;
    bool m_Resource_resolver_map_observationIsSet;
    ConfigNodePropertyInteger m_Resource_resolver_default_vanity_redirect_status;
    bool m_Resource_resolver_default_vanity_redirect_statusIsSet;
    ConfigNodePropertyBoolean m_Resource_resolver_enable_vanitypath;
    bool m_Resource_resolver_enable_vanitypathIsSet;
    ConfigNodePropertyInteger m_Resource_resolver_vanitypath_maxEntries;
    bool m_Resource_resolver_vanitypath_maxEntriesIsSet;
    ConfigNodePropertyBoolean m_Resource_resolver_vanitypath_maxEntries_startup;
    bool m_Resource_resolver_vanitypath_maxEntries_startupIsSet;
    ConfigNodePropertyInteger m_Resource_resolver_vanitypath_bloomfilter_maxBytes;
    bool m_Resource_resolver_vanitypath_bloomfilter_maxBytesIsSet;
    ConfigNodePropertyBoolean m_Resource_resolver_optimize_alias_resolution;
    bool m_Resource_resolver_optimize_alias_resolutionIsSet;
    ConfigNodePropertyArray m_Resource_resolver_vanitypath_whitelist;
    bool m_Resource_resolver_vanitypath_whitelistIsSet;
    ConfigNodePropertyArray m_Resource_resolver_vanitypath_blacklist;
    bool m_Resource_resolver_vanitypath_blacklistIsSet;
    ConfigNodePropertyBoolean m_Resource_resolver_vanity_precedence;
    bool m_Resource_resolver_vanity_precedenceIsSet;
    ConfigNodePropertyBoolean m_Resource_resolver_providerhandling_paranoid;
    bool m_Resource_resolver_providerhandling_paranoidIsSet;
    ConfigNodePropertyBoolean m_Resource_resolver_log_closing;
    bool m_Resource_resolver_log_closingIsSet;
    ConfigNodePropertyBoolean m_Resource_resolver_log_unclosed;
    bool m_Resource_resolver_log_unclosedIsSet;
};

}
}
}
}

#endif /* OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties_H_ */