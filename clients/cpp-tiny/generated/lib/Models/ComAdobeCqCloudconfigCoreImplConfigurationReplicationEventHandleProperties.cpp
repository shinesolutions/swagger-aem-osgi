

#include "ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.h"

using namespace Tiny;

ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties()
{
	flushagents = ConfigNodePropertyArray();
}

ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::~ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties()
{

}

void
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *flushagentsKey = "flush.agents";

    if(object.has_key(flushagentsKey))
    {
        bourne::json value = object[flushagentsKey];




        ConfigNodePropertyArray* obj = &flushagents;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["flushagents"] = getFlushagents().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::getFlushagents()
{
	return flushagents;
}

void
ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties::setFlushagents(ConfigNodePropertyArray flushagents)
{
	this->flushagents = flushagents;
}



