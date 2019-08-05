#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqReportingImplConfigServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqReportingImplConfigServiceImplProperties::ComDayCqReportingImplConfigServiceImplProperties()
{
	//__init();
}

ComDayCqReportingImplConfigServiceImplProperties::~ComDayCqReportingImplConfigServiceImplProperties()
{
	//__cleanup();
}

void
ComDayCqReportingImplConfigServiceImplProperties::__init()
{
	//repconftimezone = new ConfigNodePropertyString();
	//repconflocale = new ConfigNodePropertyString();
	//repconfsnapshots = new ConfigNodePropertyString();
	//repconfrepdir = new ConfigNodePropertyString();
	//repconfhourofday = new ConfigNodePropertyInteger();
	//repconfminofhour = new ConfigNodePropertyInteger();
	//repconfmaxrows = new ConfigNodePropertyInteger();
	//repconffakedata = new ConfigNodePropertyBoolean();
	//repconfsnapshotuser = new ConfigNodePropertyString();
	//repconfenforcesnapshotuser = new ConfigNodePropertyBoolean();
}

void
ComDayCqReportingImplConfigServiceImplProperties::__cleanup()
{
	//if(repconftimezone != NULL) {
	//
	//delete repconftimezone;
	//repconftimezone = NULL;
	//}
	//if(repconflocale != NULL) {
	//
	//delete repconflocale;
	//repconflocale = NULL;
	//}
	//if(repconfsnapshots != NULL) {
	//
	//delete repconfsnapshots;
	//repconfsnapshots = NULL;
	//}
	//if(repconfrepdir != NULL) {
	//
	//delete repconfrepdir;
	//repconfrepdir = NULL;
	//}
	//if(repconfhourofday != NULL) {
	//
	//delete repconfhourofday;
	//repconfhourofday = NULL;
	//}
	//if(repconfminofhour != NULL) {
	//
	//delete repconfminofhour;
	//repconfminofhour = NULL;
	//}
	//if(repconfmaxrows != NULL) {
	//
	//delete repconfmaxrows;
	//repconfmaxrows = NULL;
	//}
	//if(repconffakedata != NULL) {
	//
	//delete repconffakedata;
	//repconffakedata = NULL;
	//}
	//if(repconfsnapshotuser != NULL) {
	//
	//delete repconfsnapshotuser;
	//repconfsnapshotuser = NULL;
	//}
	//if(repconfenforcesnapshotuser != NULL) {
	//
	//delete repconfenforcesnapshotuser;
	//repconfenforcesnapshotuser = NULL;
	//}
	//
}

