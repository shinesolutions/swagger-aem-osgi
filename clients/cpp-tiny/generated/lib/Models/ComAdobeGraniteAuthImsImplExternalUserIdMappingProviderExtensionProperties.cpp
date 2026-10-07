

#include "ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties::ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties()
{
	oauthproviderid = ConfigNodePropertyString();
}

ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties::ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties::~ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties()
{

}

void
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *oauthprovideridKey = "oauth.provider.id";

    if(object.has_key(oauthprovideridKey))
    {
        bourne::json value = object[oauthprovideridKey];




        ConfigNodePropertyString* obj = &oauthproviderid;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthproviderid"] = getOauthproviderid().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties::setOauthproviderid(ConfigNodePropertyString oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}



