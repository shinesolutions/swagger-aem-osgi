

#include "ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties();
}

ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::~ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo()
{

}

void
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo::setProperties(ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties properties)
{
	this->properties = properties;
}



