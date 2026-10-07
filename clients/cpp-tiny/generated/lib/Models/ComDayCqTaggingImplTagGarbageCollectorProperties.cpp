

#include "ComDayCqTaggingImplTagGarbageCollectorProperties.h"

using namespace Tiny;

ComDayCqTaggingImplTagGarbageCollectorProperties::ComDayCqTaggingImplTagGarbageCollectorProperties()
{
	schedulerexpression = ConfigNodePropertyString();
}

ComDayCqTaggingImplTagGarbageCollectorProperties::ComDayCqTaggingImplTagGarbageCollectorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqTaggingImplTagGarbageCollectorProperties::~ComDayCqTaggingImplTagGarbageCollectorProperties()
{

}

void
ComDayCqTaggingImplTagGarbageCollectorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *schedulerexpressionKey = "scheduler.expression";

    if(object.has_key(schedulerexpressionKey))
    {
        bourne::json value = object[schedulerexpressionKey];




        ConfigNodePropertyString* obj = &schedulerexpression;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqTaggingImplTagGarbageCollectorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["schedulerexpression"] = getSchedulerexpression().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqTaggingImplTagGarbageCollectorProperties::getSchedulerexpression()
{
	return schedulerexpression;
}

void
ComDayCqTaggingImplTagGarbageCollectorProperties::setSchedulerexpression(ConfigNodePropertyString schedulerexpression)
{
	this->schedulerexpression = schedulerexpression;
}



