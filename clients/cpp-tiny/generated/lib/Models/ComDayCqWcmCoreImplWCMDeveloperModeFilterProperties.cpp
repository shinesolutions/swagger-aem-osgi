

#include "ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties()
{
	wcmdevmodefilterenabled = ConfigNodePropertyBoolean();
}

ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::~ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties()
{

}

void
ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *wcmdevmodefilterenabledKey = "wcmdevmodefilter.enabled";

    if(object.has_key(wcmdevmodefilterenabledKey))
    {
        bourne::json value = object[wcmdevmodefilterenabledKey];




        ConfigNodePropertyBoolean* obj = &wcmdevmodefilterenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["wcmdevmodefilterenabled"] = getWcmdevmodefilterenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::getWcmdevmodefilterenabled()
{
	return wcmdevmodefilterenabled;
}

void
ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties::setWcmdevmodefilterenabled(ConfigNodePropertyBoolean wcmdevmodefilterenabled)
{
	this->wcmdevmodefilterenabled = wcmdevmodefilterenabled;
}



