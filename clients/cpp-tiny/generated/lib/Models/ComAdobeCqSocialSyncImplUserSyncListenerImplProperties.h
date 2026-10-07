
/*
 * ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplUserSyncListenerImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplUserSyncListenerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialSyncImplUserSyncListenerImplProperties();
    ComAdobeCqSocialSyncImplUserSyncListenerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialSyncImplUserSyncListenerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getNodetypes();

	/*! \brief Set 
	 */
	void setNodetypes(ConfigNodePropertyArray nodetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIgnorableprops();

	/*! \brief Set 
	 */
	void setIgnorableprops(ConfigNodePropertyArray ignorableprops);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIgnorablenodes();

	/*! \brief Set 
	 */
	void setIgnorablenodes(ConfigNodePropertyArray ignorablenodes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDistfolders();

	/*! \brief Set 
	 */
	void setDistfolders(ConfigNodePropertyArray distfolders);


    private:
    ConfigNodePropertyArray nodetypes;
    ConfigNodePropertyArray ignorableprops;
    ConfigNodePropertyArray ignorablenodes;
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyArray distfolders;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplUserSyncListenerImplProperties_H_ */
