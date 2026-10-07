

#include "ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties()
{
	path = ConfigNodePropertyString();
	serviceranking = ConfigNodePropertyInteger();
	jaascontrolFlag = ConfigNodePropertyString();
	jaasrealmName = ConfigNodePropertyString();
	jaasranking = ConfigNodePropertyInteger();
	headers = ConfigNodePropertyArray();
	cookies = ConfigNodePropertyArray();
	parameters = ConfigNodePropertyArray();
	usermap = ConfigNodePropertyArray();
	format = ConfigNodePropertyString();
	trustedCredentialsAttribute = ConfigNodePropertyString();
}

ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::~ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties()
{

}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *jaascontrolFlagKey = "jaas.controlFlag";

    if(object.has_key(jaascontrolFlagKey))
    {
        bourne::json value = object[jaascontrolFlagKey];




        ConfigNodePropertyString* obj = &jaascontrolFlag;
		obj->fromJson(value.dump());

    }

    const char *jaasrealmNameKey = "jaas.realmName";

    if(object.has_key(jaasrealmNameKey))
    {
        bourne::json value = object[jaasrealmNameKey];




        ConfigNodePropertyString* obj = &jaasrealmName;
		obj->fromJson(value.dump());

    }

    const char *jaasrankingKey = "jaas.ranking";

    if(object.has_key(jaasrankingKey))
    {
        bourne::json value = object[jaasrankingKey];




        ConfigNodePropertyInteger* obj = &jaasranking;
		obj->fromJson(value.dump());

    }

    const char *headersKey = "headers";

    if(object.has_key(headersKey))
    {
        bourne::json value = object[headersKey];




        ConfigNodePropertyArray* obj = &headers;
		obj->fromJson(value.dump());

    }

    const char *cookiesKey = "cookies";

    if(object.has_key(cookiesKey))
    {
        bourne::json value = object[cookiesKey];




        ConfigNodePropertyArray* obj = &cookies;
		obj->fromJson(value.dump());

    }

    const char *parametersKey = "parameters";

    if(object.has_key(parametersKey))
    {
        bourne::json value = object[parametersKey];




        ConfigNodePropertyArray* obj = &parameters;
		obj->fromJson(value.dump());

    }

    const char *usermapKey = "usermap";

    if(object.has_key(usermapKey))
    {
        bourne::json value = object[usermapKey];




        ConfigNodePropertyArray* obj = &usermap;
		obj->fromJson(value.dump());

    }

    const char *formatKey = "format";

    if(object.has_key(formatKey))
    {
        bourne::json value = object[formatKey];




        ConfigNodePropertyString* obj = &format;
		obj->fromJson(value.dump());

    }

    const char *trustedCredentialsAttributeKey = "trustedCredentialsAttribute";

    if(object.has_key(trustedCredentialsAttributeKey))
    {
        bourne::json value = object[trustedCredentialsAttributeKey];




        ConfigNodePropertyString* obj = &trustedCredentialsAttribute;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();






	object["serviceranking"] = getServiceranking().toJson();






	object["jaascontrolFlag"] = getJaascontrolFlag().toJson();






	object["jaasrealmName"] = getJaasrealmName().toJson();






	object["jaasranking"] = getJaasranking().toJson();






	object["headers"] = getHeaders().toJson();






	object["cookies"] = getCookies().toJson();






	object["parameters"] = getParameters().toJson();






	object["usermap"] = getUsermap().toJson();






	object["format"] = getFormat().toJson();






	object["trustedCredentialsAttribute"] = getTrustedCredentialsAttribute().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getPath()
{
	return path;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getJaascontrolFlag()
{
	return jaascontrolFlag;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setJaascontrolFlag(ConfigNodePropertyString jaascontrolFlag)
{
	this->jaascontrolFlag = jaascontrolFlag;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getJaasrealmName()
{
	return jaasrealmName;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setJaasrealmName(ConfigNodePropertyString jaasrealmName)
{
	this->jaasrealmName = jaasrealmName;
}

ConfigNodePropertyInteger
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getJaasranking()
{
	return jaasranking;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setJaasranking(ConfigNodePropertyInteger jaasranking)
{
	this->jaasranking = jaasranking;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getHeaders()
{
	return headers;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setHeaders(ConfigNodePropertyArray headers)
{
	this->headers = headers;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getCookies()
{
	return cookies;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setCookies(ConfigNodePropertyArray cookies)
{
	this->cookies = cookies;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getParameters()
{
	return parameters;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setParameters(ConfigNodePropertyArray parameters)
{
	this->parameters = parameters;
}

ConfigNodePropertyArray
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getUsermap()
{
	return usermap;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setUsermap(ConfigNodePropertyArray usermap)
{
	this->usermap = usermap;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getFormat()
{
	return format;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setFormat(ConfigNodePropertyString format)
{
	this->format = format;
}

ConfigNodePropertyString
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::getTrustedCredentialsAttribute()
{
	return trustedCredentialsAttribute;
}

void
ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties::setTrustedCredentialsAttribute(ConfigNodePropertyString trustedCredentialsAttribute)
{
	this->trustedCredentialsAttribute = trustedCredentialsAttribute;
}



