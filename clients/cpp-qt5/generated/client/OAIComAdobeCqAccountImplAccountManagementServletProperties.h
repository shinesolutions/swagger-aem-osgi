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
 * OAIComAdobeCqAccountImplAccountManagementServletProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqAccountImplAccountManagementServletProperties_H_
#define OAIComAdobeCqAccountImplAccountManagementServletProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqAccountImplAccountManagementServletProperties: public OAIObject {
public:
    OAIComAdobeCqAccountImplAccountManagementServletProperties();
    OAIComAdobeCqAccountImplAccountManagementServletProperties(QString json);
    ~OAIComAdobeCqAccountImplAccountManagementServletProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeCqAccountImplAccountManagementServletProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getCqAccountmanagerConfigInformnewaccountMail();
    void setCqAccountmanagerConfigInformnewaccountMail(OAIConfigNodePropertyString* cq_accountmanager_config_informnewaccount_mail);

    OAIConfigNodePropertyString* getCqAccountmanagerConfigInformnewpwdMail();
    void setCqAccountmanagerConfigInformnewpwdMail(OAIConfigNodePropertyString* cq_accountmanager_config_informnewpwd_mail);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* cq_accountmanager_config_informnewaccount_mail;
    bool m_cq_accountmanager_config_informnewaccount_mail_isSet;

    OAIConfigNodePropertyString* cq_accountmanager_config_informnewpwd_mail;
    bool m_cq_accountmanager_config_informnewpwd_mail_isSet;

};

}

#endif /* OAIComAdobeCqAccountImplAccountManagementServletProperties_H_ */