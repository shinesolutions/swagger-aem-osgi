

#include "ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties()
{
	enableFallback = ConfigNodePropertyBoolean();
}

ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::~ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties()
{

}

void
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enableFallbackKey = "enableFallback";

    if(object.has_key(enableFallbackKey))
    {
        bourne::json value = object[enableFallbackKey];




        ConfigNodePropertyBoolean* obj = &enableFallback;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enableFallback"] = getEnableFallback().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::getEnableFallback()
{
	return enableFallback;
}

void
ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties::setEnableFallback(ConfigNodePropertyBoolean enableFallback)
{
	this->enableFallback = enableFallback;
}



