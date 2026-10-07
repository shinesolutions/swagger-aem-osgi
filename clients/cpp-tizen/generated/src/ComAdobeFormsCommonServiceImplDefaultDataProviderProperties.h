/*
 * ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.h
 *
 * 
 */

#ifndef _ComAdobeFormsCommonServiceImplDefaultDataProviderProperties_H_
#define _ComAdobeFormsCommonServiceImplDefaultDataProviderProperties_H_


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

class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeFormsCommonServiceImplDefaultDataProviderProperties();
	ComAdobeFormsCommonServiceImplDefaultDataProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeFormsCommonServiceImplDefaultDataProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAlloweddataFileLocations();

	/*! \brief Set 
	 */
	void setAlloweddataFileLocations(ConfigNodePropertyArray  alloweddataFileLocations);

private:
	ConfigNodePropertyArray alloweddataFileLocations;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeFormsCommonServiceImplDefaultDataProviderProperties_H_ */
