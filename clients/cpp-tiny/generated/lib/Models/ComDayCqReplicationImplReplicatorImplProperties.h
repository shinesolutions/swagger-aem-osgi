
/*
 * ComDayCqReplicationImplReplicatorImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReplicationImplReplicatorImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReplicationImplReplicatorImplProperties_H_


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

class ComDayCqReplicationImplReplicatorImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReplicationImplReplicatorImplProperties();
    ComDayCqReplicationImplReplicatorImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReplicationImplReplicatorImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDistributeEvents();

	/*! \brief Set 
	 */
	void setDistributeEvents(ConfigNodePropertyBoolean distribute_events);


    private:
    ConfigNodePropertyBoolean distribute_events;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReplicationImplReplicatorImplProperties_H_ */
