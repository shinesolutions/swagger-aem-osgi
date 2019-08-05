#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletCompanionServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletCompanionServletProperties::ComDayCqDamCoreImplServletCompanionServletProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletCompanionServletProperties::~ComDayCqDamCoreImplServletCompanionServletProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletCompanionServletProperties::__init()
{
	//moreInfo = new ConfigNodePropertyString();
	//mntoverlaydamguicontentassetsmoreinfohtmlpath = new ConfigNodePropertyString();
}

void
ComDayCqDamCoreImplServletCompanionServletProperties::__cleanup()
{
	//if(moreInfo != NULL) {
	//
	//delete moreInfo;
	//moreInfo = NULL;
	//}
	//if(mntoverlaydamguicontentassetsmoreinfohtmlpath != NULL) {
	//
	//delete mntoverlaydamguicontentassetsmoreinfohtmlpath;
	//mntoverlaydamguicontentassetsmoreinfohtmlpath = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletCompanionServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *moreInfoKey = "More Info";
	node = json_object_get_member(pJsonObject, moreInfoKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&moreInfo, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&moreInfo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *mntoverlaydamguicontentassetsmoreinfohtmlpathKey = "/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}";
	node = json_object_get_member(pJsonObject, mntoverlaydamguicontentassetsmoreinfohtmlpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&mntoverlaydamguicontentassetsmoreinfohtmlpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&mntoverlaydamguicontentassetsmoreinfohtmlpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletCompanionServletProperties::ComDayCqDamCoreImplServletCompanionServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletCompanionServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMoreInfo();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMoreInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *moreInfoKey = "More Info";
	json_object_set_member(pJsonObject, moreInfoKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getMntoverlaydamguicontentassetsmoreinfohtmlpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getMntoverlaydamguicontentassetsmoreinfohtmlpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mntoverlaydamguicontentassetsmoreinfohtmlpathKey = "/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}";
	json_object_set_member(pJsonObject, mntoverlaydamguicontentassetsmoreinfohtmlpathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletCompanionServletProperties::getMoreInfo()
{
	return moreInfo;
}

void
ComDayCqDamCoreImplServletCompanionServletProperties::setMoreInfo(ConfigNodePropertyString  moreInfo)
{
	this->moreInfo = moreInfo;
}

ConfigNodePropertyString
ComDayCqDamCoreImplServletCompanionServletProperties::getMntoverlaydamguicontentassetsmoreinfohtmlpath()
{
	return mntoverlaydamguicontentassetsmoreinfohtmlpath;
}

void
ComDayCqDamCoreImplServletCompanionServletProperties::setMntoverlaydamguicontentassetsmoreinfohtmlpath(ConfigNodePropertyString  mntoverlaydamguicontentassetsmoreinfohtmlpath)
{
	this->mntoverlaydamguicontentassetsmoreinfohtmlpath = mntoverlaydamguicontentassetsmoreinfohtmlpath;
}


