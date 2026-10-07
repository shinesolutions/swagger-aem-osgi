

#include "ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.h"

using namespace Tiny;

ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties()
{
	slingpostoperation = ConfigNodePropertyString();
	slingservletmethods = ConfigNodePropertyString();
}

ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::~ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties()
{

}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingpostoperationKey = "sling.post.operation";

    if(object.has_key(slingpostoperationKey))
    {
        bourne::json value = object[slingpostoperationKey];




        ConfigNodePropertyString* obj = &slingpostoperation;
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
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingpostoperation"] = getSlingpostoperation().toJson();






	object["slingservletmethods"] = getSlingservletmethods().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::getSlingpostoperation()
{
	return slingpostoperation;
}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::setSlingpostoperation(ConfigNodePropertyString slingpostoperation)
{
	this->slingpostoperation = slingpostoperation;
}

ConfigNodePropertyString
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties::setSlingservletmethods(ConfigNodePropertyString slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}



