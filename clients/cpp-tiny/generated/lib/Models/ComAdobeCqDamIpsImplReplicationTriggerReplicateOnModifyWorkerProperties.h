
/*
 * ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties();
    ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDmreplicateonmodifyenabled();

	/*! \brief Set 
	 */
	void setDmreplicateonmodifyenabled(ConfigNodePropertyBoolean dmreplicateonmodifyenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDmreplicateonmodifyforcesyncdeletes();

	/*! \brief Set 
	 */
	void setDmreplicateonmodifyforcesyncdeletes(ConfigNodePropertyBoolean dmreplicateonmodifyforcesyncdeletes);


    private:
    ConfigNodePropertyBoolean dmreplicateonmodifyenabled;
    ConfigNodePropertyBoolean dmreplicateonmodifyforcesyncdeletes;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties_H_ */
