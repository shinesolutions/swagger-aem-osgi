/*
 * ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties_H_
#define _ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties_H_


#include <string>
#include "ConfigNodePropertyString.h"
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

class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties();
	ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultConnectorName();

	/*! \brief Set 
	 */
	void setDefaultConnectorName(ConfigNodePropertyString  defaultConnectorName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDefaultCategory();

	/*! \brief Set 
	 */
	void setDefaultCategory(ConfigNodePropertyString  defaultCategory);

private:
	ConfigNodePropertyString defaultConnectorName;
	ConfigNodePropertyString defaultCategory;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties_H_ */
