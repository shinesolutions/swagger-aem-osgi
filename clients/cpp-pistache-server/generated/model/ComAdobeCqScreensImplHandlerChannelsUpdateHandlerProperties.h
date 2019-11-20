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
 * ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.h
 *
 * 
 */

#ifndef ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties_H_
#define ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties
    : public ModelBase
{
public:
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties();
    virtual ~ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getCqPagesupdatehandlerImageresourcetypes() const;
    void setCqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray const& value);
    bool cqPagesupdatehandlerImageresourcetypesIsSet() const;
    void unsetCq_pagesupdatehandler_imageresourcetypes();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getCqPagesupdatehandlerProductresourcetypes() const;
    void setCqPagesupdatehandlerProductresourcetypes(ConfigNodePropertyArray const& value);
    bool cqPagesupdatehandlerProductresourcetypesIsSet() const;
    void unsetCq_pagesupdatehandler_productresourcetypes();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getCqPagesupdatehandlerVideoresourcetypes() const;
    void setCqPagesupdatehandlerVideoresourcetypes(ConfigNodePropertyArray const& value);
    bool cqPagesupdatehandlerVideoresourcetypesIsSet() const;
    void unsetCq_pagesupdatehandler_videoresourcetypes();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getCqPagesupdatehandlerDynamicsequenceresourcetypes() const;
    void setCqPagesupdatehandlerDynamicsequenceresourcetypes(ConfigNodePropertyArray const& value);
    bool cqPagesupdatehandlerDynamicsequenceresourcetypesIsSet() const;
    void unsetCq_pagesupdatehandler_dynamicsequenceresourcetypes();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getCqPagesupdatehandlerPreviewmodepaths() const;
    void setCqPagesupdatehandlerPreviewmodepaths(ConfigNodePropertyArray const& value);
    bool cqPagesupdatehandlerPreviewmodepathsIsSet() const;
    void unsetCq_pagesupdatehandler_previewmodepaths();

protected:
    ConfigNodePropertyArray m_Cq_pagesupdatehandler_imageresourcetypes;
    bool m_Cq_pagesupdatehandler_imageresourcetypesIsSet;
    ConfigNodePropertyArray m_Cq_pagesupdatehandler_productresourcetypes;
    bool m_Cq_pagesupdatehandler_productresourcetypesIsSet;
    ConfigNodePropertyArray m_Cq_pagesupdatehandler_videoresourcetypes;
    bool m_Cq_pagesupdatehandler_videoresourcetypesIsSet;
    ConfigNodePropertyArray m_Cq_pagesupdatehandler_dynamicsequenceresourcetypes;
    bool m_Cq_pagesupdatehandler_dynamicsequenceresourcetypesIsSet;
    ConfigNodePropertyArray m_Cq_pagesupdatehandler_previewmodepaths;
    bool m_Cq_pagesupdatehandler_previewmodepathsIsSet;
};

}
}
}
}

#endif /* ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties_H_ */