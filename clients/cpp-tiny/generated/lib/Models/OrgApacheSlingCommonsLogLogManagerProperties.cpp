

#include "OrgApacheSlingCommonsLogLogManagerProperties.h"

using namespace Tiny;

OrgApacheSlingCommonsLogLogManagerProperties::OrgApacheSlingCommonsLogLogManagerProperties()
{
	orgapacheslingcommonsloglevel = ConfigNodePropertyDropDown();
	orgapacheslingcommonslogfile = ConfigNodePropertyString();
	orgapacheslingcommonslogfilenumber = ConfigNodePropertyInteger();
	orgapacheslingcommonslogfilesize = ConfigNodePropertyString();
	orgapacheslingcommonslogpattern = ConfigNodePropertyString();
	orgapacheslingcommonslogconfigurationFile = ConfigNodePropertyString();
	orgapacheslingcommonslogpackagingDataEnabled = ConfigNodePropertyBoolean();
	orgapacheslingcommonslogmaxCallerDataDepth = ConfigNodePropertyInteger();
	orgapacheslingcommonslogmaxOldFileCountInDump = ConfigNodePropertyInteger();
	orgapacheslingcommonslognumOfLines = ConfigNodePropertyInteger();
}

OrgApacheSlingCommonsLogLogManagerProperties::OrgApacheSlingCommonsLogLogManagerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCommonsLogLogManagerProperties::~OrgApacheSlingCommonsLogLogManagerProperties()
{

}

