

#include "ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties();
}

ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::~ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo()
{

}

void
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::fromJson(std::string jsonObj)
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




        ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::getPid()
{
	return pid;
}

void
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::getTitle()
{
	return title;
}

void
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::getDescription()
{
	return description;
}

void
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::getProperties()
{
	return properties;
}

void
ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo::setProperties(ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties properties)
{
	this->properties = properties;
}



