

#include "OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.h"

using namespace Tiny;

OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::OrgApacheSlingHcCoreImplScriptableHealthCheckProperties()
{
	hcname = ConfigNodePropertyString();
	hctags = ConfigNodePropertyArray();
	hcmbeanname = ConfigNodePropertyString();
	expression = ConfigNodePropertyString();
	languageextension = ConfigNodePropertyString();
}

OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::OrgApacheSlingHcCoreImplScriptableHealthCheckProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::~OrgApacheSlingHcCoreImplScriptableHealthCheckProperties()
{

}

void
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hcnameKey = "hc.name";

    if(object.has_key(hcnameKey))
    {
        bourne::json value = object[hcnameKey];




        ConfigNodePropertyString* obj = &hcname;
		obj->fromJson(value.dump());

    }

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *hcmbeannameKey = "hc.mbean.name";

    if(object.has_key(hcmbeannameKey))
    {
        bourne::json value = object[hcmbeannameKey];




        ConfigNodePropertyString* obj = &hcmbeanname;
		obj->fromJson(value.dump());

    }

    const char *expressionKey = "expression";

    if(object.has_key(expressionKey))
    {
        bourne::json value = object[expressionKey];




        ConfigNodePropertyString* obj = &expression;
		obj->fromJson(value.dump());

    }

    const char *languageextensionKey = "language.extension";

    if(object.has_key(languageextensionKey))
    {
        bourne::json value = object[languageextensionKey];




        ConfigNodePropertyString* obj = &languageextension;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hcname"] = getHcname().toJson();






	object["hctags"] = getHctags().toJson();






	object["hcmbeanname"] = getHcmbeanname().toJson();






	object["expression"] = getExpression().toJson();






	object["languageextension"] = getLanguageextension().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::getHcname()
{
	return hcname;
}

void
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::setHcname(ConfigNodePropertyString hcname)
{
	this->hcname = hcname;
}

ConfigNodePropertyArray
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::getHctags()
{
	return hctags;
}

void
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::getHcmbeanname()
{
	return hcmbeanname;
}

void
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::setHcmbeanname(ConfigNodePropertyString hcmbeanname)
{
	this->hcmbeanname = hcmbeanname;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::getExpression()
{
	return expression;
}

void
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::setExpression(ConfigNodePropertyString expression)
{
	this->expression = expression;
}

ConfigNodePropertyString
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::getLanguageextension()
{
	return languageextension;
}

void
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties::setLanguageextension(ConfigNodePropertyString languageextension)
{
	this->languageextension = languageextension;
}



