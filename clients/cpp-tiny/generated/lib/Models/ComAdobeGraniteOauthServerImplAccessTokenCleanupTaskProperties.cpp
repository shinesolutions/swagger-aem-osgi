

#include "ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.h"

using namespace Tiny;

ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties::ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties()
{
	schedulerexpression = ConfigNodePropertyString();
}

ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties::ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties::~ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties()
{

}

void
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerexpression"] = getSchedulerexpression().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}



