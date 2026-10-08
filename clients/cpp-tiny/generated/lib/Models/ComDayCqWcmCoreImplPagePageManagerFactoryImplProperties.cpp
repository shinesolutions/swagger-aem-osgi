

#include "ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties()
{
	illegalCharMapping = ConfigNodePropertyString();
	pageSubTreeActivationCheck = ConfigNodePropertyBoolean();
}

ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::~ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties()
{

}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *illegalCharMappingKey = "illegalCharMapping";

    if(object.has_key(illegalCharMappingKey))
    {
        bourne::json value = object[illegalCharMappingKey];




        ConfigNodePropertyString* obj = &illegalCharMapping;
		obj->fromJson(value.dump());

    }

    const char *pageSubTreeActivationCheckKey = "pageSubTreeActivationCheck";

    if(object.has_key(pageSubTreeActivationCheckKey))
    {
        bourne::json value = object[pageSubTreeActivationCheckKey];




        ConfigNodePropertyBoolean* obj = &pageSubTreeActivationCheck;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["illegalCharMapping"] = getIllegalCharMapping().toJson();






	object["pageSubTreeActivationCheck"] = getPageSubTreeActivationCheck().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::getIllegalCharMapping()
{
	return illegalCharMapping;
}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::setIllegalCharMapping(ConfigNodePropertyString illegalCharMapping)
{
	this->illegalCharMapping = illegalCharMapping;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::getPageSubTreeActivationCheck()
{
	return pageSubTreeActivationCheck;
}

void
ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties::setPageSubTreeActivationCheck(ConfigNodePropertyBoolean pageSubTreeActivationCheck)
{
	this->pageSubTreeActivationCheck = pageSubTreeActivationCheck;
}



