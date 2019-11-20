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
 * OAIOrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties_H
#define OAIOrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyInteger.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties: public OAIObject {
public:
    OAIOrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties();
    OAIOrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(QString json);
    ~OAIOrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyInteger getTotalWidth() const;
    void setTotalWidth(const OAIConfigNodePropertyInteger &total_width);

    OAIConfigNodePropertyInteger getColWidthName() const;
    void setColWidthName(const OAIConfigNodePropertyInteger &col_width_name);

    OAIConfigNodePropertyInteger getColWidthResult() const;
    void setColWidthResult(const OAIConfigNodePropertyInteger &col_width_result);

    OAIConfigNodePropertyInteger getColWidthTiming() const;
    void setColWidthTiming(const OAIConfigNodePropertyInteger &col_width_timing);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyInteger total_width;
    bool m_total_width_isSet;

    OAIConfigNodePropertyInteger col_width_name;
    bool m_col_width_name_isSet;

    OAIConfigNodePropertyInteger col_width_result;
    bool m_col_width_result_isSet;

    OAIConfigNodePropertyInteger col_width_timing;
    bool m_col_width_timing_isSet;

};

}

#endif // OAIOrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties_H