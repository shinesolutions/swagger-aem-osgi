/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
    : public ModelBase
{
public:
    ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties();
    virtual ~ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getCacheEnable() const;
    bool cacheEnableIsSet() const;
    void unsetCache_enable();
    void setCacheEnable(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getCacheRootPaths() const;
    bool cacheRootPathsIsSet() const;
    void unsetCache_rootPaths();
    void setCacheRootPaths(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getCacheMaxSize() const;
    bool cacheMaxSizeIsSet() const;
    void unsetCache_maxSize();
    void setCacheMaxSize(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getCacheMaxEntries() const;
    bool cacheMaxEntriesIsSet() const;
    void unsetCache_maxEntries();
    void setCacheMaxEntries(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_Cache_enable;
    bool m_Cache_enableIsSet;
    std::shared_ptr<ConfigNodePropertyArray> m_Cache_rootPaths;
    bool m_Cache_rootPathsIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Cache_maxSize;
    bool m_Cache_maxSizeIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Cache_maxEntries;
    bool m_Cache_maxEntriesIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties_H_ */