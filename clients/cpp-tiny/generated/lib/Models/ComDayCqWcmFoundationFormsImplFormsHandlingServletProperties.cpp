

#include "ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.h"

using namespace Tiny;

ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties()
{
	namewhitelist = ConfigNodePropertyString();
	allowexpressions = ConfigNodePropertyBoolean();
}

ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::~ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties()
{

}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *namewhitelistKey = "name.whitelist";

    if(object.has_key(namewhitelistKey))
    {
        bourne::json value = object[namewhitelistKey];




        ConfigNodePropertyString* obj = &namewhitelist;
		obj->fromJson(value.dump());

    }

    const char *allowexpressionsKey = "allow.expressions";

    if(object.has_key(allowexpressionsKey))
    {
        bourne::json value = object[allowexpressionsKey];




        ConfigNodePropertyBoolean* obj = &allowexpressions;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["namewhitelist"] = getNamewhitelist().toJson();






	object["allowexpressions"] = getAllowexpressions().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::getNamewhitelist()
{
	return namewhitelist;
}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::setNamewhitelist(ConfigNodePropertyString namewhitelist)
{
	this->namewhitelist = namewhitelist;
}

ConfigNodePropertyBoolean
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::getAllowexpressions()
{
	return allowexpressions;
}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::setAllowexpressions(ConfigNodePropertyBoolean allowexpressions)
{
	this->allowexpressions = allowexpressions;
}



