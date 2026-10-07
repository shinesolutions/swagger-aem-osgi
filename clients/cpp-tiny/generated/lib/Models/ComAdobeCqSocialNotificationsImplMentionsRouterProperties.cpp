

#include "ComAdobeCqSocialNotificationsImplMentionsRouterProperties.h"

using namespace Tiny;

ComAdobeCqSocialNotificationsImplMentionsRouterProperties::ComAdobeCqSocialNotificationsImplMentionsRouterProperties()
{
	eventtopics = ConfigNodePropertyString();
	eventfilter = ConfigNodePropertyString();
}

ComAdobeCqSocialNotificationsImplMentionsRouterProperties::ComAdobeCqSocialNotificationsImplMentionsRouterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialNotificationsImplMentionsRouterProperties::~ComAdobeCqSocialNotificationsImplMentionsRouterProperties()
{

}

void
ComAdobeCqSocialNotificationsImplMentionsRouterProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialNotificationsImplMentionsRouterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventtopics"] = getEventtopics().toJson();






	object["eventfilter"] = getEventfilter().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialNotificationsImplMentionsRouterProperties::getEventtopics()
{
	return eventtopics;
}

void
ComAdobeCqSocialNotificationsImplMentionsRouterProperties::setEventtopics(ConfigNodePropertyString eventtopics)
{
	this->eventtopics = eventtopics;
}

ConfigNodePropertyString
ComAdobeCqSocialNotificationsImplMentionsRouterProperties::getEventfilter()
{
	return eventfilter;
}

void
ComAdobeCqSocialNotificationsImplMentionsRouterProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}



