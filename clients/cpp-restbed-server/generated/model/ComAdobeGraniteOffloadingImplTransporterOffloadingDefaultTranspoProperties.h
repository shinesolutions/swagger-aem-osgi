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
 * ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.h
 *
 * 
 */

#ifndef ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties_H_
#define ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties_H_



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
class  ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties
{
public:
    ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties();
    virtual ~ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getDefaultTransportAgentToWorkerPrefix() const;
    void setDefaultTransportAgentToWorkerPrefix(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getDefaultTransportAgentToMasterPrefix() const;
    void setDefaultTransportAgentToMasterPrefix(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getDefaultTransportInputPackage() const;
    void setDefaultTransportInputPackage(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getDefaultTransportOutputPackage() const;
    void setDefaultTransportOutputPackage(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getDefaultTransportReplicationSynchronous() const;
    void setDefaultTransportReplicationSynchronous(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getDefaultTransportContentpackage() const;
    void setDefaultTransportContentpackage(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getOffloadingTransporterDefaultEnabled() const;
    void setOffloadingTransporterDefaultEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Default_transport_agent_to_worker_prefix;
    std::shared_ptr<ConfigNodePropertyString> m_Default_transport_agent_to_master_prefix;
    std::shared_ptr<ConfigNodePropertyString> m_Default_transport_input_package;
    std::shared_ptr<ConfigNodePropertyString> m_Default_transport_output_package;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Default_transport_replication_synchronous;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Default_transport_contentpackage;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Offloading_transporter_default_enabled;
};

}
}
}
}

#endif /* ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties_H_ */