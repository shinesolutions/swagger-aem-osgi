

#include "ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties.h"

using namespace Tiny;

ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties()
{
	hctags = ConfigNodePropertyArray();
	excludesearchpath = ConfigNodePropertyArray();
}

ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::~ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties()
{

}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *hctagsKey = "hc.tags";

    if(object.has_key(hctagsKey))
    {
        bourne::json value = object[hctagsKey];




        ConfigNodePropertyArray* obj = &hctags;
		obj->fromJson(value.dump());

    }

    const char *excludesearchpathKey = "exclude.search.path";

    if(object.has_key(excludesearchpathKey))
    {
        bourne::json value = object[excludesearchpathKey];




        ConfigNodePropertyArray* obj = &excludesearchpath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["hctags"] = getHctags().toJson();






	object["excludesearchpath"] = getExcludesearchpath().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::setHctags(ConfigNodePropertyArray hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::getExcludesearchpath()
{
	return excludesearchpath;
}

void
ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties::setExcludesearchpath(ConfigNodePropertyArray excludesearchpath)
{
	this->excludesearchpath = excludesearchpath;
}



