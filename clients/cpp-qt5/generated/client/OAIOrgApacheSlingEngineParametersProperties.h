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
 * OAIOrgApacheSlingEngineParametersProperties.h
 *
 * 
 */

#ifndef OAIOrgApacheSlingEngineParametersProperties_H_
#define OAIOrgApacheSlingEngineParametersProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyBoolean.h"
#include "OAIOAIConfigNodePropertyInteger.h"
#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIOrgApacheSlingEngineParametersProperties: public OAIObject {
public:
    OAIOrgApacheSlingEngineParametersProperties();
    OAIOrgApacheSlingEngineParametersProperties(QString json);
    ~OAIOrgApacheSlingEngineParametersProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIOrgApacheSlingEngineParametersProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getSlingDefaultParameterEncoding();
    void setSlingDefaultParameterEncoding(OAIConfigNodePropertyString* sling_default_parameter_encoding);

    OAIConfigNodePropertyInteger* getSlingDefaultMaxParameters();
    void setSlingDefaultMaxParameters(OAIConfigNodePropertyInteger* sling_default_max_parameters);

    OAIConfigNodePropertyString* getFileLocation();
    void setFileLocation(OAIConfigNodePropertyString* file_location);

    OAIConfigNodePropertyInteger* getFileThreshold();
    void setFileThreshold(OAIConfigNodePropertyInteger* file_threshold);

    OAIConfigNodePropertyInteger* getFileMax();
    void setFileMax(OAIConfigNodePropertyInteger* file_max);

    OAIConfigNodePropertyInteger* getRequestMax();
    void setRequestMax(OAIConfigNodePropertyInteger* request_max);

    OAIConfigNodePropertyBoolean* getSlingDefaultParameterCheckForAdditionalContainerParameters();
    void setSlingDefaultParameterCheckForAdditionalContainerParameters(OAIConfigNodePropertyBoolean* sling_default_parameter_check_for_additional_container_parameters);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* sling_default_parameter_encoding;
    bool m_sling_default_parameter_encoding_isSet;

    OAIConfigNodePropertyInteger* sling_default_max_parameters;
    bool m_sling_default_max_parameters_isSet;

    OAIConfigNodePropertyString* file_location;
    bool m_file_location_isSet;

    OAIConfigNodePropertyInteger* file_threshold;
    bool m_file_threshold_isSet;

    OAIConfigNodePropertyInteger* file_max;
    bool m_file_max_isSet;

    OAIConfigNodePropertyInteger* request_max;
    bool m_request_max_isSet;

    OAIConfigNodePropertyBoolean* sling_default_parameter_check_for_additional_container_parameters;
    bool m_sling_default_parameter_check_for_additional_container_parameters_isSet;

};

}

#endif /* OAIOrgApacheSlingEngineParametersProperties_H_ */