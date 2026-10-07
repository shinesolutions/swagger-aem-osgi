

#include "ComDayCqDamCoreImplProcessTextExtractionProcessInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplProcessTextExtractionProcessInfo::ComDayCqDamCoreImplProcessTextExtractionProcessInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplProcessTextExtractionProcessProperties();
}

ComDayCqDamCoreImplProcessTextExtractionProcessInfo::ComDayCqDamCoreImplProcessTextExtractionProcessInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplProcessTextExtractionProcessInfo::~ComDayCqDamCoreImplProcessTextExtractionProcessInfo()
{

}

void
ComDayCqDamCoreImplProcessTextExtractionProcessInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplProcessTextExtractionProcessProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplProcessTextExtractionProcessInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplProcessTextExtractionProcessInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplProcessTextExtractionProcessInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplProcessTextExtractionProcessInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplProcessTextExtractionProcessInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplProcessTextExtractionProcessInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplProcessTextExtractionProcessInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplProcessTextExtractionProcessProperties
ComDayCqDamCoreImplProcessTextExtractionProcessInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplProcessTextExtractionProcessInfo::setProperties(ComDayCqDamCoreImplProcessTextExtractionProcessProperties properties)
{
	this->properties = properties;
}



