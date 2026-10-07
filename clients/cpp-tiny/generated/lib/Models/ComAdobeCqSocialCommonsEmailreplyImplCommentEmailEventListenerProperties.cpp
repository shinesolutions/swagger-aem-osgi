

#include "ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties()
{
	eventtopics = ConfigNodePropertyString();
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::~ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventtopicsKey = "event.topics";

    if(object.has_key(eventtopicsKey))
    {
        bourne::json value = object[eventtopicsKey];




        ConfigNodePropertyString* obj = &eventtopics;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventtopics"] = getEventtopics().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::getEventtopics()
{
	return eventtopics;
}

void
ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties::setEventtopics(ConfigNodePropertyString eventtopics)
{
	this->eventtopics = eventtopics;
}



