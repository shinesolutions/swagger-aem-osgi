/*
 * ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplCommandsWCMCommandServletProperties_H_
#define _ComDayCqWcmCoreImplCommandsWCMCommandServletProperties_H_


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

class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplCommandsWCMCommandServletProperties();
	ComDayCqWcmCoreImplCommandsWCMCommandServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplCommandsWCMCommandServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getWcmcommandservletdeleteWhitelist();

	/*! \brief Set 
	 */
	void setWcmcommandservletdeleteWhitelist(ConfigNodePropertyArray  wcmcommandservletdelete_whitelist);

private:
	ConfigNodePropertyArray wcmcommandservletdelete_whitelist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplCommandsWCMCommandServletProperties_H_ */
