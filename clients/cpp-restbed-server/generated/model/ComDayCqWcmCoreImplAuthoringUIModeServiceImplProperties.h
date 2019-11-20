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
 * ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.h
 *
 * 
 */

#ifndef ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties_H_
#define ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties_H_



#include "ConfigNodePropertyString.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties
{
public:
    ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties();
    virtual ~ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getAuthoringUIModeServiceDefault() const;
    void setAuthoringUIModeServiceDefault(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_AuthoringUIModeService_default;
};

}
}
}
}

#endif /* ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties_H_ */