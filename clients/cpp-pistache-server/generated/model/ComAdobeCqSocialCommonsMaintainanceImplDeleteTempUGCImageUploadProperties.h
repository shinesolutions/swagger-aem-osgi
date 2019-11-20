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
 * ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.h
 *
 * 
 */

#ifndef ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties_H_
#define ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyInteger.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties
    : public ModelBase
{
public:
    ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties();
    virtual ~ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getNumberOfDays() const;
    void setNumberOfDays(ConfigNodePropertyInteger const& value);
    bool numberOfDaysIsSet() const;
    void unsetNumberOfDays();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getAgeOfFile() const;
    void setAgeOfFile(ConfigNodePropertyInteger const& value);
    bool ageOfFileIsSet() const;
    void unsetAgeOfFile();

protected:
    ConfigNodePropertyInteger m_NumberOfDays;
    bool m_NumberOfDaysIsSet;
    ConfigNodePropertyInteger m_AgeOfFile;
    bool m_AgeOfFileIsSet;
};

}
}
}
}

#endif /* ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties_H_ */