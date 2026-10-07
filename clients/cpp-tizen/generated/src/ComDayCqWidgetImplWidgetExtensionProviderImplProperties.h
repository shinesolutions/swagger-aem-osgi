/*
 * ComDayCqWidgetImplWidgetExtensionProviderImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWidgetImplWidgetExtensionProviderImplProperties_H_
#define _ComDayCqWidgetImplWidgetExtensionProviderImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWidgetImplWidgetExtensionProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWidgetImplWidgetExtensionProviderImplProperties();
	ComDayCqWidgetImplWidgetExtensionProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWidgetImplWidgetExtensionProviderImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExtendablewidgets();

	/*! \brief Set 
	 */
	void setExtendablewidgets(ConfigNodePropertyArray  extendablewidgets);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getWidgetextensionproviderdebug();

	/*! \brief Set 
	 */
	void setWidgetextensionproviderdebug(ConfigNodePropertyBoolean  widgetextensionproviderdebug);

private:
	ConfigNodePropertyArray extendablewidgets;
	ConfigNodePropertyBoolean widgetextensionproviderdebug;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWidgetImplWidgetExtensionProviderImplProperties_H_ */
