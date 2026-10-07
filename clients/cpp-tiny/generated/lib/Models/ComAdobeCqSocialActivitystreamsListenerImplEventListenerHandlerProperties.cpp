

#include "ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties.h"

using namespace Tiny;

ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties()
{
	eventtopics = ConfigNodePropertyString();
	eventfilter = ConfigNodePropertyString();
}

ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::~ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties()
{

}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventtopics"] = getEventtopics().toJson();






	object["eventfilter"] = getEventfilter().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::getEventtopics()
{
	return eventtopics;
}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::setEventtopics(ConfigNodePropertyString eventtopics)
{
	this->eventtopics = eventtopics;
}

ConfigNodePropertyString
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::getEventfilter()
{
	return eventfilter;
}

void
ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}



