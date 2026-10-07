

#include "ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties();
}

ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::~ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo()
{

}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo::setProperties(ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties properties)
{
	this->properties = properties;
}



