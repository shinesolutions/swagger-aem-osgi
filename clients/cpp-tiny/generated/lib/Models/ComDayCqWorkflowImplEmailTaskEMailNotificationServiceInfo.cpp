

#include "ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.h"

using namespace Tiny;

ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties();
}

ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::~ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo()
{

}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::fromJson(std::string jsonObj)
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




        ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::getPid()
{
	return pid;
}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::getTitle()
{
	return title;
}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::getDescription()
{
	return description;
}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::getProperties()
{
	return properties;
}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo::setProperties(ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties properties)
{
	this->properties = properties;
}



