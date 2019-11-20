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
 * OAIComDayCqAuthImplCugCugSupportImplProperties.h
 *
 * 
 */

#ifndef OAIComDayCqAuthImplCugCugSupportImplProperties_H_
#define OAIComDayCqAuthImplCugCugSupportImplProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyBoolean.h"
#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqAuthImplCugCugSupportImplProperties: public OAIObject {
public:
    OAIComDayCqAuthImplCugCugSupportImplProperties();
    OAIComDayCqAuthImplCugCugSupportImplProperties(QString json);
    ~OAIComDayCqAuthImplCugCugSupportImplProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComDayCqAuthImplCugCugSupportImplProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray* getCugExemptedPrincipals();
    void setCugExemptedPrincipals(OAIConfigNodePropertyArray* cug_exempted_principals);

    OAIConfigNodePropertyBoolean* getCugEnabled();
    void setCugEnabled(OAIConfigNodePropertyBoolean* cug_enabled);

    OAIConfigNodePropertyString* getCugPrincipalsRegex();
    void setCugPrincipalsRegex(OAIConfigNodePropertyString* cug_principals_regex);

    OAIConfigNodePropertyString* getCugPrincipalsReplacement();
    void setCugPrincipalsReplacement(OAIConfigNodePropertyString* cug_principals_replacement);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyArray* cug_exempted_principals;
    bool m_cug_exempted_principals_isSet;

    OAIConfigNodePropertyBoolean* cug_enabled;
    bool m_cug_enabled_isSet;

    OAIConfigNodePropertyString* cug_principals_regex;
    bool m_cug_principals_regex_isSet;

    OAIConfigNodePropertyString* cug_principals_replacement;
    bool m_cug_principals_replacement_isSet;

};

}

#endif /* OAIComDayCqAuthImplCugCugSupportImplProperties_H_ */