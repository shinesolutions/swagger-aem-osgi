

#include "ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo.h"

using namespace Tiny;

ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties();
}

ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::~ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo()
{

}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo::setProperties(ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties properties)
{
	this->properties = properties;
}



