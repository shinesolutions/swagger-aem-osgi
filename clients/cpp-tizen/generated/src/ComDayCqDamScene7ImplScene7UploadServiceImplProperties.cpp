#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamScene7ImplScene7UploadServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamScene7ImplScene7UploadServiceImplProperties::ComDayCqDamScene7ImplScene7UploadServiceImplProperties()
{
	//__init();
}

ComDayCqDamScene7ImplScene7UploadServiceImplProperties::~ComDayCqDamScene7ImplScene7UploadServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::__init()
{
	//cqdamscene7uploadserviceactivejobtimeoutlabel = new ConfigNodePropertyInteger();
	//cqdamscene7uploadserviceconnectionmaxperroutelabel = new ConfigNodePropertyInteger();
}

void
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::__cleanup()
{
	//if(cqdamscene7uploadserviceactivejobtimeoutlabel != NULL) {
	//
	//delete cqdamscene7uploadserviceactivejobtimeoutlabel;
	//cqdamscene7uploadserviceactivejobtimeoutlabel = NULL;
	//}
	//if(cqdamscene7uploadserviceconnectionmaxperroutelabel != NULL) {
	//
	//delete cqdamscene7uploadserviceconnectionmaxperroutelabel;
	//cqdamscene7uploadserviceconnectionmaxperroutelabel = NULL;
	//}
	//
}

void
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqdamscene7uploadserviceactivejobtimeoutlabelKey = "cq.dam.scene7.uploadservice.activejobtimeout.label";
	node = json_object_get_member(pJsonObject, cqdamscene7uploadserviceactivejobtimeoutlabelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamscene7uploadserviceactivejobtimeoutlabel, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamscene7uploadserviceactivejobtimeoutlabel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamscene7uploadserviceconnectionmaxperroutelabelKey = "cq.dam.scene7.uploadservice.connectionmaxperroute.label";
	node = json_object_get_member(pJsonObject, cqdamscene7uploadserviceconnectionmaxperroutelabelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqdamscene7uploadserviceconnectionmaxperroutelabel, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqdamscene7uploadserviceconnectionmaxperroutelabel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamScene7ImplScene7UploadServiceImplProperties::ComDayCqDamScene7ImplScene7UploadServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamscene7uploadserviceactivejobtimeoutlabel();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamscene7uploadserviceactivejobtimeoutlabel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamscene7uploadserviceactivejobtimeoutlabelKey = "cq.dam.scene7.uploadservice.activejobtimeout.label";
	json_object_set_member(pJsonObject, cqdamscene7uploadserviceactivejobtimeoutlabelKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqdamscene7uploadserviceconnectionmaxperroutelabel();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqdamscene7uploadserviceconnectionmaxperroutelabel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamscene7uploadserviceconnectionmaxperroutelabelKey = "cq.dam.scene7.uploadservice.connectionmaxperroute.label";
	json_object_set_member(pJsonObject, cqdamscene7uploadserviceconnectionmaxperroutelabelKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::getCqdamscene7uploadserviceactivejobtimeoutlabel()
{
	return cqdamscene7uploadserviceactivejobtimeoutlabel;
}

void
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::setCqdamscene7uploadserviceactivejobtimeoutlabel(ConfigNodePropertyInteger  cqdamscene7uploadserviceactivejobtimeoutlabel)
{
	this->cqdamscene7uploadserviceactivejobtimeoutlabel = cqdamscene7uploadserviceactivejobtimeoutlabel;
}

ConfigNodePropertyInteger
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::getCqdamscene7uploadserviceconnectionmaxperroutelabel()
{
	return cqdamscene7uploadserviceconnectionmaxperroutelabel;
}

void
ComDayCqDamScene7ImplScene7UploadServiceImplProperties::setCqdamscene7uploadserviceconnectionmaxperroutelabel(ConfigNodePropertyInteger  cqdamscene7uploadserviceconnectionmaxperroutelabel)
{
	this->cqdamscene7uploadserviceconnectionmaxperroutelabel = cqdamscene7uploadserviceconnectionmaxperroutelabel;
}


