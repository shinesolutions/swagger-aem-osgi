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
 * OAIOrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingCommonsLogLogManagerFactoryWriterProperties_H
#define OAIOrgApacheSlingCommonsLogLogManagerFactoryWriterProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyBoolean.h"
#include "OAIConfigNodePropertyInteger.h"
#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingCommonsLogLogManagerFactoryWriterProperties: public OAIObject {
public:
    OAIOrgApacheSlingCommonsLogLogManagerFactoryWriterProperties();
    OAIOrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(QString json);
    ~OAIOrgApacheSlingCommonsLogLogManagerFactoryWriterProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getOrgApacheSlingCommonsLogFile() const;
    void setOrgApacheSlingCommonsLogFile(const OAIConfigNodePropertyString &org_apache_sling_commons_log_file);

    OAIConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() const;
    void setOrgApacheSlingCommonsLogFileNumber(const OAIConfigNodePropertyInteger &org_apache_sling_commons_log_file_number);

    OAIConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() const;
    void setOrgApacheSlingCommonsLogFileSize(const OAIConfigNodePropertyString &org_apache_sling_commons_log_file_size);

    OAIConfigNodePropertyBoolean getOrgApacheSlingCommonsLogFileBuffered() const;
    void setOrgApacheSlingCommonsLogFileBuffered(const OAIConfigNodePropertyBoolean &org_apache_sling_commons_log_file_buffered);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString org_apache_sling_commons_log_file;
    bool m_org_apache_sling_commons_log_file_isSet;

    OAIConfigNodePropertyInteger org_apache_sling_commons_log_file_number;
    bool m_org_apache_sling_commons_log_file_number_isSet;

    OAIConfigNodePropertyString org_apache_sling_commons_log_file_size;
    bool m_org_apache_sling_commons_log_file_size_isSet;

    OAIConfigNodePropertyBoolean org_apache_sling_commons_log_file_buffered;
    bool m_org_apache_sling_commons_log_file_buffered_isSet;

};

}

#endif // OAIOrgApacheSlingCommonsLogLogManagerFactoryWriterProperties_H