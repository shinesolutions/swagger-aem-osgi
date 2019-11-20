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
 * OAIComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties_H
#define OAIComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties_H

#include <QJsonObject>


#include "OAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties: public OAIObject {
public:
    OAIComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties();
    OAIComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties(QString json);
    ~OAIComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIConfigNodePropertyString getPipelineType() const;
    void setPipelineType(const OAIConfigNodePropertyString &pipeline_type);

    virtual bool isSet() const override;

private:
    OAIConfigNodePropertyString pipeline_type;
    bool m_pipeline_type_isSet;

};

}

#endif // OAIComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties_H