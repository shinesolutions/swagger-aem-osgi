

#include "ComAdobeCqSocialScoringImplScoringEventListenerProperties.h"

using namespace Tiny;

ComAdobeCqSocialScoringImplScoringEventListenerProperties::ComAdobeCqSocialScoringImplScoringEventListenerProperties()
{
	eventtopics = ConfigNodePropertyString();
	eventfilter = ConfigNodePropertyString();
}

ComAdobeCqSocialScoringImplScoringEventListenerProperties::ComAdobeCqSocialScoringImplScoringEventListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialScoringImplScoringEventListenerProperties::~ComAdobeCqSocialScoringImplScoringEventListenerProperties()
{

}

void
ComAdobeCqSocialScoringImplScoringEventListenerProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialScoringImplScoringEventListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventtopics"] = getEventtopics().toJson();






	object["eventfilter"] = getEventfilter().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialScoringImplScoringEventListenerProperties::getEventtopics()
{
	return eventtopics;
}

void
ComAdobeCqSocialScoringImplScoringEventListenerProperties::setEventtopics(ConfigNodePropertyString eventtopics)
{
	this->eventtopics = eventtopics;
}

ConfigNodePropertyString
ComAdobeCqSocialScoringImplScoringEventListenerProperties::getEventfilter()
{
	return eventfilter;
}

void
ComAdobeCqSocialScoringImplScoringEventListenerProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}



