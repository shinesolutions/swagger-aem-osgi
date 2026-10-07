

#include "ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo.h"

using namespace Tiny;

ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties();
}

ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::~ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo()
{

}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties
ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo::setProperties(ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties properties)
{
	this->properties = properties;
}



