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

#ifndef OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo_H
#define OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo_H

#include <QJsonObject>


#include "OAIComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.h"
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo: public OAIObject {
public:
    OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo();
    OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo(QString json);
    ~OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getPid() const;
    void setPid(const QString &pid);

    QString getTitle() const;
    void setTitle(const QString &title);

    QString getDescription() const;
    void setDescription(const QString &description);

    OAIComAdobeCqDamS7imagingImplPsPlatformServerServletProperties getProperties() const;
    void setProperties(const OAIComAdobeCqDamS7imagingImplPsPlatformServerServletProperties &properties);

    virtual bool isSet() const override;

private:
    QString pid;
    bool m_pid_isSet;

    QString title;
    bool m_title_isSet;

    QString description;
    bool m_description_isSet;

    OAIComAdobeCqDamS7imagingImplPsPlatformServerServletProperties properties;
    bool m_properties_isSet;

};

}

#endif // OAIComAdobeCqDamS7imagingImplPsPlatformServerServletInfo_H