

#include "ComDayCqWidgetImplHtmlLibraryManagerImplProperties.h"

using namespace Tiny;

ComDayCqWidgetImplHtmlLibraryManagerImplProperties::ComDayCqWidgetImplHtmlLibraryManagerImplProperties()
{
	htmllibmanagerclientmanager = ConfigNodePropertyString();
	htmllibmanagerdebug = ConfigNodePropertyBoolean();
	htmllibmanagerdebugconsole = ConfigNodePropertyBoolean();
	htmllibmanagerdebuginitjs = ConfigNodePropertyString();
	htmllibmanagerdefaultthemename = ConfigNodePropertyString();
	htmllibmanagerdefaultuserthemename = ConfigNodePropertyString();
	htmllibmanagerfirebuglitepath = ConfigNodePropertyString();
	htmllibmanagerforceCQUrlInfo = ConfigNodePropertyBoolean();
	htmllibmanagergzip = ConfigNodePropertyBoolean();
	htmllibmanagermaxage = ConfigNodePropertyInteger();
	htmllibmanagermaxDataUriSize = ConfigNodePropertyInteger();
	htmllibmanagerminify = ConfigNodePropertyBoolean();
	htmllibmanagerpathlist = ConfigNodePropertyArray();
	htmllibmanagertiming = ConfigNodePropertyBoolean();
}

