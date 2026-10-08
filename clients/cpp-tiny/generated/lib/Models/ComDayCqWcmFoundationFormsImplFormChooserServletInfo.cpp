

#include "ComDayCqWcmFoundationFormsImplFormChooserServletInfo.h"

using namespace Tiny;

ComDayCqWcmFoundationFormsImplFormChooserServletInfo::ComDayCqWcmFoundationFormsImplFormChooserServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmFoundationFormsImplFormChooserServletProperties();
}

ComDayCqWcmFoundationFormsImplFormChooserServletInfo::ComDayCqWcmFoundationFormsImplFormChooserServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationFormsImplFormChooserServletInfo::~ComDayCqWcmFoundationFormsImplFormChooserServletInfo()
{

}

void
ComDayCqWcmFoundationFormsImplFormChooserServletInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmFoundationFormsImplFormChooserServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationFormsImplFormChooserServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmFoundationFormsImplFormChooserServletInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmFoundationFormsImplFormChooserServletInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmFoundationFormsImplFormChooserServletInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmFoundationFormsImplFormChooserServletProperties
ComDayCqWcmFoundationFormsImplFormChooserServletInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmFoundationFormsImplFormChooserServletInfo::setProperties(ComDayCqWcmFoundationFormsImplFormChooserServletProperties properties)
{
	this->properties = properties;
}



