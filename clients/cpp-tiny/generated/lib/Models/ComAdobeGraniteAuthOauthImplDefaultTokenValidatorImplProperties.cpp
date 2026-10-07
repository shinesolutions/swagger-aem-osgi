

#include "ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties()
{
	authtokenvalidatortype = ConfigNodePropertyString();
}

ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::~ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties()
{

}

void
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *authtokenvalidatortypeKey = "auth.token.validator.type";

    if(object.has_key(authtokenvalidatortypeKey))
    {
        bourne::json value = object[authtokenvalidatortypeKey];




        ConfigNodePropertyString* obj = &authtokenvalidatortype;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["authtokenvalidatortype"] = getAuthtokenvalidatortype().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::getAuthtokenvalidatortype()
{
	return authtokenvalidatortype;
}

void
ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties::setAuthtokenvalidatortype(ConfigNodePropertyString authtokenvalidatortype)
{
	this->authtokenvalidatortype = authtokenvalidatortype;
}



