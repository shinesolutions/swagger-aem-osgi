

#include "ComDayCqDamCoreImplEventDamEventAuditListenerProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplEventDamEventAuditListenerProperties::ComDayCqDamCoreImplEventDamEventAuditListenerProperties()
{
	eventfilter = ConfigNodePropertyString();
	enabled = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplEventDamEventAuditListenerProperties::ComDayCqDamCoreImplEventDamEventAuditListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplEventDamEventAuditListenerProperties::~ComDayCqDamCoreImplEventDamEventAuditListenerProperties()
{

}

void
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventfilterKey = "event.filter";

    if(object.has_key(eventfilterKey))
    {
        bourne::json value = object[eventfilterKey];




        ConfigNodePropertyString* obj = &eventfilter;
		obj->fromJson(value.dump());

    }

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventfilter"] = getEventfilter().toJson();






	object["enabled"] = getEnabled().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::getEnabled()
{
	return enabled;
}

void
ComDayCqDamCoreImplEventDamEventAuditListenerProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}



