
/*
 * ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties();
    ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties();


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
	ConfigNodePropertyString getIgnorablenodes();

	/*! \brief Set 
	 */
	void setIgnorablenodes(ConfigNodePropertyString ignorablenodes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDistfolders();

	/*! \brief Set 
	 */
	void setDistfolders(ConfigNodePropertyString distfolders);


    private:
    ConfigNodePropertyArray nodetypes;
    ConfigNodePropertyArray ignorableprops;
    ConfigNodePropertyString ignorablenodes;
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyString distfolders;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties_H_ */
