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
 * OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.h
 *
 * 
 */

#ifndef OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties_H_
#define OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
{
public:
    OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties();
    virtual ~OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getName() const;
    void setName(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getMinPoolSize() const;
    void setMinPoolSize(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getMaxPoolSize() const;
    void setMaxPoolSize(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getQueueSize() const;
    void setQueueSize(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getMaxThreadAge() const;
    void setMaxThreadAge(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getKeepAliveTime() const;
    void setKeepAliveTime(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyDropDown> getBlockPolicy() const;
    void setBlockPolicy(std::shared_ptr<ConfigNodePropertyDropDown> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getShutdownGraceful() const;
    void setShutdownGraceful(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getDaemon() const;
    void setDaemon(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getShutdownWaitTime() const;
    void setShutdownWaitTime(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyDropDown> getPriority() const;
    void setPriority(std::shared_ptr<ConfigNodePropertyDropDown> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Name;
    std::shared_ptr<ConfigNodePropertyInteger> m_MinPoolSize;
    std::shared_ptr<ConfigNodePropertyInteger> m_MaxPoolSize;
    std::shared_ptr<ConfigNodePropertyInteger> m_QueueSize;
    std::shared_ptr<ConfigNodePropertyInteger> m_MaxThreadAge;
    std::shared_ptr<ConfigNodePropertyInteger> m_KeepAliveTime;
    std::shared_ptr<ConfigNodePropertyDropDown> m_BlockPolicy;
    std::shared_ptr<ConfigNodePropertyBoolean> m_ShutdownGraceful;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Daemon;
    std::shared_ptr<ConfigNodePropertyInteger> m_ShutdownWaitTime;
    std::shared_ptr<ConfigNodePropertyDropDown> m_Priority;
};

}
}
}
}

#endif /* OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties_H_ */