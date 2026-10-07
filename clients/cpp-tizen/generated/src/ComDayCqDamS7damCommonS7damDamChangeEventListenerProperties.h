/*
 * ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties_H_
#define _ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties_H_


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

class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties();
	ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdams7damdamchangeeventlistenerenabled();

	/*! \brief Set 
	 */
	void setCqdams7damdamchangeeventlistenerenabled(ConfigNodePropertyBoolean  cqdams7damdamchangeeventlistenerenabled);

private:
	ConfigNodePropertyBoolean cqdams7damdamchangeeventlistenerenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties_H_ */
