

#include "ComDayCqReplicationImplReverseReplicatorProperties.h"

using namespace Tiny;

ComDayCqReplicationImplReverseReplicatorProperties::ComDayCqReplicationImplReverseReplicatorProperties()
{
	schedulerperiod = ConfigNodePropertyInteger();
}

ComDayCqReplicationImplReverseReplicatorProperties::ComDayCqReplicationImplReverseReplicatorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplReverseReplicatorProperties::~ComDayCqReplicationImplReverseReplicatorProperties()
{

}

void
ComDayCqReplicationImplReverseReplicatorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerperiodKey = "scheduler.period";

    if(object.has_key(schedulerperiodKey))
    {
        bourne::json value = object[schedulerperiodKey];




        ConfigNodePropertyInteger* obj = &schedulerperiod;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplReverseReplicatorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerperiod"] = getSchedulerperiod().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqReplicationImplReverseReplicatorProperties::getSchedulerperiod()
{
	return schedulerperiod;
}

void
ComDayCqReplicationImplReverseReplicatorProperties::setSchedulerperiod(ConfigNodePropertyInteger schedulerperiod)
{
	this->schedulerperiod = schedulerperiod;
}



