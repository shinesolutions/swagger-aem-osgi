

#include "ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo.h"

using namespace Tiny;

ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties();
}

ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::~ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo()
{

}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo::setProperties(ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties properties)
{
	this->properties = properties;
}



