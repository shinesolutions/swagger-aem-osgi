

#include "ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo.h"

using namespace Tiny;

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties();
}

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::~ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo()
{

}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo::setProperties(ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties properties)
{
	this->properties = properties;
}



