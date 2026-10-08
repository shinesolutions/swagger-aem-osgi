

#include "ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.h"

using namespace Tiny;

ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties()
{
	comadobeaemscreensimplremoterequest_timeout = ConfigNodePropertyInteger();
}

ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::~ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties()
{

}

void
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *comadobeaemscreensimplremoterequest_timeoutKey = "com.adobe.aem.screens.impl.remote.request_timeout";

    if(object.has_key(comadobeaemscreensimplremoterequest_timeoutKey))
    {
        bourne::json value = object[comadobeaemscreensimplremoterequest_timeoutKey];




        ConfigNodePropertyInteger* obj = &comadobeaemscreensimplremoterequest_timeout;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["comadobeaemscreensimplremoterequest_timeout"] = getComadobeaemscreensimplremoterequestTimeout().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::getComadobeaemscreensimplremoterequestTimeout()
{
	return comadobeaemscreensimplremoterequest_timeout;
}

void
ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties::setComadobeaemscreensimplremoterequestTimeout(ConfigNodePropertyInteger comadobeaemscreensimplremoterequest_timeout)
{
	this->comadobeaemscreensimplremoterequest_timeout = comadobeaemscreensimplremoterequest_timeout;
}



