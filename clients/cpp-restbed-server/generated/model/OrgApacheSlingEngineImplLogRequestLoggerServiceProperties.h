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
 * OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.h
 *
 * 
 */

#ifndef OrgApacheSlingEngineImplLogRequestLoggerServiceProperties_H_
#define OrgApacheSlingEngineImplLogRequestLoggerServiceProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingEngineImplLogRequestLoggerServiceProperties
{
public:
    OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();
    virtual ~OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// OrgApacheSlingEngineImplLogRequestLoggerServiceProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getRequestLogServiceFormat() const;
    void setRequestLogServiceFormat(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getRequestLogServiceOutput() const;
    void setRequestLogServiceOutput(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyDropDown> getRequestLogServiceOutputtype() const;
    void setRequestLogServiceOutputtype(std::shared_ptr<ConfigNodePropertyDropDown> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getRequestLogServiceOnentry() const;
    void setRequestLogServiceOnentry(std::shared_ptr<ConfigNodePropertyBoolean> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Request_log_service_format;
    std::shared_ptr<ConfigNodePropertyString> m_Request_log_service_output;
    std::shared_ptr<ConfigNodePropertyDropDown> m_Request_log_service_outputtype;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Request_log_service_onentry;
};

}
}
}
}

#endif /* OrgApacheSlingEngineImplLogRequestLoggerServiceProperties_H_ */
