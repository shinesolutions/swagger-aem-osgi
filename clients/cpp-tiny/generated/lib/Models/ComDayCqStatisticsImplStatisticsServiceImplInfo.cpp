

#include "ComDayCqStatisticsImplStatisticsServiceImplInfo.h"

using namespace Tiny;

ComDayCqStatisticsImplStatisticsServiceImplInfo::ComDayCqStatisticsImplStatisticsServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqStatisticsImplStatisticsServiceImplProperties();
}

ComDayCqStatisticsImplStatisticsServiceImplInfo::ComDayCqStatisticsImplStatisticsServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqStatisticsImplStatisticsServiceImplInfo::~ComDayCqStatisticsImplStatisticsServiceImplInfo()
{

}

void
ComDayCqStatisticsImplStatisticsServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqStatisticsImplStatisticsServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqStatisticsImplStatisticsServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqStatisticsImplStatisticsServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqStatisticsImplStatisticsServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqStatisticsImplStatisticsServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqStatisticsImplStatisticsServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqStatisticsImplStatisticsServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqStatisticsImplStatisticsServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqStatisticsImplStatisticsServiceImplProperties
ComDayCqStatisticsImplStatisticsServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqStatisticsImplStatisticsServiceImplInfo::setProperties(ComDayCqStatisticsImplStatisticsServiceImplProperties properties)
{
	this->properties = properties;
}



