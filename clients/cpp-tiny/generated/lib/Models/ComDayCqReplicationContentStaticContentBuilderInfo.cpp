

#include "ComDayCqReplicationContentStaticContentBuilderInfo.h"

using namespace Tiny;

ComDayCqReplicationContentStaticContentBuilderInfo::ComDayCqReplicationContentStaticContentBuilderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqReplicationContentStaticContentBuilderProperties();
}

ComDayCqReplicationContentStaticContentBuilderInfo::ComDayCqReplicationContentStaticContentBuilderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationContentStaticContentBuilderInfo::~ComDayCqReplicationContentStaticContentBuilderInfo()
{

}

void
ComDayCqReplicationContentStaticContentBuilderInfo::fromJson(std::string jsonObj)
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




        ComDayCqReplicationContentStaticContentBuilderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationContentStaticContentBuilderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqReplicationContentStaticContentBuilderInfo::getPid()
{
	return pid;
}

void
ComDayCqReplicationContentStaticContentBuilderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqReplicationContentStaticContentBuilderInfo::getTitle()
{
	return title;
}

void
ComDayCqReplicationContentStaticContentBuilderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqReplicationContentStaticContentBuilderInfo::getDescription()
{
	return description;
}

void
ComDayCqReplicationContentStaticContentBuilderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqReplicationContentStaticContentBuilderProperties
ComDayCqReplicationContentStaticContentBuilderInfo::getProperties()
{
	return properties;
}

void
ComDayCqReplicationContentStaticContentBuilderInfo::setProperties(ComDayCqReplicationContentStaticContentBuilderProperties properties)
{
	this->properties = properties;
}



