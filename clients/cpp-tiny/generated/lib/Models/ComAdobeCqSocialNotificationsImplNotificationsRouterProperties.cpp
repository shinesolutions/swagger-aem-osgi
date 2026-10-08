

#include "ComAdobeCqSocialNotificationsImplNotificationsRouterProperties.h"

using namespace Tiny;

ComAdobeCqSocialNotificationsImplNotificationsRouterProperties::ComAdobeCqSocialNotificationsImplNotificationsRouterProperties()
{
	eventtopics = ConfigNodePropertyString();
	eventfilter = ConfigNodePropertyString();
}

ComAdobeCqSocialNotificationsImplNotificationsRouterProperties::ComAdobeCqSocialNotificationsImplNotificationsRouterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialNotificationsImplNotificationsRouterProperties::~ComAdobeCqSocialNotificationsImplNotificationsRouterProperties()
{

}

void
ComAdobeCqSocialNotificationsImplNotificationsRouterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventtopicsKey = "event.topics";

    if(object.has_key(eventtopicsKey))
    {
        bourne::json value = object[eventtopicsKey];




        ConfigNodePropertyString* obj = &eventtopics;
		obj->fromJson(value.dump());

    }

    const char *eventfilterKey = "event.filter";

    if(object.has_key(eventfilterKey))
    {
        bourne::json value = object[eventfilterKey];




        ConfigNodePropertyString* obj = &eventfilter;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialNotificationsImplNotificationsRouterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventtopics"] = getEventtopics().toJson();






	object["eventfilter"] = getEventfilter().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialNotificationsImplNotificationsRouterProperties::getEventtopics()
{
	return eventtopics;
}

void
ComAdobeCqSocialNotificationsImplNotificationsRouterProperties::setEventtopics(ConfigNodePropertyString eventtopics)
{
	this->eventtopics = eventtopics;
}

ConfigNodePropertyString
ComAdobeCqSocialNotificationsImplNotificationsRouterProperties::getEventfilter()
{
	return eventfilter;
}

void
ComAdobeCqSocialNotificationsImplNotificationsRouterProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}



