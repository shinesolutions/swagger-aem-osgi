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
 * OAIOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties_H_
#define OAIOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties: public OAIObject {
public:
    OAIOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties();
    OAIOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(QString json);
    ~OAIOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getDatasourceName();
    void setDatasourceName(OAIConfigNodePropertyString* datasource_name);

    OAIConfigNodePropertyString* getDatasourceSvcPropName();
    void setDatasourceSvcPropName(OAIConfigNodePropertyString* datasource_svc_prop_name);

    OAIConfigNodePropertyString* getDatasourceJndiName();
    void setDatasourceJndiName(OAIConfigNodePropertyString* datasource_jndi_name);

    OAIConfigNodePropertyArray* getJndiProperties();
    void setJndiProperties(OAIConfigNodePropertyArray* jndi_properties);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* datasource_name;
    bool m_datasource_name_isSet;

    OAIConfigNodePropertyString* datasource_svc_prop_name;
    bool m_datasource_svc_prop_name_isSet;

    OAIConfigNodePropertyString* datasource_jndi_name;
    bool m_datasource_jndi_name_isSet;

    OAIConfigNodePropertyArray* jndi_properties;
    bool m_jndi_properties_isSet;

};

}

#endif /* OAIOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties_H_ */