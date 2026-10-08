

#include "ComDayCqWcmMsmImplRolloutManagerImplProperties.h"

using namespace Tiny;

ComDayCqWcmMsmImplRolloutManagerImplProperties::ComDayCqWcmMsmImplRolloutManagerImplProperties()
{
	eventfilter = ConfigNodePropertyString();
	rolloutmgrexcludedpropsdefault = ConfigNodePropertyArray();
	rolloutmgrexcludedparagraphpropsdefault = ConfigNodePropertyArray();
	rolloutmgrexcludednodetypesdefault = ConfigNodePropertyArray();
	rolloutmgrthreadpoolmaxsize = ConfigNodePropertyInteger();
	rolloutmgrthreadpoolmaxshutdowntime = ConfigNodePropertyInteger();
	rolloutmgrthreadpoolpriority = ConfigNodePropertyDropDown();
	rolloutmgrcommitsize = ConfigNodePropertyInteger();
	rolloutmgrconflicthandlingenabled = ConfigNodePropertyBoolean();
}

ComDayCqWcmMsmImplRolloutManagerImplProperties::ComDayCqWcmMsmImplRolloutManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMsmImplRolloutManagerImplProperties::~ComDayCqWcmMsmImplRolloutManagerImplProperties()
{

}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventfilterKey = "event.filter";

    if(object.has_key(eventfilterKey))
    {
        bourne::json value = object[eventfilterKey];




        ConfigNodePropertyString* obj = &eventfilter;
		obj->fromJson(value.dump());

    }

    const char *rolloutmgrexcludedpropsdefaultKey = "rolloutmgr.excludedprops.default";

    if(object.has_key(rolloutmgrexcludedpropsdefaultKey))
    {
        bourne::json value = object[rolloutmgrexcludedpropsdefaultKey];




        ConfigNodePropertyArray* obj = &rolloutmgrexcludedpropsdefault;
		obj->fromJson(value.dump());

    }

    const char *rolloutmgrexcludedparagraphpropsdefaultKey = "rolloutmgr.excludedparagraphprops.default";

    if(object.has_key(rolloutmgrexcludedparagraphpropsdefaultKey))
    {
        bourne::json value = object[rolloutmgrexcludedparagraphpropsdefaultKey];




        ConfigNodePropertyArray* obj = &rolloutmgrexcludedparagraphpropsdefault;
		obj->fromJson(value.dump());

    }

    const char *rolloutmgrexcludednodetypesdefaultKey = "rolloutmgr.excludednodetypes.default";

    if(object.has_key(rolloutmgrexcludednodetypesdefaultKey))
    {
        bourne::json value = object[rolloutmgrexcludednodetypesdefaultKey];




        ConfigNodePropertyArray* obj = &rolloutmgrexcludednodetypesdefault;
		obj->fromJson(value.dump());

    }

    const char *rolloutmgrthreadpoolmaxsizeKey = "rolloutmgr.threadpool.maxsize";

    if(object.has_key(rolloutmgrthreadpoolmaxsizeKey))
    {
        bourne::json value = object[rolloutmgrthreadpoolmaxsizeKey];




        ConfigNodePropertyInteger* obj = &rolloutmgrthreadpoolmaxsize;
		obj->fromJson(value.dump());

    }

    const char *rolloutmgrthreadpoolmaxshutdowntimeKey = "rolloutmgr.threadpool.maxshutdowntime";

    if(object.has_key(rolloutmgrthreadpoolmaxshutdowntimeKey))
    {
        bourne::json value = object[rolloutmgrthreadpoolmaxshutdowntimeKey];




        ConfigNodePropertyInteger* obj = &rolloutmgrthreadpoolmaxshutdowntime;
		obj->fromJson(value.dump());

    }

    const char *rolloutmgrthreadpoolpriorityKey = "rolloutmgr.threadpool.priority";

    if(object.has_key(rolloutmgrthreadpoolpriorityKey))
    {
        bourne::json value = object[rolloutmgrthreadpoolpriorityKey];




        ConfigNodePropertyDropDown* obj = &rolloutmgrthreadpoolpriority;
		obj->fromJson(value.dump());

    }

    const char *rolloutmgrcommitsizeKey = "rolloutmgr.commit.size";

    if(object.has_key(rolloutmgrcommitsizeKey))
    {
        bourne::json value = object[rolloutmgrcommitsizeKey];




        ConfigNodePropertyInteger* obj = &rolloutmgrcommitsize;
		obj->fromJson(value.dump());

    }

    const char *rolloutmgrconflicthandlingenabledKey = "rolloutmgr.conflicthandling.enabled";

    if(object.has_key(rolloutmgrconflicthandlingenabledKey))
    {
        bourne::json value = object[rolloutmgrconflicthandlingenabledKey];




        ConfigNodePropertyBoolean* obj = &rolloutmgrconflicthandlingenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMsmImplRolloutManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventfilter"] = getEventfilter().toJson();






	object["rolloutmgrexcludedpropsdefault"] = getRolloutmgrexcludedpropsdefault().toJson();






	object["rolloutmgrexcludedparagraphpropsdefault"] = getRolloutmgrexcludedparagraphpropsdefault().toJson();






	object["rolloutmgrexcludednodetypesdefault"] = getRolloutmgrexcludednodetypesdefault().toJson();






	object["rolloutmgrthreadpoolmaxsize"] = getRolloutmgrthreadpoolmaxsize().toJson();






	object["rolloutmgrthreadpoolmaxshutdowntime"] = getRolloutmgrthreadpoolmaxshutdowntime().toJson();






	object["rolloutmgrthreadpoolpriority"] = getRolloutmgrthreadpoolpriority().toJson();






	object["rolloutmgrcommitsize"] = getRolloutmgrcommitsize().toJson();






	object["rolloutmgrconflicthandlingenabled"] = getRolloutmgrconflicthandlingenabled().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmMsmImplRolloutManagerImplProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrexcludedpropsdefault()
{
	return rolloutmgrexcludedpropsdefault;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrexcludedpropsdefault(ConfigNodePropertyArray rolloutmgrexcludedpropsdefault)
{
	this->rolloutmgrexcludedpropsdefault = rolloutmgrexcludedpropsdefault;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrexcludedparagraphpropsdefault()
{
	return rolloutmgrexcludedparagraphpropsdefault;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrexcludedparagraphpropsdefault(ConfigNodePropertyArray rolloutmgrexcludedparagraphpropsdefault)
{
	this->rolloutmgrexcludedparagraphpropsdefault = rolloutmgrexcludedparagraphpropsdefault;
}

ConfigNodePropertyArray
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrexcludednodetypesdefault()
{
	return rolloutmgrexcludednodetypesdefault;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrexcludednodetypesdefault(ConfigNodePropertyArray rolloutmgrexcludednodetypesdefault)
{
	this->rolloutmgrexcludednodetypesdefault = rolloutmgrexcludednodetypesdefault;
}

ConfigNodePropertyInteger
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrthreadpoolmaxsize()
{
	return rolloutmgrthreadpoolmaxsize;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrthreadpoolmaxsize(ConfigNodePropertyInteger rolloutmgrthreadpoolmaxsize)
{
	this->rolloutmgrthreadpoolmaxsize = rolloutmgrthreadpoolmaxsize;
}

ConfigNodePropertyInteger
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrthreadpoolmaxshutdowntime()
{
	return rolloutmgrthreadpoolmaxshutdowntime;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrthreadpoolmaxshutdowntime(ConfigNodePropertyInteger rolloutmgrthreadpoolmaxshutdowntime)
{
	this->rolloutmgrthreadpoolmaxshutdowntime = rolloutmgrthreadpoolmaxshutdowntime;
}

ConfigNodePropertyDropDown
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrthreadpoolpriority()
{
	return rolloutmgrthreadpoolpriority;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrthreadpoolpriority(ConfigNodePropertyDropDown rolloutmgrthreadpoolpriority)
{
	this->rolloutmgrthreadpoolpriority = rolloutmgrthreadpoolpriority;
}

ConfigNodePropertyInteger
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrcommitsize()
{
	return rolloutmgrcommitsize;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrcommitsize(ConfigNodePropertyInteger rolloutmgrcommitsize)
{
	this->rolloutmgrcommitsize = rolloutmgrcommitsize;
}

ConfigNodePropertyBoolean
ComDayCqWcmMsmImplRolloutManagerImplProperties::getRolloutmgrconflicthandlingenabled()
{
	return rolloutmgrconflicthandlingenabled;
}

void
ComDayCqWcmMsmImplRolloutManagerImplProperties::setRolloutmgrconflicthandlingenabled(ConfigNodePropertyBoolean rolloutmgrconflicthandlingenabled)
{
	this->rolloutmgrconflicthandlingenabled = rolloutmgrconflicthandlingenabled;
}



