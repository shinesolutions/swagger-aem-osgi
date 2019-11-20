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
 * ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.h
 *
 * 
 */

#ifndef ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_
#define ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties
    : public ModelBase
{
public:
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties();
    virtual ~ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getCqPagesupdatehandlerImageresourcetypes() const;
    void setCqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray const& value);
    bool cqPagesupdatehandlerImageresourcetypesIsSet() const;
    void unsetCq_pagesupdatehandler_imageresourcetypes();

protected:
    ConfigNodePropertyArray m_Cq_pagesupdatehandler_imageresourcetypes;
    bool m_Cq_pagesupdatehandler_imageresourcetypesIsSet;
};

}
}
}
}

#endif /* ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_ */