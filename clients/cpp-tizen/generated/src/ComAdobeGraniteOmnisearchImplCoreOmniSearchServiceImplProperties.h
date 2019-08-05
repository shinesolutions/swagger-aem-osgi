/*
 * ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties_H_
#define _ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties();
	ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getOmnisearchsuggestionrequiretextmin();

	/*! \brief Set 
	 */
	void setOmnisearchsuggestionrequiretextmin(ConfigNodePropertyInteger  omnisearchsuggestionrequiretextmin);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOmnisearchsuggestionspellcheckrequire();

	/*! \brief Set 
	 */
	void setOmnisearchsuggestionspellcheckrequire(ConfigNodePropertyBoolean  omnisearchsuggestionspellcheckrequire);

private:
	ConfigNodePropertyInteger omnisearchsuggestionrequiretextmin;
	ConfigNodePropertyBoolean omnisearchsuggestionspellcheckrequire;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties_H_ */
