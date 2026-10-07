

#include "ComDayCqDamHandlerStandardPsdPsdHandlerProperties.h"

using namespace Tiny;

ComDayCqDamHandlerStandardPsdPsdHandlerProperties::ComDayCqDamHandlerStandardPsdPsdHandlerProperties()
{
	large_file_threshold = ConfigNodePropertyInteger();
}

ComDayCqDamHandlerStandardPsdPsdHandlerProperties::ComDayCqDamHandlerStandardPsdPsdHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamHandlerStandardPsdPsdHandlerProperties::~ComDayCqDamHandlerStandardPsdPsdHandlerProperties()
{

}

void
ComDayCqDamHandlerStandardPsdPsdHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *large_file_thresholdKey = "large_file_threshold";

    if(object.has_key(large_file_thresholdKey))
    {
        bourne::json value = object[large_file_thresholdKey];




        ConfigNodePropertyInteger* obj = &large_file_threshold;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamHandlerStandardPsdPsdHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["large_file_threshold"] = getLargeFileThreshold().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqDamHandlerStandardPsdPsdHandlerProperties::getLargeFileThreshold()
{
	return large_file_threshold;
}

void
ComDayCqDamHandlerStandardPsdPsdHandlerProperties::setLargeFileThreshold(ConfigNodePropertyInteger large_file_threshold)
{
	this->large_file_threshold = large_file_threshold;
}



