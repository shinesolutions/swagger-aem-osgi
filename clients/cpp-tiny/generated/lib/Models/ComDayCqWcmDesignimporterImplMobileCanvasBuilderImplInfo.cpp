

#include "ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties();
}

ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::~ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo()
{

}

void
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo::setProperties(ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties properties)
{
	this->properties = properties;
}



