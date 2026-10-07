

#include "ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.h"

using namespace Tiny;

ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties()
{
	deviceinfotransformerenabled = ConfigNodePropertyBoolean();
	deviceinfotransformercssstyle = ConfigNodePropertyString();
}

ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::~ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties()
{

}

void
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *deviceinfotransformerenabledKey = "device.info.transformer.enabled";

    if(object.has_key(deviceinfotransformerenabledKey))
    {
        bourne::json value = object[deviceinfotransformerenabledKey];




        ConfigNodePropertyBoolean* obj = &deviceinfotransformerenabled;
		obj->fromJson(value.dump());

    }

    const char *deviceinfotransformercssstyleKey = "device.info.transformer.css.style";

    if(object.has_key(deviceinfotransformercssstyleKey))
    {
        bourne::json value = object[deviceinfotransformercssstyleKey];




        ConfigNodePropertyString* obj = &deviceinfotransformercssstyle;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["deviceinfotransformerenabled"] = getDeviceinfotransformerenabled().toJson();






	object["deviceinfotransformercssstyle"] = getDeviceinfotransformercssstyle().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::getDeviceinfotransformerenabled()
{
	return deviceinfotransformerenabled;
}

void
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::setDeviceinfotransformerenabled(ConfigNodePropertyBoolean deviceinfotransformerenabled)
{
	this->deviceinfotransformerenabled = deviceinfotransformerenabled;
}

ConfigNodePropertyString
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::getDeviceinfotransformercssstyle()
{
	return deviceinfotransformercssstyle;
}

void
ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties::setDeviceinfotransformercssstyle(ConfigNodePropertyString deviceinfotransformercssstyle)
{
	this->deviceinfotransformercssstyle = deviceinfotransformercssstyle;
}



