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
 * OrgApacheFelixSystemreadyImplServicesCheckProperties.h
 *
 * 
 */

#ifndef OrgApacheFelixSystemreadyImplServicesCheckProperties_H_
#define OrgApacheFelixSystemreadyImplServicesCheckProperties_H_



#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyArray.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheFelixSystemreadyImplServicesCheckProperties
{
public:
    OrgApacheFelixSystemreadyImplServicesCheckProperties();
    virtual ~OrgApacheFelixSystemreadyImplServicesCheckProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// OrgApacheFelixSystemreadyImplServicesCheckProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getServicesList() const;
    void setServicesList(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyDropDown> getType() const;
    void setType(std::shared_ptr<ConfigNodePropertyDropDown> value);

protected:
    std::shared_ptr<ConfigNodePropertyArray> m_Services_list;
    std::shared_ptr<ConfigNodePropertyDropDown> m_Type;
};

}
}
}
}

#endif /* OrgApacheFelixSystemreadyImplServicesCheckProperties_H_ */