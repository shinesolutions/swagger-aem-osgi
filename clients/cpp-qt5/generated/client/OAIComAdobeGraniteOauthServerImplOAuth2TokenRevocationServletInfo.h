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
 * OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo.h
 *
 * 
 */

#ifndef OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo_H_
#define OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo_H_

#include <QJsonObject>


#include "OAIOAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.h"
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo: public OAIObject {
public:
    OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo();
    OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo(QString json);
    ~OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo* fromJson(QString jsonString) override;

    QString* getPid();
    void setPid(QString* pid);

    QString* getTitle();
    void setTitle(QString* title);

    QString* getDescription();
    void setDescription(QString* description);

    OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties* getProperties();
    void setProperties(OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties* properties);


    virtual bool isSet() override;

private:
    QString* pid;
    bool m_pid_isSet;

    QString* title;
    bool m_title_isSet;

    QString* description;
    bool m_description_isSet;

    OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties* properties;
    bool m_properties_isSet;

};

}

#endif /* OAIComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo_H_ */