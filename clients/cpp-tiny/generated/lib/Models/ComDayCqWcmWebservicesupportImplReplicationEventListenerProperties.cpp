

#include "ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties.h"

using namespace Tiny;

ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties()
{
	flushagents = ConfigNodePropertyArray();
}

ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::~ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties()
{

}

void
ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *flushagentsKey = "Flush agents";

    if(object.has_key(flushagentsKey))
    {
        bourne::json value = object[flushagentsKey];




        ConfigNodePropertyArray* obj = &flushagents;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["flushagents"] = getFlushagents().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::getFlushagents()
{
	return flushagents;
}

void
ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties::setFlushagents(ConfigNodePropertyArray flushagents)
{
	this->flushagents = flushagents;
}



