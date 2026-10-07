

#include "ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties.h"

using namespace Tiny;

ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties::ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties()
{
	oauthclientrevocationactive = ConfigNodePropertyBoolean();
}

ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties::ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties::~ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties()
{

}

void
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *oauthclientrevocationactiveKey = "oauth.client.revocation.active";

    if(object.has_key(oauthclientrevocationactiveKey))
    {
        bourne::json value = object[oauthclientrevocationactiveKey];




        ConfigNodePropertyBoolean* obj = &oauthclientrevocationactive;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthclientrevocationactive"] = getOauthclientrevocationactive().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties::getOauthclientrevocationactive()
{
	return oauthclientrevocationactive;
}

void
ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties::setOauthclientrevocationactive(ConfigNodePropertyBoolean oauthclientrevocationactive)
{
	this->oauthclientrevocationactive = oauthclientrevocationactive;
}



