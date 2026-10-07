

#include "ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties()
{
	jmxobjectname = ConfigNodePropertyString();
	propertymeasureenabled = ConfigNodePropertyBoolean();
	propertyname = ConfigNodePropertyString();
	propertymaxwaitms = ConfigNodePropertyInteger();
	propertymaxrate = ConfigNodePropertyFloat();
	fulltextmeasureenabled = ConfigNodePropertyBoolean();
	fulltextname = ConfigNodePropertyString();
	fulltextmaxwaitms = ConfigNodePropertyInteger();
	fulltextmaxrate = ConfigNodePropertyFloat();
}

ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::~ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties()
{

}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *jmxobjectnameKey = "jmx.objectname";

    if(object.has_key(jmxobjectnameKey))
    {
        bourne::json value = object[jmxobjectnameKey];




        ConfigNodePropertyString* obj = &jmxobjectname;
		obj->fromJson(value.dump());

    }

    const char *propertymeasureenabledKey = "property.measure.enabled";

    if(object.has_key(propertymeasureenabledKey))
    {
        bourne::json value = object[propertymeasureenabledKey];




        ConfigNodePropertyBoolean* obj = &propertymeasureenabled;
		obj->fromJson(value.dump());

    }

    const char *propertynameKey = "property.name";

    if(object.has_key(propertynameKey))
    {
        bourne::json value = object[propertynameKey];




        ConfigNodePropertyString* obj = &propertyname;
		obj->fromJson(value.dump());

    }

    const char *propertymaxwaitmsKey = "property.max.wait.ms";

    if(object.has_key(propertymaxwaitmsKey))
    {
        bourne::json value = object[propertymaxwaitmsKey];




        ConfigNodePropertyInteger* obj = &propertymaxwaitms;
		obj->fromJson(value.dump());

    }

    const char *propertymaxrateKey = "property.max.rate";

    if(object.has_key(propertymaxrateKey))
    {
        bourne::json value = object[propertymaxrateKey];




        ConfigNodePropertyFloat* obj = &propertymaxrate;
		obj->fromJson(value.dump());

    }

    const char *fulltextmeasureenabledKey = "fulltext.measure.enabled";

    if(object.has_key(fulltextmeasureenabledKey))
    {
        bourne::json value = object[fulltextmeasureenabledKey];




        ConfigNodePropertyBoolean* obj = &fulltextmeasureenabled;
		obj->fromJson(value.dump());

    }

    const char *fulltextnameKey = "fulltext.name";

    if(object.has_key(fulltextnameKey))
    {
        bourne::json value = object[fulltextnameKey];




        ConfigNodePropertyString* obj = &fulltextname;
		obj->fromJson(value.dump());

    }

    const char *fulltextmaxwaitmsKey = "fulltext.max.wait.ms";

    if(object.has_key(fulltextmaxwaitmsKey))
    {
        bourne::json value = object[fulltextmaxwaitmsKey];




        ConfigNodePropertyInteger* obj = &fulltextmaxwaitms;
		obj->fromJson(value.dump());

    }

    const char *fulltextmaxrateKey = "fulltext.max.rate";

    if(object.has_key(fulltextmaxrateKey))
    {
        bourne::json value = object[fulltextmaxrateKey];




        ConfigNodePropertyFloat* obj = &fulltextmaxrate;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["jmxobjectname"] = getJmxobjectname().toJson();






	object["propertymeasureenabled"] = getPropertymeasureenabled().toJson();






	object["propertyname"] = getPropertyname().toJson();






	object["propertymaxwaitms"] = getPropertymaxwaitms().toJson();






	object["propertymaxrate"] = getPropertymaxrate().toJson();






	object["fulltextmeasureenabled"] = getFulltextmeasureenabled().toJson();






	object["fulltextname"] = getFulltextname().toJson();






	object["fulltextmaxwaitms"] = getFulltextmaxwaitms().toJson();






	object["fulltextmaxrate"] = getFulltextmaxrate().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getJmxobjectname()
{
	return jmxobjectname;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setJmxobjectname(ConfigNodePropertyString jmxobjectname)
{
	this->jmxobjectname = jmxobjectname;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getPropertymeasureenabled()
{
	return propertymeasureenabled;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setPropertymeasureenabled(ConfigNodePropertyBoolean propertymeasureenabled)
{
	this->propertymeasureenabled = propertymeasureenabled;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getPropertyname()
{
	return propertyname;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setPropertyname(ConfigNodePropertyString propertyname)
{
	this->propertyname = propertyname;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getPropertymaxwaitms()
{
	return propertymaxwaitms;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setPropertymaxwaitms(ConfigNodePropertyInteger propertymaxwaitms)
{
	this->propertymaxwaitms = propertymaxwaitms;
}

ConfigNodePropertyFloat
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getPropertymaxrate()
{
	return propertymaxrate;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setPropertymaxrate(ConfigNodePropertyFloat propertymaxrate)
{
	this->propertymaxrate = propertymaxrate;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getFulltextmeasureenabled()
{
	return fulltextmeasureenabled;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setFulltextmeasureenabled(ConfigNodePropertyBoolean fulltextmeasureenabled)
{
	this->fulltextmeasureenabled = fulltextmeasureenabled;
}

ConfigNodePropertyString
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getFulltextname()
{
	return fulltextname;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setFulltextname(ConfigNodePropertyString fulltextname)
{
	this->fulltextname = fulltextname;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getFulltextmaxwaitms()
{
	return fulltextmaxwaitms;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setFulltextmaxwaitms(ConfigNodePropertyInteger fulltextmaxwaitms)
{
	this->fulltextmaxwaitms = fulltextmaxwaitms;
}

ConfigNodePropertyFloat
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::getFulltextmaxrate()
{
	return fulltextmaxrate;
}

void
ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties::setFulltextmaxrate(ConfigNodePropertyFloat fulltextmaxrate)
{
	this->fulltextmaxrate = fulltextmaxrate;
}



