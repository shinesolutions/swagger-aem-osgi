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



#include "OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties()
{
    m_NameIsSet = false;
    m_MinPoolSizeIsSet = false;
    m_MaxPoolSizeIsSet = false;
    m_QueueSizeIsSet = false;
    m_MaxThreadAgeIsSet = false;
    m_KeepAliveTimeIsSet = false;
    m_BlockPolicyIsSet = false;
    m_ShutdownGracefulIsSet = false;
    m_DaemonIsSet = false;
    m_ShutdownWaitTimeIsSet = false;
    m_PriorityIsSet = false;
}

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::~OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties()
{
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::validate()
{
    // TODO: implement validation
}

web::json::value OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    }
    if(m_MinPoolSizeIsSet)
    {
        val[utility::conversions::to_string_t("minPoolSize")] = ModelBase::toJson(m_MinPoolSize);
    }
    if(m_MaxPoolSizeIsSet)
    {
        val[utility::conversions::to_string_t("maxPoolSize")] = ModelBase::toJson(m_MaxPoolSize);
    }
    if(m_QueueSizeIsSet)
    {
        val[utility::conversions::to_string_t("queueSize")] = ModelBase::toJson(m_QueueSize);
    }
    if(m_MaxThreadAgeIsSet)
    {
        val[utility::conversions::to_string_t("maxThreadAge")] = ModelBase::toJson(m_MaxThreadAge);
    }
    if(m_KeepAliveTimeIsSet)
    {
        val[utility::conversions::to_string_t("keepAliveTime")] = ModelBase::toJson(m_KeepAliveTime);
    }
    if(m_BlockPolicyIsSet)
    {
        val[utility::conversions::to_string_t("blockPolicy")] = ModelBase::toJson(m_BlockPolicy);
    }
    if(m_ShutdownGracefulIsSet)
    {
        val[utility::conversions::to_string_t("shutdownGraceful")] = ModelBase::toJson(m_ShutdownGraceful);
    }
    if(m_DaemonIsSet)
    {
        val[utility::conversions::to_string_t("daemon")] = ModelBase::toJson(m_Daemon);
    }
    if(m_ShutdownWaitTimeIsSet)
    {
        val[utility::conversions::to_string_t("shutdownWaitTime")] = ModelBase::toJson(m_ShutdownWaitTime);
    }
    if(m_PriorityIsSet)
    {
        val[utility::conversions::to_string_t("priority")] = ModelBase::toJson(m_Priority);
    }

    return val;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("name")))
    {
        if(!val[utility::conversions::to_string_t("name")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("name")]);
            setName( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("minPoolSize")))
    {
        if(!val[utility::conversions::to_string_t("minPoolSize")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromJson(val[utility::conversions::to_string_t("minPoolSize")]);
            setMinPoolSize( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("maxPoolSize")))
    {
        if(!val[utility::conversions::to_string_t("maxPoolSize")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromJson(val[utility::conversions::to_string_t("maxPoolSize")]);
            setMaxPoolSize( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("queueSize")))
    {
        if(!val[utility::conversions::to_string_t("queueSize")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromJson(val[utility::conversions::to_string_t("queueSize")]);
            setQueueSize( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("maxThreadAge")))
    {
        if(!val[utility::conversions::to_string_t("maxThreadAge")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromJson(val[utility::conversions::to_string_t("maxThreadAge")]);
            setMaxThreadAge( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("keepAliveTime")))
    {
        if(!val[utility::conversions::to_string_t("keepAliveTime")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromJson(val[utility::conversions::to_string_t("keepAliveTime")]);
            setKeepAliveTime( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("blockPolicy")))
    {
        if(!val[utility::conversions::to_string_t("blockPolicy")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyDropDown> newItem(new ConfigNodePropertyDropDown());
            newItem->fromJson(val[utility::conversions::to_string_t("blockPolicy")]);
            setBlockPolicy( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("shutdownGraceful")))
    {
        if(!val[utility::conversions::to_string_t("shutdownGraceful")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("shutdownGraceful")]);
            setShutdownGraceful( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("daemon")))
    {
        if(!val[utility::conversions::to_string_t("daemon")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("daemon")]);
            setDaemon( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("shutdownWaitTime")))
    {
        if(!val[utility::conversions::to_string_t("shutdownWaitTime")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromJson(val[utility::conversions::to_string_t("shutdownWaitTime")]);
            setShutdownWaitTime( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("priority")))
    {
        if(!val[utility::conversions::to_string_t("priority")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyDropDown> newItem(new ConfigNodePropertyDropDown());
            newItem->fromJson(val[utility::conversions::to_string_t("priority")]);
            setPriority( newItem );
        }
    }
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_NameIsSet)
    {
        if (m_Name.get())
        {
            m_Name->toMultipart(multipart, utility::conversions::to_string_t("name."));
        }
    }
    if(m_MinPoolSizeIsSet)
    {
        if (m_MinPoolSize.get())
        {
            m_MinPoolSize->toMultipart(multipart, utility::conversions::to_string_t("minPoolSize."));
        }
    }
    if(m_MaxPoolSizeIsSet)
    {
        if (m_MaxPoolSize.get())
        {
            m_MaxPoolSize->toMultipart(multipart, utility::conversions::to_string_t("maxPoolSize."));
        }
    }
    if(m_QueueSizeIsSet)
    {
        if (m_QueueSize.get())
        {
            m_QueueSize->toMultipart(multipart, utility::conversions::to_string_t("queueSize."));
        }
    }
    if(m_MaxThreadAgeIsSet)
    {
        if (m_MaxThreadAge.get())
        {
            m_MaxThreadAge->toMultipart(multipart, utility::conversions::to_string_t("maxThreadAge."));
        }
    }
    if(m_KeepAliveTimeIsSet)
    {
        if (m_KeepAliveTime.get())
        {
            m_KeepAliveTime->toMultipart(multipart, utility::conversions::to_string_t("keepAliveTime."));
        }
    }
    if(m_BlockPolicyIsSet)
    {
        if (m_BlockPolicy.get())
        {
            m_BlockPolicy->toMultipart(multipart, utility::conversions::to_string_t("blockPolicy."));
        }
    }
    if(m_ShutdownGracefulIsSet)
    {
        if (m_ShutdownGraceful.get())
        {
            m_ShutdownGraceful->toMultipart(multipart, utility::conversions::to_string_t("shutdownGraceful."));
        }
    }
    if(m_DaemonIsSet)
    {
        if (m_Daemon.get())
        {
            m_Daemon->toMultipart(multipart, utility::conversions::to_string_t("daemon."));
        }
    }
    if(m_ShutdownWaitTimeIsSet)
    {
        if (m_ShutdownWaitTime.get())
        {
            m_ShutdownWaitTime->toMultipart(multipart, utility::conversions::to_string_t("shutdownWaitTime."));
        }
    }
    if(m_PriorityIsSet)
    {
        if (m_Priority.get())
        {
            m_Priority->toMultipart(multipart, utility::conversions::to_string_t("priority."));
        }
    }
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("name")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("name")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("name."));
            setName( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("minPoolSize")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("minPoolSize")))
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("minPoolSize."));
            setMinPoolSize( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("maxPoolSize")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("maxPoolSize")))
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("maxPoolSize."));
            setMaxPoolSize( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("queueSize")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("queueSize")))
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("queueSize."));
            setQueueSize( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("maxThreadAge")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("maxThreadAge")))
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("maxThreadAge."));
            setMaxThreadAge( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("keepAliveTime")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("keepAliveTime")))
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("keepAliveTime."));
            setKeepAliveTime( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("blockPolicy")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("blockPolicy")))
        {
            std::shared_ptr<ConfigNodePropertyDropDown> newItem(new ConfigNodePropertyDropDown());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("blockPolicy."));
            setBlockPolicy( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("shutdownGraceful")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("shutdownGraceful")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("shutdownGraceful."));
            setShutdownGraceful( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("daemon")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("daemon")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("daemon."));
            setDaemon( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("shutdownWaitTime")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("shutdownWaitTime")))
        {
            std::shared_ptr<ConfigNodePropertyInteger> newItem(new ConfigNodePropertyInteger());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("shutdownWaitTime."));
            setShutdownWaitTime( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("priority")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("priority")))
        {
            std::shared_ptr<ConfigNodePropertyDropDown> newItem(new ConfigNodePropertyDropDown());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("priority."));
            setPriority( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyString> OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getName() const
{
    return m_Name;
}


void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setName(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::nameIsSet() const
{
    return m_NameIsSet;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::unsetName()
{
    m_NameIsSet = false;
}

std::shared_ptr<ConfigNodePropertyInteger> OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getMinPoolSize() const
{
    return m_MinPoolSize;
}


void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setMinPoolSize(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_MinPoolSize = value;
    m_MinPoolSizeIsSet = true;
}
bool OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::minPoolSizeIsSet() const
{
    return m_MinPoolSizeIsSet;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::unsetMinPoolSize()
{
    m_MinPoolSizeIsSet = false;
}

std::shared_ptr<ConfigNodePropertyInteger> OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getMaxPoolSize() const
{
    return m_MaxPoolSize;
}


void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setMaxPoolSize(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_MaxPoolSize = value;
    m_MaxPoolSizeIsSet = true;
}
bool OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::maxPoolSizeIsSet() const
{
    return m_MaxPoolSizeIsSet;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::unsetMaxPoolSize()
{
    m_MaxPoolSizeIsSet = false;
}

std::shared_ptr<ConfigNodePropertyInteger> OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getQueueSize() const
{
    return m_QueueSize;
}


void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setQueueSize(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_QueueSize = value;
    m_QueueSizeIsSet = true;
}
bool OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::queueSizeIsSet() const
{
    return m_QueueSizeIsSet;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::unsetQueueSize()
{
    m_QueueSizeIsSet = false;
}

std::shared_ptr<ConfigNodePropertyInteger> OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getMaxThreadAge() const
{
    return m_MaxThreadAge;
}


void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setMaxThreadAge(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_MaxThreadAge = value;
    m_MaxThreadAgeIsSet = true;
}
bool OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::maxThreadAgeIsSet() const
{
    return m_MaxThreadAgeIsSet;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::unsetMaxThreadAge()
{
    m_MaxThreadAgeIsSet = false;
}

std::shared_ptr<ConfigNodePropertyInteger> OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getKeepAliveTime() const
{
    return m_KeepAliveTime;
}


void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setKeepAliveTime(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_KeepAliveTime = value;
    m_KeepAliveTimeIsSet = true;
}
bool OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::keepAliveTimeIsSet() const
{
    return m_KeepAliveTimeIsSet;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::unsetKeepAliveTime()
{
    m_KeepAliveTimeIsSet = false;
}

std::shared_ptr<ConfigNodePropertyDropDown> OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getBlockPolicy() const
{
    return m_BlockPolicy;
}


void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setBlockPolicy(std::shared_ptr<ConfigNodePropertyDropDown> value)
{
    m_BlockPolicy = value;
    m_BlockPolicyIsSet = true;
}
bool OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::blockPolicyIsSet() const
{
    return m_BlockPolicyIsSet;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::unsetBlockPolicy()
{
    m_BlockPolicyIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getShutdownGraceful() const
{
    return m_ShutdownGraceful;
}


void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setShutdownGraceful(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_ShutdownGraceful = value;
    m_ShutdownGracefulIsSet = true;
}
bool OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::shutdownGracefulIsSet() const
{
    return m_ShutdownGracefulIsSet;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::unsetShutdownGraceful()
{
    m_ShutdownGracefulIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getDaemon() const
{
    return m_Daemon;
}


void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setDaemon(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Daemon = value;
    m_DaemonIsSet = true;
}
bool OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::daemonIsSet() const
{
    return m_DaemonIsSet;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::unsetDaemon()
{
    m_DaemonIsSet = false;
}

std::shared_ptr<ConfigNodePropertyInteger> OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getShutdownWaitTime() const
{
    return m_ShutdownWaitTime;
}


void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setShutdownWaitTime(std::shared_ptr<ConfigNodePropertyInteger> value)
{
    m_ShutdownWaitTime = value;
    m_ShutdownWaitTimeIsSet = true;
}
bool OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::shutdownWaitTimeIsSet() const
{
    return m_ShutdownWaitTimeIsSet;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::unsetShutdownWaitTime()
{
    m_ShutdownWaitTimeIsSet = false;
}

std::shared_ptr<ConfigNodePropertyDropDown> OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getPriority() const
{
    return m_Priority;
}


void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setPriority(std::shared_ptr<ConfigNodePropertyDropDown> value)
{
    m_Priority = value;
    m_PriorityIsSet = true;
}
bool OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::priorityIsSet() const
{
    return m_PriorityIsSet;
}

void OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::unsetPriority()
{
    m_PriorityIsSet = false;
}

}
}
}
}
