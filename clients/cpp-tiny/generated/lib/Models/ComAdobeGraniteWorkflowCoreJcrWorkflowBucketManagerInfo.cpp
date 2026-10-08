

#include "ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo.h"

using namespace Tiny;

ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties();
}

ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::~ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo()
{

}

void
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo::setProperties(ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties properties)
{
	this->properties = properties;
}



