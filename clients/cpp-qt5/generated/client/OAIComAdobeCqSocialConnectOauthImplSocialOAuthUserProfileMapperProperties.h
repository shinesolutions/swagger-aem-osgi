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
 * OAIComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties_H_
#define OAIComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties: public OAIObject {
public:
    OAIComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties();
    OAIComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties(QString json);
    ~OAIComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray* getFacebook();
    void setFacebook(OAIConfigNodePropertyArray* facebook);

    OAIConfigNodePropertyArray* getTwitter();
    void setTwitter(OAIConfigNodePropertyArray* twitter);

    OAIConfigNodePropertyString* getProviderConfigUserFolder();
    void setProviderConfigUserFolder(OAIConfigNodePropertyString* provider_config_user_folder);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyArray* facebook;
    bool m_facebook_isSet;

    OAIConfigNodePropertyArray* twitter;
    bool m_twitter_isSet;

    OAIConfigNodePropertyString* provider_config_user_folder;
    bool m_provider_config_user_folder_isSet;

};

}

#endif /* OAIComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties_H_ */