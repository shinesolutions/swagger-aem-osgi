

#include "ComDayCqDamHandlerStandardPdfPdfHandlerInfo.h"

using namespace Tiny;

ComDayCqDamHandlerStandardPdfPdfHandlerInfo::ComDayCqDamHandlerStandardPdfPdfHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamHandlerStandardPdfPdfHandlerProperties();
}

ComDayCqDamHandlerStandardPdfPdfHandlerInfo::ComDayCqDamHandlerStandardPdfPdfHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamHandlerStandardPdfPdfHandlerInfo::~ComDayCqDamHandlerStandardPdfPdfHandlerInfo()
{

}

void
ComDayCqDamHandlerStandardPdfPdfHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamHandlerStandardPdfPdfHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamHandlerStandardPdfPdfHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamHandlerStandardPdfPdfHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamHandlerStandardPdfPdfHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamHandlerStandardPdfPdfHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamHandlerStandardPdfPdfHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamHandlerStandardPdfPdfHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamHandlerStandardPdfPdfHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamHandlerStandardPdfPdfHandlerProperties
ComDayCqDamHandlerStandardPdfPdfHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamHandlerStandardPdfPdfHandlerInfo::setProperties(ComDayCqDamHandlerStandardPdfPdfHandlerProperties properties)
{
	this->properties = properties;
}



