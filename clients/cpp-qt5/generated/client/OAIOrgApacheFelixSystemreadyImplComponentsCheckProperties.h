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
 * OAIOrgApacheFelixSystemreadyImplComponentsCheckProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheFelixSystemreadyImplComponentsCheckProperties_H_
#define OAIOrgApacheFelixSystemreadyImplComponentsCheckProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyDropDown.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheFelixSystemreadyImplComponentsCheckProperties: public OAIObject {
public:
    OAIOrgApacheFelixSystemreadyImplComponentsCheckProperties();
    OAIOrgApacheFelixSystemreadyImplComponentsCheckProperties(QString json);
    ~OAIOrgApacheFelixSystemreadyImplComponentsCheckProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIOrgApacheFelixSystemreadyImplComponentsCheckProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray* getComponentsList();
    void setComponentsList(OAIConfigNodePropertyArray* components_list);

    OAIConfigNodePropertyDropDown* getType();
    void setType(OAIConfigNodePropertyDropDown* type);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyArray* components_list;
    bool m_components_list_isSet;

    OAIConfigNodePropertyDropDown* type;
    bool m_type_isSet;

};

}

#endif /* OAIOrgApacheFelixSystemreadyImplComponentsCheckProperties_H_ */