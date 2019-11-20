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
 * OAIOrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_
#define OAIOrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyBoolean.h"
#include "OAIOAIConfigNodePropertyInteger.h"
#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties: public OAIObject {
public:
    OAIOrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties();
    OAIOrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(QString json);
    ~OAIOrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIOrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getPoolName();
    void setPoolName(OAIConfigNodePropertyString* pool_name);

    OAIConfigNodePropertyArray* getAllowedPoolNames();
    void setAllowedPoolNames(OAIConfigNodePropertyArray* allowed_pool_names);

    OAIConfigNodePropertyBoolean* getSchedulerUseleaderforsingle();
    void setSchedulerUseleaderforsingle(OAIConfigNodePropertyBoolean* scheduler_useleaderforsingle);

    OAIConfigNodePropertyArray* getMetricsFilters();
    void setMetricsFilters(OAIConfigNodePropertyArray* metrics_filters);

    OAIConfigNodePropertyInteger* getSlowThresholdMillis();
    void setSlowThresholdMillis(OAIConfigNodePropertyInteger* slow_threshold_millis);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* pool_name;
    bool m_pool_name_isSet;

    OAIConfigNodePropertyArray* allowed_pool_names;
    bool m_allowed_pool_names_isSet;

    OAIConfigNodePropertyBoolean* scheduler_useleaderforsingle;
    bool m_scheduler_useleaderforsingle_isSet;

    OAIConfigNodePropertyArray* metrics_filters;
    bool m_metrics_filters_isSet;

    OAIConfigNodePropertyInteger* slow_threshold_millis;
    bool m_slow_threshold_millis_isSet;

};

}

#endif /* OAIOrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties_H_ */