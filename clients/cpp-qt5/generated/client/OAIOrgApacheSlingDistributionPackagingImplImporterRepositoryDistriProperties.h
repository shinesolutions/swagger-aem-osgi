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
 * OAIOrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties_H_
#define OAIOrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties: public OAIObject {
public:
    OAIOrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties();
    OAIOrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties(QString json);
    ~OAIOrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIOrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getName();
    void setName(OAIConfigNodePropertyString* name);

    OAIConfigNodePropertyString* getServiceName();
    void setServiceName(OAIConfigNodePropertyString* service_name);

    OAIConfigNodePropertyString* getPath();
    void setPath(OAIConfigNodePropertyString* path);

    OAIConfigNodePropertyString* getPrivilegeName();
    void setPrivilegeName(OAIConfigNodePropertyString* privilege_name);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* name;
    bool m_name_isSet;

    OAIConfigNodePropertyString* service_name;
    bool m_service_name_isSet;

    OAIConfigNodePropertyString* path;
    bool m_path_isSet;

    OAIConfigNodePropertyString* privilege_name;
    bool m_privilege_name_isSet;

};

}

#endif /* OAIOrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties_H_ */