/*
 * ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties_H_
#define _ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties_H_


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

class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties();
	ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqsearchpromoteconfighandlerenabled();

	/*! \brief Set 
	 */
	void setCqsearchpromoteconfighandlerenabled(ConfigNodePropertyBoolean  cqsearchpromoteconfighandlerenabled);

private:
	ConfigNodePropertyBoolean cqsearchpromoteconfighandlerenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties_H_ */
