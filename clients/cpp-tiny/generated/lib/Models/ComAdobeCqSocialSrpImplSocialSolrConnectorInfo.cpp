

#include "ComAdobeCqSocialSrpImplSocialSolrConnectorInfo.h"

using namespace Tiny;

ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::ComAdobeCqSocialSrpImplSocialSolrConnectorInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialSrpImplSocialSolrConnectorProperties();
}

ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::ComAdobeCqSocialSrpImplSocialSolrConnectorInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::~ComAdobeCqSocialSrpImplSocialSolrConnectorInfo()
{

}

void
ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialSrpImplSocialSolrConnectorProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialSrpImplSocialSolrConnectorProperties
ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialSrpImplSocialSolrConnectorInfo::setProperties(ComAdobeCqSocialSrpImplSocialSolrConnectorProperties properties)
{
	this->properties = properties;
}



