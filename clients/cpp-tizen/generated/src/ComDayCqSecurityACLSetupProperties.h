/*
 * ComDayCqSecurityACLSetupProperties.h
 *
 * 
 */

#ifndef _ComDayCqSecurityACLSetupProperties_H_
#define _ComDayCqSecurityACLSetupProperties_H_


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

class ComDayCqSecurityACLSetupProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqSecurityACLSetupProperties();
	ComDayCqSecurityACLSetupProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqSecurityACLSetupProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqaclsetuprules();

	/*! \brief Set 
	 */
	void setCqaclsetuprules(ConfigNodePropertyArray  cqaclsetuprules);

private:
	ConfigNodePropertyArray cqaclsetuprules;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqSecurityACLSetupProperties_H_ */
