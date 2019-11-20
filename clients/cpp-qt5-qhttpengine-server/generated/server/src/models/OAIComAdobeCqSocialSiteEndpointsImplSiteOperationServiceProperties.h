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
 * OAIComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties_H
#define OAIComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyArray.h"
#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties: public OAIObject {
public:
    OAIComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties();
    OAIComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(QString json);
    ~OAIComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray getFieldWhitelist() const;
    void setFieldWhitelist(const OAIConfigNodePropertyArray &field_whitelist);

    OAIConfigNodePropertyArray getSitePathFilters() const;
    void setSitePathFilters(const OAIConfigNodePropertyArray &site_path_filters);

    OAIConfigNodePropertyString getSitePackageGroup() const;
    void setSitePackageGroup(const OAIConfigNodePropertyString &site_package_group);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyArray field_whitelist;
    bool m_field_whitelist_isSet;

    OAIConfigNodePropertyArray site_path_filters;
    bool m_site_path_filters_isSet;

    OAIConfigNodePropertyString site_package_group;
    bool m_site_package_group_isSet;

};

}

#endif // OAIComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties_H