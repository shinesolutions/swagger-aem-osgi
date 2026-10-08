

#include "ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.h"

using namespace Tiny;

ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties()
{
	redirectenabled = ConfigNodePropertyBoolean();
	redirectstatsenabled = ConfigNodePropertyBoolean();
	redirectextensions = ConfigNodePropertyArray();
	redirectpaths = ConfigNodePropertyArray();
}

ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::~ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties()
{

}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *redirectenabledKey = "redirect.enabled";

    if(object.has_key(redirectenabledKey))
    {
        bourne::json value = object[redirectenabledKey];




        ConfigNodePropertyBoolean* obj = &redirectenabled;
		obj->fromJson(value.dump());

    }

    const char *redirectstatsenabledKey = "redirect.stats.enabled";

    if(object.has_key(redirectstatsenabledKey))
    {
        bourne::json value = object[redirectstatsenabledKey];




        ConfigNodePropertyBoolean* obj = &redirectstatsenabled;
		obj->fromJson(value.dump());

    }

    const char *redirectextensionsKey = "redirect.extensions";

    if(object.has_key(redirectextensionsKey))
    {
        bourne::json value = object[redirectextensionsKey];




        ConfigNodePropertyArray* obj = &redirectextensions;
		obj->fromJson(value.dump());

    }

    const char *redirectpathsKey = "redirect.paths";

    if(object.has_key(redirectpathsKey))
    {
        bourne::json value = object[redirectpathsKey];




        ConfigNodePropertyArray* obj = &redirectpaths;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["redirectenabled"] = getRedirectenabled().toJson();






	object["redirectstatsenabled"] = getRedirectstatsenabled().toJson();






	object["redirectextensions"] = getRedirectextensions().toJson();






	object["redirectpaths"] = getRedirectpaths().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectenabled()
{
	return redirectenabled;
}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectenabled(ConfigNodePropertyBoolean redirectenabled)
{
	this->redirectenabled = redirectenabled;
}

ConfigNodePropertyBoolean
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectstatsenabled()
{
	return redirectstatsenabled;
}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectstatsenabled(ConfigNodePropertyBoolean redirectstatsenabled)
{
	this->redirectstatsenabled = redirectstatsenabled;
}

ConfigNodePropertyArray
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectextensions()
{
	return redirectextensions;
}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectextensions(ConfigNodePropertyArray redirectextensions)
{
	this->redirectextensions = redirectextensions;
}

ConfigNodePropertyArray
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::getRedirectpaths()
{
	return redirectpaths;
}

void
ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties::setRedirectpaths(ConfigNodePropertyArray redirectpaths)
{
	this->redirectpaths = redirectpaths;
}



