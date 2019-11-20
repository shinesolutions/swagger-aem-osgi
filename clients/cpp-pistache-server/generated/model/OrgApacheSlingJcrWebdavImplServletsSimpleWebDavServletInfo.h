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
 * OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo.h
 *
 * 
 */

#ifndef OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo_H_
#define OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo_H_


#include "ModelBase.h"

#include <string>
#include "OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo
    : public ModelBase
{
public:
    OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo();
    virtual ~OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo members

    /// <summary>
    /// 
    /// </summary>
    std::string getPid() const;
    void setPid(std::string const& value);
    bool pidIsSet() const;
    void unsetPid();
    /// <summary>
    /// 
    /// </summary>
    std::string getTitle() const;
    void setTitle(std::string const& value);
    bool titleIsSet() const;
    void unsetTitle();
    /// <summary>
    /// 
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string const& value);
    bool descriptionIsSet() const;
    void unsetDescription();
    /// <summary>
    /// 
    /// </summary>
    OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties getProperties() const;
    void setProperties(OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties const& value);
    bool propertiesIsSet() const;
    void unsetProperties();
    /// <summary>
    /// 
    /// </summary>
    std::string getBundleLocation() const;
    void setBundleLocation(std::string const& value);
    bool bundleLocationIsSet() const;
    void unsetBundle_location();
    /// <summary>
    /// 
    /// </summary>
    std::string getServiceLocation() const;
    void setServiceLocation(std::string const& value);
    bool serviceLocationIsSet() const;
    void unsetService_location();

protected:
    std::string m_Pid;
    bool m_PidIsSet;
    std::string m_Title;
    bool m_TitleIsSet;
    std::string m_Description;
    bool m_DescriptionIsSet;
    OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties m_Properties;
    bool m_PropertiesIsSet;
    std::string m_Bundle_location;
    bool m_Bundle_locationIsSet;
    std::string m_Service_location;
    bool m_Service_locationIsSet;
};

}
}
}
}

#endif /* OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo_H_ */