#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmDesignimporterDesignPackageImporterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmDesignimporterDesignPackageImporterProperties::ComDayCqWcmDesignimporterDesignPackageImporterProperties()
{
	//__init();
}

ComDayCqWcmDesignimporterDesignPackageImporterProperties::~ComDayCqWcmDesignimporterDesignPackageImporterProperties()
{
	//__cleanup();
}

void
ComDayCqWcmDesignimporterDesignPackageImporterProperties::__init()
{
	//extractfilter = new ConfigNodePropertyArray();
}

void
ComDayCqWcmDesignimporterDesignPackageImporterProperties::__cleanup()
{
	//if(extractfilter != NULL) {
	//
	//delete extractfilter;
	//extractfilter = NULL;
	//}
	//
}

void
ComDayCqWcmDesignimporterDesignPackageImporterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *extractfilterKey = "extract.filter";
	node = json_object_get_member(pJsonObject, extractfilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&extractfilter, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&extractfilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmDesignimporterDesignPackageImporterProperties::ComDayCqWcmDesignimporterDesignPackageImporterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmDesignimporterDesignPackageImporterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExtractfilter();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExtractfilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *extractfilterKey = "extract.filter";
	json_object_set_member(pJsonObject, extractfilterKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmDesignimporterDesignPackageImporterProperties::getExtractfilter()
{
	return extractfilter;
}

void
ComDayCqWcmDesignimporterDesignPackageImporterProperties::setExtractfilter(ConfigNodePropertyArray  extractfilter)
{
	this->extractfilter = extractfilter;
}


