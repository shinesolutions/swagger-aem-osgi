/*
 * ComDayCqReplicationImplTransportHttpProperties.h
 *
 * 
 */

#ifndef _ComDayCqReplicationImplTransportHttpProperties_H_
#define _ComDayCqReplicationImplTransportHttpProperties_H_


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

class ComDayCqReplicationImplTransportHttpProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationImplTransportHttpProperties();
	ComDayCqReplicationImplTransportHttpProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationImplTransportHttpProperties();

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

#endif /* _ComDayCqReplicationImplTransportHttpProperties_H_ */
