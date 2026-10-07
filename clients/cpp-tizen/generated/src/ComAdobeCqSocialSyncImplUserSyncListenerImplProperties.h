/*
 * ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialSyncImplUserSyncListenerImplProperties_H_
#define _ComAdobeCqSocialSyncImplUserSyncListenerImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialSyncImplUserSyncListenerImplProperties();
	ComAdobeCqSocialSyncImplUserSyncListenerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialSyncImplUserSyncListenerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getNodetypes();

	/*! \brief Set 
	 */
	void setNodetypes(ConfigNodePropertyArray  nodetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIgnorableprops();

	/*! \brief Set 
	 */
	void setIgnorableprops(ConfigNodePropertyArray  ignorableprops);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIgnorablenodes();

	/*! \brief Set 
	 */
	void setIgnorablenodes(ConfigNodePropertyArray  ignorablenodes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDistfolders();

	/*! \brief Set 
	 */
	void setDistfolders(ConfigNodePropertyArray  distfolders);

private:
	ConfigNodePropertyArray nodetypes;
	ConfigNodePropertyArray ignorableprops;
	ConfigNodePropertyArray ignorablenodes;
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyArray distfolders;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialSyncImplUserSyncListenerImplProperties_H_ */
