/*
 * ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties_H_
#define _ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties_H_


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

class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties();
	ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamscene7configurationeventlistenerenabled();

	/*! \brief Set 
	 */
	void setCqdamscene7configurationeventlistenerenabled(ConfigNodePropertyBoolean  cqdamscene7configurationeventlistenerenabled);

private:
	ConfigNodePropertyBoolean cqdamscene7configurationeventlistenerenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties_H_ */
