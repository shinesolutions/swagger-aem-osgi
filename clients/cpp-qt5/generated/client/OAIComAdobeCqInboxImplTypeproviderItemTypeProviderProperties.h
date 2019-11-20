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
 * OAIComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqInboxImplTypeproviderItemTypeProviderProperties_H_
#define OAIComAdobeCqInboxImplTypeproviderItemTypeProviderProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqInboxImplTypeproviderItemTypeProviderProperties: public OAIObject {
public:
    OAIComAdobeCqInboxImplTypeproviderItemTypeProviderProperties();
    OAIComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(QString json);
    ~OAIComAdobeCqInboxImplTypeproviderItemTypeProviderProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeCqInboxImplTypeproviderItemTypeProviderProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray* getInboxImplTypeproviderRegistrypaths();
    void setInboxImplTypeproviderRegistrypaths(OAIConfigNodePropertyArray* inbox_impl_typeprovider_registrypaths);

    OAIConfigNodePropertyArray* getInboxImplTypeproviderLegacypaths();
    void setInboxImplTypeproviderLegacypaths(OAIConfigNodePropertyArray* inbox_impl_typeprovider_legacypaths);

    OAIConfigNodePropertyString* getInboxImplTypeproviderDefaulturlFailureitem();
    void setInboxImplTypeproviderDefaulturlFailureitem(OAIConfigNodePropertyString* inbox_impl_typeprovider_defaulturl_failureitem);

    OAIConfigNodePropertyString* getInboxImplTypeproviderDefaulturlWorkitem();
    void setInboxImplTypeproviderDefaulturlWorkitem(OAIConfigNodePropertyString* inbox_impl_typeprovider_defaulturl_workitem);

    OAIConfigNodePropertyString* getInboxImplTypeproviderDefaulturlTask();
    void setInboxImplTypeproviderDefaulturlTask(OAIConfigNodePropertyString* inbox_impl_typeprovider_defaulturl_task);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyArray* inbox_impl_typeprovider_registrypaths;
    bool m_inbox_impl_typeprovider_registrypaths_isSet;

    OAIConfigNodePropertyArray* inbox_impl_typeprovider_legacypaths;
    bool m_inbox_impl_typeprovider_legacypaths_isSet;

    OAIConfigNodePropertyString* inbox_impl_typeprovider_defaulturl_failureitem;
    bool m_inbox_impl_typeprovider_defaulturl_failureitem_isSet;

    OAIConfigNodePropertyString* inbox_impl_typeprovider_defaulturl_workitem;
    bool m_inbox_impl_typeprovider_defaulturl_workitem_isSet;

    OAIConfigNodePropertyString* inbox_impl_typeprovider_defaulturl_task;
    bool m_inbox_impl_typeprovider_defaulturl_task_isSet;

};

}

#endif /* OAIComAdobeCqInboxImplTypeproviderItemTypeProviderProperties_H_ */