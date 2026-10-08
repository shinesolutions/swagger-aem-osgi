

#include "ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties()
{
	authimsclientsecret = ConfigNodePropertyString();
	customizertype = ConfigNodePropertyString();
}

ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::~ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties()
{

}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *authimsclientsecretKey = "auth.ims.client.secret";

    if(object.has_key(authimsclientsecretKey))
    {
        bourne::json value = object[authimsclientsecretKey];




        ConfigNodePropertyString* obj = &authimsclientsecret;
		obj->fromJson(value.dump());

    }

    const char *customizertypeKey = "customizer.type";

    if(object.has_key(customizertypeKey))
    {
        bourne::json value = object[customizertypeKey];




        ConfigNodePropertyString* obj = &customizertype;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["authimsclientsecret"] = getAuthimsclientsecret().toJson();






	object["customizertype"] = getCustomizertype().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::getAuthimsclientsecret()
{
	return authimsclientsecret;
}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::setAuthimsclientsecret(ConfigNodePropertyString authimsclientsecret)
{
	this->authimsclientsecret = authimsclientsecret;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::getCustomizertype()
{
	return customizertype;
}

void
ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties::setCustomizertype(ConfigNodePropertyString customizertype)
{
	this->customizertype = customizertype;
}



