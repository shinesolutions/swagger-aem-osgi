

#include "ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties.h"

using namespace Tiny;

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties()
{
	slingservletpaths = ConfigNodePropertyString();
	oauthrevocationactive = ConfigNodePropertyBoolean();
}

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::~ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties()
{

}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletpathsKey = "sling.servlet.paths";

    if(object.has_key(slingservletpathsKey))
    {
        bourne::json value = object[slingservletpathsKey];




        ConfigNodePropertyString* obj = &slingservletpaths;
		obj->fromJson(value.dump());

    }

    const char *oauthrevocationactiveKey = "oauth.revocation.active";

    if(object.has_key(oauthrevocationactiveKey))
    {
        bourne::json value = object[oauthrevocationactiveKey];




        ConfigNodePropertyBoolean* obj = &oauthrevocationactive;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletpaths"] = getSlingservletpaths().toJson();






	object["oauthrevocationactive"] = getOauthrevocationactive().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::getSlingservletpaths()
{
	return slingservletpaths;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::setSlingservletpaths(ConfigNodePropertyString slingservletpaths)
{
	this->slingservletpaths = slingservletpaths;
}

ConfigNodePropertyBoolean
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::getOauthrevocationactive()
{
	return oauthrevocationactive;
}

void
ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties::setOauthrevocationactive(ConfigNodePropertyBoolean oauthrevocationactive)
{
	this->oauthrevocationactive = oauthrevocationactive;
}



