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
 * OAIComDayCqMailerDefaultMailServiceProperties.h
 *
 * 
 */

#ifndef OAIComDayCqMailerDefaultMailServiceProperties_H_
#define OAIComDayCqMailerDefaultMailServiceProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyBoolean.h"
#include "OAIOAIConfigNodePropertyInteger.h"
#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqMailerDefaultMailServiceProperties: public OAIObject {
public:
    OAIComDayCqMailerDefaultMailServiceProperties();
    OAIComDayCqMailerDefaultMailServiceProperties(QString json);
    ~OAIComDayCqMailerDefaultMailServiceProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComDayCqMailerDefaultMailServiceProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getSmtpHost();
    void setSmtpHost(OAIConfigNodePropertyString* smtp_host);

    OAIConfigNodePropertyInteger* getSmtpPort();
    void setSmtpPort(OAIConfigNodePropertyInteger* smtp_port);

    OAIConfigNodePropertyString* getSmtpUser();
    void setSmtpUser(OAIConfigNodePropertyString* smtp_user);

    OAIConfigNodePropertyString* getSmtpPassword();
    void setSmtpPassword(OAIConfigNodePropertyString* smtp_password);

    OAIConfigNodePropertyString* getFromAddress();
    void setFromAddress(OAIConfigNodePropertyString* from_address);

    OAIConfigNodePropertyBoolean* getSmtpSsl();
    void setSmtpSsl(OAIConfigNodePropertyBoolean* smtp_ssl);

    OAIConfigNodePropertyBoolean* getSmtpStarttls();
    void setSmtpStarttls(OAIConfigNodePropertyBoolean* smtp_starttls);

    OAIConfigNodePropertyBoolean* getDebugEmail();
    void setDebugEmail(OAIConfigNodePropertyBoolean* debug_email);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* smtp_host;
    bool m_smtp_host_isSet;

    OAIConfigNodePropertyInteger* smtp_port;
    bool m_smtp_port_isSet;

    OAIConfigNodePropertyString* smtp_user;
    bool m_smtp_user_isSet;

    OAIConfigNodePropertyString* smtp_password;
    bool m_smtp_password_isSet;

    OAIConfigNodePropertyString* from_address;
    bool m_from_address_isSet;

    OAIConfigNodePropertyBoolean* smtp_ssl;
    bool m_smtp_ssl_isSet;

    OAIConfigNodePropertyBoolean* smtp_starttls;
    bool m_smtp_starttls_isSet;

    OAIConfigNodePropertyBoolean* debug_email;
    bool m_debug_email_isSet;

};

}

#endif /* OAIComDayCqMailerDefaultMailServiceProperties_H_ */
