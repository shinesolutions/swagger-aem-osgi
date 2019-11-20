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
 * OAIOrgApacheSlingTenantInternalTenantProviderImplProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingTenantInternalTenantProviderImplProperties_H
#define OAIOrgApacheSlingTenantInternalTenantProviderImplProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyArray.h"
#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingTenantInternalTenantProviderImplProperties: public OAIObject {
public:
    OAIOrgApacheSlingTenantInternalTenantProviderImplProperties();
    OAIOrgApacheSlingTenantInternalTenantProviderImplProperties(QString json);
    ~OAIOrgApacheSlingTenantInternalTenantProviderImplProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getTenantRoot() const;
    void setTenantRoot(const OAIConfigNodePropertyString &tenant_root);

    OAIConfigNodePropertyArray getTenantPathMatcher() const;
    void setTenantPathMatcher(const OAIConfigNodePropertyArray &tenant_path_matcher);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString tenant_root;
    bool m_tenant_root_isSet;

    OAIConfigNodePropertyArray tenant_path_matcher;
    bool m_tenant_path_matcher_isSet;

};

}

#endif // OAIOrgApacheSlingTenantInternalTenantProviderImplProperties_H