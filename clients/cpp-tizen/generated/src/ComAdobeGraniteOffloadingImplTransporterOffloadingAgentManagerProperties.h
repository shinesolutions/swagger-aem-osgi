/*
 * ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties.h
 *
 * 
 */

#ifndef _ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties_H_
#define _ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties_H_


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

class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties();
	ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOffloadingagentmanagerenabled();

	/*! \brief Set 
	 */
	void setOffloadingagentmanagerenabled(ConfigNodePropertyBoolean  offloadingagentmanagerenabled);

private:
	ConfigNodePropertyBoolean offloadingagentmanagerenabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties_H_ */
