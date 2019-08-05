/*
 * ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties_H_
#define _ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties_H_


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

class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties();
	ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties();

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

#endif /* _ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties_H_ */
