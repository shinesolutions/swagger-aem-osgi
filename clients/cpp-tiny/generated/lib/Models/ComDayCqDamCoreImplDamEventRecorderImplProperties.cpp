

#include "ComDayCqDamCoreImplDamEventRecorderImplProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplDamEventRecorderImplProperties::ComDayCqDamCoreImplDamEventRecorderImplProperties()
{
	eventfilter = ConfigNodePropertyString();
	eventqueuelength = ConfigNodePropertyInteger();
	eventrecorderenabled = ConfigNodePropertyBoolean();
	eventrecorderblacklist = ConfigNodePropertyArray();
	eventrecordereventtypes = ConfigNodePropertyDropDown();
}

ComDayCqDamCoreImplDamEventRecorderImplProperties::ComDayCqDamCoreImplDamEventRecorderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplDamEventRecorderImplProperties::~ComDayCqDamCoreImplDamEventRecorderImplProperties()
{

}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventfilterKey = "event.filter";

    if(object.has_key(eventfilterKey))
    {
        bourne::json value = object[eventfilterKey];




        ConfigNodePropertyString* obj = &eventfilter;
		obj->fromJson(value.dump());

    }

    const char *eventqueuelengthKey = "event.queue.length";

    if(object.has_key(eventqueuelengthKey))
    {
        bourne::json value = object[eventqueuelengthKey];




        ConfigNodePropertyInteger* obj = &eventqueuelength;
		obj->fromJson(value.dump());

    }

    const char *eventrecorderenabledKey = "eventrecorder.enabled";

    if(object.has_key(eventrecorderenabledKey))
    {
        bourne::json value = object[eventrecorderenabledKey];




        ConfigNodePropertyBoolean* obj = &eventrecorderenabled;
		obj->fromJson(value.dump());

    }

    const char *eventrecorderblacklistKey = "eventrecorder.blacklist";

    if(object.has_key(eventrecorderblacklistKey))
    {
        bourne::json value = object[eventrecorderblacklistKey];




        ConfigNodePropertyArray* obj = &eventrecorderblacklist;
		obj->fromJson(value.dump());

    }

    const char *eventrecordereventtypesKey = "eventrecorder.eventtypes";

    if(object.has_key(eventrecordereventtypesKey))
    {
        bourne::json value = object[eventrecordereventtypesKey];




        ConfigNodePropertyDropDown* obj = &eventrecordereventtypes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplDamEventRecorderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventfilter"] = getEventfilter().toJson();






	object["eventqueuelength"] = getEventqueuelength().toJson();






	object["eventrecorderenabled"] = getEventrecorderenabled().toJson();






	object["eventrecorderblacklist"] = getEventrecorderblacklist().toJson();






	object["eventrecordereventtypes"] = getEventrecordereventtypes().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplDamEventRecorderImplProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplDamEventRecorderImplProperties::getEventqueuelength()
{
	return eventqueuelength;
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::setEventqueuelength(ConfigNodePropertyInteger eventqueuelength)
{
	this->eventqueuelength = eventqueuelength;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplDamEventRecorderImplProperties::getEventrecorderenabled()
{
	return eventrecorderenabled;
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::setEventrecorderenabled(ConfigNodePropertyBoolean eventrecorderenabled)
{
	this->eventrecorderenabled = eventrecorderenabled;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplDamEventRecorderImplProperties::getEventrecorderblacklist()
{
	return eventrecorderblacklist;
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::setEventrecorderblacklist(ConfigNodePropertyArray eventrecorderblacklist)
{
	this->eventrecorderblacklist = eventrecorderblacklist;
}

ConfigNodePropertyDropDown
ComDayCqDamCoreImplDamEventRecorderImplProperties::getEventrecordereventtypes()
{
	return eventrecordereventtypes;
}

void
ComDayCqDamCoreImplDamEventRecorderImplProperties::setEventrecordereventtypes(ConfigNodePropertyDropDown eventrecordereventtypes)
{
	this->eventrecordereventtypes = eventrecordereventtypes;
}



