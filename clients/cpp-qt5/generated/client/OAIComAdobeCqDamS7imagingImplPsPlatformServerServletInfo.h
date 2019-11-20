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
 * OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo.h
 *
 * 
 */

#ifndef OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo_H_
#define OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo_H_

#include <QJsonObject>


#include "OAIOAIComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.h"
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo: public OAIObject {
public:
    OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo();
    OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo(QString json);
    ~OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo* fromJson(QString jsonString) override;

    QString* getPid();
    void setPid(QString* pid);

    QString* getTitle();
    void setTitle(QString* title);

    QString* getDescription();
    void setDescription(QString* description);

    OAIComAdobeCqDamS7imagingImplPsPlatformServerServletProperties* getProperties();
    void setProperties(OAIComAdobeCqDamS7imagingImplPsPlatformServerServletProperties* properties);


    virtual bool isSet() override;

private:
    QString* pid;
    bool m_pid_isSet;

    QString* title;
    bool m_title_isSet;

    QString* description;
    bool m_description_isSet;

    OAIComAdobeCqDamS7imagingImplPsPlatformServerServletProperties* properties;
    bool m_properties_isSet;

};

}

#endif /* OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo_H_ */