

#include "ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo.h"

using namespace Tiny;

ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties();
}

ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::~ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo()
{

}

void
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo::setProperties(ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties properties)
{
	this->properties = properties;
}