ComDayCqWidgetImplHtmlLibraryManagerImplProperties::ComDayCqWidgetImplHtmlLibraryManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWidgetImplHtmlLibraryManagerImplProperties::~ComDayCqWidgetImplHtmlLibraryManagerImplProperties()
{

}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *htmllibmanagerclientmanagerKey = "htmllibmanager.clientmanager";

    if(object.has_key(htmllibmanagerclientmanagerKey))
    {
        bourne::json value = object[htmllibmanagerclientmanagerKey];




        ConfigNodePropertyString* obj = &htmllibmanagerclientmanager;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerdebugKey = "htmllibmanager.debug";

    if(object.has_key(htmllibmanagerdebugKey))
    {
        bourne::json value = object[htmllibmanagerdebugKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanagerdebug;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerdebugconsoleKey = "htmllibmanager.debug.console";

    if(object.has_key(htmllibmanagerdebugconsoleKey))
    {
        bourne::json value = object[htmllibmanagerdebugconsoleKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanagerdebugconsole;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerdebuginitjsKey = "htmllibmanager.debug.init.js";

    if(object.has_key(htmllibmanagerdebuginitjsKey))
    {
        bourne::json value = object[htmllibmanagerdebuginitjsKey];




        ConfigNodePropertyString* obj = &htmllibmanagerdebuginitjs;
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

    const char *htmllibmanagerfirebuglitepathKey = "htmllibmanager.firebuglite.path";

    if(object.has_key(htmllibmanagerfirebuglitepathKey))
    {
        bourne::json value = object[htmllibmanagerfirebuglitepathKey];




        ConfigNodePropertyString* obj = &htmllibmanagerfirebuglitepath;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerforceCQUrlInfoKey = "htmllibmanager.forceCQUrlInfo";

    if(object.has_key(htmllibmanagerforceCQUrlInfoKey))
    {
        bourne::json value = object[htmllibmanagerforceCQUrlInfoKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanagerforceCQUrlInfo;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagergzipKey = "htmllibmanager.gzip";

    if(object.has_key(htmllibmanagergzipKey))
    {
        bourne::json value = object[htmllibmanagergzipKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanagergzip;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagermaxageKey = "htmllibmanager.maxage";

    if(object.has_key(htmllibmanagermaxageKey))
    {
        bourne::json value = object[htmllibmanagermaxageKey];




        ConfigNodePropertyInteger* obj = &htmllibmanagermaxage;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagermaxDataUriSizeKey = "htmllibmanager.maxDataUriSize";

    if(object.has_key(htmllibmanagermaxDataUriSizeKey))
    {
        bourne::json value = object[htmllibmanagermaxDataUriSizeKey];




        ConfigNodePropertyInteger* obj = &htmllibmanagermaxDataUriSize;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerminifyKey = "htmllibmanager.minify";

    if(object.has_key(htmllibmanagerminifyKey))
    {
        bourne::json value = object[htmllibmanagerminifyKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanagerminify;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagerpathlistKey = "htmllibmanager.path.list";

    if(object.has_key(htmllibmanagerpathlistKey))
    {
        bourne::json value = object[htmllibmanagerpathlistKey];




        ConfigNodePropertyArray* obj = &htmllibmanagerpathlist;
		obj->fromJson(value.dump());

    }

    const char *htmllibmanagertimingKey = "htmllibmanager.timing";

    if(object.has_key(htmllibmanagertimingKey))
    {
        bourne::json value = object[htmllibmanagertimingKey];




        ConfigNodePropertyBoolean* obj = &htmllibmanagertiming;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["htmllibmanagerclientmanager"] = getHtmllibmanagerclientmanager().toJson();






	object["htmllibmanagerdebug"] = getHtmllibmanagerdebug().toJson();






	object["htmllibmanagerdebugconsole"] = getHtmllibmanagerdebugconsole().toJson();






	object["htmllibmanagerdebuginitjs"] = getHtmllibmanagerdebuginitjs().toJson();






	object["htmllibmanagerdefaultthemename"] = getHtmllibmanagerdefaultthemename().toJson();






	object["htmllibmanagerdefaultuserthemename"] = getHtmllibmanagerdefaultuserthemename().toJson();






	object["htmllibmanagerfirebuglitepath"] = getHtmllibmanagerfirebuglitepath().toJson();






	object["htmllibmanagerforceCQUrlInfo"] = getHtmllibmanagerforceCQUrlInfo().toJson();






	object["htmllibmanagergzip"] = getHtmllibmanagergzip().toJson();






	object["htmllibmanagermaxage"] = getHtmllibmanagermaxage().toJson();






	object["htmllibmanagermaxDataUriSize"] = getHtmllibmanagermaxDataUriSize().toJson();






	object["htmllibmanagerminify"] = getHtmllibmanagerminify().toJson();






	object["htmllibmanagerpathlist"] = getHtmllibmanagerpathlist().toJson();






	object["htmllibmanagertiming"] = getHtmllibmanagertiming().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerclientmanager()
{
	return htmllibmanagerclientmanager;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerclientmanager(ConfigNodePropertyString htmllibmanagerclientmanager)
{
	this->htmllibmanagerclientmanager = htmllibmanagerclientmanager;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdebug()
{
	return htmllibmanagerdebug;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdebug(ConfigNodePropertyBoolean htmllibmanagerdebug)
{
	this->htmllibmanagerdebug = htmllibmanagerdebug;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdebugconsole()
{
	return htmllibmanagerdebugconsole;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdebugconsole(ConfigNodePropertyBoolean htmllibmanagerdebugconsole)
{
	this->htmllibmanagerdebugconsole = htmllibmanagerdebugconsole;
}

ConfigNodePropertyString
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdebuginitjs()
{
	return htmllibmanagerdebuginitjs;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdebuginitjs(ConfigNodePropertyString htmllibmanagerdebuginitjs)
{
	this->htmllibmanagerdebuginitjs = htmllibmanagerdebuginitjs;
}

ConfigNodePropertyString
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdefaultthemename()
{
	return htmllibmanagerdefaultthemename;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdefaultthemename(ConfigNodePropertyString htmllibmanagerdefaultthemename)
{
	this->htmllibmanagerdefaultthemename = htmllibmanagerdefaultthemename;
}

ConfigNodePropertyString
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerdefaultuserthemename()
{
	return htmllibmanagerdefaultuserthemename;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerdefaultuserthemename(ConfigNodePropertyString htmllibmanagerdefaultuserthemename)
{
	this->htmllibmanagerdefaultuserthemename = htmllibmanagerdefaultuserthemename;
}

ConfigNodePropertyString
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerfirebuglitepath()
{
	return htmllibmanagerfirebuglitepath;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerfirebuglitepath(ConfigNodePropertyString htmllibmanagerfirebuglitepath)
{
	this->htmllibmanagerfirebuglitepath = htmllibmanagerfirebuglitepath;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerforceCQUrlInfo()
{
	return htmllibmanagerforceCQUrlInfo;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerforceCQUrlInfo(ConfigNodePropertyBoolean htmllibmanagerforceCQUrlInfo)
{
	this->htmllibmanagerforceCQUrlInfo = htmllibmanagerforceCQUrlInfo;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagergzip()
{
	return htmllibmanagergzip;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagergzip(ConfigNodePropertyBoolean htmllibmanagergzip)
{
	this->htmllibmanagergzip = htmllibmanagergzip;
}

ConfigNodePropertyInteger
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagermaxage()
{
	return htmllibmanagermaxage;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagermaxage(ConfigNodePropertyInteger htmllibmanagermaxage)
{
	this->htmllibmanagermaxage = htmllibmanagermaxage;
}

ConfigNodePropertyInteger
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagermaxDataUriSize()
{
	return htmllibmanagermaxDataUriSize;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagermaxDataUriSize(ConfigNodePropertyInteger htmllibmanagermaxDataUriSize)
{
	this->htmllibmanagermaxDataUriSize = htmllibmanagermaxDataUriSize;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerminify()
{
	return htmllibmanagerminify;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerminify(ConfigNodePropertyBoolean htmllibmanagerminify)
{
	this->htmllibmanagerminify = htmllibmanagerminify;
}

ConfigNodePropertyArray
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagerpathlist()
{
	return htmllibmanagerpathlist;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagerpathlist(ConfigNodePropertyArray htmllibmanagerpathlist)
{
	this->htmllibmanagerpathlist = htmllibmanagerpathlist;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::getHtmllibmanagertiming()
{
	return htmllibmanagertiming;
}

void
ComDayCqWidgetImplHtmlLibraryManagerImplProperties::setHtmllibmanagertiming(ConfigNodePropertyBoolean htmllibmanagertiming)
{
	this->htmllibmanagertiming = htmllibmanagertiming;
}



