

#include "ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.h"

using namespace Tiny;

ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties();
}

ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::~ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo()
{

}

void
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo::setProperties(ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties properties)
{
	this->properties = properties;
}



