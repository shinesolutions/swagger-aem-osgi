/*
 * ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties_H_
#define _ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties_H_


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

class ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties();
	ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAdaptsupportedwidths();

	/*! \brief Set 
	 */
	void setAdaptsupportedwidths(ConfigNodePropertyArray  adaptsupportedwidths);

private:
	ConfigNodePropertyArray adaptsupportedwidths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties_H_ */
