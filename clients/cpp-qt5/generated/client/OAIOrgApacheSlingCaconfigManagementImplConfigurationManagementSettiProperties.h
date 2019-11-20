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
 * OAIOrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties_H_
#define OAIOrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties: public OAIObject {
public:
    OAIOrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties();
    OAIOrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties(QString json);
    ~OAIOrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIOrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray* getIgnorePropertyNameRegex();
    void setIgnorePropertyNameRegex(OAIConfigNodePropertyArray* ignore_property_name_regex);

    OAIConfigNodePropertyArray* getConfigCollectionPropertiesResourceNames();
    void setConfigCollectionPropertiesResourceNames(OAIConfigNodePropertyArray* config_collection_properties_resource_names);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyArray* ignore_property_name_regex;
    bool m_ignore_property_name_regex_isSet;

    OAIConfigNodePropertyArray* config_collection_properties_resource_names;
    bool m_config_collection_properties_resource_names_isSet;

};

}

#endif /* OAIOrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties_H_ */