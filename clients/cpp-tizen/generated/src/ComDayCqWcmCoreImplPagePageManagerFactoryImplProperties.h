/*
 * ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties_H_
#define _ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties();
	ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getIllegalCharMapping();

	/*! \brief Set 
	 */
	void setIllegalCharMapping(ConfigNodePropertyString  illegalCharMapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPageSubTreeActivationCheck();

	/*! \brief Set 
	 */
	void setPageSubTreeActivationCheck(ConfigNodePropertyBoolean  pageSubTreeActivationCheck);

private:
	ConfigNodePropertyString illegalCharMapping;
	ConfigNodePropertyBoolean pageSubTreeActivationCheck;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties_H_ */
