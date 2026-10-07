#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCommonsLogLogManagerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCommonsLogLogManagerProperties::OrgApacheSlingCommonsLogLogManagerProperties()
{
	//__init();
}

OrgApacheSlingCommonsLogLogManagerProperties::~OrgApacheSlingCommonsLogLogManagerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCommonsLogLogManagerProperties::__init()
{
	//orgapacheslingcommonsloglevel = new ConfigNodePropertyDropDown();
	//orgapacheslingcommonslogfile = new ConfigNodePropertyString();
	//orgapacheslingcommonslogfilenumber = new ConfigNodePropertyInteger();
	//orgapacheslingcommonslogfilesize = new ConfigNodePropertyString();
	//orgapacheslingcommonslogpattern = new ConfigNodePropertyString();
	//orgapacheslingcommonslogconfigurationFile = new ConfigNodePropertyString();
	//orgapacheslingcommonslogpackagingDataEnabled = new ConfigNodePropertyBoolean();
	//orgapacheslingcommonslogmaxCallerDataDepth = new ConfigNodePropertyInteger();
	//orgapacheslingcommonslogmaxOldFileCountInDump = new ConfigNodePropertyInteger();
	//orgapacheslingcommonslognumOfLines = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingCommonsLogLogManagerProperties::__cleanup()
{
	//if(orgapacheslingcommonsloglevel != NULL) {
	//
	//delete orgapacheslingcommonsloglevel;
	//orgapacheslingcommonsloglevel = NULL;
	//}
	//if(orgapacheslingcommonslogfile != NULL) {
	//
	//delete orgapacheslingcommonslogfile;
	//orgapacheslingcommonslogfile = NULL;
	//}
	//if(orgapacheslingcommonslogfilenumber != NULL) {
	//
	//delete orgapacheslingcommonslogfilenumber;
	//orgapacheslingcommonslogfilenumber = NULL;
	//}
	//if(orgapacheslingcommonslogfilesize != NULL) {
	//
	//delete orgapacheslingcommonslogfilesize;
	//orgapacheslingcommonslogfilesize = NULL;
	//}
	//if(orgapacheslingcommonslogpattern != NULL) {
	//
	//delete orgapacheslingcommonslogpattern;
	//orgapacheslingcommonslogpattern = NULL;
	//}
	//if(orgapacheslingcommonslogconfigurationFile != NULL) {
	//
	//delete orgapacheslingcommonslogconfigurationFile;
	//orgapacheslingcommonslogconfigurationFile = NULL;
	//}
	//if(orgapacheslingcommonslogpackagingDataEnabled != NULL) {
	//
	//delete orgapacheslingcommonslogpackagingDataEnabled;
	//orgapacheslingcommonslogpackagingDataEnabled = NULL;
	//}
	//if(orgapacheslingcommonslogmaxCallerDataDepth != NULL) {
	//
	//delete orgapacheslingcommonslogmaxCallerDataDepth;
	//orgapacheslingcommonslogmaxCallerDataDepth = NULL;
	//}
	//if(orgapacheslingcommonslogmaxOldFileCountInDump != NULL) {
	//
	//delete orgapacheslingcommonslogmaxOldFileCountInDump;
	//orgapacheslingcommonslogmaxOldFileCountInDump = NULL;
	//}
	//if(orgapacheslingcommonslognumOfLines != NULL) {
	//
	//delete orgapacheslingcommonslognumOfLines;
	//orgapacheslingcommonslognumOfLines = NULL;
	//}
	//
}

void
OrgApacheSlingCommonsLogLogManagerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orgapacheslingcommonsloglevelKey = "org.apache.sling.commons.log.level";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonsloglevelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&orgapacheslingcommonsloglevel, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&orgapacheslingcommonsloglevel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogfileKey = "org.apache.sling.commons.log.file";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogfileKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapacheslingcommonslogfile, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapacheslingcommonslogfile);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogfilenumberKey = "org.apache.sling.commons.log.file.number";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogfilenumberKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&orgapacheslingcommonslogfilenumber, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&orgapacheslingcommonslogfilenumber);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogfilesizeKey = "org.apache.sling.commons.log.file.size";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogfilesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapacheslingcommonslogfilesize, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapacheslingcommonslogfilesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogpatternKey = "org.apache.sling.commons.log.pattern";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogpatternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapacheslingcommonslogpattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapacheslingcommonslogpattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogconfigurationFileKey = "org.apache.sling.commons.log.configurationFile";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogconfigurationFileKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapacheslingcommonslogconfigurationFile, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapacheslingcommonslogconfigurationFile);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogpackagingDataEnabledKey = "org.apache.sling.commons.log.packagingDataEnabled";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogpackagingDataEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&orgapacheslingcommonslogpackagingDataEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&orgapacheslingcommonslogpackagingDataEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogmaxCallerDataDepthKey = "org.apache.sling.commons.log.maxCallerDataDepth";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogmaxCallerDataDepthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&orgapacheslingcommonslogmaxCallerDataDepth, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&orgapacheslingcommonslogmaxCallerDataDepth);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogmaxOldFileCountInDumpKey = "org.apache.sling.commons.log.maxOldFileCountInDump";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogmaxOldFileCountInDumpKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&orgapacheslingcommonslogmaxOldFileCountInDump, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&orgapacheslingcommonslogmaxOldFileCountInDump);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslognumOfLinesKey = "org.apache.sling.commons.log.numOfLines";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslognumOfLinesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&orgapacheslingcommonslognumOfLines, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&orgapacheslingcommonslognumOfLines);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCommonsLogLogManagerProperties::OrgApacheSlingCommonsLogLogManagerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCommonsLogLogManagerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getOrgapacheslingcommonsloglevel();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getOrgapacheslingcommonsloglevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonsloglevelKey = "org.apache.sling.commons.log.level";
	json_object_set_member(pJsonObject, orgapacheslingcommonsloglevelKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapacheslingcommonslogfile();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapacheslingcommonslogfile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogfileKey = "org.apache.sling.commons.log.file";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogfileKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getOrgapacheslingcommonslogfilenumber();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getOrgapacheslingcommonslogfilenumber());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogfilenumberKey = "org.apache.sling.commons.log.file.number";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogfilenumberKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapacheslingcommonslogfilesize();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapacheslingcommonslogfilesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogfilesizeKey = "org.apache.sling.commons.log.file.size";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogfilesizeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapacheslingcommonslogpattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapacheslingcommonslogpattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogpatternKey = "org.apache.sling.commons.log.pattern";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogpatternKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapacheslingcommonslogconfigurationFile();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapacheslingcommonslogconfigurationFile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogconfigurationFileKey = "org.apache.sling.commons.log.configurationFile";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogconfigurationFileKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOrgapacheslingcommonslogpackagingDataEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOrgapacheslingcommonslogpackagingDataEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogpackagingDataEnabledKey = "org.apache.sling.commons.log.packagingDataEnabled";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogpackagingDataEnabledKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getOrgapacheslingcommonslogmaxCallerDataDepth();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getOrgapacheslingcommonslogmaxCallerDataDepth());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogmaxCallerDataDepthKey = "org.apache.sling.commons.log.maxCallerDataDepth";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogmaxCallerDataDepthKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getOrgapacheslingcommonslogmaxOldFileCountInDump();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getOrgapacheslingcommonslogmaxOldFileCountInDump());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogmaxOldFileCountInDumpKey = "org.apache.sling.commons.log.maxOldFileCountInDump";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogmaxOldFileCountInDumpKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getOrgapacheslingcommonslognumOfLines();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getOrgapacheslingcommonslognumOfLines());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslognumOfLinesKey = "org.apache.sling.commons.log.numOfLines";
	json_object_set_member(pJsonObject, orgapacheslingcommonslognumOfLinesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonsloglevel()
{
	return orgapacheslingcommonsloglevel;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonsloglevel(ConfigNodePropertyDropDown  orgapacheslingcommonsloglevel)
{
	this->orgapacheslingcommonsloglevel = orgapacheslingcommonsloglevel;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogfile()
{
	return orgapacheslingcommonslogfile;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogfile(ConfigNodePropertyString  orgapacheslingcommonslogfile)
{
	this->orgapacheslingcommonslogfile = orgapacheslingcommonslogfile;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogfilenumber()
{
	return orgapacheslingcommonslogfilenumber;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogfilenumber(ConfigNodePropertyInteger  orgapacheslingcommonslogfilenumber)
{
	this->orgapacheslingcommonslogfilenumber = orgapacheslingcommonslogfilenumber;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogfilesize()
{
	return orgapacheslingcommonslogfilesize;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogfilesize(ConfigNodePropertyString  orgapacheslingcommonslogfilesize)
{
	this->orgapacheslingcommonslogfilesize = orgapacheslingcommonslogfilesize;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogpattern()
{
	return orgapacheslingcommonslogpattern;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogpattern(ConfigNodePropertyString  orgapacheslingcommonslogpattern)
{
	this->orgapacheslingcommonslogpattern = orgapacheslingcommonslogpattern;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogconfigurationFile()
{
	return orgapacheslingcommonslogconfigurationFile;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogconfigurationFile(ConfigNodePropertyString  orgapacheslingcommonslogconfigurationFile)
{
	this->orgapacheslingcommonslogconfigurationFile = orgapacheslingcommonslogconfigurationFile;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogpackagingDataEnabled()
{
	return orgapacheslingcommonslogpackagingDataEnabled;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogpackagingDataEnabled(ConfigNodePropertyBoolean  orgapacheslingcommonslogpackagingDataEnabled)
{
	this->orgapacheslingcommonslogpackagingDataEnabled = orgapacheslingcommonslogpackagingDataEnabled;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogmaxCallerDataDepth()
{
	return orgapacheslingcommonslogmaxCallerDataDepth;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogmaxCallerDataDepth(ConfigNodePropertyInteger  orgapacheslingcommonslogmaxCallerDataDepth)
{
	this->orgapacheslingcommonslogmaxCallerDataDepth = orgapacheslingcommonslogmaxCallerDataDepth;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslogmaxOldFileCountInDump()
{
	return orgapacheslingcommonslogmaxOldFileCountInDump;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslogmaxOldFileCountInDump(ConfigNodePropertyInteger  orgapacheslingcommonslogmaxOldFileCountInDump)
{
	this->orgapacheslingcommonslogmaxOldFileCountInDump = orgapacheslingcommonslogmaxOldFileCountInDump;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsLogLogManagerProperties::getOrgapacheslingcommonslognumOfLines()
{
	return orgapacheslingcommonslognumOfLines;
}

void
OrgApacheSlingCommonsLogLogManagerProperties::setOrgapacheslingcommonslognumOfLines(ConfigNodePropertyInteger  orgapacheslingcommonslognumOfLines)
{
	this->orgapacheslingcommonslognumOfLines = orgapacheslingcommonslognumOfLines;
}


