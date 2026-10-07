

#include "ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo.h"

using namespace Tiny;

ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties();
}

ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::~ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo()
{

}

void
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::fromJson(std::string jsonObj)
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




        ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::getPid()
{
	return pid;
}

void
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::getTitle()
{
	return title;
}

void
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::getDescription()
{
	return description;
}

void
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::getProperties()
{
	return properties;
}

void
ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo::setProperties(ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties properties)
{
	this->properties = properties;
}



