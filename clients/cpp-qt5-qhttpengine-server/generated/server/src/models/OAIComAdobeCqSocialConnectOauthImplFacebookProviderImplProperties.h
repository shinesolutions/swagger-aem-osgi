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
 * OAIComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties_H
#define OAIComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyArray.h"
#include "OAIConfigNodePropertyBoolean.h"
#include "OAIConfigNodePropertyDropDown.h"
#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties: public OAIObject {
public:
    OAIComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties();
    OAIComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties(QString json);
    ~OAIComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getOauthProviderId() const;
    void setOauthProviderId(const OAIConfigNodePropertyString &oauth_provider_id);

    OAIConfigNodePropertyString getOauthCloudConfigRoot() const;
    void setOauthCloudConfigRoot(const OAIConfigNodePropertyString &oauth_cloud_config_root);

    OAIConfigNodePropertyString getProviderConfigRoot() const;
    void setProviderConfigRoot(const OAIConfigNodePropertyString &provider_config_root);

    OAIConfigNodePropertyBoolean getProviderConfigCreateTagsEnabled() const;
    void setProviderConfigCreateTagsEnabled(const OAIConfigNodePropertyBoolean &provider_config_create_tags_enabled);

    OAIConfigNodePropertyDropDown getProviderConfigUserFolder() const;
    void setProviderConfigUserFolder(const OAIConfigNodePropertyDropDown &provider_config_user_folder);

    OAIConfigNodePropertyBoolean getProviderConfigFacebookFetchFields() const;
    void setProviderConfigFacebookFetchFields(const OAIConfigNodePropertyBoolean &provider_config_facebook_fetch_fields);

    OAIConfigNodePropertyArray getProviderConfigFacebookFields() const;
    void setProviderConfigFacebookFields(const OAIConfigNodePropertyArray &provider_config_facebook_fields);

    OAIConfigNodePropertyBoolean getProviderConfigRefreshUserdataEnabled() const;
    void setProviderConfigRefreshUserdataEnabled(const OAIConfigNodePropertyBoolean &provider_config_refresh_userdata_enabled);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString oauth_provider_id;
    bool m_oauth_provider_id_isSet;

    OAIConfigNodePropertyString oauth_cloud_config_root;
    bool m_oauth_cloud_config_root_isSet;

    OAIConfigNodePropertyString provider_config_root;
    bool m_provider_config_root_isSet;

    OAIConfigNodePropertyBoolean provider_config_create_tags_enabled;
    bool m_provider_config_create_tags_enabled_isSet;

    OAIConfigNodePropertyDropDown provider_config_user_folder;
    bool m_provider_config_user_folder_isSet;

    OAIConfigNodePropertyBoolean provider_config_facebook_fetch_fields;
    bool m_provider_config_facebook_fetch_fields_isSet;

    OAIConfigNodePropertyArray provider_config_facebook_fields;
    bool m_provider_config_facebook_fields_isSet;

    OAIConfigNodePropertyBoolean provider_config_refresh_userdata_enabled;
    bool m_provider_config_refresh_userdata_enabled_isSet;

};

}

#endif // OAIComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties_H