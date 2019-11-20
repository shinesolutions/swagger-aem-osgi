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
 * OAIComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties_H
#define OAIComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties: public OAIObject {
public:
    OAIComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties();
    OAIComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties(QString json);
    ~OAIComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getSlingServletSelectors() const;
    void setSlingServletSelectors(const OAIConfigNodePropertyString &sling_servlet_selectors);

    OAIConfigNodePropertyString getSlingServletExtensions() const;
    void setSlingServletExtensions(const OAIConfigNodePropertyString &sling_servlet_extensions);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString sling_servlet_selectors;
    bool m_sling_servlet_selectors_isSet;

    OAIConfigNodePropertyString sling_servlet_extensions;
    bool m_sling_servlet_extensions_isSet;

};

}

#endif // OAIComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties_H