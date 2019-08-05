/*
 * ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties_H_
#define _ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties_H_


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

class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties();
	ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDisabledciphersuites();

	/*! \brief Set 
	 */
	void setDisabledciphersuites(ConfigNodePropertyArray  disabledciphersuites);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getEnabledciphersuites();

	/*! \brief Set 
	 */
	void setEnabledciphersuites(ConfigNodePropertyArray  enabledciphersuites);

private:
	ConfigNodePropertyArray disabledciphersuites;
	ConfigNodePropertyArray enabledciphersuites;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties_H_ */
