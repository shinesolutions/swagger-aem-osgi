

#include "ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties.h"

using namespace Tiny;

ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties()
{
	slingservletpaths = ConfigNodePropertyString();
	slingservletmethods = ConfigNodePropertyString();
}

ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::~ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties()
{

}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingservletpathsKey = "sling.servlet.paths";

    if(object.has_key(slingservletpathsKey))
    {
        bourne::json value = object[slingservletpathsKey];




        ConfigNodePropertyString* obj = &slingservletpaths;
		obj->fromJson(value.dump());

    }

    const char *slingservletmethodsKey = "sling.servlet.methods";

    if(object.has_key(slingservletmethodsKey))
    {
        bourne::json value = object[slingservletmethodsKey];




        ConfigNodePropertyString* obj = &slingservletmethods;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingservletpaths"] = getSlingservletpaths().toJson();






	object["slingservletmethods"] = getSlingservletmethods().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::getSlingservletpaths()
{
	return slingservletpaths;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::setSlingservletpaths(ConfigNodePropertyString slingservletpaths)
{
	this->slingservletpaths = slingservletpaths;
}

ConfigNodePropertyString
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties::setSlingservletmethods(ConfigNodePropertyString slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}



