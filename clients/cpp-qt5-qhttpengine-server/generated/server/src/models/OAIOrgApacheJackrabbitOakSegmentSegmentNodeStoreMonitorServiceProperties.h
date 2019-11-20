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
 * OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H
#define OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyArray.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties: public OAIObject {
public:
    OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties();
    OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties(QString json);
    ~OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyArray getCommitsTrackerWriterGroups() const;
    void setCommitsTrackerWriterGroups(const OAIConfigNodePropertyArray &commits_tracker_writer_groups);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyArray commits_tracker_writer_groups;
    bool m_commits_tracker_writer_groups_isSet;

};

}

#endif // OAIOrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties_H