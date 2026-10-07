/*
 * ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties_H_
#define _ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties();
	ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProcesslabel();

	/*! \brief Set 
	 */
	void setProcesslabel(ConfigNodePropertyString  processlabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getExtractpages();

	/*! \brief Set 
	 */
	void setExtractpages(ConfigNodePropertyBoolean  extractpages);

private:
	ConfigNodePropertyString processlabel;
	ConfigNodePropertyBoolean extractpages;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties_H_ */
