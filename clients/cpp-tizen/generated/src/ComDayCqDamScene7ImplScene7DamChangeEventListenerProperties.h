/*
 * ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties_H_
#define _ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties();
	ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamscene7damchangeeventlistenerenabled();

	/*! \brief Set 
	 */
	void setCqdamscene7damchangeeventlistenerenabled(ConfigNodePropertyBoolean  cqdamscene7damchangeeventlistenerenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdamscene7damchangeeventlistenerobservedpaths();

	/*! \brief Set 
	 */
	void setCqdamscene7damchangeeventlistenerobservedpaths(ConfigNodePropertyArray  cqdamscene7damchangeeventlistenerobservedpaths);

private:
	ConfigNodePropertyBoolean cqdamscene7damchangeeventlistenerenabled;
	ConfigNodePropertyArray cqdamscene7damchangeeventlistenerobservedpaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties_H_ */
