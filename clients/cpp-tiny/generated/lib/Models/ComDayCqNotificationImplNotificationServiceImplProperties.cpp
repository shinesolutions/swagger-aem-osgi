

#include "ComDayCqNotificationImplNotificationServiceImplProperties.h"

using namespace Tiny;

ComDayCqNotificationImplNotificationServiceImplProperties::ComDayCqNotificationImplNotificationServiceImplProperties()
{
	eventfilter = ConfigNodePropertyString();
}

ComDayCqNotificationImplNotificationServiceImplProperties::ComDayCqNotificationImplNotificationServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqNotificationImplNotificationServiceImplProperties::~ComDayCqNotificationImplNotificationServiceImplProperties()
{

}

void
ComDayCqNotificationImplNotificationServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventfilterKey = "event.filter";

    if(object.has_key(eventfilterKey))
    {
        bourne::json value = object[eventfilterKey];




        ConfigNodePropertyString* obj = &eventfilter;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqNotificationImplNotificationServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventfilter"] = getEventfilter().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqNotificationImplNotificationServiceImplProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqNotificationImplNotificationServiceImplProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}



