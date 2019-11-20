/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties
    : public ModelBase
{
public:
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties();
    virtual ~ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getOperation() const;
    bool operationIsSet() const;
    void unsetOperation();
    void setOperation(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getOperationIcon() const;
    bool operationIconIsSet() const;
    void unsetOperationIcon();
    void setOperationIcon(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getTopicName() const;
    bool topicNameIsSet() const;
    void unsetTopicName();
    void setTopicName(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getEmailEnabled() const;
    bool emailEnabledIsSet() const;
    void unsetEmailEnabled();
    void setEmailEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Operation;
    bool m_OperationIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_OperationIcon;
    bool m_OperationIconIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_TopicName;
    bool m_TopicNameIsSet;
    std::shared_ptr<ConfigNodePropertyBoolean> m_EmailEnabled;
    bool m_EmailEnabledIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties_H_ */