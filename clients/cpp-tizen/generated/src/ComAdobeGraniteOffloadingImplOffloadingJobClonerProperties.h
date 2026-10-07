/*
 * ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties_H_
#define _ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties_H_


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

class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties();
	ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOffloadingjobclonerenabled();

	/*! \brief Set 
	 */
	void setOffloadingjobclonerenabled(ConfigNodePropertyBoolean  offloadingjobclonerenabled);

private:
	ConfigNodePropertyBoolean offloadingjobclonerenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties_H_ */
