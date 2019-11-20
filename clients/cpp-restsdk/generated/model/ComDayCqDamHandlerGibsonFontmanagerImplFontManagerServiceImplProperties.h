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
 * ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties
    : public ModelBase
{
public:
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties();
    virtual ~ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getEventFilter() const;
    bool eventFilterIsSet() const;
    void unsetEvent_filter();
    void setEventFilter(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getFontmgrSystemFontDir() const;
    bool fontmgrSystemFontDirIsSet() const;
    void unsetFontmgr_system_font_dir();
    void setFontmgrSystemFontDir(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getFontmgrAdobeFontDir() const;
    bool fontmgrAdobeFontDirIsSet() const;
    void unsetFontmgr_adobe_font_dir();
    void setFontmgrAdobeFontDir(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getFontmgrCustomerFontDir() const;
    bool fontmgrCustomerFontDirIsSet() const;
    void unsetFontmgr_customer_font_dir();
    void setFontmgrCustomerFontDir(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Event_filter;
    bool m_Event_filterIsSet;
    std::shared_ptr<ConfigNodePropertyArray> m_Fontmgr_system_font_dir;
    bool m_Fontmgr_system_font_dirIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Fontmgr_adobe_font_dir;
    bool m_Fontmgr_adobe_font_dirIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Fontmgr_customer_font_dir;
    bool m_Fontmgr_customer_font_dirIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties_H_ */