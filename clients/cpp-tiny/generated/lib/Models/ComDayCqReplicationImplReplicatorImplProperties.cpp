

#include "ComDayCqReplicationImplReplicatorImplProperties.h"

using namespace Tiny;

ComDayCqReplicationImplReplicatorImplProperties::ComDayCqReplicationImplReplicatorImplProperties()
{
	distribute_events = ConfigNodePropertyBoolean();
}

ComDayCqReplicationImplReplicatorImplProperties::ComDayCqReplicationImplReplicatorImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplReplicatorImplProperties::~ComDayCqReplicationImplReplicatorImplProperties()
{

}

void
ComDayCqReplicationImplReplicatorImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *distribute_eventsKey = "distribute_events";

    if(object.has_key(distribute_eventsKey))
    {
        bourne::json value = object[distribute_eventsKey];




        ConfigNodePropertyBoolean* obj = &distribute_events;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplReplicatorImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["distribute_events"] = getDistributeEvents().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqReplicationImplReplicatorImplProperties::getDistributeEvents()
{
	return distribute_events;
}

void
ComDayCqReplicationImplReplicatorImplProperties::setDistributeEvents(ConfigNodePropertyBoolean distribute_events)
{
	this->distribute_events = distribute_events;
}



