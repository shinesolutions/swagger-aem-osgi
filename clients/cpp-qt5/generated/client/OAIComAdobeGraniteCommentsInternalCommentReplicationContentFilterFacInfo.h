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
 * OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo.h
 *
 * 
 */

#ifndef OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo_H_
#define OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo_H_

#include <QJsonObject>


#include "OAIOAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.h"
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo: public OAIObject {
public:
    OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo();
    OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo(QString json);
    ~OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo* fromJson(QString jsonString) override;

    QString* getPid();
    void setPid(QString* pid);

    QString* getTitle();
    void setTitle(QString* title);

    QString* getDescription();
    void setDescription(QString* description);

    OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties* getProperties();
    void setProperties(OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties* properties);


    virtual bool isSet() override;

private:
    QString* pid;
    bool m_pid_isSet;

    QString* title;
    bool m_title_isSet;

    QString* description;
    bool m_description_isSet;

    OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties* properties;
    bool m_properties_isSet;

};

}

#endif /* OAIComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo_H_ */