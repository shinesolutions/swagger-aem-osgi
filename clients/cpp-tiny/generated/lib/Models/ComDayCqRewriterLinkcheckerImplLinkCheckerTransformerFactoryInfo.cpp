

#include "ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo.h"

using namespace Tiny;

ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties();
}

ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::~ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo()
{

}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::fromJson(std::string jsonObj)
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




        ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::getPid()
{
	return pid;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::getTitle()
{
	return title;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::getDescription()
{
	return description;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::getProperties()
{
	return properties;
}

void
ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo::setProperties(ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties properties)
{
	this->properties = properties;
}



