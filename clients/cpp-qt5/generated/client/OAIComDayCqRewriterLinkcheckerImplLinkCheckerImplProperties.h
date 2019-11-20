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
 * OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.h
 *
 * 
 */

#ifndef OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties_H_
#define OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyBoolean.h"
#include "OAIOAIConfigNodePropertyInteger.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties: public OAIObject {
public:
    OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties();
    OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(QString json);
    ~OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyInteger* getSchedulerPeriod();
    void setSchedulerPeriod(OAIConfigNodePropertyInteger* scheduler_period);

    OAIConfigNodePropertyBoolean* getSchedulerConcurrent();
    void setSchedulerConcurrent(OAIConfigNodePropertyBoolean* scheduler_concurrent);

    OAIConfigNodePropertyInteger* getServiceBadLinkToleranceInterval();
    void setServiceBadLinkToleranceInterval(OAIConfigNodePropertyInteger* service_bad_link_tolerance_interval);

    OAIConfigNodePropertyArray* getServiceCheckOverridePatterns();
    void setServiceCheckOverridePatterns(OAIConfigNodePropertyArray* service_check_override_patterns);

    OAIConfigNodePropertyBoolean* getServiceCacheBrokenInternalLinks();
    void setServiceCacheBrokenInternalLinks(OAIConfigNodePropertyBoolean* service_cache_broken_internal_links);

    OAIConfigNodePropertyArray* getServiceSpecialLinkPrefix();
    void setServiceSpecialLinkPrefix(OAIConfigNodePropertyArray* service_special_link_prefix);

    OAIConfigNodePropertyArray* getServiceSpecialLinkPatterns();
    void setServiceSpecialLinkPatterns(OAIConfigNodePropertyArray* service_special_link_patterns);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyInteger* scheduler_period;
    bool m_scheduler_period_isSet;

    OAIConfigNodePropertyBoolean* scheduler_concurrent;
    bool m_scheduler_concurrent_isSet;

    OAIConfigNodePropertyInteger* service_bad_link_tolerance_interval;
    bool m_service_bad_link_tolerance_interval_isSet;

    OAIConfigNodePropertyArray* service_check_override_patterns;
    bool m_service_check_override_patterns_isSet;

    OAIConfigNodePropertyBoolean* service_cache_broken_internal_links;
    bool m_service_cache_broken_internal_links_isSet;

    OAIConfigNodePropertyArray* service_special_link_prefix;
    bool m_service_special_link_prefix_isSet;

    OAIConfigNodePropertyArray* service_special_link_patterns;
    bool m_service_special_link_patterns_isSet;

};

}

#endif /* OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties_H_ */