

#include "ComDayCqSearchImplBuilderQueryBuilderImplInfo.h"

using namespace Tiny;

ComDayCqSearchImplBuilderQueryBuilderImplInfo::ComDayCqSearchImplBuilderQueryBuilderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqSearchImplBuilderQueryBuilderImplProperties();
}

ComDayCqSearchImplBuilderQueryBuilderImplInfo::ComDayCqSearchImplBuilderQueryBuilderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqSearchImplBuilderQueryBuilderImplInfo::~ComDayCqSearchImplBuilderQueryBuilderImplInfo()
{

}

void
ComDayCqSearchImplBuilderQueryBuilderImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqSearchImplBuilderQueryBuilderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqSearchImplBuilderQueryBuilderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqSearchImplBuilderQueryBuilderImplInfo::getPid()
{
	return pid;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqSearchImplBuilderQueryBuilderImplInfo::getTitle()
{
	return title;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqSearchImplBuilderQueryBuilderImplInfo::getDescription()
{
	return description;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqSearchImplBuilderQueryBuilderImplProperties
ComDayCqSearchImplBuilderQueryBuilderImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqSearchImplBuilderQueryBuilderImplInfo::setProperties(ComDayCqSearchImplBuilderQueryBuilderImplProperties properties)
{
	this->properties = properties;
}



