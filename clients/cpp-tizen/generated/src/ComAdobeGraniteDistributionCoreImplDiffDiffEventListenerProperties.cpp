#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties()
{
	//__init();
}

ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::~ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::__init()
{
	//diffPath = new ConfigNodePropertyString();
	//serviceName = new ConfigNodePropertyString();
	//serviceUsertarget = new ConfigNodePropertyString();
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::__cleanup()
{
	//if(diffPath != NULL) {
	//
	//delete diffPath;
	//diffPath = NULL;
	//}
	//if(serviceName != NULL) {
	//
	//delete serviceName;
	//serviceName = NULL;
	//}
	//if(serviceUsertarget != NULL) {
	//
	//delete serviceUsertarget;
	//serviceUsertarget = NULL;
	//}
	//
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *diffPathKey = "diffPath";
	node = json_object_get_member(pJsonObject, diffPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&diffPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&diffPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serviceNameKey = "serviceName";
	node = json_object_get_member(pJsonObject, serviceNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&serviceName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&serviceName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serviceUsertargetKey = "serviceUser.target";
	node = json_object_get_member(pJsonObject, serviceUsertargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&serviceUsertarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&serviceUsertarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDiffPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDiffPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *diffPathKey = "diffPath";
	json_object_set_member(pJsonObject, diffPathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServiceName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServiceName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceNameKey = "serviceName";
	json_object_set_member(pJsonObject, serviceNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServiceUsertarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServiceUsertarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceUsertargetKey = "serviceUser.target";
	json_object_set_member(pJsonObject, serviceUsertargetKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::getDiffPath()
{
	return diffPath;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::setDiffPath(ConfigNodePropertyString  diffPath)
{
	this->diffPath = diffPath;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::getServiceName()
{
	return serviceName;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::setServiceName(ConfigNodePropertyString  serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::getServiceUsertarget()
{
	return serviceUsertarget;
}

void
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties::setServiceUsertarget(ConfigNodePropertyString  serviceUsertarget)
{
	this->serviceUsertarget = serviceUsertarget;
}


