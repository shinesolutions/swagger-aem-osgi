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
 * OAIComDayCqWcmFoundationImplPageRedirectServletProperties.h
 *
 * 
 */

#ifndef OAIComDayCqWcmFoundationImplPageRedirectServletProperties_H
#define OAIComDayCqWcmFoundationImplPageRedirectServletProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyArray.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqWcmFoundationImplPageRedirectServletProperties: public OAIObject {
public:
    OAIComDayCqWcmFoundationImplPageRedirectServletProperties();
    OAIComDayCqWcmFoundationImplPageRedirectServletProperties(QString json);
    ~OAIComDayCqWcmFoundationImplPageRedirectServletProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray getExcludedResourceTypes() const;
    void setExcludedResourceTypes(const OAIConfigNodePropertyArray &excluded_resource_types);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyArray excluded_resource_types;
    bool m_excluded_resource_types_isSet;

};

}

#endif // OAIComDayCqWcmFoundationImplPageRedirectServletProperties_H