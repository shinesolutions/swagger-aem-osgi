

#include "ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties();
}

ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::~ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo()
{

}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo::setProperties(ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties properties)
{
	this->properties = properties;
}



