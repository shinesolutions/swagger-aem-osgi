

#include "ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties()
{
	path = ConfigNodePropertyString();
}

ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::~ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties()
{

}

void
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::getPath()
{
	return path;
}

void
ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}



