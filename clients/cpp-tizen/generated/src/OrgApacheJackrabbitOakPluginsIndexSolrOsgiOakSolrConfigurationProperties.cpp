#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties()
{
	//__init();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::__init()
{
	//pathdescfield = new ConfigNodePropertyString();
	//pathchildfield = new ConfigNodePropertyString();
	//pathparentfield = new ConfigNodePropertyString();
	//pathexactfield = new ConfigNodePropertyString();
	//catchallfield = new ConfigNodePropertyString();
	//collapsedpathfield = new ConfigNodePropertyString();
	//pathdepthfield = new ConfigNodePropertyString();
	//commitpolicy = new ConfigNodePropertyDropDown();
	//rows = new ConfigNodePropertyInteger();
	//pathrestrictions = new ConfigNodePropertyBoolean();
	//propertyrestrictions = new ConfigNodePropertyBoolean();
	//primarytypesrestrictions = new ConfigNodePropertyBoolean();
	//ignoredproperties = new ConfigNodePropertyArray();
	//usedproperties = new ConfigNodePropertyArray();
	//typemappings = new ConfigNodePropertyArray();
	//propertymappings = new ConfigNodePropertyArray();
	//collapsejcrcontentnodes = new ConfigNodePropertyBoolean();
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::__cleanup()
{
	//if(pathdescfield != NULL) {
	//
	//delete pathdescfield;
	//pathdescfield = NULL;
	//}
	//if(pathchildfield != NULL) {
	//
	//delete pathchildfield;
	//pathchildfield = NULL;
	//}
	//if(pathparentfield != NULL) {
	//
	//delete pathparentfield;
	//pathparentfield = NULL;
	//}
	//if(pathexactfield != NULL) {
	//
	//delete pathexactfield;
	//pathexactfield = NULL;
	//}
	//if(catchallfield != NULL) {
	//
	//delete catchallfield;
	//catchallfield = NULL;
	//}
	//if(collapsedpathfield != NULL) {
	//
	//delete collapsedpathfield;
	//collapsedpathfield = NULL;
	//}
	//if(pathdepthfield != NULL) {
	//
	//delete pathdepthfield;
	//pathdepthfield = NULL;
	//}
	//if(commitpolicy != NULL) {
	//
	//delete commitpolicy;
	//commitpolicy = NULL;
	//}
	//if(rows != NULL) {
	//
	//delete rows;
	//rows = NULL;
	//}
	//if(pathrestrictions != NULL) {
	//
	//delete pathrestrictions;
	//pathrestrictions = NULL;
	//}
	//if(propertyrestrictions != NULL) {
	//
	//delete propertyrestrictions;
	//propertyrestrictions = NULL;
	//}
	//if(primarytypesrestrictions != NULL) {
	//
	//delete primarytypesrestrictions;
	//primarytypesrestrictions = NULL;
	//}
	//if(ignoredproperties != NULL) {
	//
	//delete ignoredproperties;
	//ignoredproperties = NULL;
	//}
	//if(usedproperties != NULL) {
	//
	//delete usedproperties;
	//usedproperties = NULL;
	//}
	//if(typemappings != NULL) {
	//
	//delete typemappings;
	//typemappings = NULL;
	//}
	//if(propertymappings != NULL) {
	//
	//delete propertymappings;
	//propertymappings = NULL;
	//}
	//if(collapsejcrcontentnodes != NULL) {
	//
	//delete collapsejcrcontentnodes;
	//collapsejcrcontentnodes = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathdescfieldKey = "path.desc.field";
	node = json_object_get_member(pJsonObject, pathdescfieldKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pathdescfield, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pathdescfield);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pathchildfieldKey = "path.child.field";
	node = json_object_get_member(pJsonObject, pathchildfieldKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pathchildfield, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pathchildfield);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pathparentfieldKey = "path.parent.field";
	node = json_object_get_member(pJsonObject, pathparentfieldKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pathparentfield, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pathparentfield);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pathexactfieldKey = "path.exact.field";
	node = json_object_get_member(pJsonObject, pathexactfieldKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pathexactfield, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pathexactfield);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *catchallfieldKey = "catch.all.field";
	node = json_object_get_member(pJsonObject, catchallfieldKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&catchallfield, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&catchallfield);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *collapsedpathfieldKey = "collapsed.path.field";
	node = json_object_get_member(pJsonObject, collapsedpathfieldKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&collapsedpathfield, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&collapsedpathfield);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pathdepthfieldKey = "path.depth.field";
	node = json_object_get_member(pJsonObject, pathdepthfieldKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&pathdepthfield, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&pathdepthfield);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *commitpolicyKey = "commit.policy";
	node = json_object_get_member(pJsonObject, commitpolicyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&commitpolicy, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&commitpolicy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rowsKey = "rows";
	node = json_object_get_member(pJsonObject, rowsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&rows, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&rows);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pathrestrictionsKey = "path.restrictions";
	node = json_object_get_member(pJsonObject, pathrestrictionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&pathrestrictions, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&pathrestrictions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *propertyrestrictionsKey = "property.restrictions";
	node = json_object_get_member(pJsonObject, propertyrestrictionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&propertyrestrictions, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&propertyrestrictions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *primarytypesrestrictionsKey = "primarytypes.restrictions";
	node = json_object_get_member(pJsonObject, primarytypesrestrictionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&primarytypesrestrictions, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&primarytypesrestrictions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ignoredpropertiesKey = "ignored.properties";
	node = json_object_get_member(pJsonObject, ignoredpropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&ignoredproperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&ignoredproperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *usedpropertiesKey = "used.properties";
	node = json_object_get_member(pJsonObject, usedpropertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&usedproperties, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&usedproperties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typemappingsKey = "type.mappings";
	node = json_object_get_member(pJsonObject, typemappingsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&typemappings, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&typemappings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *propertymappingsKey = "property.mappings";
	node = json_object_get_member(pJsonObject, propertymappingsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&propertymappings, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&propertymappings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *collapsejcrcontentnodesKey = "collapse.jcrcontent.nodes";
	node = json_object_get_member(pJsonObject, collapsejcrcontentnodesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&collapsejcrcontentnodes, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&collapsejcrcontentnodes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPathdescfield();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPathdescfield());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathdescfieldKey = "path.desc.field";
	json_object_set_member(pJsonObject, pathdescfieldKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPathchildfield();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPathchildfield());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathchildfieldKey = "path.child.field";
	json_object_set_member(pJsonObject, pathchildfieldKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPathparentfield();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPathparentfield());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathparentfieldKey = "path.parent.field";
	json_object_set_member(pJsonObject, pathparentfieldKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPathexactfield();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPathexactfield());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathexactfieldKey = "path.exact.field";
	json_object_set_member(pJsonObject, pathexactfieldKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCatchallfield();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCatchallfield());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *catchallfieldKey = "catch.all.field";
	json_object_set_member(pJsonObject, catchallfieldKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCollapsedpathfield();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCollapsedpathfield());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *collapsedpathfieldKey = "collapsed.path.field";
	json_object_set_member(pJsonObject, collapsedpathfieldKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPathdepthfield();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPathdepthfield());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathdepthfieldKey = "path.depth.field";
	json_object_set_member(pJsonObject, pathdepthfieldKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getCommitpolicy();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getCommitpolicy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *commitpolicyKey = "commit.policy";
	json_object_set_member(pJsonObject, commitpolicyKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRows();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRows());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rowsKey = "rows";
	json_object_set_member(pJsonObject, rowsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPathrestrictions();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPathrestrictions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathrestrictionsKey = "path.restrictions";
	json_object_set_member(pJsonObject, pathrestrictionsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPropertyrestrictions();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPropertyrestrictions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertyrestrictionsKey = "property.restrictions";
	json_object_set_member(pJsonObject, propertyrestrictionsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPrimarytypesrestrictions();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPrimarytypesrestrictions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *primarytypesrestrictionsKey = "primarytypes.restrictions";
	json_object_set_member(pJsonObject, primarytypesrestrictionsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getIgnoredproperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getIgnoredproperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ignoredpropertiesKey = "ignored.properties";
	json_object_set_member(pJsonObject, ignoredpropertiesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getUsedproperties();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getUsedproperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *usedpropertiesKey = "used.properties";
	json_object_set_member(pJsonObject, usedpropertiesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTypemappings();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTypemappings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typemappingsKey = "type.mappings";
	json_object_set_member(pJsonObject, typemappingsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPropertymappings();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPropertymappings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertymappingsKey = "property.mappings";
	json_object_set_member(pJsonObject, propertymappingsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCollapsejcrcontentnodes();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCollapsejcrcontentnodes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *collapsejcrcontentnodesKey = "collapse.jcrcontent.nodes";
	json_object_set_member(pJsonObject, collapsejcrcontentnodesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathdescfield()
{
	return pathdescfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathdescfield(ConfigNodePropertyString  pathdescfield)
{
	this->pathdescfield = pathdescfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathchildfield()
{
	return pathchildfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathchildfield(ConfigNodePropertyString  pathchildfield)
{
	this->pathchildfield = pathchildfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathparentfield()
{
	return pathparentfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathparentfield(ConfigNodePropertyString  pathparentfield)
{
	this->pathparentfield = pathparentfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathexactfield()
{
	return pathexactfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathexactfield(ConfigNodePropertyString  pathexactfield)
{
	this->pathexactfield = pathexactfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getCatchallfield()
{
	return catchallfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setCatchallfield(ConfigNodePropertyString  catchallfield)
{
	this->catchallfield = catchallfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getCollapsedpathfield()
{
	return collapsedpathfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setCollapsedpathfield(ConfigNodePropertyString  collapsedpathfield)
{
	this->collapsedpathfield = collapsedpathfield;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathdepthfield()
{
	return pathdepthfield;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathdepthfield(ConfigNodePropertyString  pathdepthfield)
{
	this->pathdepthfield = pathdepthfield;
}

ConfigNodePropertyDropDown
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getCommitpolicy()
{
	return commitpolicy;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setCommitpolicy(ConfigNodePropertyDropDown  commitpolicy)
{
	this->commitpolicy = commitpolicy;
}

ConfigNodePropertyInteger
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getRows()
{
	return rows;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setRows(ConfigNodePropertyInteger  rows)
{
	this->rows = rows;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPathrestrictions()
{
	return pathrestrictions;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPathrestrictions(ConfigNodePropertyBoolean  pathrestrictions)
{
	this->pathrestrictions = pathrestrictions;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPropertyrestrictions()
{
	return propertyrestrictions;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPropertyrestrictions(ConfigNodePropertyBoolean  propertyrestrictions)
{
	this->propertyrestrictions = propertyrestrictions;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPrimarytypesrestrictions()
{
	return primarytypesrestrictions;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPrimarytypesrestrictions(ConfigNodePropertyBoolean  primarytypesrestrictions)
{
	this->primarytypesrestrictions = primarytypesrestrictions;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getIgnoredproperties()
{
	return ignoredproperties;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setIgnoredproperties(ConfigNodePropertyArray  ignoredproperties)
{
	this->ignoredproperties = ignoredproperties;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getUsedproperties()
{
	return usedproperties;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setUsedproperties(ConfigNodePropertyArray  usedproperties)
{
	this->usedproperties = usedproperties;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getTypemappings()
{
	return typemappings;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setTypemappings(ConfigNodePropertyArray  typemappings)
{
	this->typemappings = typemappings;
}

ConfigNodePropertyArray
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getPropertymappings()
{
	return propertymappings;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setPropertymappings(ConfigNodePropertyArray  propertymappings)
{
	this->propertymappings = propertymappings;
}

ConfigNodePropertyBoolean
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::getCollapsejcrcontentnodes()
{
	return collapsejcrcontentnodes;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties::setCollapsejcrcontentnodes(ConfigNodePropertyBoolean  collapsejcrcontentnodes)
{
	this->collapsejcrcontentnodes = collapsejcrcontentnodes;
}


