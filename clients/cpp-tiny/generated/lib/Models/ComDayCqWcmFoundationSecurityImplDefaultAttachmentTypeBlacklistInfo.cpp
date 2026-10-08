

#include "ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo.h"

using namespace Tiny;

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties();
}

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::~ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo()
{

}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo::setProperties(ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties properties)
{
	this->properties = properties;
}



