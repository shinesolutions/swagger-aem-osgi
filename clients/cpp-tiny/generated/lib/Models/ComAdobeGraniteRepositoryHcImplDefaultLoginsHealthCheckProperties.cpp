

#include "ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties()
{
	hctags = ConfigNodePropertyArray();
	accountlogins = ConfigNodePropertyArray();
	consolelogins = ConfigNodePropertyArray();
}

ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::~ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties()
{

}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *accountloginsKey = "account.logins";

    if(object.has_key(accountloginsKey))
    {
        bourne::json value = object[accountloginsKey];




        ConfigNodePropertyArray* obj = &accountlogins;
		obj->fromJson(value.dump());

    }

    const char *consoleloginsKey = "console.logins";

    if(object.has_key(consoleloginsKey))
    {
        bourne::json value = object[consoleloginsKey];




        ConfigNodePropertyArray* obj = &consolelogins;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();






	object["accountlogins"] = getAccountlogins().toJson();






	object["consolelogins"] = getConsolelogins().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::getAccountlogins()
{
	return accountlogins;
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::setAccountlogins(ConfigNodePropertyArray accountlogins)
{
	this->accountlogins = accountlogins;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::getConsolelogins()
{
	return consolelogins;
}

void
ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties::setConsolelogins(ConfigNodePropertyArray consolelogins)
{
	this->consolelogins = consolelogins;
}



