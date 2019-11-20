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
 * OAIOrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties_H
#define OAIOrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyArray.h"
#include "OAIConfigNodePropertyInteger.h"
#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties: public OAIObject {
public:
    OAIOrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties();
    OAIOrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(QString json);
    ~OAIOrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray getDatasources() const;
    void setDatasources(const OAIConfigNodePropertyArray &datasources);

    OAIConfigNodePropertyInteger getStep() const;
    void setStep(const OAIConfigNodePropertyInteger &step);

    OAIConfigNodePropertyArray getArchives() const;
    void setArchives(const OAIConfigNodePropertyArray &archives);

    OAIConfigNodePropertyString getPath() const;
    void setPath(const OAIConfigNodePropertyString &path);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyArray datasources;
    bool m_datasources_isSet;

    OAIConfigNodePropertyInteger step;
    bool m_step_isSet;

    OAIConfigNodePropertyArray archives;
    bool m_archives_isSet;

    OAIConfigNodePropertyString path;
    bool m_path_isSet;

};

}

#endif // OAIOrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties_H