

#include "ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.h"

using namespace Tiny;

ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties::ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties()
{
	slingpostoperation = ConfigNodePropertyString();
	slingservletmethods = ConfigNodePropertyString();
}

ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties::ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties::~ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties()
{

}

void
ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties::fromJson(std::string jsonObj)
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
ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingpostoperation"] = getSlingpostoperation().toJson();






	object["slingservletmethods"] = getSlingservletmethods().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties::getSlingpostoperation()
{
	return slingpostoperation;
}

void
ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties::setSlingpostoperation(ConfigNodePropertyString slingpostoperation)
{
	this->slingpostoperation = slingpostoperation;
}

ConfigNodePropertyString
ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties::getSlingservletmethods()
{
	return slingservletmethods;
}

void
ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties::setSlingservletmethods(ConfigNodePropertyString slingservletmethods)
{
	this->slingservletmethods = slingservletmethods;
}



