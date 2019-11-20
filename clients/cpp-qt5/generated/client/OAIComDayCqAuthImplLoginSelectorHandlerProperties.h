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
 * OAIComDayCqAuthImplLoginSelectorHandlerProperties.h
 *
 * 
 */

#ifndef OAIComDayCqAuthImplLoginSelectorHandlerProperties_H_
#define OAIComDayCqAuthImplLoginSelectorHandlerProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyBoolean.h"
#include "OAIOAIConfigNodePropertyInteger.h"
#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqAuthImplLoginSelectorHandlerProperties: public OAIObject {
public:
    OAIComDayCqAuthImplLoginSelectorHandlerProperties();
    OAIComDayCqAuthImplLoginSelectorHandlerProperties(QString json);
    ~OAIComDayCqAuthImplLoginSelectorHandlerProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComDayCqAuthImplLoginSelectorHandlerProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getPath();
    void setPath(OAIConfigNodePropertyString* path);

    OAIConfigNodePropertyInteger* getServiceRanking();
    void setServiceRanking(OAIConfigNodePropertyInteger* service_ranking);

    OAIConfigNodePropertyArray* getAuthLoginselectorMappings();
    void setAuthLoginselectorMappings(OAIConfigNodePropertyArray* auth_loginselector_mappings);

    OAIConfigNodePropertyArray* getAuthLoginselectorChangepwMappings();
    void setAuthLoginselectorChangepwMappings(OAIConfigNodePropertyArray* auth_loginselector_changepw_mappings);

    OAIConfigNodePropertyString* getAuthLoginselectorDefaultloginpage();
    void setAuthLoginselectorDefaultloginpage(OAIConfigNodePropertyString* auth_loginselector_defaultloginpage);

    OAIConfigNodePropertyString* getAuthLoginselectorDefaultchangepwpage();
    void setAuthLoginselectorDefaultchangepwpage(OAIConfigNodePropertyString* auth_loginselector_defaultchangepwpage);

    OAIConfigNodePropertyArray* getAuthLoginselectorHandle();
    void setAuthLoginselectorHandle(OAIConfigNodePropertyArray* auth_loginselector_handle);

    OAIConfigNodePropertyBoolean* getAuthLoginselectorHandleAllExtensions();
    void setAuthLoginselectorHandleAllExtensions(OAIConfigNodePropertyBoolean* auth_loginselector_handle_all_extensions);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* path;
    bool m_path_isSet;

    OAIConfigNodePropertyInteger* service_ranking;
    bool m_service_ranking_isSet;

    OAIConfigNodePropertyArray* auth_loginselector_mappings;
    bool m_auth_loginselector_mappings_isSet;

    OAIConfigNodePropertyArray* auth_loginselector_changepw_mappings;
    bool m_auth_loginselector_changepw_mappings_isSet;

    OAIConfigNodePropertyString* auth_loginselector_defaultloginpage;
    bool m_auth_loginselector_defaultloginpage_isSet;

    OAIConfigNodePropertyString* auth_loginselector_defaultchangepwpage;
    bool m_auth_loginselector_defaultchangepwpage_isSet;

    OAIConfigNodePropertyArray* auth_loginselector_handle;
    bool m_auth_loginselector_handle_isSet;

    OAIConfigNodePropertyBoolean* auth_loginselector_handle_all_extensions;
    bool m_auth_loginselector_handle_all_extensions_isSet;

};

}

#endif /* OAIComDayCqAuthImplLoginSelectorHandlerProperties_H_ */