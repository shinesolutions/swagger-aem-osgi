

#include "ComDayCqWidgetImplWidgetExtensionProviderImplProperties.h"

using namespace Tiny;

ComDayCqWidgetImplWidgetExtensionProviderImplProperties::ComDayCqWidgetImplWidgetExtensionProviderImplProperties()
{
	extendablewidgets = ConfigNodePropertyArray();
	widgetextensionproviderdebug = ConfigNodePropertyBoolean();
}

ComDayCqWidgetImplWidgetExtensionProviderImplProperties::ComDayCqWidgetImplWidgetExtensionProviderImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWidgetImplWidgetExtensionProviderImplProperties::~ComDayCqWidgetImplWidgetExtensionProviderImplProperties()
{

}

void
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *extendablewidgetsKey = "extendable.widgets";

    if(object.has_key(extendablewidgetsKey))
    {
        bourne::json value = object[extendablewidgetsKey];




        ConfigNodePropertyArray* obj = &extendablewidgets;
		obj->fromJson(value.dump());

    }

    const char *widgetextensionproviderdebugKey = "widgetextensionprovider.debug";

    if(object.has_key(widgetextensionproviderdebugKey))
    {
        bourne::json value = object[widgetextensionproviderdebugKey];




        ConfigNodePropertyBoolean* obj = &widgetextensionproviderdebug;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["extendablewidgets"] = getExtendablewidgets().toJson();






	object["widgetextensionproviderdebug"] = getWidgetextensionproviderdebug().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::getExtendablewidgets()
{
	return extendablewidgets;
}

void
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::setExtendablewidgets(ConfigNodePropertyArray extendablewidgets)
{
	this->extendablewidgets = extendablewidgets;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::getWidgetextensionproviderdebug()
{
	return widgetextensionproviderdebug;
}

void
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::setWidgetextensionproviderdebug(ConfigNodePropertyBoolean widgetextensionproviderdebug)
{
	this->widgetextensionproviderdebug = widgetextensionproviderdebug;
}



