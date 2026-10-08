

#include "ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.h"

using namespace Tiny;

ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties::ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties()
{
	slingservletextensions = ConfigNodePropertyString();
	slingservletpaths = ConfigNodePropertyString();
	slingservletmethods = ConfigNodePropertyString();
}

ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties::ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties::~ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties()
{

}

void
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletextensionsKey = "sling.servlet.extensions";

    if(object.has_key(slingservletextensionsKey))
    {
        bourne::json value = object[slingservletextensionsKey];




        ConfigNodePropertyString* obj = &slingservletextensions;
		obj->fromJson(value.dump());

    }

    const char *slingservletpathsKey = "sling.servlet.paths";

    if(object.has_key(slingservletpathsKey))
    {
        bourne::json value = object[slingservletpathsKey];




        ConfigNodePropertyString* obj = &slingservletpaths;
		obj->fromJson(value.dump());

    }

    const char *slingservletmethodsKey = "sling.servlet.methods";

    if(object.has_key(slingservletmethodsKey))
    {
        bourne::json value = object[slingservletmethodsKey];




        ConfigNodePropertyString* obj = &slingservletmethods;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletextensions"] = getSlingservletextensions().toJson();






	object["slingservletpaths"] = getSlingservletpaths().toJson();






	object["slingservletmethods"] = getSlingservletmethods().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties::getSlingservletextensions()
{
	return slingservletextensions;
}

void
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties::setSlingservletextensions(ConfigNodePropertyString slingservletextensions)
{
	this->slingservletextensions = slingservletextensions;
}

ConfigNodePropertyString
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties::getSlingservletpaths()
{
	return slingservletpaths;
}

void
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties::setSlingservletpaths(ConfigNodePropertyString slingservletpaths)
{
	this->slingservletpaths = slingservletpaths;
}

ConfigNodePropertyString
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties::setSlingservletmethods(ConfigNodePropertyString slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}



