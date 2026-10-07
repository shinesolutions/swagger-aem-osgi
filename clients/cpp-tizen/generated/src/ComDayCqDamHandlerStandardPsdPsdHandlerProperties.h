/*
 * ComDayCqDamHandlerStandardPsdPsdHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamHandlerStandardPsdPsdHandlerProperties_H_
#define _ComDayCqDamHandlerStandardPsdPsdHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyInteger.h"
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

class ComDayCqDamHandlerStandardPsdPsdHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamHandlerStandardPsdPsdHandlerProperties();
	ComDayCqDamHandlerStandardPsdPsdHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamHandlerStandardPsdPsdHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargeFileThreshold();

	/*! \brief Set 
	 */
	void setLargeFileThreshold(ConfigNodePropertyInteger  large_file_threshold);

private:
	ConfigNodePropertyInteger large_file_threshold;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamHandlerStandardPsdPsdHandlerProperties_H_ */
