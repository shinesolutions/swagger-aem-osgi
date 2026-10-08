

#include "OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.h"

using namespace Tiny;

OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties()
{
	handlerschemes = ConfigNodePropertyArray();
	slingjcrinstallfoldernameregexp = ConfigNodePropertyString();
	slingjcrinstallfoldermaxdepth = ConfigNodePropertyInteger();
	slingjcrinstallsearchpath = ConfigNodePropertyArray();
	slingjcrinstallnewconfigpath = ConfigNodePropertyString();
	slingjcrinstallsignalpath = ConfigNodePropertyString();
	slingjcrinstallenablewriteback = ConfigNodePropertyBoolean();
}

OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::~OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties()
{

}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *handlerschemesKey = "handler.schemes";

    if(object.has_key(handlerschemesKey))
    {
        bourne::json value = object[handlerschemesKey];




        ConfigNodePropertyArray* obj = &handlerschemes;
		obj->fromJson(value.dump());

    }

    const char *slingjcrinstallfoldernameregexpKey = "sling.jcrinstall.folder.name.regexp";

    if(object.has_key(slingjcrinstallfoldernameregexpKey))
    {
        bourne::json value = object[slingjcrinstallfoldernameregexpKey];




        ConfigNodePropertyString* obj = &slingjcrinstallfoldernameregexp;
		obj->fromJson(value.dump());

    }

    const char *slingjcrinstallfoldermaxdepthKey = "sling.jcrinstall.folder.max.depth";

    if(object.has_key(slingjcrinstallfoldermaxdepthKey))
    {
        bourne::json value = object[slingjcrinstallfoldermaxdepthKey];




        ConfigNodePropertyInteger* obj = &slingjcrinstallfoldermaxdepth;
		obj->fromJson(value.dump());

    }

    const char *slingjcrinstallsearchpathKey = "sling.jcrinstall.search.path";

    if(object.has_key(slingjcrinstallsearchpathKey))
    {
        bourne::json value = object[slingjcrinstallsearchpathKey];




        ConfigNodePropertyArray* obj = &slingjcrinstallsearchpath;
		obj->fromJson(value.dump());

    }

    const char *slingjcrinstallnewconfigpathKey = "sling.jcrinstall.new.config.path";

    if(object.has_key(slingjcrinstallnewconfigpathKey))
    {
        bourne::json value = object[slingjcrinstallnewconfigpathKey];




        ConfigNodePropertyString* obj = &slingjcrinstallnewconfigpath;
		obj->fromJson(value.dump());

    }

    const char *slingjcrinstallsignalpathKey = "sling.jcrinstall.signal.path";

    if(object.has_key(slingjcrinstallsignalpathKey))
    {
        bourne::json value = object[slingjcrinstallsignalpathKey];




        ConfigNodePropertyString* obj = &slingjcrinstallsignalpath;
		obj->fromJson(value.dump());

    }

    const char *slingjcrinstallenablewritebackKey = "sling.jcrinstall.enable.writeback";

    if(object.has_key(slingjcrinstallenablewritebackKey))
    {
        bourne::json value = object[slingjcrinstallenablewritebackKey];




        ConfigNodePropertyBoolean* obj = &slingjcrinstallenablewriteback;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["handlerschemes"] = getHandlerschemes().toJson();






	object["slingjcrinstallfoldernameregexp"] = getSlingjcrinstallfoldernameregexp().toJson();






	object["slingjcrinstallfoldermaxdepth"] = getSlingjcrinstallfoldermaxdepth().toJson();






	object["slingjcrinstallsearchpath"] = getSlingjcrinstallsearchpath().toJson();






	object["slingjcrinstallnewconfigpath"] = getSlingjcrinstallnewconfigpath().toJson();






	object["slingjcrinstallsignalpath"] = getSlingjcrinstallsignalpath().toJson();






	object["slingjcrinstallenablewriteback"] = getSlingjcrinstallenablewriteback().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getHandlerschemes()
{
	return handlerschemes;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setHandlerschemes(ConfigNodePropertyArray handlerschemes)
{
	this->handlerschemes = handlerschemes;
}

ConfigNodePropertyString
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallfoldernameregexp()
{
	return slingjcrinstallfoldernameregexp;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallfoldernameregexp(ConfigNodePropertyString slingjcrinstallfoldernameregexp)
{
	this->slingjcrinstallfoldernameregexp = slingjcrinstallfoldernameregexp;
}

ConfigNodePropertyInteger
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallfoldermaxdepth()
{
	return slingjcrinstallfoldermaxdepth;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallfoldermaxdepth(ConfigNodePropertyInteger slingjcrinstallfoldermaxdepth)
{
	this->slingjcrinstallfoldermaxdepth = slingjcrinstallfoldermaxdepth;
}

ConfigNodePropertyArray
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallsearchpath()
{
	return slingjcrinstallsearchpath;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallsearchpath(ConfigNodePropertyArray slingjcrinstallsearchpath)
{
	this->slingjcrinstallsearchpath = slingjcrinstallsearchpath;
}

ConfigNodePropertyString
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallnewconfigpath()
{
	return slingjcrinstallnewconfigpath;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallnewconfigpath(ConfigNodePropertyString slingjcrinstallnewconfigpath)
{
	this->slingjcrinstallnewconfigpath = slingjcrinstallnewconfigpath;
}

ConfigNodePropertyString
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallsignalpath()
{
	return slingjcrinstallsignalpath;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallsignalpath(ConfigNodePropertyString slingjcrinstallsignalpath)
{
	this->slingjcrinstallsignalpath = slingjcrinstallsignalpath;
}

ConfigNodePropertyBoolean
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::getSlingjcrinstallenablewriteback()
{
	return slingjcrinstallenablewriteback;
}

void
OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties::setSlingjcrinstallenablewriteback(ConfigNodePropertyBoolean slingjcrinstallenablewriteback)
{
	this->slingjcrinstallenablewriteback = slingjcrinstallenablewriteback;
}



