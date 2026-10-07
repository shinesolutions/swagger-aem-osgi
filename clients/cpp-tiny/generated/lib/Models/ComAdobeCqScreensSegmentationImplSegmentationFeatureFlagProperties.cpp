

#include "ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.h"

using namespace Tiny;

ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties()
{
	enableDataTriggeredContent = ConfigNodePropertyBoolean();
}

ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::~ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties()
{

}

void
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enableDataTriggeredContentKey = "enableDataTriggeredContent";

    if(object.has_key(enableDataTriggeredContentKey))
    {
        bourne::json value = object[enableDataTriggeredContentKey];




        ConfigNodePropertyBoolean* obj = &enableDataTriggeredContent;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enableDataTriggeredContent"] = getEnableDataTriggeredContent().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::getEnableDataTriggeredContent()
{
	return enableDataTriggeredContent;
}

void
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::setEnableDataTriggeredContent(ConfigNodePropertyBoolean enableDataTriggeredContent)
{
	this->enableDataTriggeredContent = enableDataTriggeredContent;
}



