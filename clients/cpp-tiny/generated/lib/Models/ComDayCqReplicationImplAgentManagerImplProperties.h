
/*
 * ComDayCqReplicationImplAgentManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReplicationImplAgentManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReplicationImplAgentManagerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqReplicationImplAgentManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReplicationImplAgentManagerImplProperties();
    ComDayCqReplicationImplAgentManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReplicationImplAgentManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getJobtopics();

	/*! \brief Set 
	 */
	void setJobtopics(ConfigNodePropertyString jobtopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getServiceUsertarget();

	/*! \brief Set 
	 */
	void setServiceUsertarget(ConfigNodePropertyString serviceUsertarget);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAgentProvidertarget();

	/*! \brief Set 
	 */
	void setAgentProvidertarget(ConfigNodePropertyString agentProvidertarget);


    private:
    ConfigNodePropertyString jobtopics;
    ConfigNodePropertyString serviceUsertarget;
    ConfigNodePropertyString agentProvidertarget;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReplicationImplAgentManagerImplProperties_H_ */
