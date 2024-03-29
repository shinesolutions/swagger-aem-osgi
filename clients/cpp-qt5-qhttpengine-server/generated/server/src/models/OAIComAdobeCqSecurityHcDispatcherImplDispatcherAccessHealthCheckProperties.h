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
 * OAIComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties_H
#define OAIComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyArray.h"
#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties: public OAIObject {
public:
    OAIComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties();
    OAIComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(QString json);
    ~OAIComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray getHcTags() const;
    void setHcTags(const OAIConfigNodePropertyArray &hc_tags);

    OAIConfigNodePropertyString getDispatcherAddress() const;
    void setDispatcherAddress(const OAIConfigNodePropertyString &dispatcher_address);

    OAIConfigNodePropertyArray getDispatcherFilterAllowed() const;
    void setDispatcherFilterAllowed(const OAIConfigNodePropertyArray &dispatcher_filter_allowed);

    OAIConfigNodePropertyArray getDispatcherFilterBlocked() const;
    void setDispatcherFilterBlocked(const OAIConfigNodePropertyArray &dispatcher_filter_blocked);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyArray hc_tags;
    bool m_hc_tags_isSet;

    OAIConfigNodePropertyString dispatcher_address;
    bool m_dispatcher_address_isSet;

    OAIConfigNodePropertyArray dispatcher_filter_allowed;
    bool m_dispatcher_filter_allowed_isSet;

    OAIConfigNodePropertyArray dispatcher_filter_blocked;
    bool m_dispatcher_filter_blocked_isSet;

};

}

#endif // OAIComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties_H
