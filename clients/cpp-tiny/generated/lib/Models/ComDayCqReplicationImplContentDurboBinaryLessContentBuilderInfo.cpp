

#include "ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.h"

using namespace Tiny;

ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties();
}

ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::~ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo()
{

}

void
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::fromJson(std::string jsonObj)
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




        ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::getPid()
{
	return pid;
}

void
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::getTitle()
{
	return title;
}

void
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::getDescription()
{
	return description;
}

void
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::getProperties()
{
	return properties;
}

void
ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo::setProperties(ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties properties)
{
	this->properties = properties;
}



