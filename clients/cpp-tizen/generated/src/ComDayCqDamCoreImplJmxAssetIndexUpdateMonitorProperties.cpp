#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties()
{
	//__init();
}

ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::~ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::__init()
{
	//jmxobjectname = new ConfigNodePropertyString();
	//propertymeasureenabled = new ConfigNodePropertyBoolean();
	//propertyname = new ConfigNodePropertyString();
	//propertymaxwaitms = new ConfigNodePropertyInteger();
	//propertymaxrate = new ConfigNodePropertyFloat();
	//fulltextmeasureenabled = new ConfigNodePropertyBoolean();
	//fulltextname = new ConfigNodePropertyString();
	//fulltextmaxwaitms = new ConfigNodePropertyInteger();
	//fulltextmaxrate = new ConfigNodePropertyFloat();
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::__cleanup()
{
	//if(jmxobjectname != NULL) {
	//
	//delete jmxobjectname;
	//jmxobjectname = NULL;
	//}
	//if(propertymeasureenabled != NULL) {
	//
	//delete propertymeasureenabled;
	//propertymeasureenabled = NULL;
	//}
	//if(propertyname != NULL) {
	//
	//delete propertyname;
	//propertyname = NULL;
	//}
	//if(propertymaxwaitms != NULL) {
	//
	//delete propertymaxwaitms;
	//propertymaxwaitms = NULL;
	//}
	//if(propertymaxrate != NULL) {
	//
	//delete propertymaxrate;
	//propertymaxrate = NULL;
	//}
	//if(fulltextmeasureenabled != NULL) {
	//
	//delete fulltextmeasureenabled;
	//fulltextmeasureenabled = NULL;
	//}
	//if(fulltextname != NULL) {
	//
	//delete fulltextname;
	//fulltextname = NULL;
	//}
	//if(fulltextmaxwaitms != NULL) {
	//
	//delete fulltextmaxwaitms;
	//fulltextmaxwaitms = NULL;
	//}
	//if(fulltextmaxrate != NULL) {
	//
	//delete fulltextmaxrate;
	//fulltextmaxrate = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *jmxobjectnameKey = "jmx.objectname";
	node = json_object_get_member(pJsonObject, jmxobjectnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jmxobjectname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jmxobjectname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *propertymeasureenabledKey = "property.measure.enabled";
	node = json_object_get_member(pJsonObject, propertymeasureenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&propertymeasureenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&propertymeasureenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *propertynameKey = "property.name";
	node = json_object_get_member(pJsonObject, propertynameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&propertyname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&propertyname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *propertymaxwaitmsKey = "property.max.wait.ms";
	node = json_object_get_member(pJsonObject, propertymaxwaitmsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&propertymaxwaitms, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&propertymaxwaitms);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *propertymaxrateKey = "property.max.rate";
	node = json_object_get_member(pJsonObject, propertymaxrateKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyFloat")) {
			jsonToValue(&propertymaxrate, node, "ConfigNodePropertyFloat", "ConfigNodePropertyFloat");
		} else {
			
			ConfigNodePropertyFloat* obj = static_cast<ConfigNodePropertyFloat*> (&propertymaxrate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fulltextmeasureenabledKey = "fulltext.measure.enabled";
	node = json_object_get_member(pJsonObject, fulltextmeasureenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&fulltextmeasureenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&fulltextmeasureenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fulltextnameKey = "fulltext.name";
	node = json_object_get_member(pJsonObject, fulltextnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&fulltextname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&fulltextname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fulltextmaxwaitmsKey = "fulltext.max.wait.ms";
	node = json_object_get_member(pJsonObject, fulltextmaxwaitmsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&fulltextmaxwaitms, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&fulltextmaxwaitms);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fulltextmaxrateKey = "fulltext.max.rate";
	node = json_object_get_member(pJsonObject, fulltextmaxrateKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyFloat")) {
			jsonToValue(&fulltextmaxrate, node, "ConfigNodePropertyFloat", "ConfigNodePropertyFloat");
		} else {
			
			ConfigNodePropertyFloat* obj = static_cast<ConfigNodePropertyFloat*> (&fulltextmaxrate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJmxobjectname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJmxobjectname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jmxobjectnameKey = "jmx.objectname";
	json_object_set_member(pJsonObject, jmxobjectnameKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getPropertymeasureenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getPropertymeasureenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertymeasureenabledKey = "property.measure.enabled";
	json_object_set_member(pJsonObject, propertymeasureenabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPropertyname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPropertyname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertynameKey = "property.name";
	json_object_set_member(pJsonObject, propertynameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getPropertymaxwaitms();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getPropertymaxwaitms());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertymaxwaitmsKey = "property.max.wait.ms";
	json_object_set_member(pJsonObject, propertymaxwaitmsKey, node);
	if (isprimitive("ConfigNodePropertyFloat")) {
		ConfigNodePropertyFloat obj = getPropertymaxrate();
		node = converttoJson(&obj, "ConfigNodePropertyFloat", "");
	}
	else {
		
		ConfigNodePropertyFloat obj = static_cast<ConfigNodePropertyFloat> (getPropertymaxrate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertymaxrateKey = "property.max.rate";
	json_object_set_member(pJsonObject, propertymaxrateKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getFulltextmeasureenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getFulltextmeasureenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fulltextmeasureenabledKey = "fulltext.measure.enabled";
	json_object_set_member(pJsonObject, fulltextmeasureenabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFulltextname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFulltextname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fulltextnameKey = "fulltext.name";
	json_object_set_member(pJsonObject, fulltextnameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getFulltextmaxwaitms();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getFulltextmaxwaitms());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fulltextmaxwaitmsKey = "fulltext.max.wait.ms";
	json_object_set_member(pJsonObject, fulltextmaxwaitmsKey, node);
	if (isprimitive("ConfigNodePropertyFloat")) {
		ConfigNodePropertyFloat obj = getFulltextmaxrate();
		node = converttoJson(&obj, "ConfigNodePropertyFloat", "");
	}
	else {
		
		ConfigNodePropertyFloat obj = static_cast<ConfigNodePropertyFloat> (getFulltextmaxrate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fulltextmaxrateKey = "fulltext.max.rate";
	json_object_set_member(pJsonObject, fulltextmaxrateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getJmxobjectname()
{
	return jmxobjectname;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setJmxobjectname(ConfigNodePropertyString  jmxobjectname)
{
	this->jmxobjectname = jmxobjectname;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getPropertymeasureenabled()
{
	return propertymeasureenabled;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setPropertymeasureenabled(ConfigNodePropertyBoolean  propertymeasureenabled)
{
	this->propertymeasureenabled = propertymeasureenabled;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getPropertyname()
{
	return propertyname;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setPropertyname(ConfigNodePropertyString  propertyname)
{
	this->propertyname = propertyname;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getPropertymaxwaitms()
{
	return propertymaxwaitms;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setPropertymaxwaitms(ConfigNodePropertyInteger  propertymaxwaitms)
{
	this->propertymaxwaitms = propertymaxwaitms;
}

ConfigNodePropertyFloat
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getPropertymaxrate()
{
	return propertymaxrate;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setPropertymaxrate(ConfigNodePropertyFloat  propertymaxrate)
{
	this->propertymaxrate = propertymaxrate;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getFulltextmeasureenabled()
{
	return fulltextmeasureenabled;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setFulltextmeasureenabled(ConfigNodePropertyBoolean  fulltextmeasureenabled)
{
	this->fulltextmeasureenabled = fulltextmeasureenabled;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getFulltextname()
{
	return fulltextname;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setFulltextname(ConfigNodePropertyString  fulltextname)
{
	this->fulltextname = fulltextname;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getFulltextmaxwaitms()
{
	return fulltextmaxwaitms;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setFulltextmaxwaitms(ConfigNodePropertyInteger  fulltextmaxwaitms)
{
	this->fulltextmaxwaitms = fulltextmaxwaitms;
}

ConfigNodePropertyFloat
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getFulltextmaxrate()
{
	return fulltextmaxrate;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setFulltextmaxrate(ConfigNodePropertyFloat  fulltextmaxrate)
{
	this->fulltextmaxrate = fulltextmaxrate;
}


