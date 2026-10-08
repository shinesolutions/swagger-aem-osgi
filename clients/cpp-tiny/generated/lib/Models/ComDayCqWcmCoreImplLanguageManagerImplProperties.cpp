

#include "ComDayCqWcmCoreImplLanguageManagerImplProperties.h"

using namespace Tiny;

ComDayCqWcmCoreImplLanguageManagerImplProperties::ComDayCqWcmCoreImplLanguageManagerImplProperties()
{
	langmgrlistpath = ConfigNodePropertyString();
	langmgrcountrydefault = ConfigNodePropertyArray();
}

ComDayCqWcmCoreImplLanguageManagerImplProperties::ComDayCqWcmCoreImplLanguageManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmCoreImplLanguageManagerImplProperties::~ComDayCqWcmCoreImplLanguageManagerImplProperties()
{

}

void
ComDayCqWcmCoreImplLanguageManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *langmgrlistpathKey = "langmgr.list.path";

    if(object.has_key(langmgrlistpathKey))
    {
        bourne::json value = object[langmgrlistpathKey];




        ConfigNodePropertyString* obj = &langmgrlistpath;
		obj->fromJson(value.dump());

    }

    const char *langmgrcountrydefaultKey = "langmgr.country.default";

    if(object.has_key(langmgrcountrydefaultKey))
    {
        bourne::json value = object[langmgrcountrydefaultKey];




        ConfigNodePropertyArray* obj = &langmgrcountrydefault;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmCoreImplLanguageManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["langmgrlistpath"] = getLangmgrlistpath().toJson();






	object["langmgrcountrydefault"] = getLangmgrcountrydefault().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmCoreImplLanguageManagerImplProperties::getLangmgrlistpath()
{
	return langmgrlistpath;
}

void
ComDayCqWcmCoreImplLanguageManagerImplProperties::setLangmgrlistpath(ConfigNodePropertyString langmgrlistpath)
{
	this->langmgrlistpath = langmgrlistpath;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplLanguageManagerImplProperties::getLangmgrcountrydefault()
{
	return langmgrcountrydefault;
}

void
ComDayCqWcmCoreImplLanguageManagerImplProperties::setLangmgrcountrydefault(ConfigNodePropertyArray langmgrcountrydefault)
{
	this->langmgrcountrydefault = langmgrcountrydefault;
}



