

#include "ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo.h"

using namespace Tiny;

ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties();
}

ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::~ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo()
{

}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::fromJson(std::string jsonObj)
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




        ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::getPid()
{
	return pid;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::getTitle()
{
	return title;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::getDescription()
{
	return description;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo::setProperties(ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties properties)
{
	this->properties = properties;
}



