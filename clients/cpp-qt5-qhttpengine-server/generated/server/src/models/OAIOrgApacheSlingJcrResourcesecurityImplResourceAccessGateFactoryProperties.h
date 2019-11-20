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
 * OAIOrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties_H
#define OAIOrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties: public OAIObject {
public:
    OAIOrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties();
    OAIOrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(QString json);
    ~OAIOrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getPath() const;
    void setPath(const OAIConfigNodePropertyString &path);

    OAIConfigNodePropertyString getCheckpathPrefix() const;
    void setCheckpathPrefix(const OAIConfigNodePropertyString &checkpath_prefix);

    OAIConfigNodePropertyString getJcrPath() const;
    void setJcrPath(const OAIConfigNodePropertyString &jcr_path);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString path;
    bool m_path_isSet;

    OAIConfigNodePropertyString checkpath_prefix;
    bool m_checkpath_prefix_isSet;

    OAIConfigNodePropertyString jcr_path;
    bool m_jcr_path_isSet;

};

}

#endif // OAIOrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties_H