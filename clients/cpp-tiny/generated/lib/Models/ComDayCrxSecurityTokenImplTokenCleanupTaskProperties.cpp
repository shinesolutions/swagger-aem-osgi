

#include "ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.h"

using namespace Tiny;

ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::ComDayCrxSecurityTokenImplTokenCleanupTaskProperties()
{
	enabletokencleanuptask = ConfigNodePropertyBoolean();
	schedulerexpression = ConfigNodePropertyString();
	batchsize = ConfigNodePropertyInteger();
}

ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::ComDayCrxSecurityTokenImplTokenCleanupTaskProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::~ComDayCrxSecurityTokenImplTokenCleanupTaskProperties()
{

}

void
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enabletokencleanuptaskKey = "enable.token.cleanup.task";

    if(object.has_key(enabletokencleanuptaskKey))
    {
        bourne::json value = object[enabletokencleanuptaskKey];




        ConfigNodePropertyBoolean* obj = &enabletokencleanuptask;
		obj->fromJson(value.dump());

    }

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }

    const char *batchsizeKey = "batch.size";

    if(object.has_key(batchsizeKey))
    {
        bourne::json value = object[batchsizeKey];




        ConfigNodePropertyInteger* obj = &batchsize;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enabletokencleanuptask"] = getEnabletokencleanuptask().toJson();






	object["schedulerexpression"] = getSchedulerexpression().toJson();






	object["batchsize"] = getBatchsize().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::getEnabletokencleanuptask()
{
	return enabletokencleanuptask;
}

void
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::setEnabletokencleanuptask(ConfigNodePropertyBoolean enabletokencleanuptask)
{
	this->enabletokencleanuptask = enabletokencleanuptask;
}

ConfigNodePropertyString
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}

ConfigNodePropertyInteger
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::getBatchsize()
{
	return batchsize;
}

void
ComDayCrxSecurityTokenImplTokenCleanupTaskProperties::setBatchsize(ConfigNodePropertyInteger batchsize)
{
	this->batchsize = batchsize;
}



