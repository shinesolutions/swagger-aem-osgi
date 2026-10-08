

#include "ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties()
{
	oauthproviderid = ConfigNodePropertyString();
}

ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::~ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties()
{

}

void
ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthproviderid"] = getOauthproviderid().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties::setOauthproviderid(ConfigNodePropertyString oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}



