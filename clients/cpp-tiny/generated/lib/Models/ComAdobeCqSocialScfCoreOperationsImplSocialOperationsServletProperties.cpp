

#include "ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.h"

using namespace Tiny;

ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties::ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties()
{
	slingservletselectors = ConfigNodePropertyString();
	slingservletextensions = ConfigNodePropertyString();
}

ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties::ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties::~ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties()
{

}

void
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletselectorsKey = "sling.servlet.selectors";

    if(object.has_key(slingservletselectorsKey))
    {
        bourne::json value = object[slingservletselectorsKey];




        ConfigNodePropertyString* obj = &slingservletselectors;
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
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletselectors"] = getSlingservletselectors().toJson();






	object["slingservletextensions"] = getSlingservletextensions().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties::setSlingservletselectors(ConfigNodePropertyString slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyString
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties::getSlingservletextensions()
{
	return slingservletextensions;
}

void
ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties::setSlingservletextensions(ConfigNodePropertyString slingservletextensions)
{
	this->slingservletextensions = slingservletextensions;
}



