

#include "ComDayCqReplicationImplAgentManagerImplInfo.h"

using namespace Tiny;

ComDayCqReplicationImplAgentManagerImplInfo::ComDayCqReplicationImplAgentManagerImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqReplicationImplAgentManagerImplProperties();
}

ComDayCqReplicationImplAgentManagerImplInfo::ComDayCqReplicationImplAgentManagerImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplAgentManagerImplInfo::~ComDayCqReplicationImplAgentManagerImplInfo()
{

}

void
ComDayCqReplicationImplAgentManagerImplInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        ComDayCqReplicationImplAgentManagerImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplAgentManagerImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqReplicationImplAgentManagerImplInfo::getPid()
{
	return pid;
}

void
ComDayCqReplicationImplAgentManagerImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqReplicationImplAgentManagerImplInfo::getTitle()
{
	return title;
}

void
ComDayCqReplicationImplAgentManagerImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqReplicationImplAgentManagerImplInfo::getDescription()
{
	return description;
}

void
ComDayCqReplicationImplAgentManagerImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqReplicationImplAgentManagerImplProperties
ComDayCqReplicationImplAgentManagerImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqReplicationImplAgentManagerImplInfo::setProperties(ComDayCqReplicationImplAgentManagerImplProperties properties)
{
	this->properties = properties;
}



