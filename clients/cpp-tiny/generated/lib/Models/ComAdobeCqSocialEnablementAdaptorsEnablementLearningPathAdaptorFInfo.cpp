

#include "ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo.h"

using namespace Tiny;

ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties();
}

ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::~ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo()
{

}

void
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo::setProperties(ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties properties)
{
	this->properties = properties;
}



