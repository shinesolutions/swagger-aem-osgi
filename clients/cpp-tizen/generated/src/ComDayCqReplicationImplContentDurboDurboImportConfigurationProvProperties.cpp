#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties()
{
	//__init();
}

ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::~ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties()
{
	//__cleanup();
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::__init()
{
	//preservehierarchynodes = new ConfigNodePropertyBoolean();
	//ignoreversioning = new ConfigNodePropertyBoolean();
	//importacl = new ConfigNodePropertyBoolean();
	//savethreshold = new ConfigNodePropertyInteger();
	//preserveuserpaths = new ConfigNodePropertyBoolean();
	//preserveuuid = new ConfigNodePropertyBoolean();
	//preserveuuidnodetypes = new ConfigNodePropertyArray();
	//preserveuuidsubtrees = new ConfigNodePropertyArray();
	//autocommit = new ConfigNodePropertyBoolean();
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::__cleanup()
{
	//if(preservehierarchynodes != NULL) {
	//
	//delete preservehierarchynodes;
	//preservehierarchynodes = NULL;
	//}
	//if(ignoreversioning != NULL) {
	//
	//delete ignoreversioning;
	//ignoreversioning = NULL;
	//}
	//if(importacl != NULL) {
	//
	//delete importacl;
	//importacl = NULL;
	//}
	//if(savethreshold != NULL) {
	//
	//delete savethreshold;
	//savethreshold = NULL;
	//}
	//if(preserveuserpaths != NULL) {
	//
	//delete preserveuserpaths;
	//preserveuserpaths = NULL;
	//}
	//if(preserveuuid != NULL) {
	//
	//delete preserveuuid;
	//preserveuuid = NULL;
	//}
	//if(preserveuuidnodetypes != NULL) {
	//
	//delete preserveuuidnodetypes;
	//preserveuuidnodetypes = NULL;
	//}
	//if(preserveuuidsubtrees != NULL) {
	//
	//delete preserveuuidsubtrees;
	//preserveuuidsubtrees = NULL;
	//}
	//if(autocommit != NULL) {
	//
	//delete autocommit;
	//autocommit = NULL;
	//}
	//
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *preservehierarchynodesKey = "preserve.hierarchy.nodes";
	node = json_object_get_member(pJsonObject, preservehierarchynodesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&preservehierarchynodes, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&preservehierarchynodes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ignoreversioningKey = "ignore.versioning";
	node = json_object_get_member(pJsonObject, ignoreversioningKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&ignoreversioning, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&ignoreversioning);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *importaclKey = "import.acl";
	node = json_object_get_member(pJsonObject, importaclKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&importacl, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&importacl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *savethresholdKey = "save.threshold";
	node = json_object_get_member(pJsonObject, savethresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&savethreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&savethreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *preserveuserpathsKey = "preserve.user.paths";
	node = json_object_get_member(pJsonObject, preserveuserpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&preserveuserpaths, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&preserveuserpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *preserveuuidKey = "preserve.uuid";
	node = json_object_get_member(pJsonObject, preserveuuidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&preserveuuid, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&preserveuuid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *preserveuuidnodetypesKey = "preserve.uuid.nodetypes";
	node = json_object_get_member(pJsonObject, preserveuuidnodetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&preserveuuidnodetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&preserveuuidnodetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *preserveuuidsubtreesKey = "preserve.uuid.subtrees";
	node = json_object_get_member(pJsonObject, preserveuuidsubtreesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&preserveuuidsubtrees, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&preserveuuidsubtrees);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *autocommitKey = "auto.commit";
	node = json_object_get_member(pJsonObject, autocommitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&autocommit, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&autocommit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPreservehierarchynodes();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPreservehierarchynodes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preservehierarchynodesKey = "preserve.hierarchy.nodes";
	json_object_set_member(pJsonObject, preservehierarchynodesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getIgnoreversioning();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getIgnoreversioning());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ignoreversioningKey = "ignore.versioning";
	json_object_set_member(pJsonObject, ignoreversioningKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getImportacl();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getImportacl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *importaclKey = "import.acl";
	json_object_set_member(pJsonObject, importaclKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSavethreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSavethreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *savethresholdKey = "save.threshold";
	json_object_set_member(pJsonObject, savethresholdKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPreserveuserpaths();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPreserveuserpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preserveuserpathsKey = "preserve.user.paths";
	json_object_set_member(pJsonObject, preserveuserpathsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPreserveuuid();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPreserveuuid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preserveuuidKey = "preserve.uuid";
	json_object_set_member(pJsonObject, preserveuuidKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPreserveuuidnodetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPreserveuuidnodetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preserveuuidnodetypesKey = "preserve.uuid.nodetypes";
	json_object_set_member(pJsonObject, preserveuuidnodetypesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPreserveuuidsubtrees();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPreserveuuidsubtrees());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *preserveuuidsubtreesKey = "preserve.uuid.subtrees";
	json_object_set_member(pJsonObject, preserveuuidsubtreesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAutocommit();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAutocommit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *autocommitKey = "auto.commit";
	json_object_set_member(pJsonObject, autocommitKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getPreservehierarchynodes()
{
	return preservehierarchynodes;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setPreservehierarchynodes(ConfigNodePropertyBoolean  preservehierarchynodes)
{
	this->preservehierarchynodes = preservehierarchynodes;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getIgnoreversioning()
{
	return ignoreversioning;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setIgnoreversioning(ConfigNodePropertyBoolean  ignoreversioning)
{
	this->ignoreversioning = ignoreversioning;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getImportacl()
{
	return importacl;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setImportacl(ConfigNodePropertyBoolean  importacl)
{
	this->importacl = importacl;
}

ConfigNodePropertyInteger
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getSavethreshold()
{
	return savethreshold;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setSavethreshold(ConfigNodePropertyInteger  savethreshold)
{
	this->savethreshold = savethreshold;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getPreserveuserpaths()
{
	return preserveuserpaths;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setPreserveuserpaths(ConfigNodePropertyBoolean  preserveuserpaths)
{
	this->preserveuserpaths = preserveuserpaths;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getPreserveuuid()
{
	return preserveuuid;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setPreserveuuid(ConfigNodePropertyBoolean  preserveuuid)
{
	this->preserveuuid = preserveuuid;
}

ConfigNodePropertyArray
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getPreserveuuidnodetypes()
{
	return preserveuuidnodetypes;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setPreserveuuidnodetypes(ConfigNodePropertyArray  preserveuuidnodetypes)
{
	this->preserveuuidnodetypes = preserveuuidnodetypes;
}

ConfigNodePropertyArray
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getPreserveuuidsubtrees()
{
	return preserveuuidsubtrees;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setPreserveuuidsubtrees(ConfigNodePropertyArray  preserveuuidsubtrees)
{
	this->preserveuuidsubtrees = preserveuuidsubtrees;
}

ConfigNodePropertyBoolean
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::getAutocommit()
{
	return autocommit;
}

void
ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties::setAutocommit(ConfigNodePropertyBoolean  autocommit)
{
	this->autocommit = autocommit;
}


