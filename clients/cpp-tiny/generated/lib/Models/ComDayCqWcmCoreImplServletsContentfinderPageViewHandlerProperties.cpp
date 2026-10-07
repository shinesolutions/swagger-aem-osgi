

#include "ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties()
{
	guessTotal = ConfigNodePropertyString();
	tagTitleSearch = ConfigNodePropertyBoolean();
}

ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::~ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties()
{

}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *guessTotalKey = "guessTotal";

    if(object.has_key(guessTotalKey))
    {
        bourne::json value = object[guessTotalKey];




        ConfigNodePropertyString* obj = &guessTotal;
		obj->fromJson(value.dump());

    }

    const char *tagTitleSearchKey = "tagTitleSearch";

    if(object.has_key(tagTitleSearchKey))
    {
        bourne::json value = object[tagTitleSearchKey];




        ConfigNodePropertyBoolean* obj = &tagTitleSearch;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["guessTotal"] = getGuessTotal().toJson();






	object["tagTitleSearch"] = getTagTitleSearch().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::getGuessTotal()
{
	return guessTotal;
}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::setGuessTotal(ConfigNodePropertyString guessTotal)
{
	this->guessTotal = guessTotal;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::getTagTitleSearch()
{
	return tagTitleSearch;
}

void
ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties::setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch)
{
	this->tagTitleSearch = tagTitleSearch;
}



