/*
 * ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties_H_
#define _ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties_H_


#include <string>
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

class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties();
	ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getForcelocation();

	/*! \brief Set 
	 */
	void setForcelocation(ConfigNodePropertyBoolean  forcelocation);

private:
	ConfigNodePropertyBoolean forcelocation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties_H_ */
