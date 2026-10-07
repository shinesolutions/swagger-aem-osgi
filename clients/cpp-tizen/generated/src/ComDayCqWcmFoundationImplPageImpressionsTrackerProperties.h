/*
 * ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmFoundationImplPageImpressionsTrackerProperties_H_
#define _ComDayCqWcmFoundationImplPageImpressionsTrackerProperties_H_


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

class ComDayCqWcmFoundationImplPageImpressionsTrackerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmFoundationImplPageImpressionsTrackerProperties();
	ComDayCqWcmFoundationImplPageImpressionsTrackerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmFoundationImplPageImpressionsTrackerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingauthrequirements();

	/*! \brief Set 
	 */
	void setSlingauthrequirements(ConfigNodePropertyString  slingauthrequirements);

private:
	ConfigNodePropertyString slingauthrequirements;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmFoundationImplPageImpressionsTrackerProperties_H_ */
