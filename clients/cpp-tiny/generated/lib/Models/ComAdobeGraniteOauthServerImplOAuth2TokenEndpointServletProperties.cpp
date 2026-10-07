

#include "ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties.h"

using namespace Tiny;

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties()
{
	oauthissuer = ConfigNodePropertyString();
	oauthaccesstokenexpiresin = ConfigNodePropertyString();
	osgihttpwhiteboardservletpattern = ConfigNodePropertyString();
	osgihttpwhiteboardcontextselect = ConfigNodePropertyString();
}

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::~ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties()
{

}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *oauthissuerKey = "oauth.issuer";

    if(object.has_key(oauthissuerKey))
    {
        bourne::json value = object[oauthissuerKey];




        ConfigNodePropertyString* obj = &oauthissuer;
		obj->fromJson(value.dump());

    }

    const char *oauthaccesstokenexpiresinKey = "oauth.access.token.expires.in";

    if(object.has_key(oauthaccesstokenexpiresinKey))
    {
        bourne::json value = object[oauthaccesstokenexpiresinKey];




        ConfigNodePropertyString* obj = &oauthaccesstokenexpiresin;
		obj->fromJson(value.dump());

    }

    const char *osgihttpwhiteboardservletpatternKey = "osgi.http.whiteboard.servlet.pattern";

    if(object.has_key(osgihttpwhiteboardservletpatternKey))
    {
        bourne::json value = object[osgihttpwhiteboardservletpatternKey];




        ConfigNodePropertyString* obj = &osgihttpwhiteboardservletpattern;
		obj->fromJson(value.dump());

    }

    const char *osgihttpwhiteboardcontextselectKey = "osgi.http.whiteboard.context.select";

    if(object.has_key(osgihttpwhiteboardcontextselectKey))
    {
        bourne::json value = object[osgihttpwhiteboardcontextselectKey];




        ConfigNodePropertyString* obj = &osgihttpwhiteboardcontextselect;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthissuer"] = getOauthissuer().toJson();






	object["oauthaccesstokenexpiresin"] = getOauthaccesstokenexpiresin().toJson();






	object["osgihttpwhiteboardservletpattern"] = getOsgihttpwhiteboardservletpattern().toJson();






	object["osgihttpwhiteboardcontextselect"] = getOsgihttpwhiteboardcontextselect().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOauthissuer()
{
	return oauthissuer;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOauthissuer(ConfigNodePropertyString oauthissuer)
{
	this->oauthissuer = oauthissuer;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOauthaccesstokenexpiresin()
{
	return oauthaccesstokenexpiresin;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOauthaccesstokenexpiresin(ConfigNodePropertyString oauthaccesstokenexpiresin)
{
	this->oauthaccesstokenexpiresin = oauthaccesstokenexpiresin;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOsgihttpwhiteboardservletpattern()
{
	return osgihttpwhiteboardservletpattern;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOsgihttpwhiteboardservletpattern(ConfigNodePropertyString osgihttpwhiteboardservletpattern)
{
	this->osgihttpwhiteboardservletpattern = osgihttpwhiteboardservletpattern;
}

ConfigNodePropertyString
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::getOsgihttpwhiteboardcontextselect()
{
	return osgihttpwhiteboardcontextselect;
}

void
ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties::setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString osgihttpwhiteboardcontextselect)
{
	this->osgihttpwhiteboardcontextselect = osgihttpwhiteboardcontextselect;
}



