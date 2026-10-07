

#include "ComDayCqImageInternalFontFontHelperInfo.h"

using namespace Tiny;

ComDayCqImageInternalFontFontHelperInfo::ComDayCqImageInternalFontFontHelperInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqImageInternalFontFontHelperProperties();
}

ComDayCqImageInternalFontFontHelperInfo::ComDayCqImageInternalFontFontHelperInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqImageInternalFontFontHelperInfo::~ComDayCqImageInternalFontFontHelperInfo()
{

}

void
ComDayCqImageInternalFontFontHelperInfo::fromJson(std::string jsonObj)
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




        ComDayCqImageInternalFontFontHelperProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqImageInternalFontFontHelperInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqImageInternalFontFontHelperInfo::getPid()
{
	return pid;
}

void
ComDayCqImageInternalFontFontHelperInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqImageInternalFontFontHelperInfo::getTitle()
{
	return title;
}

void
ComDayCqImageInternalFontFontHelperInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqImageInternalFontFontHelperInfo::getDescription()
{
	return description;
}

void
ComDayCqImageInternalFontFontHelperInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqImageInternalFontFontHelperProperties
ComDayCqImageInternalFontFontHelperInfo::getProperties()
{
	return properties;
}

void
ComDayCqImageInternalFontFontHelperInfo::setProperties(ComDayCqImageInternalFontFontHelperProperties properties)
{
	this->properties = properties;
}



