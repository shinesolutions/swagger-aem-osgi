

#include "ApacheSlingHealthCheckResultHTMLSerializerInfo.h"

using namespace Tiny;

ApacheSlingHealthCheckResultHTMLSerializerInfo::ApacheSlingHealthCheckResultHTMLSerializerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ApacheSlingHealthCheckResultHTMLSerializerProperties();
}

ApacheSlingHealthCheckResultHTMLSerializerInfo::ApacheSlingHealthCheckResultHTMLSerializerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ApacheSlingHealthCheckResultHTMLSerializerInfo::~ApacheSlingHealthCheckResultHTMLSerializerInfo()
{

}

void
ApacheSlingHealthCheckResultHTMLSerializerInfo::fromJson(std::string jsonObj)
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




        ApacheSlingHealthCheckResultHTMLSerializerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ApacheSlingHealthCheckResultHTMLSerializerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ApacheSlingHealthCheckResultHTMLSerializerInfo::getPid()
{
	return pid;
}

void
ApacheSlingHealthCheckResultHTMLSerializerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ApacheSlingHealthCheckResultHTMLSerializerInfo::getTitle()
{
	return title;
}

void
ApacheSlingHealthCheckResultHTMLSerializerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ApacheSlingHealthCheckResultHTMLSerializerInfo::getDescription()
{
	return description;
}

void
ApacheSlingHealthCheckResultHTMLSerializerInfo::setDescription(std::string description)
{
	this->description = description;
}

ApacheSlingHealthCheckResultHTMLSerializerProperties
ApacheSlingHealthCheckResultHTMLSerializerInfo::getProperties()
{
	return properties;
}

void
ApacheSlingHealthCheckResultHTMLSerializerInfo::setProperties(ApacheSlingHealthCheckResultHTMLSerializerProperties properties)
{
	this->properties = properties;
}



