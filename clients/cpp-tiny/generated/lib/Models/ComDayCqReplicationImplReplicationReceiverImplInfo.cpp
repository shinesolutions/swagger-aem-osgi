

#include "ComDayCqReplicationImplReplicationReceiverImplInfo.h"

using namespace Tiny;

ComDayCqReplicationImplReplicationReceiverImplInfo::ComDayCqReplicationImplReplicationReceiverImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqReplicationImplReplicationReceiverImplProperties();
}

ComDayCqReplicationImplReplicationReceiverImplInfo::ComDayCqReplicationImplReplicationReceiverImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplReplicationReceiverImplInfo::~ComDayCqReplicationImplReplicationReceiverImplInfo()
{

}

void
ComDayCqReplicationImplReplicationReceiverImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqReplicationImplReplicationReceiverImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplReplicationReceiverImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqReplicationImplReplicationReceiverImplInfo::getPid()
{
	return pid;
}

void
ComDayCqReplicationImplReplicationReceiverImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqReplicationImplReplicationReceiverImplInfo::getTitle()
{
	return title;
}

void
ComDayCqReplicationImplReplicationReceiverImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqReplicationImplReplicationReceiverImplInfo::getDescription()
{
	return description;
}

void
ComDayCqReplicationImplReplicationReceiverImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqReplicationImplReplicationReceiverImplProperties
ComDayCqReplicationImplReplicationReceiverImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqReplicationImplReplicationReceiverImplInfo::setProperties(ComDayCqReplicationImplReplicationReceiverImplProperties properties)
{
	this->properties = properties;
}



