#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::ComAdobeCqScheduledExporterImplScheduledExporterImplProperties()
{
	//__init();
}

ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::~ComAdobeCqScheduledExporterImplScheduledExporterImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::__init()
{
	//includepaths = new ConfigNodePropertyArray();
	//exporteruser = new ConfigNodePropertyString();
}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::__cleanup()
{
	//if(includepaths != NULL) {
	//
	//delete includepaths;
	//includepaths = NULL;
	//}
	//if(exporteruser != NULL) {
	//
	//delete exporteruser;
	//exporteruser = NULL;
	//}
	//
}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *includepathsKey = "include.paths";
	node = json_object_get_member(pJsonObject, includepathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&includepaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&includepaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exporteruserKey = "exporter.user";
	node = json_object_get_member(pJsonObject, exporteruserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&exporteruser, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&exporteruser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::ComAdobeCqScheduledExporterImplScheduledExporterImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getIncludepaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getIncludepaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *includepathsKey = "include.paths";
	json_object_set_member(pJsonObject, includepathsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getExporteruser();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getExporteruser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *exporteruserKey = "exporter.user";
	json_object_set_member(pJsonObject, exporteruserKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::getIncludepaths()
{
	return includepaths;
}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::setIncludepaths(ConfigNodePropertyArray  includepaths)
{
	this->includepaths = includepaths;
}

ConfigNodePropertyString
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::getExporteruser()
{
	return exporteruser;
}

void
ComAdobeCqScheduledExporterImplScheduledExporterImplProperties::setExporteruser(ConfigNodePropertyString  exporteruser)
{
	this->exporteruser = exporteruser;
}


