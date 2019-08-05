/*
 * ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties_H_
#define _ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties_H_


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

class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties();
	ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthoringUIModeServicedefault();

	/*! \brief Set 
	 */
	void setAuthoringUIModeServicedefault(ConfigNodePropertyString  authoringUIModeServicedefault);

private:
	ConfigNodePropertyString authoringUIModeServicedefault;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties_H_ */
