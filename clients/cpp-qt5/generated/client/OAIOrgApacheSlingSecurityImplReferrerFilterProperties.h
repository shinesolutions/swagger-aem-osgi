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
 * OAIOrgApacheSlingSecurityImplReferrerFilterProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingSecurityImplReferrerFilterProperties_H_
#define OAIOrgApacheSlingSecurityImplReferrerFilterProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyBoolean.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingSecurityImplReferrerFilterProperties: public OAIObject {
public:
    OAIOrgApacheSlingSecurityImplReferrerFilterProperties();
    OAIOrgApacheSlingSecurityImplReferrerFilterProperties(QString json);
    ~OAIOrgApacheSlingSecurityImplReferrerFilterProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIOrgApacheSlingSecurityImplReferrerFilterProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyBoolean* getAllowEmpty();
    void setAllowEmpty(OAIConfigNodePropertyBoolean* allow_empty);

    OAIConfigNodePropertyArray* getAllowHosts();
    void setAllowHosts(OAIConfigNodePropertyArray* allow_hosts);

    OAIConfigNodePropertyArray* getAllowHostsRegexp();
    void setAllowHostsRegexp(OAIConfigNodePropertyArray* allow_hosts_regexp);

    OAIConfigNodePropertyArray* getFilterMethods();
    void setFilterMethods(OAIConfigNodePropertyArray* filter_methods);

    OAIConfigNodePropertyArray* getExcludeAgentsRegexp();
    void setExcludeAgentsRegexp(OAIConfigNodePropertyArray* exclude_agents_regexp);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyBoolean* allow_empty;
    bool m_allow_empty_isSet;

    OAIConfigNodePropertyArray* allow_hosts;
    bool m_allow_hosts_isSet;

    OAIConfigNodePropertyArray* allow_hosts_regexp;
    bool m_allow_hosts_regexp_isSet;

    OAIConfigNodePropertyArray* filter_methods;
    bool m_filter_methods_isSet;

    OAIConfigNodePropertyArray* exclude_agents_regexp;
    bool m_exclude_agents_regexp_isSet;

};

}

#endif /* OAIOrgApacheSlingSecurityImplReferrerFilterProperties_H_ */