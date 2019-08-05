/*
 * ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_
#define _ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_


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

class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties();
	ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqpagesupdatehandlerimageresourcetypes();

	/*! \brief Set 
	 */
	void setCqpagesupdatehandlerimageresourcetypes(ConfigNodePropertyArray  cqpagesupdatehandlerimageresourcetypes);

private:
	ConfigNodePropertyArray cqpagesupdatehandlerimageresourcetypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties_H_ */
