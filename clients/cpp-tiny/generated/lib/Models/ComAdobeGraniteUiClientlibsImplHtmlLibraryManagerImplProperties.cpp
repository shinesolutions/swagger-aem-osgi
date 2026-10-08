

#include "ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.h"

using namespace Tiny;

ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties()
{
	htmllibmanagertiming = ConfigNodePropertyBoolean();
	htmllibmanagerdebuginitjs = ConfigNodePropertyString();
	htmllibmanagerminify = ConfigNodePropertyBoolean();
	htmllibmanagerdebug = ConfigNodePropertyBoolean();
	htmllibmanagergzip = ConfigNodePropertyBoolean();
	htmllibmanagermaxDataUriSize = ConfigNodePropertyInteger();
	htmllibmanagermaxage = ConfigNodePropertyInteger();
	htmllibmanagerforceCQUrlInfo = ConfigNodePropertyBoolean();
	htmllibmanagerdefaultthemename = ConfigNodePropertyString();
	htmllibmanagerdefaultuserthemename = ConfigNodePropertyString();
	htmllibmanagerclientmanager = ConfigNodePropertyString();
	htmllibmanagerpathlist = ConfigNodePropertyArray();
	htmllibmanagerexcludedpathlist = ConfigNodePropertyArray();
	htmllibmanagerprocessorjs = ConfigNodePropertyArray();
	htmllibmanagerprocessorcss = ConfigNodePropertyArray();
	htmllibmanagerlongcachepatterns = ConfigNodePropertyArray();
	htmllibmanagerlongcacheformat = ConfigNodePropertyString();
	htmllibmanageruseFileSystemOutputCache = ConfigNodePropertyBoolean();
	htmllibmanagerfileSystemOutputCacheLocation = ConfigNodePropertyString();
	htmllibmanagerdisablereplacement = ConfigNodePropertyArray();
}

ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::~ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties()
{

}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *htmllibmanagertimingKey = "htmllibmanager.timing";

    if(object.has_key(htmllibmanagertimingKey))
    {
        bourne::json value = object[htmllibmanagertimingKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanagertiming;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerdebuginitjsKey = "htmllibmanager.debug.init.js";

    if(object.has_key(htmllibmanagerdebuginitjsKey))
    {
        bourne::json value = object[htmllibmanagerdebuginitjsKey];




        ConfigNodePropertyString* obj = &htmllibmanagerdebuginitjs;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerminifyKey = "htmllibmanager.minify";

    if(object.has_key(htmllibmanagerminifyKey))
    {
        bourne::json value = object[htmllibmanagerminifyKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanagerminify;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerdebugKey = "htmllibmanager.debug";

    if(object.has_key(htmllibmanagerdebugKey))
    {
        bourne::json value = object[htmllibmanagerdebugKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanagerdebug;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagergzipKey = "htmllibmanager.gzip";

    if(object.has_key(htmllibmanagergzipKey))
    {
        bourne::json value = object[htmllibmanagergzipKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanagergzip;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagermaxDataUriSizeKey = "htmllibmanager.maxDataUriSize";

    if(object.has_key(htmllibmanagermaxDataUriSizeKey))
    {
        bourne::json value = object[htmllibmanagermaxDataUriSizeKey];




        ConfigNodePropertyInteger* obj = &htmllibmanagermaxDataUriSize;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagermaxageKey = "htmllibmanager.maxage";

    if(object.has_key(htmllibmanagermaxageKey))
    {
        bourne::json value = object[htmllibmanagermaxageKey];




        ConfigNodePropertyInteger* obj = &htmllibmanagermaxage;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerforceCQUrlInfoKey = "htmllibmanager.forceCQUrlInfo";

    if(object.has_key(htmllibmanagerforceCQUrlInfoKey))
    {
        bourne::json value = object[htmllibmanagerforceCQUrlInfoKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanagerforceCQUrlInfo;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerdefaultthemenameKey = "htmllibmanager.defaultthemename";

    if(object.has_key(htmllibmanagerdefaultthemenameKey))
    {
        bourne::json value = object[htmllibmanagerdefaultthemenameKey];




        ConfigNodePropertyString* obj = &htmllibmanagerdefaultthemename;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerdefaultuserthemenameKey = "htmllibmanager.defaultuserthemename";

    if(object.has_key(htmllibmanagerdefaultuserthemenameKey))
    {
        bourne::json value = object[htmllibmanagerdefaultuserthemenameKey];




        ConfigNodePropertyString* obj = &htmllibmanagerdefaultuserthemename;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerclientmanagerKey = "htmllibmanager.clientmanager";

    if(object.has_key(htmllibmanagerclientmanagerKey))
    {
        bourne::json value = object[htmllibmanagerclientmanagerKey];




        ConfigNodePropertyString* obj = &htmllibmanagerclientmanager;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerpathlistKey = "htmllibmanager.path.list";

    if(object.has_key(htmllibmanagerpathlistKey))
    {
        bourne::json value = object[htmllibmanagerpathlistKey];




        ConfigNodePropertyArray* obj = &htmllibmanagerpathlist;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerexcludedpathlistKey = "htmllibmanager.excluded.path.list";

    if(object.has_key(htmllibmanagerexcludedpathlistKey))
    {
        bourne::json value = object[htmllibmanagerexcludedpathlistKey];




        ConfigNodePropertyArray* obj = &htmllibmanagerexcludedpathlist;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerprocessorjsKey = "htmllibmanager.processor.js";

    if(object.has_key(htmllibmanagerprocessorjsKey))
    {
        bourne::json value = object[htmllibmanagerprocessorjsKey];




        ConfigNodePropertyArray* obj = &htmllibmanagerprocessorjs;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerprocessorcssKey = "htmllibmanager.processor.css";

    if(object.has_key(htmllibmanagerprocessorcssKey))
    {
        bourne::json value = object[htmllibmanagerprocessorcssKey];




        ConfigNodePropertyArray* obj = &htmllibmanagerprocessorcss;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerlongcachepatternsKey = "htmllibmanager.longcache.patterns";

    if(object.has_key(htmllibmanagerlongcachepatternsKey))
    {
        bourne::json value = object[htmllibmanagerlongcachepatternsKey];




        ConfigNodePropertyArray* obj = &htmllibmanagerlongcachepatterns;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerlongcacheformatKey = "htmllibmanager.longcache.format";

    if(object.has_key(htmllibmanagerlongcacheformatKey))
    {
        bourne::json value = object[htmllibmanagerlongcacheformatKey];




        ConfigNodePropertyString* obj = &htmllibmanagerlongcacheformat;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanageruseFileSystemOutputCacheKey = "htmllibmanager.useFileSystemOutputCache";

    if(object.has_key(htmllibmanageruseFileSystemOutputCacheKey))
    {
        bourne::json value = object[htmllibmanageruseFileSystemOutputCacheKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanageruseFileSystemOutputCache;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerfileSystemOutputCacheLocationKey = "htmllibmanager.fileSystemOutputCacheLocation";

    if(object.has_key(htmllibmanagerfileSystemOutputCacheLocationKey))
    {
        bourne::json value = object[htmllibmanagerfileSystemOutputCacheLocationKey];




        ConfigNodePropertyString* obj = &htmllibmanagerfileSystemOutputCacheLocation;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerdisablereplacementKey = "htmllibmanager.disable.replacement";

    if(object.has_key(htmllibmanagerdisablereplacementKey))
    {
        bourne::json value = object[htmllibmanagerdisablereplacementKey];




        ConfigNodePropertyArray* obj = &htmllibmanagerdisablereplacement;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["htmllibmanagertiming"] = getHtmllibmanagertiming().toJson();






	object["htmllibmanagerdebuginitjs"] = getHtmllibmanagerdebuginitjs().toJson();






	object["htmllibmanagerminify"] = getHtmllibmanagerminify().toJson();






	object["htmllibmanagerdebug"] = getHtmllibmanagerdebug().toJson();






	object["htmllibmanagergzip"] = getHtmllibmanagergzip().toJson();






	object["htmllibmanagermaxDataUriSize"] = getHtmllibmanagermaxDataUriSize().toJson();






	object["htmllibmanagermaxage"] = getHtmllibmanagermaxage().toJson();






	object["htmllibmanagerforceCQUrlInfo"] = getHtmllibmanagerforceCQUrlInfo().toJson();






	object["htmllibmanagerdefaultthemename"] = getHtmllibmanagerdefaultthemename().toJson();






	object["htmllibmanagerdefaultuserthemename"] = getHtmllibmanagerdefaultuserthemename().toJson();






	object["htmllibmanagerclientmanager"] = getHtmllibmanagerclientmanager().toJson();






	object["htmllibmanagerpathlist"] = getHtmllibmanagerpathlist().toJson();






	object["htmllibmanagerexcludedpathlist"] = getHtmllibmanagerexcludedpathlist().toJson();






	object["htmllibmanagerprocessorjs"] = getHtmllibmanagerprocessorjs().toJson();






	object["htmllibmanagerprocessorcss"] = getHtmllibmanagerprocessorcss().toJson();






	object["htmllibmanagerlongcachepatterns"] = getHtmllibmanagerlongcachepatterns().toJson();






	object["htmllibmanagerlongcacheformat"] = getHtmllibmanagerlongcacheformat().toJson();






	object["htmllibmanageruseFileSystemOutputCache"] = getHtmllibmanageruseFileSystemOutputCache().toJson();






	object["htmllibmanagerfileSystemOutputCacheLocation"] = getHtmllibmanagerfileSystemOutputCacheLocation().toJson();






	object["htmllibmanagerdisablereplacement"] = getHtmllibmanagerdisablereplacement().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagertiming()
{
	return htmllibmanagertiming;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagertiming(ConfigNodePropertyBoolean htmllibmanagertiming)
{
	this->htmllibmanagertiming = htmllibmanagertiming;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdebuginitjs()
{
	return htmllibmanagerdebuginitjs;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdebuginitjs(ConfigNodePropertyString htmllibmanagerdebuginitjs)
{
	this->htmllibmanagerdebuginitjs = htmllibmanagerdebuginitjs;
}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerminify()
{
	return htmllibmanagerminify;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerminify(ConfigNodePropertyBoolean htmllibmanagerminify)
{
	this->htmllibmanagerminify = htmllibmanagerminify;
}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdebug()
{
	return htmllibmanagerdebug;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdebug(ConfigNodePropertyBoolean htmllibmanagerdebug)
{
	this->htmllibmanagerdebug = htmllibmanagerdebug;
}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagergzip()
{
	return htmllibmanagergzip;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagergzip(ConfigNodePropertyBoolean htmllibmanagergzip)
{
	this->htmllibmanagergzip = htmllibmanagergzip;
}

ConfigNodePropertyInteger
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagermaxDataUriSize()
{
	return htmllibmanagermaxDataUriSize;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagermaxDataUriSize(ConfigNodePropertyInteger htmllibmanagermaxDataUriSize)
{
	this->htmllibmanagermaxDataUriSize = htmllibmanagermaxDataUriSize;
}

ConfigNodePropertyInteger
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagermaxage()
{
	return htmllibmanagermaxage;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagermaxage(ConfigNodePropertyInteger htmllibmanagermaxage)
{
	this->htmllibmanagermaxage = htmllibmanagermaxage;
}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerforceCQUrlInfo()
{
	return htmllibmanagerforceCQUrlInfo;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerforceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerforceCQUrlInfo)
{
	this->htmllibmanagerforceCQUrlInfo = htmllibmanagerforceCQUrlInfo;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdefaultthemename()
{
	return htmllibmanagerdefaultthemename;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdefaultthemename(ConfigNodePropertyString htmllibmanagerdefaultthemename)
{
	this->htmllibmanagerdefaultthemename = htmllibmanagerdefaultthemename;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdefaultuserthemename()
{
	return htmllibmanagerdefaultuserthemename;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdefaultuserthemename(ConfigNodePropertyString htmllibmanagerdefaultuserthemename)
{
	this->htmllibmanagerdefaultuserthemename = htmllibmanagerdefaultuserthemename;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerclientmanager()
{
	return htmllibmanagerclientmanager;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerclientmanager(ConfigNodePropertyString htmllibmanagerclientmanager)
{
	this->htmllibmanagerclientmanager = htmllibmanagerclientmanager;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerpathlist()
{
	return htmllibmanagerpathlist;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerpathlist(ConfigNodePropertyArray htmllibmanagerpathlist)
{
	this->htmllibmanagerpathlist = htmllibmanagerpathlist;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerexcludedpathlist()
{
	return htmllibmanagerexcludedpathlist;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerexcludedpathlist(ConfigNodePropertyArray htmllibmanagerexcludedpathlist)
{
	this->htmllibmanagerexcludedpathlist = htmllibmanagerexcludedpathlist;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerprocessorjs()
{
	return htmllibmanagerprocessorjs;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerprocessorjs(ConfigNodePropertyArray htmllibmanagerprocessorjs)
{
	this->htmllibmanagerprocessorjs = htmllibmanagerprocessorjs;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerprocessorcss()
{
	return htmllibmanagerprocessorcss;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerprocessorcss(ConfigNodePropertyArray htmllibmanagerprocessorcss)
{
	this->htmllibmanagerprocessorcss = htmllibmanagerprocessorcss;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerlongcachepatterns()
{
	return htmllibmanagerlongcachepatterns;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerlongcachepatterns(ConfigNodePropertyArray htmllibmanagerlongcachepatterns)
{
	this->htmllibmanagerlongcachepatterns = htmllibmanagerlongcachepatterns;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerlongcacheformat()
{
	return htmllibmanagerlongcacheformat;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerlongcacheformat(ConfigNodePropertyString htmllibmanagerlongcacheformat)
{
	this->htmllibmanagerlongcacheformat = htmllibmanagerlongcacheformat;
}

ConfigNodePropertyBoolean
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanageruseFileSystemOutputCache()
{
	return htmllibmanageruseFileSystemOutputCache;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanageruseFileSystemOutputCache(ConfigNodePropertyBoolean htmllibmanageruseFileSystemOutputCache)
{
	this->htmllibmanageruseFileSystemOutputCache = htmllibmanageruseFileSystemOutputCache;
}

ConfigNodePropertyString
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerfileSystemOutputCacheLocation()
{
	return htmllibmanagerfileSystemOutputCacheLocation;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerfileSystemOutputCacheLocation(ConfigNodePropertyString htmllibmanagerfileSystemOutputCacheLocation)
{
	this->htmllibmanagerfileSystemOutputCacheLocation = htmllibmanagerfileSystemOutputCacheLocation;
}

ConfigNodePropertyArray
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdisablereplacement()
{
	return htmllibmanagerdisablereplacement;
}

void
ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdisablereplacement(ConfigNodePropertyArray htmllibmanagerdisablereplacement)
{
	this->htmllibmanagerdisablereplacement = htmllibmanagerdisablereplacement;
}



