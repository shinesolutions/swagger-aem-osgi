
/*
 * ComDayCqReplicationImplReverseReplicatorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqReplicationImplReverseReplicatorProperties_H_
#define TINY_CPP_CLIENT_ComDayCqReplicationImplReverseReplicatorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqReplicationImplReverseReplicatorProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqReplicationImplReverseReplicatorProperties();
    ComDayCqReplicationImplReverseReplicatorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqReplicationImplReverseReplicatorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSchedulerperiod();

	/*! \brief Set 
	 */
	void setSchedulerperiod(ConfigNodePropertyInteger schedulerperiod);


    private:
    ConfigNodePropertyInteger schedulerperiod;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqReplicationImplReverseReplicatorProperties_H_ */
