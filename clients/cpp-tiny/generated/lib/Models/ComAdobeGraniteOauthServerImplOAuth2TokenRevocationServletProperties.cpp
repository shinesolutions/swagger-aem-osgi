

#include "ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.h"

using namespace Tiny;

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties()
{
	oauthtokenrevocationactive = ConfigNodePropertyBoolean();
}

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::~ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties()
{

}

void
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *oauthtokenrevocationactiveKey = "oauth.token.revocation.active";

    if(object.has_key(oauthtokenrevocationactiveKey))
    {
        bourne::json value = object[oauthtokenrevocationactiveKey];




        ConfigNodePropertyBoolean* obj = &oauthtokenrevocationactive;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthtokenrevocationactive"] = getOauthtokenrevocationactive().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::getOauthtokenrevocationactive()
{
	return oauthtokenrevocationactive;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties::setOauthtokenrevocationactive(ConfigNodePropertyBoolean oauthtokenrevocationactive)
{
	this->oauthtokenrevocationactive = oauthtokenrevocationactive;
}



