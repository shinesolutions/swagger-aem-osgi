

#include "ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.h"

using namespace Tiny;

ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties()
{
	providerroots = ConfigNodePropertyString();
}

ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::~ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties()
{

}

void
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *providerrootsKey = "provider.roots";

    if(object.has_key(providerrootsKey))
    {
        bourne::json value = object[providerrootsKey];




        ConfigNodePropertyString* obj = &providerroots;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["providerroots"] = getProviderroots().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::getProviderroots()
{
	return providerroots;
}

void
ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties::setProviderroots(ConfigNodePropertyString providerroots)
{
	this->providerroots = providerroots;
}



