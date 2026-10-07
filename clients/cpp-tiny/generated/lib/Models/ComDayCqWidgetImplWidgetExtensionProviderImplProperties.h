
/*
 * ComDayCqWidgetImplWidgetExtensionProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWidgetImplWidgetExtensionProviderImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWidgetImplWidgetExtensionProviderImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWidgetImplWidgetExtensionProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWidgetImplWidgetExtensionProviderImplProperties();
    ComDayCqWidgetImplWidgetExtensionProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWidgetImplWidgetExtensionProviderImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExtendablewidgets();

	/*! \brief Set 
	 */
	void setExtendablewidgets(ConfigNodePropertyArray extendablewidgets);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getWidgetextensionproviderdebug();

	/*! \brief Set 
	 */
	void setWidgetextensionproviderdebug(ConfigNodePropertyBoolean widgetextensionproviderdebug);


    private:
    ConfigNodePropertyArray extendablewidgets;
    ConfigNodePropertyBoolean widgetextensionproviderdebug;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWidgetImplWidgetExtensionProviderImplProperties_H_ */
