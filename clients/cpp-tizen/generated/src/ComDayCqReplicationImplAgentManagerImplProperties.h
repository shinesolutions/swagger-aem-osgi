/*
 * ComDayCqReplicationImplAgentManagerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqReplicationImplAgentManagerImplProperties_H_
#define _ComDayCqReplicationImplAgentManagerImplProperties_H_


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

class ComDayCqReplicationImplAgentManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationImplAgentManagerImplProperties();
	ComDayCqReplicationImplAgentManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationImplAgentManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJobtopics();

	/*! \brief Set 
	 */
	void setJobtopics(ConfigNodePropertyString  jobtopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceUsertarget();

	/*! \brief Set 
	 */
	void setServiceUsertarget(ConfigNodePropertyString  serviceUsertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAgentProvidertarget();

	/*! \brief Set 
	 */
	void setAgentProvidertarget(ConfigNodePropertyString  agentProvidertarget);

private:
	ConfigNodePropertyString jobtopics;
	ConfigNodePropertyString serviceUsertarget;
	ConfigNodePropertyString agentProvidertarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationImplAgentManagerImplProperties_H_ */
