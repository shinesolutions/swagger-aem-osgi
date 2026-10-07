

#include "MessagingUserComponentFactoryProperties.h"

using namespace Tiny;

MessagingUserComponentFactoryProperties::MessagingUserComponentFactoryProperties()
{
	priority = ConfigNodePropertyInteger();
}

MessagingUserComponentFactoryProperties::MessagingUserComponentFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

MessagingUserComponentFactoryProperties::~MessagingUserComponentFactoryProperties()
{

}

void
MessagingUserComponentFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *priorityKey = "priority";

    if(object.has_key(priorityKey))
    {
        bourne::json value = object[priorityKey];




        ConfigNodePropertyInteger* obj = &priority;
		obj->fromJson(value.dump());

    }


}

bourne::json
MessagingUserComponentFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["priority"] = getPriority().toJson();


    return object;

}

ConfigNodePropertyInteger
MessagingUserComponentFactoryProperties::getPriority()
{
	return priority;
}

void
MessagingUserComponentFactoryProperties::setPriority(ConfigNodePropertyInteger priority)
{
	this->priority = priority;
}



