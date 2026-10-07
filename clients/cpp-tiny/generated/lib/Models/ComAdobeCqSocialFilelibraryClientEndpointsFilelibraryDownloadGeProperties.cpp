

#include "ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.h"

using namespace Tiny;

ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties::ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties()
{
	slingservletselectors = ConfigNodePropertyString();
	slingservletextensions = ConfigNodePropertyString();
}

ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties::ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties::~ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties()
{

}

void
ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletselectors"] = getSlingservletselectors().toJson();






	object["slingservletextensions"] = getSlingservletextensions().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties::setSlingservletselectors(ConfigNodePropertyString slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyString
ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties::getSlingservletextensions()
{
	return slingservletextensions;
}

void
ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties::setSlingservletextensions(ConfigNodePropertyString slingservletextensions)
{
	this->slingservletextensions = slingservletextensions;
}