void
ComDayCqReportingImplConfigServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *repconftimezoneKey = "repconf.timezone";
	node = json_object_get_member(pJsonObject, repconftimezoneKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&repconftimezone, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&repconftimezone);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repconflocaleKey = "repconf.locale";
	node = json_object_get_member(pJsonObject, repconflocaleKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&repconflocale, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&repconflocale);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repconfsnapshotsKey = "repconf.snapshots";
	node = json_object_get_member(pJsonObject, repconfsnapshotsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&repconfsnapshots, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&repconfsnapshots);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repconfrepdirKey = "repconf.repdir";
	node = json_object_get_member(pJsonObject, repconfrepdirKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&repconfrepdir, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&repconfrepdir);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repconfhourofdayKey = "repconf.hourofday";
	node = json_object_get_member(pJsonObject, repconfhourofdayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&repconfhourofday, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&repconfhourofday);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repconfminofhourKey = "repconf.minofhour";
	node = json_object_get_member(pJsonObject, repconfminofhourKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&repconfminofhour, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&repconfminofhour);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repconfmaxrowsKey = "repconf.maxrows";
	node = json_object_get_member(pJsonObject, repconfmaxrowsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&repconfmaxrows, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&repconfmaxrows);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repconffakedataKey = "repconf.fakedata";
	node = json_object_get_member(pJsonObject, repconffakedataKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&repconffakedata, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&repconffakedata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repconfsnapshotuserKey = "repconf.snapshotuser";
	node = json_object_get_member(pJsonObject, repconfsnapshotuserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&repconfsnapshotuser, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&repconfsnapshotuser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *repconfenforcesnapshotuserKey = "repconf.enforcesnapshotuser";
	node = json_object_get_member(pJsonObject, repconfenforcesnapshotuserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&repconfenforcesnapshotuser, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&repconfenforcesnapshotuser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqReportingImplConfigServiceImplProperties::ComDayCqReportingImplConfigServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqReportingImplConfigServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRepconftimezone();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRepconftimezone());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repconftimezoneKey = "repconf.timezone";
	json_object_set_member(pJsonObject, repconftimezoneKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRepconflocale();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRepconflocale());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repconflocaleKey = "repconf.locale";
	json_object_set_member(pJsonObject, repconflocaleKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRepconfsnapshots();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRepconfsnapshots());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repconfsnapshotsKey = "repconf.snapshots";
	json_object_set_member(pJsonObject, repconfsnapshotsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRepconfrepdir();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRepconfrepdir());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repconfrepdirKey = "repconf.repdir";
	json_object_set_member(pJsonObject, repconfrepdirKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRepconfhourofday();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRepconfhourofday());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repconfhourofdayKey = "repconf.hourofday";
	json_object_set_member(pJsonObject, repconfhourofdayKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRepconfminofhour();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRepconfminofhour());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repconfminofhourKey = "repconf.minofhour";
	json_object_set_member(pJsonObject, repconfminofhourKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getRepconfmaxrows();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getRepconfmaxrows());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repconfmaxrowsKey = "repconf.maxrows";
	json_object_set_member(pJsonObject, repconfmaxrowsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRepconffakedata();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRepconffakedata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repconffakedataKey = "repconf.fakedata";
	json_object_set_member(pJsonObject, repconffakedataKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRepconfsnapshotuser();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRepconfsnapshotuser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repconfsnapshotuserKey = "repconf.snapshotuser";
	json_object_set_member(pJsonObject, repconfsnapshotuserKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRepconfenforcesnapshotuser();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRepconfenforcesnapshotuser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *repconfenforcesnapshotuserKey = "repconf.enforcesnapshotuser";
	json_object_set_member(pJsonObject, repconfenforcesnapshotuserKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqReportingImplConfigServiceImplProperties::getRepconftimezone()
{
	return repconftimezone;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconftimezone(ConfigNodePropertyString  repconftimezone)
{
	this->repconftimezone = repconftimezone;
}

ConfigNodePropertyString
ComDayCqReportingImplConfigServiceImplProperties::getRepconflocale()
{
	return repconflocale;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconflocale(ConfigNodePropertyString  repconflocale)
{
	this->repconflocale = repconflocale;
}

ConfigNodePropertyString
ComDayCqReportingImplConfigServiceImplProperties::getRepconfsnapshots()
{
	return repconfsnapshots;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfsnapshots(ConfigNodePropertyString  repconfsnapshots)
{
	this->repconfsnapshots = repconfsnapshots;
}

ConfigNodePropertyString
ComDayCqReportingImplConfigServiceImplProperties::getRepconfrepdir()
{
	return repconfrepdir;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfrepdir(ConfigNodePropertyString  repconfrepdir)
{
	this->repconfrepdir = repconfrepdir;
}

ConfigNodePropertyInteger
ComDayCqReportingImplConfigServiceImplProperties::getRepconfhourofday()
{
	return repconfhourofday;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfhourofday(ConfigNodePropertyInteger  repconfhourofday)
{
	this->repconfhourofday = repconfhourofday;
}

ConfigNodePropertyInteger
ComDayCqReportingImplConfigServiceImplProperties::getRepconfminofhour()
{
	return repconfminofhour;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfminofhour(ConfigNodePropertyInteger  repconfminofhour)
{
	this->repconfminofhour = repconfminofhour;
}

ConfigNodePropertyInteger
ComDayCqReportingImplConfigServiceImplProperties::getRepconfmaxrows()
{
	return repconfmaxrows;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfmaxrows(ConfigNodePropertyInteger  repconfmaxrows)
{
	this->repconfmaxrows = repconfmaxrows;
}

ConfigNodePropertyBoolean
ComDayCqReportingImplConfigServiceImplProperties::getRepconffakedata()
{
	return repconffakedata;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconffakedata(ConfigNodePropertyBoolean  repconffakedata)
{
	this->repconffakedata = repconffakedata;
}

ConfigNodePropertyString
ComDayCqReportingImplConfigServiceImplProperties::getRepconfsnapshotuser()
{
	return repconfsnapshotuser;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfsnapshotuser(ConfigNodePropertyString  repconfsnapshotuser)
{
	this->repconfsnapshotuser = repconfsnapshotuser;
}

ConfigNodePropertyBoolean
ComDayCqReportingImplConfigServiceImplProperties::getRepconfenforcesnapshotuser()
{
	return repconfenforcesnapshotuser;
}

void
ComDayCqReportingImplConfigServiceImplProperties::setRepconfenforcesnapshotuser(ConfigNodePropertyBoolean  repconfenforcesnapshotuser)
{
	this->repconfenforcesnapshotuser = repconfenforcesnapshotuser;
}


