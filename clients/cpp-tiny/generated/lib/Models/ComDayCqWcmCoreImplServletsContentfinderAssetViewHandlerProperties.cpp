

#include "ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties()
{
	damshowexpired = ConfigNodePropertyBoolean();
	damshowhidden = ConfigNodePropertyBoolean();
	tagTitleSearch = ConfigNodePropertyBoolean();
	guessTotal = ConfigNodePropertyString();
	damexpiryProperty = ConfigNodePropertyString();
}

ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::~ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties()
{

}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *damshowexpiredKey = "dam.showexpired";

    if(object.has_key(damshowexpiredKey))
    {
        bourne::json value = object[damshowexpiredKey];




        ConfigNodePropertyBoolean* obj = &damshowexpired;
		obj->fromJson(value.dump());

    }

    const char *damshowhiddenKey = "dam.showhidden";

    if(object.has_key(damshowhiddenKey))
    {
        bourne::json value = object[damshowhiddenKey];




        ConfigNodePropertyBoolean* obj = &damshowhidden;
		obj->fromJson(value.dump());

    }

    const char *tagTitleSearchKey = "tagTitleSearch";

    if(object.has_key(tagTitleSearchKey))
    {
        bourne::json value = object[tagTitleSearchKey];




        ConfigNodePropertyBoolean* obj = &tagTitleSearch;
		obj->fromJson(value.dump());

    }

    const char *guessTotalKey = "guessTotal";

    if(object.has_key(guessTotalKey))
    {
        bourne::json value = object[guessTotalKey];




        ConfigNodePropertyString* obj = &guessTotal;
		obj->fromJson(value.dump());

    }

    const char *damexpiryPropertyKey = "dam.expiryProperty";

    if(object.has_key(damexpiryPropertyKey))
    {
        bourne::json value = object[damexpiryPropertyKey];




        ConfigNodePropertyString* obj = &damexpiryProperty;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["damshowexpired"] = getDamshowexpired().toJson();






	object["damshowhidden"] = getDamshowhidden().toJson();






	object["tagTitleSearch"] = getTagTitleSearch().toJson();






	object["guessTotal"] = getGuessTotal().toJson();






	object["damexpiryProperty"] = getDamexpiryProperty().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::getDamshowexpired()
{
	return damshowexpired;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::setDamshowexpired(ConfigNodePropertyBoolean damshowexpired)
{
	this->damshowexpired = damshowexpired;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::getDamshowhidden()
{
	return damshowhidden;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::setDamshowhidden(ConfigNodePropertyBoolean damshowhidden)
{
	this->damshowhidden = damshowhidden;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::getTagTitleSearch()
{
	return tagTitleSearch;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::setTagTitleSearch(ConfigNodePropertyBoolean tagTitleSearch)
{
	this->tagTitleSearch = tagTitleSearch;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::getGuessTotal()
{
	return guessTotal;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::setGuessTotal(ConfigNodePropertyString guessTotal)
{
	this->guessTotal = guessTotal;
}

ConfigNodePropertyString
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::getDamexpiryProperty()
{
	return damexpiryProperty;
}

void
ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties::setDamexpiryProperty(ConfigNodePropertyString damexpiryProperty)
{
	this->damexpiryProperty = damexpiryProperty;
}