void
OrgApacheSlingCommonsLogLogManagerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapacheslingcommonsloglevelKey = "org.apache.sling.commons.log.level";

    if(object.has_key(orgapacheslingcommonsloglevelKey))
    {
        bourne::json value = object[orgapacheslingcommonsloglevelKey];




        ConfigNodePropertyDropDown* obj = &orgapacheslingcommonsloglevel;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogfileKey = "org.apache.sling.commons.log.file";

    if(object.has_key(orgapacheslingcommonslogfileKey))
    {
        bourne::json value = object[orgapacheslingcommonslogfileKey];




        ConfigNodePropertyString* obj = &orgapacheslingcommonslogfile;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogfilenumberKey = "org.apache.sling.commons.log.file.number";

    if(object.has_key(orgapacheslingcommonslogfilenumberKey))
    {
        bourne::json value = object[orgapacheslingcommonslogfilenumberKey];




        ConfigNodePropertyInteger* obj = &orgapacheslingcommonslogfilenumber;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogfilesizeKey = "org.apache.sling.commons.log.file.size";

    if(object.has_key(orgapacheslingcommonslogfilesizeKey))
    {
        bourne::json value = object[orgapacheslingcommonslogfilesizeKey];




        ConfigNodePropertyString* obj = &orgapacheslingcommonslogfilesize;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogpatternKey = "org.apache.sling.commons.log.pattern";

    if(object.has_key(orgapacheslingcommonslogpatternKey))
    {
        bourne::json value = object[orgapacheslingcommonslogpatternKey];




        ConfigNodePropertyString* obj = &orgapacheslingcommonslogpattern;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogconfigurationFileKey = "org.apache.sling.commons.log.configurationFile";

    if(object.has_key(orgapacheslingcommonslogconfigurationFileKey))
    {
        bourne::json value = object[orgapacheslingcommonslogconfigurationFileKey];




        ConfigNodePropertyString* obj = &orgapacheslingcommonslogconfigurationFile;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogpackagingDataEnabledKey = "org.apache.sling.commons.log.packagingDataEnabled";

    if(object.has_key(orgapacheslingcommonslogpackagingDataEnabledKey))
    {
        bourne::json value = object[orgapacheslingcommonslogpackagingDataEnabledKey];




        ConfigNodePropertyBoolean* obj = &orgapacheslingcommonslogpackagingDataEnabled;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogmaxCallerDataDepthKey = "org.apache.sling.commons.log.maxCallerDataDepth";

    if(object.has_key(orgapacheslingcommonslogmaxCallerDataDepthKey))
    {
        bourne::json value = object[orgapacheslingcommonslogmaxCallerDataDepthKey];




        ConfigNodePropertyInteger* obj = &orgapacheslingcommonslogmaxCallerDataDepth;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslogmaxOldFileCountInDumpKey = "org.apache.sling.commons.log.maxOldFileCountInDump";

    if(object.has_key(orgapacheslingcommonslogmaxOldFileCountInDumpKey))
    {
        bourne::json value = object[orgapacheslingcommonslogmaxOldFileCountInDumpKey];




        ConfigNodePropertyInteger* obj = &orgapacheslingcommonslogmaxOldFileCountInDump;
		obj->fromJson(value.dump());

    }

    const char *orgapacheslingcommonslognumOfLinesKey = "org.apache.sling.commons.log.numOfLines";

    if(object.has_key(orgapacheslingcommonslognumOfLinesKey))
    {
        bourne::json value = object[orgapacheslingcommonslognumOfLinesKey];




        ConfigNodePropertyInteger* obj = &orgapacheslingcommonslognumOfLines;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCommonsLogLogManagerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapacheslingcommonsloglevel"] = getOrgapacheslingcommonsloglevel().toJson();






	object["orgapacheslingcommonslogfile"] = getOrgapacheslingcommonslogfile().toJson();






	object["orgapacheslingcommonslogfilenumber"] = getOrgapacheslingcommonslogfilenumber().toJson();






	object["orgapacheslingcommonslogfilesize"] = getOrgapacheslingcommonslogfilesize().toJson();






	object["orgapacheslingcommonslogpattern"] = getOrgapacheslingcommonslogpattern().toJson();






	object["orgapacheslingcommonslogconfigurationFile"] = getOrgapacheslingcommonslogconfigurationFile().toJson();






	object["orgapacheslingcommonslogpackagingDataEnabled"] = getOrgapacheslingcommonslogpackagingDataEnabled().toJson();






	object["orgapacheslingcommonslogmaxCallerDataDepth"] = getOrgapacheslingcommonslogmaxCallerDataDepth().toJson();






	object["orgapacheslingcommonslogmaxOldFileCountInDump"] = getOrgapacheslingcommonslogmaxOldFileCountInDump().toJson();






	object["orgapacheslingcommonslognumOfLines"] = getOrgapacheslingcommonslognumOfLines().toJson();


    return object;

}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonsloglevel()
{
	return orgapacheslingcommonsloglevel;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonsloglevel(ConfigNodePropertyDropDown orgapacheslingcommonsloglevel)
{
	this->orgapacheslingcommonsloglevel = orgapacheslingcommonsloglevel;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogfile()
{
	return orgapacheslingcommonslogfile;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogfile(ConfigNodePropertyString orgapacheslingcommonslogfile)
{
	this->orgapacheslingcommonslogfile = orgapacheslingcommonslogfile;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogfilenumber()
{
	return orgapacheslingcommonslogfilenumber;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogfilenumber(ConfigNodePropertyInteger orgapacheslingcommonslogfilenumber)
{
	this->orgapacheslingcommonslogfilenumber = orgapacheslingcommonslogfilenumber;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogfilesize()
{
	return orgapacheslingcommonslogfilesize;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogfilesize(ConfigNodePropertyString orgapacheslingcommonslogfilesize)
{
	this->orgapacheslingcommonslogfilesize = orgapacheslingcommonslogfilesize;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogpattern()
{
	return orgapacheslingcommonslogpattern;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogpattern(ConfigNodePropertyString orgapacheslingcommonslogpattern)
{
	this->orgapacheslingcommonslogpattern = orgapacheslingcommonslogpattern;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogconfigurationFile()
{
	return orgapacheslingcommonslogconfigurationFile;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogconfigurationFile(ConfigNodePropertyString orgapacheslingcommonslogconfigurationFile)
{
	this->orgapacheslingcommonslogconfigurationFile = orgapacheslingcommonslogconfigurationFile;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogpackagingDataEnabled()
{
	return orgapacheslingcommonslogpackagingDataEnabled;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogpackagingDataEnabled(ConfigNodePropertyBoolean orgapacheslingcommonslogpackagingDataEnabled)
{
	this->orgapacheslingcommonslogpackagingDataEnabled = orgapacheslingcommonslogpackagingDataEnabled;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogmaxCallerDataDepth()
{
	return orgapacheslingcommonslogmaxCallerDataDepth;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogmaxCallerDataDepth(ConfigNodePropertyInteger orgapacheslingcommonslogmaxCallerDataDepth)
{
	this->orgapacheslingcommonslogmaxCallerDataDepth = orgapacheslingcommonslogmaxCallerDataDepth;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogmaxOldFileCountInDump()
{
	return orgapacheslingcommonslogmaxOldFileCountInDump;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogmaxOldFileCountInDump(ConfigNodePropertyInteger orgapacheslingcommonslogmaxOldFileCountInDump)
{
	this->orgapacheslingcommonslogmaxOldFileCountInDump = orgapacheslingcommonslogmaxOldFileCountInDump;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslognumOfLines()
{
	return orgapacheslingcommonslognumOfLines;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslognumOfLines(ConfigNodePropertyInteger orgapacheslingcommonslognumOfLines)
{
	this->orgapacheslingcommonslognumOfLines = orgapacheslingcommonslognumOfLines;
}



