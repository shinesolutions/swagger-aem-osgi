/*
 * ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties_H_
#define _ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties_H_


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

class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties();
	ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOffloadingoffloaderenabled();

	/*! \brief Set 
	 */
	void setOffloadingoffloaderenabled(ConfigNodePropertyBoolean  offloadingoffloaderenabled);

private:
	ConfigNodePropertyBoolean offloadingoffloaderenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties_H_ */
