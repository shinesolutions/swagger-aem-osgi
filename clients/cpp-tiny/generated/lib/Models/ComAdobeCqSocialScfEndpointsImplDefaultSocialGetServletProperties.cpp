

#include "ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.h"

using namespace Tiny;

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties()
{
	slingservletselectors = ConfigNodePropertyArray();
	slingservletextensions = ConfigNodePropertyString();
}

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::~ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties()
{

}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletselectorsKey = "sling.servlet.selectors";

    if(object.has_key(slingservletselectorsKey))
    {
        bourne::json value = object[slingservletselectorsKey];




        ConfigNodePropertyArray* obj = &slingservletselectors;
		obj->fromJson(value.dump());

    }

    const char *slingservletextensionsKey = "sling.servlet.extensions";

    if(object.has_key(slingservletextensionsKey))
    {
        bourne::json value = object[slingservletextensionsKey];




        ConfigNodePropertyString* obj = &slingservletextensions;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletselectors"] = getSlingservletselectors().toJson();






	object["slingservletextensions"] = getSlingservletextensions().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::setSlingservletselectors(ConfigNodePropertyArray slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyString
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::getSlingservletextensions()
{
	return slingservletextensions;
}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::setSlingservletextensions(ConfigNodePropertyString slingservletextensions)
{
	this->slingservletextensions = slingservletextensions;
}



