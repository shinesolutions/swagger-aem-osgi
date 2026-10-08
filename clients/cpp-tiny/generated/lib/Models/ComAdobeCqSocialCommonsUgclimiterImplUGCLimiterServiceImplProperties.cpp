

#include "ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties::ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties()
{
	eventtopics = ConfigNodePropertyString();
	eventfilter = ConfigNodePropertyString();
	verbs = ConfigNodePropertyArray();
}

ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties::ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties::~ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties()
{

}

void
ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties::fromJson(std::string jsonObj)
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

    const char *verbsKey = "verbs";

    if(object.has_key(verbsKey))
    {
        bourne::json value = object[verbsKey];




        ConfigNodePropertyArray* obj = &verbs;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventtopics"] = getEventtopics().toJson();






	object["eventfilter"] = getEventfilter().toJson();






	object["verbs"] = getVerbs().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties::getEventtopics()
{
	return eventtopics;
}

void
ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties::setEventtopics(ConfigNodePropertyString eventtopics)
{
	this->eventtopics = eventtopics;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties::getEventfilter()
{
	return eventfilter;
}

void
ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyArray
ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties::getVerbs()
{
	return verbs;
}

void
ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties::setVerbs(ConfigNodePropertyArray verbs)
{
	this->verbs = verbs;
}



