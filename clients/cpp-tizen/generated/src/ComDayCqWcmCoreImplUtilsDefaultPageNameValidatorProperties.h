/*
 * ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties_H_
#define _ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties_H_


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

class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties();
	ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getNonValidChars();

	/*! \brief Set 
	 */
	void setNonValidChars(ConfigNodePropertyString  nonValidChars);

private:
	ConfigNodePropertyString nonValidChars;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties_H_ */
