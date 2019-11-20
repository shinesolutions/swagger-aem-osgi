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
 * OAIComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties.h
 *
 * 
 */

#ifndef OAIComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties_H_
#define OAIComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyInteger.h"
#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties: public OAIObject {
public:
    OAIComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties();
    OAIComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties(QString json);
    ~OAIComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyInteger* getServiceRanking();
    void setServiceRanking(OAIConfigNodePropertyInteger* service_ranking);

    OAIConfigNodePropertyString* getTagpattern();
    void setTagpattern(OAIConfigNodePropertyString* tagpattern);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyInteger* service_ranking;
    bool m_service_ranking_isSet;

    OAIConfigNodePropertyString* tagpattern;
    bool m_tagpattern_isSet;

};

}

#endif /* OAIComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties_H_ */