

#include "ComAdobeGraniteAuthImsProperties.h"

using namespace Tiny;

ComAdobeGraniteAuthImsProperties::ComAdobeGraniteAuthImsProperties()
{
	configid = ConfigNodePropertyString();
	scope = ConfigNodePropertyString();
}

ComAdobeGraniteAuthImsProperties::ComAdobeGraniteAuthImsProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteAuthImsProperties::~ComAdobeGraniteAuthImsProperties()
{

}

void
ComAdobeGraniteAuthImsProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *configidKey = "configid";

    if(object.has_key(configidKey))
    {
        bourne::json value = object[configidKey];




        ConfigNodePropertyString* obj = &configid;
		obj->fromJson(value.dump());

    }

    const char *scopeKey = "scope";

    if(object.has_key(scopeKey))
    {
        bourne::json value = object[scopeKey];




        ConfigNodePropertyString* obj = &scope;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteAuthImsProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["configid"] = getConfigid().toJson();






	object["scope"] = getScope().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteAuthImsProperties::getConfigid()
{
	return configid;
}

void
ComAdobeGraniteAuthImsProperties::setConfigid(ConfigNodePropertyString configid)
{
	this->configid = configid;
}

ConfigNodePropertyString
ComAdobeGraniteAuthImsProperties::getScope()
{
	return scope;
}

void
ComAdobeGraniteAuthImsProperties::setScope(ConfigNodePropertyString scope)
{
	this->scope = scope;
}



