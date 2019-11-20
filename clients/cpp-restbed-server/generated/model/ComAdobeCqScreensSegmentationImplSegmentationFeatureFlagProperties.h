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
 * ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.h
 *
 * 
 */

#ifndef ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties_H_
#define ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties
{
public:
    ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties();
    virtual ~ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getEnableDataTriggeredContent() const;
    void setEnableDataTriggeredContent(std::shared_ptr<ConfigNodePropertyBoolean> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_EnableDataTriggeredContent;
};

}
}
}
}

#endif /* ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties_H_ */