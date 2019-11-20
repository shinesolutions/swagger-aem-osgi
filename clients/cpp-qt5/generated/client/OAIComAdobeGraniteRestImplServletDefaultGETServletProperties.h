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

#ifndef OAIComAdobeGraniteRestImplServletDefaultGETServletProperties_H_
#define OAIComAdobeGraniteRestImplServletDefaultGETServletProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyBoolean.h"
#include "OAIOAIConfigNodePropertyInteger.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeGraniteRestImplServletDefaultGETServletProperties: public OAIObject {
public:
    OAIComAdobeGraniteRestImplServletDefaultGETServletProperties();
    OAIComAdobeGraniteRestImplServletDefaultGETServletProperties(QString json);
    ~OAIComAdobeGraniteRestImplServletDefaultGETServletProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeGraniteRestImplServletDefaultGETServletProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyInteger* getDefaultLimit();
    void setDefaultLimit(OAIConfigNodePropertyInteger* default_limit);

    OAIConfigNodePropertyBoolean* getUseAbsoluteUri();
    void setUseAbsoluteUri(OAIConfigNodePropertyBoolean* use_absolute_uri);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyInteger* default_limit;
    bool m_default_limit_isSet;

    OAIConfigNodePropertyBoolean* use_absolute_uri;
    bool m_use_absolute_uri_isSet;

};

}

#endif /* OAIComAdobeGraniteRestImplServletDefaultGETServletProperties_H_ */