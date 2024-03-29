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
 * OAIComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties_H_
#define OAIComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyBoolean.h"
#include "OAIOAIConfigNodePropertyDropDown.h"
#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties: public OAIObject {
public:
    OAIComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
    OAIComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties(QString json);
    ~OAIComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getOauthProviderId();
    void setOauthProviderId(OAIConfigNodePropertyString* oauth_provider_id);

    OAIConfigNodePropertyString* getOauthCloudConfigRoot();
    void setOauthCloudConfigRoot(OAIConfigNodePropertyString* oauth_cloud_config_root);

    OAIConfigNodePropertyString* getProviderConfigRoot();
    void setProviderConfigRoot(OAIConfigNodePropertyString* provider_config_root);

    OAIConfigNodePropertyDropDown* getProviderConfigUserFolder();
    void setProviderConfigUserFolder(OAIConfigNodePropertyDropDown* provider_config_user_folder);

    OAIConfigNodePropertyBoolean* getProviderConfigTwitterEnableParams();
    void setProviderConfigTwitterEnableParams(OAIConfigNodePropertyBoolean* provider_config_twitter_enable_params);

    OAIConfigNodePropertyArray* getProviderConfigTwitterParams();
    void setProviderConfigTwitterParams(OAIConfigNodePropertyArray* provider_config_twitter_params);

    OAIConfigNodePropertyBoolean* getProviderConfigRefreshUserdataEnabled();
    void setProviderConfigRefreshUserdataEnabled(OAIConfigNodePropertyBoolean* provider_config_refresh_userdata_enabled);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* oauth_provider_id;
    bool m_oauth_provider_id_isSet;

    OAIConfigNodePropertyString* oauth_cloud_config_root;
    bool m_oauth_cloud_config_root_isSet;

    OAIConfigNodePropertyString* provider_config_root;
    bool m_provider_config_root_isSet;

    OAIConfigNodePropertyDropDown* provider_config_user_folder;
    bool m_provider_config_user_folder_isSet;

    OAIConfigNodePropertyBoolean* provider_config_twitter_enable_params;
    bool m_provider_config_twitter_enable_params_isSet;

    OAIConfigNodePropertyArray* provider_config_twitter_params;
    bool m_provider_config_twitter_params_isSet;

    OAIConfigNodePropertyBoolean* provider_config_refresh_userdata_enabled;
    bool m_provider_config_refresh_userdata_enabled_isSet;

};

}

#endif /* OAIComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties_H_ */
