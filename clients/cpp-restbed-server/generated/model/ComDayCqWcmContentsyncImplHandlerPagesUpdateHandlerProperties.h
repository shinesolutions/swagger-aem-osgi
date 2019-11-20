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
 * ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.h
 *
 * 
 */

#ifndef ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_
#define ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_



#include "ConfigNodePropertyArray.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties
{
public:
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties();
    virtual ~ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getCqPagesupdatehandlerImageresourcetypes() const;
    void setCqPagesupdatehandlerImageresourcetypes(std::shared_ptr<ConfigNodePropertyArray> value);

protected:
    std::shared_ptr<ConfigNodePropertyArray> m_Cq_pagesupdatehandler_imageresourcetypes;
};

}
}
}
}

#endif /* ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_ */