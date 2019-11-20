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
 * ConfigNodePropertyBoolean.h
 *
 * 
 */

#ifndef ConfigNodePropertyBoolean_H_
#define ConfigNodePropertyBoolean_H_


#include "ModelBase.h"

#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ConfigNodePropertyBoolean
    : public ModelBase
{
public:
    ConfigNodePropertyBoolean();
    virtual ~ConfigNodePropertyBoolean();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ConfigNodePropertyBoolean members

    /// <summary>
    /// property name
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// True if optional
    /// </summary>
    bool isOptional() const;
    void setOptional(bool const value);
    bool optionalIsSet() const;
    void unsetOptional();
    /// <summary>
    /// True if property is set
    /// </summary>
    bool isIsSet() const;
    void setIsSet(bool const value);
    bool isSetIsSet() const;
    void unsetIs_set();
    /// <summary>
    /// Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)
    /// </summary>
    int32_t getType() const;
    void setType(int32_t const value);
    bool typeIsSet() const;
    void unsetType();
    /// <summary>
    /// Property value
    /// </summary>
    bool isValue() const;
    void setValue(bool const value);
    bool valueIsSet() const;
    void unsetValue();
    /// <summary>
    /// Property description
    /// </summary>
    std::string getDescription() const;
    void setDescription(std::string const& value);
    bool descriptionIsSet() const;
    void unsetDescription();

protected:
    std::string m_Name;
    bool m_NameIsSet;
    bool m_Optional;
    bool m_OptionalIsSet;
    bool m_Is_set;
    bool m_Is_setIsSet;
    int32_t m_Type;
    bool m_TypeIsSet;
    bool m_Value;
    bool m_ValueIsSet;
    std::string m_Description;
    bool m_DescriptionIsSet;
};

}
}
}
}

#endif /* ConfigNodePropertyBoolean_H_ */