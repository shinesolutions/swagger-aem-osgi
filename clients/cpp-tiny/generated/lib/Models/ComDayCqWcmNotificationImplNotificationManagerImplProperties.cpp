

#include "ComDayCqWcmNotificationImplNotificationManagerImplProperties.h"

using namespace Tiny;

ComDayCqWcmNotificationImplNotificationManagerImplProperties::ComDayCqWcmNotificationImplNotificationManagerImplProperties()
{
	eventtopics = ConfigNodePropertyArray();
}

ComDayCqWcmNotificationImplNotificationManagerImplProperties::ComDayCqWcmNotificationImplNotificationManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmNotificationImplNotificationManagerImplProperties::~ComDayCqWcmNotificationImplNotificationManagerImplProperties()
{

}

void
ComDayCqWcmNotificationImplNotificationManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventtopicsKey = "event.topics";

    if(object.has_key(eventtopicsKey))
    {
        bourne::json value = object[eventtopicsKey];




        ConfigNodePropertyArray* obj = &eventtopics;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmNotificationImplNotificationManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventtopics"] = getEventtopics().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWcmNotificationImplNotificationManagerImplProperties::getEventtopics()
{
	return eventtopics;
}

void
ComDayCqWcmNotificationImplNotificationManagerImplProperties::setEventtopics(ConfigNodePropertyArray eventtopics)
{
	this->eventtopics = eventtopics;
}



