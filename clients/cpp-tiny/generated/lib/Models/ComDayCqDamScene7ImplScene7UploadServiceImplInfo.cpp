

#include "ComDayCqDamScene7ImplScene7UploadServiceImplInfo.h"

using namespace Tiny;

ComDayCqDamScene7ImplScene7UploadServiceImplInfo::ComDayCqDamScene7ImplScene7UploadServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamScene7ImplScene7UploadServiceImplProperties();
}

ComDayCqDamScene7ImplScene7UploadServiceImplInfo::ComDayCqDamScene7ImplScene7UploadServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamScene7ImplScene7UploadServiceImplInfo::~ComDayCqDamScene7ImplScene7UploadServiceImplInfo()
{

}

void
ComDayCqDamScene7ImplScene7UploadServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamScene7ImplScene7UploadServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamScene7ImplScene7UploadServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamScene7ImplScene7UploadServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqDamScene7ImplScene7UploadServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamScene7ImplScene7UploadServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqDamScene7ImplScene7UploadServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamScene7ImplScene7UploadServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqDamScene7ImplScene7UploadServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamScene7ImplScene7UploadServiceImplProperties
ComDayCqDamScene7ImplScene7UploadServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamScene7ImplScene7UploadServiceImplInfo::setProperties(ComDayCqDamScene7ImplScene7UploadServiceImplProperties properties)
{
	this->properties = properties;
}



