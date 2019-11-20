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
 * OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.h
 *
 * 
 */

#ifndef OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H_
#define OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties
    : public ModelBase
{
public:
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties();
    virtual ~OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getCommitsTrackerWriterGroups() const;
    void setCommitsTrackerWriterGroups(ConfigNodePropertyArray const& value);
    bool commitsTrackerWriterGroupsIsSet() const;
    void unsetCommitsTrackerWriterGroups();

protected:
    ConfigNodePropertyArray m_CommitsTrackerWriterGroups;
    bool m_CommitsTrackerWriterGroupsIsSet;
};

}
}
}
}

#endif /* OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H_ */