/*
 * ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.h
 *
 * 
 */

#ifndef _ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties_H_
#define _ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties_H_


#include <string>
#include "ConfigNodePropertyDropDown.h"
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

class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties();
	ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTempStorageConfig();

	/*! \brief Set 
	 */
	void setTempStorageConfig(ConfigNodePropertyDropDown  tempStorageConfig);

private:
	ConfigNodePropertyDropDown tempStorageConfig;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties_H_ */
