

#include "ComDayCqReplicationImplReplicatorImplInfo.h"

using namespace Tiny;

ComDayCqReplicationImplReplicatorImplInfo::ComDayCqReplicationImplReplicatorImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqReplicationImplReplicatorImplProperties();
}

ComDayCqReplicationImplReplicatorImplInfo::ComDayCqReplicationImplReplicatorImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplReplicatorImplInfo::~ComDayCqReplicationImplReplicatorImplInfo()
{

}

void
ComDayCqReplicationImplReplicatorImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqReplicationImplReplicatorImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplReplicatorImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqReplicationImplReplicatorImplInfo::getPid()
{
	return pid;
}

void
ComDayCqReplicationImplReplicatorImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqReplicationImplReplicatorImplInfo::getTitle()
{
	return title;
}

void
ComDayCqReplicationImplReplicatorImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqReplicationImplReplicatorImplInfo::getDescription()
{
	return description;
}

void
ComDayCqReplicationImplReplicatorImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqReplicationImplReplicatorImplProperties
ComDayCqReplicationImplReplicatorImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqReplicationImplReplicatorImplInfo::setProperties(ComDayCqReplicationImplReplicatorImplProperties properties)
{
	this->properties = properties;
}



