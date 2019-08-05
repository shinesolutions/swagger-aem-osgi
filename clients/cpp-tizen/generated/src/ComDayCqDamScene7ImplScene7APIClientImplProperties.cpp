#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamScene7ImplScene7APIClientImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamScene7ImplScene7APIClientImplProperties::ComDayCqDamScene7ImplScene7APIClientImplProperties()
{
	//__init();
}

ComDayCqDamScene7ImplScene7APIClientImplProperties::~ComDayCqDamScene7ImplScene7APIClientImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamScene7ImplScene7APIClientImplProperties::__init()
{
	//cqdamscene7apiclientrecordsperpagenofiltername = new ConfigNodePropertyInteger();
	//cqdamscene7apiclientrecordsperpagewithfiltername = new ConfigNodePropertyInteger();
}

void
ComDayCqDamScene7ImplScene7APIClientImplProperties::__cleanup()
{
	//if(cqdamscene7apiclientrecordsperpagenofiltername != NULL) {
	//
	//delete cqdamscene7apiclientrecordsperpagenofiltername;
	//cqdamscene7apiclientrecordsperpagenofiltername = NULL;
	//}
	//if(cqdamscene7apiclientrecordsperpagewithfiltername != NULL) {
	//
	//delete cqdamscene7apiclientrecordsperpagewithfiltername;
	//cqdamscene7apiclientrecordsperpagewithfiltername = NULL;
	//}
	//
}

void
ComDayCqDamScene7ImplScene7APIClientImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamscene7apiclientrecordsperpagenofilternameKey = "cq.dam.scene7.apiclient.recordsperpage.nofilter.name";
	node = json_object_get_member(pJsonObject, cqdamscene7apiclientrecordsperpagenofilternameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamscene7apiclientrecordsperpagenofiltername, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamscene7apiclientrecordsperpagenofiltername);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamscene7apiclientrecordsperpagewithfilternameKey = "cq.dam.scene7.apiclient.recordsperpage.withfilter.name";
	node = json_object_get_member(pJsonObject, cqdamscene7apiclientrecordsperpagewithfilternameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamscene7apiclientrecordsperpagewithfiltername, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamscene7apiclientrecordsperpagewithfiltername);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamScene7ImplScene7APIClientImplProperties::ComDayCqDamScene7ImplScene7APIClientImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamScene7ImplScene7APIClientImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamscene7apiclientrecordsperpagenofiltername();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamscene7apiclientrecordsperpagenofiltername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamscene7apiclientrecordsperpagenofilternameKey = "cq.dam.scene7.apiclient.recordsperpage.nofilter.name";
	json_object_set_member(pJsonObject, cqdamscene7apiclientrecordsperpagenofilternameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamscene7apiclientrecordsperpagewithfiltername();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamscene7apiclientrecordsperpagewithfiltername());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamscene7apiclientrecordsperpagewithfilternameKey = "cq.dam.scene7.apiclient.recordsperpage.withfilter.name";
	json_object_set_member(pJsonObject, cqdamscene7apiclientrecordsperpagewithfilternameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamScene7ImplScene7APIClientImplProperties::getCqdamscene7apiclientrecordsperpagenofiltername()
{
	return cqdamscene7apiclientrecordsperpagenofiltername;
}

void
ComDayCqDamScene7ImplScene7APIClientImplProperties::setCqdamscene7apiclientrecordsperpagenofiltername(ConfigNodePropertyInteger  cqdamscene7apiclientrecordsperpagenofiltername)
{
	this->cqdamscene7apiclientrecordsperpagenofiltername = cqdamscene7apiclientrecordsperpagenofiltername;
}

ConfigNodePropertyInteger
ComDayCqDamScene7ImplScene7APIClientImplProperties::getCqdamscene7apiclientrecordsperpagewithfiltername()
{
	return cqdamscene7apiclientrecordsperpagewithfiltername;
}

void
ComDayCqDamScene7ImplScene7APIClientImplProperties::setCqdamscene7apiclientrecordsperpagewithfiltername(ConfigNodePropertyInteger  cqdamscene7apiclientrecordsperpagewithfiltername)
{
	this->cqdamscene7apiclientrecordsperpagewithfiltername = cqdamscene7apiclientrecordsperpagewithfiltername;
}


