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
 * OAIComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.h
 *
 * 
 */

#ifndef OAIComDayCqDamInddImplHandlerIndesignXMPHandlerProperties_H
#define OAIComDayCqDamInddImplHandlerIndesignXMPHandlerProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyBoolean.h"
#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqDamInddImplHandlerIndesignXMPHandlerProperties: public OAIObject {
public:
    OAIComDayCqDamInddImplHandlerIndesignXMPHandlerProperties();
    OAIComDayCqDamInddImplHandlerIndesignXMPHandlerProperties(QString json);
    ~OAIComDayCqDamInddImplHandlerIndesignXMPHandlerProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getProcessLabel() const;
    void setProcessLabel(const OAIConfigNodePropertyString &process_label);

    OAIConfigNodePropertyBoolean getExtractPages() const;
    void setExtractPages(const OAIConfigNodePropertyBoolean &extract_pages);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString process_label;
    bool m_process_label_isSet;

    OAIConfigNodePropertyBoolean extract_pages;
    bool m_extract_pages_isSet;

};

}

#endif // OAIComDayCqDamInddImplHandlerIndesignXMPHandlerProperties_H