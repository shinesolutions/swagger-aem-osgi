

#include "ComDayCqMcmImplMCMConfigurationProperties.h"

using namespace Tiny;

ComDayCqMcmImplMCMConfigurationProperties::ComDayCqMcmImplMCMConfigurationProperties()
{
	experienceindirection = ConfigNodePropertyArray();
	touchpointindirection = ConfigNodePropertyArray();
}

ComDayCqMcmImplMCMConfigurationProperties::ComDayCqMcmImplMCMConfigurationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmImplMCMConfigurationProperties::~ComDayCqMcmImplMCMConfigurationProperties()
{

}

void
ComDayCqMcmImplMCMConfigurationProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *experienceindirectionKey = "experience.indirection";

    if(object.has_key(experienceindirectionKey))
    {
        bourne::json value = object[experienceindirectionKey];




        ConfigNodePropertyArray* obj = &experienceindirection;
		obj->fromJson(value.dump());

    }

    const char *touchpointindirectionKey = "touchpoint.indirection";

    if(object.has_key(touchpointindirectionKey))
    {
        bourne::json value = object[touchpointindirectionKey];




        ConfigNodePropertyArray* obj = &touchpointindirection;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmImplMCMConfigurationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["experienceindirection"] = getExperienceindirection().toJson();






	object["touchpointindirection"] = getTouchpointindirection().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqMcmImplMCMConfigurationProperties::getExperienceindirection()
{
	return experienceindirection;
}

void
ComDayCqMcmImplMCMConfigurationProperties::setExperienceindirection(ConfigNodePropertyArray experienceindirection)
{
	this->experienceindirection = experienceindirection;
}

ConfigNodePropertyArray
ComDayCqMcmImplMCMConfigurationProperties::getTouchpointindirection()
{
	return touchpointindirection;
}

void
ComDayCqMcmImplMCMConfigurationProperties::setTouchpointindirection(ConfigNodePropertyArray touchpointindirection)
{
	this->touchpointindirection = touchpointindirection;
}



