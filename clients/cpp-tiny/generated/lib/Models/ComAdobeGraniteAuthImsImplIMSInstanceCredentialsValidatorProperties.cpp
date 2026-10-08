

#include "ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties::ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties()
{
	oauthproviderid = ConfigNodePropertyString();
}

ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties::ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties::~ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties()
{

}

void
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties::fromJson(std::string jsonObj)
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
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["oauthproviderid"] = getOauthproviderid().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties::getOauthproviderid()
{
	return oauthproviderid;
}

void
ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties::setOauthproviderid(ConfigNodePropertyString oauthproviderid)
{
	this->oauthproviderid = oauthproviderid;
}



