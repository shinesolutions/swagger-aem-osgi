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
 * OAIComAdobeGraniteAuthOauthAccesstokenProviderInfo.h
 *
 * 
 */

#ifndef OAIComAdobeGraniteAuthOauthAccesstokenProviderInfo_H_
#define OAIComAdobeGraniteAuthOauthAccesstokenProviderInfo_H_

#include <QJsonObject>


#include "OAIOAIComAdobeGraniteAuthOauthAccesstokenProviderProperties.h"
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeGraniteAuthOauthAccesstokenProviderInfo: public OAIObject {
public:
    OAIComAdobeGraniteAuthOauthAccesstokenProviderInfo();
    OAIComAdobeGraniteAuthOauthAccesstokenProviderInfo(QString json);
    ~OAIComAdobeGraniteAuthOauthAccesstokenProviderInfo();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeGraniteAuthOauthAccesstokenProviderInfo* fromJson(QString jsonString) override;

    QString* getPid();
    void setPid(QString* pid);

    QString* getTitle();
    void setTitle(QString* title);

    QString* getDescription();
    void setDescription(QString* description);

    OAIComAdobeGraniteAuthOauthAccesstokenProviderProperties* getProperties();
    void setProperties(OAIComAdobeGraniteAuthOauthAccesstokenProviderProperties* properties);


    virtual bool isSet() override;

private:
    QString* pid;
    bool m_pid_isSet;

    QString* title;
    bool m_title_isSet;

    QString* description;
    bool m_description_isSet;

    OAIComAdobeGraniteAuthOauthAccesstokenProviderProperties* properties;
    bool m_properties_isSet;

};

}

#endif /* OAIComAdobeGraniteAuthOauthAccesstokenProviderInfo_H_ */