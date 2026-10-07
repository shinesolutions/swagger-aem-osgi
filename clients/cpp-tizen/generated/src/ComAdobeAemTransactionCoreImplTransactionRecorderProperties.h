/*
 * ComAdobeAemTransactionCoreImplTransactionRecorderProperties.h
 *
 * 
 */

#ifndef _ComAdobeAemTransactionCoreImplTransactionRecorderProperties_H_
#define _ComAdobeAemTransactionCoreImplTransactionRecorderProperties_H_


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

class ComAdobeAemTransactionCoreImplTransactionRecorderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeAemTransactionCoreImplTransactionRecorderProperties();
	ComAdobeAemTransactionCoreImplTransactionRecorderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeAemTransactionCoreImplTransactionRecorderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIsTransactionRecordingEnabled();

	/*! \brief Set 
	 */
	void setIsTransactionRecordingEnabled(ConfigNodePropertyBoolean  isTransactionRecordingEnabled);

private:
	ConfigNodePropertyBoolean isTransactionRecordingEnabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeAemTransactionCoreImplTransactionRecorderProperties_H_ */
