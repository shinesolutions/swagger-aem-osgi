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
 * OAIComAdobeGraniteRestImplServletDefaultGETServletProperties.h
 *
 * 
 */

#ifndef OAIComAdobeGraniteRestImplServletDefaultGETServletProperties_H
#define OAIComAdobeGraniteRestImplServletDefaultGETServletProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyBoolean.h"
#include "OAIConfigNodePropertyInteger.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeGraniteRestImplServletDefaultGETServletProperties: public OAIObject {
public:
    OAIComAdobeGraniteRestImplServletDefaultGETServletProperties();
    OAIComAdobeGraniteRestImplServletDefaultGETServletProperties(QString json);
    ~OAIComAdobeGraniteRestImplServletDefaultGETServletProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyInteger getDefaultLimit() const;
    void setDefaultLimit(const OAIConfigNodePropertyInteger &default_limit);

    OAIConfigNodePropertyBoolean getUseAbsoluteUri() const;
    void setUseAbsoluteUri(const OAIConfigNodePropertyBoolean &use_absolute_uri);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyInteger default_limit;
    bool m_default_limit_isSet;

    OAIConfigNodePropertyBoolean use_absolute_uri;
    bool m_use_absolute_uri_isSet;

};

}

#endif // OAIComAdobeGraniteRestImplServletDefaultGETServletProperties_H