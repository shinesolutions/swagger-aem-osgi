

#include "ComDayCqExtwidgetServletsImageSpriteServletInfo.h"

using namespace Tiny;

ComDayCqExtwidgetServletsImageSpriteServletInfo::ComDayCqExtwidgetServletsImageSpriteServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqExtwidgetServletsImageSpriteServletProperties();
}

ComDayCqExtwidgetServletsImageSpriteServletInfo::ComDayCqExtwidgetServletsImageSpriteServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqExtwidgetServletsImageSpriteServletInfo::~ComDayCqExtwidgetServletsImageSpriteServletInfo()
{

}

void
ComDayCqExtwidgetServletsImageSpriteServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqExtwidgetServletsImageSpriteServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqExtwidgetServletsImageSpriteServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqExtwidgetServletsImageSpriteServletInfo::getPid()
{
	return pid;
}

void
ComDayCqExtwidgetServletsImageSpriteServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqExtwidgetServletsImageSpriteServletInfo::getTitle()
{
	return title;
}

void
ComDayCqExtwidgetServletsImageSpriteServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqExtwidgetServletsImageSpriteServletInfo::getDescription()
{
	return description;
}

void
ComDayCqExtwidgetServletsImageSpriteServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqExtwidgetServletsImageSpriteServletProperties
ComDayCqExtwidgetServletsImageSpriteServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqExtwidgetServletsImageSpriteServletInfo::setProperties(ComDayCqExtwidgetServletsImageSpriteServletProperties properties)
{
	this->properties = properties;
}



