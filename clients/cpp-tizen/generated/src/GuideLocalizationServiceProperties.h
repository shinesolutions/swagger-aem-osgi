/*
 * GuideLocalizationServiceProperties.h
 *
 * 
 */

#ifndef _GuideLocalizationServiceProperties_H_
#define _GuideLocalizationServiceProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class GuideLocalizationServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	GuideLocalizationServiceProperties();
	GuideLocalizationServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GuideLocalizationServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSupportedLocales();

	/*! \brief Set 
	 */
	void setSupportedLocales(ConfigNodePropertyArray  supportedLocales);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getLocalizableProperties();

	/*! \brief Set 
	 */
	void setLocalizableProperties(ConfigNodePropertyArray  localizableProperties);

private:
	ConfigNodePropertyArray supportedLocales;
	ConfigNodePropertyArray localizableProperties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GuideLocalizationServiceProperties_H_ */
