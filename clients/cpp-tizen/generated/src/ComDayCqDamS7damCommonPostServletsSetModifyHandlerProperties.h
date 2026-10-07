/*
 * ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties_H_
#define _ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties_H_


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

class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties();
	ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingpostoperation();

	/*! \brief Set 
	 */
	void setSlingpostoperation(ConfigNodePropertyString  slingpostoperation);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyString  slingservletmethods);

private:
	ConfigNodePropertyString slingpostoperation;
	ConfigNodePropertyString slingservletmethods;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties_H_ */
