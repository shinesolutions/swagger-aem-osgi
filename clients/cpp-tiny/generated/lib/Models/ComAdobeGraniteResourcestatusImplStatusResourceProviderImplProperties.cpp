

#include "ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.h"

using namespace Tiny;

ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties()
{
	providerroot = ConfigNodePropertyString();
}

ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::~ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties()
{

}

void
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *providerrootKey = "provider.root";

    if(object.has_key(providerrootKey))
    {
        bourne::json value = object[providerrootKey];




        ConfigNodePropertyString* obj = &providerroot;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["providerroot"] = getProviderroot().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::getProviderroot()
{
	return providerroot;
}

void
ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties::setProviderroot(ConfigNodePropertyString providerroot)
{
	this->providerroot = providerroot;
}



