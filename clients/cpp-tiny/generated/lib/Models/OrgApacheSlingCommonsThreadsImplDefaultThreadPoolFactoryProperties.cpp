

#include "OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties.h"

using namespace Tiny;

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties()
{
	name = ConfigNodePropertyString();
	minPoolSize = ConfigNodePropertyInteger();
	maxPoolSize = ConfigNodePropertyInteger();
	queueSize = ConfigNodePropertyInteger();
	maxThreadAge = ConfigNodePropertyInteger();
	keepAliveTime = ConfigNodePropertyInteger();
	blockPolicy = ConfigNodePropertyDropDown();
	shutdownGraceful = ConfigNodePropertyBoolean();
	daemon = ConfigNodePropertyBoolean();
	shutdownWaitTime = ConfigNodePropertyInteger();
	priority = ConfigNodePropertyDropDown();
}

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::~OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties()
{

}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];




        ConfigNodePropertyString* obj = &name;
		obj->fromJson(value.dump());

    }

    const char *minPoolSizeKey = "minPoolSize";

    if(object.has_key(minPoolSizeKey))
    {
        bourne::json value = object[minPoolSizeKey];




        ConfigNodePropertyInteger* obj = &minPoolSize;
		obj->fromJson(value.dump());

    }

    const char *maxPoolSizeKey = "maxPoolSize";

    if(object.has_key(maxPoolSizeKey))
    {
        bourne::json value = object[maxPoolSizeKey];




        ConfigNodePropertyInteger* obj = &maxPoolSize;
		obj->fromJson(value.dump());

    }

    const char *queueSizeKey = "queueSize";

    if(object.has_key(queueSizeKey))
    {
        bourne::json value = object[queueSizeKey];




        ConfigNodePropertyInteger* obj = &queueSize;
		obj->fromJson(value.dump());

    }

    const char *maxThreadAgeKey = "maxThreadAge";

    if(object.has_key(maxThreadAgeKey))
    {
        bourne::json value = object[maxThreadAgeKey];




        ConfigNodePropertyInteger* obj = &maxThreadAge;
		obj->fromJson(value.dump());

    }

    const char *keepAliveTimeKey = "keepAliveTime";

    if(object.has_key(keepAliveTimeKey))
    {
        bourne::json value = object[keepAliveTimeKey];




        ConfigNodePropertyInteger* obj = &keepAliveTime;
		obj->fromJson(value.dump());

    }

    const char *blockPolicyKey = "blockPolicy";

    if(object.has_key(blockPolicyKey))
    {
        bourne::json value = object[blockPolicyKey];




        ConfigNodePropertyDropDown* obj = &blockPolicy;
		obj->fromJson(value.dump());

    }

    const char *shutdownGracefulKey = "shutdownGraceful";

    if(object.has_key(shutdownGracefulKey))
    {
        bourne::json value = object[shutdownGracefulKey];




        ConfigNodePropertyBoolean* obj = &shutdownGraceful;
		obj->fromJson(value.dump());

    }

    const char *daemonKey = "daemon";

    if(object.has_key(daemonKey))
    {
        bourne::json value = object[daemonKey];




        ConfigNodePropertyBoolean* obj = &daemon;
		obj->fromJson(value.dump());

    }

    const char *shutdownWaitTimeKey = "shutdownWaitTime";

    if(object.has_key(shutdownWaitTimeKey))
    {
        bourne::json value = object[shutdownWaitTimeKey];




        ConfigNodePropertyInteger* obj = &shutdownWaitTime;
		obj->fromJson(value.dump());

    }

    const char *priorityKey = "priority";

    if(object.has_key(priorityKey))
    {
        bourne::json value = object[priorityKey];




        ConfigNodePropertyDropDown* obj = &priority;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["name"] = getName().toJson();






	object["minPoolSize"] = getMinPoolSize().toJson();






	object["maxPoolSize"] = getMaxPoolSize().toJson();






	object["queueSize"] = getQueueSize().toJson();






	object["maxThreadAge"] = getMaxThreadAge().toJson();






	object["keepAliveTime"] = getKeepAliveTime().toJson();






	object["blockPolicy"] = getBlockPolicy().toJson();






	object["shutdownGraceful"] = getShutdownGraceful().toJson();






	object["daemon"] = getDaemon().toJson();






	object["shutdownWaitTime"] = getShutdownWaitTime().toJson();






	object["priority"] = getPriority().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getName()
{
	return name;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setName(ConfigNodePropertyString name)
{
	this->name = name;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getMinPoolSize()
{
	return minPoolSize;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setMinPoolSize(ConfigNodePropertyInteger minPoolSize)
{
	this->minPoolSize = minPoolSize;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getMaxPoolSize()
{
	return maxPoolSize;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setMaxPoolSize(ConfigNodePropertyInteger maxPoolSize)
{
	this->maxPoolSize = maxPoolSize;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getQueueSize()
{
	return queueSize;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setQueueSize(ConfigNodePropertyInteger queueSize)
{
	this->queueSize = queueSize;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getMaxThreadAge()
{
	return maxThreadAge;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setMaxThreadAge(ConfigNodePropertyInteger maxThreadAge)
{
	this->maxThreadAge = maxThreadAge;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getKeepAliveTime()
{
	return keepAliveTime;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setKeepAliveTime(ConfigNodePropertyInteger keepAliveTime)
{
	this->keepAliveTime = keepAliveTime;
}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getBlockPolicy()
{
	return blockPolicy;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setBlockPolicy(ConfigNodePropertyDropDown blockPolicy)
{
	this->blockPolicy = blockPolicy;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getShutdownGraceful()
{
	return shutdownGraceful;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setShutdownGraceful(ConfigNodePropertyBoolean shutdownGraceful)
{
	this->shutdownGraceful = shutdownGraceful;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getDaemon()
{
	return daemon;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setDaemon(ConfigNodePropertyBoolean daemon)
{
	this->daemon = daemon;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getShutdownWaitTime()
{
	return shutdownWaitTime;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setShutdownWaitTime(ConfigNodePropertyInteger shutdownWaitTime)
{
	this->shutdownWaitTime = shutdownWaitTime;
}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::getPriority()
{
	return priority;
}

void
OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties::setPriority(ConfigNodePropertyDropDown priority)
{
	this->priority = priority;
}



