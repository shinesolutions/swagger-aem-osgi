

#include "ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.h"

using namespace Tiny;

ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties();
}

ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::~ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo()
{

}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties
ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo::setProperties(ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties properties)
{
	this->properties = properties;
}



