

#include "ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties()
{
	nonValidChars = ConfigNodePropertyString();
}

ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::~ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties()
{

}

void
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nonValidCharsKey = "nonValidChars";

    if(object.has_key(nonValidCharsKey))
    {
        bourne::json value = object[nonValidCharsKey];




        ConfigNodePropertyString* obj = &nonValidChars;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["nonValidChars"] = getNonValidChars().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::getNonValidChars()
{
	return nonValidChars;
}

void
ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties::setNonValidChars(ConfigNodePropertyString nonValidChars)
{
	this->nonValidChars = nonValidChars;
}



