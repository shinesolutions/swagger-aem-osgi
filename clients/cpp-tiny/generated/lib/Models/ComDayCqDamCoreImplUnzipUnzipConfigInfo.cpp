

#include "ComDayCqDamCoreImplUnzipUnzipConfigInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplUnzipUnzipConfigInfo::ComDayCqDamCoreImplUnzipUnzipConfigInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplUnzipUnzipConfigProperties();
}

ComDayCqDamCoreImplUnzipUnzipConfigInfo::ComDayCqDamCoreImplUnzipUnzipConfigInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplUnzipUnzipConfigInfo::~ComDayCqDamCoreImplUnzipUnzipConfigInfo()
{

}

void
ComDayCqDamCoreImplUnzipUnzipConfigInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplUnzipUnzipConfigProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplUnzipUnzipConfigInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplUnzipUnzipConfigInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplUnzipUnzipConfigInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplUnzipUnzipConfigInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplUnzipUnzipConfigInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplUnzipUnzipConfigInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplUnzipUnzipConfigInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplUnzipUnzipConfigProperties
ComDayCqDamCoreImplUnzipUnzipConfigInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplUnzipUnzipConfigInfo::setProperties(ComDayCqDamCoreImplUnzipUnzipConfigProperties properties)
{
	this->properties = properties;
}



