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
 * OAIComAdobeCqSocialCalendarServletsTimeZoneServletProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqSocialCalendarServletsTimeZoneServletProperties_H
#define OAIComAdobeCqSocialCalendarServletsTimeZoneServletProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyInteger.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqSocialCalendarServletsTimeZoneServletProperties: public OAIObject {
public:
    OAIComAdobeCqSocialCalendarServletsTimeZoneServletProperties();
    OAIComAdobeCqSocialCalendarServletsTimeZoneServletProperties(QString json);
    ~OAIComAdobeCqSocialCalendarServletsTimeZoneServletProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyInteger getTimezonesExpirytime() const;
    void setTimezonesExpirytime(const OAIConfigNodePropertyInteger &timezones_expirytime);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyInteger timezones_expirytime;
    bool m_timezones_expirytime_isSet;

};

}

#endif // OAIComAdobeCqSocialCalendarServletsTimeZoneServletProperties_H