

#include "ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties::ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties()
{
	oauthproviderid = ConfigNodePropertyString();
}

ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties::ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties::~ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties()
{

}

void
ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthproviderid"] = getOauthproviderid().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties::setOauthproviderid(ConfigNodePropertyString oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}



