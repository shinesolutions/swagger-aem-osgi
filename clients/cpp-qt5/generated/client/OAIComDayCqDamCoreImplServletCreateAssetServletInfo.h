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
 * OAIComDayCqDamCoreImplServletCreateAssetServletInfo.h
 *
 * 
 */

#ifndef OAIComDayCqDamCoreImplServletCreateAssetServletInfo_H_
#define OAIComDayCqDamCoreImplServletCreateAssetServletInfo_H_

#include <QJsonObject>


#include "OAIOAIComDayCqDamCoreImplServletCreateAssetServletProperties.h"
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqDamCoreImplServletCreateAssetServletInfo: public OAIObject {
public:
    OAIComDayCqDamCoreImplServletCreateAssetServletInfo();
    OAIComDayCqDamCoreImplServletCreateAssetServletInfo(QString json);
    ~OAIComDayCqDamCoreImplServletCreateAssetServletInfo();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComDayCqDamCoreImplServletCreateAssetServletInfo* fromJson(QString jsonString) override;

    QString* getPid();
    void setPid(QString* pid);

    QString* getTitle();
    void setTitle(QString* title);

    QString* getDescription();
    void setDescription(QString* description);

    OAIComDayCqDamCoreImplServletCreateAssetServletProperties* getProperties();
    void setProperties(OAIComDayCqDamCoreImplServletCreateAssetServletProperties* properties);


    virtual bool isSet() override;

private:
    QString* pid;
    bool m_pid_isSet;

    QString* title;
    bool m_title_isSet;

    QString* description;
    bool m_description_isSet;

    OAIComDayCqDamCoreImplServletCreateAssetServletProperties* properties;
    bool m_properties_isSet;

};

}

#endif /* OAIComDayCqDamCoreImplServletCreateAssetServletInfo_H_ */