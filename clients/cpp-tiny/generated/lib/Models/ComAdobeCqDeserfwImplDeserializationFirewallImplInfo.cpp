

#include "ComAdobeCqDeserfwImplDeserializationFirewallImplInfo.h"

using namespace Tiny;

ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::ComAdobeCqDeserfwImplDeserializationFirewallImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDeserfwImplDeserializationFirewallImplProperties();
}

ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::ComAdobeCqDeserfwImplDeserializationFirewallImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::~ComAdobeCqDeserfwImplDeserializationFirewallImplInfo()
{

}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDeserfwImplDeserializationFirewallImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDeserfwImplDeserializationFirewallImplProperties
ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplInfo::setProperties(ComAdobeCqDeserfwImplDeserializationFirewallImplProperties properties)
{
	this->properties = properties;
}



