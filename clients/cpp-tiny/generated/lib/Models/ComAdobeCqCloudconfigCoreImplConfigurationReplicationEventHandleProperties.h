
/*
 * ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties();
    ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFlushagents();

	/*! \brief Set 
	 */
	void setFlushagents(ConfigNodePropertyArray flushagents);


    private:
    ConfigNodePropertyArray flushagents;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties_H_ */
