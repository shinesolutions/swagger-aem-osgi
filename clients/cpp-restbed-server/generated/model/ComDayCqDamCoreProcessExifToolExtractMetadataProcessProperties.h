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
 * ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.h
 *
 * 
 */

#ifndef ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties_H_
#define ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties
{
public:
    ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties();
    virtual ~ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getProcessLabel() const;
    void setProcessLabel(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getCqDamEnableSha1() const;
    void setCqDamEnableSha1(std::shared_ptr<ConfigNodePropertyBoolean> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Process_label;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Cq_dam_enable_sha1;
};

}
}
}
}

#endif /* ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties_H_ */