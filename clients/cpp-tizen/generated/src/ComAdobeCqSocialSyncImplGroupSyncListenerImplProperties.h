/*
 * ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties_H_
#define _ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties();
	ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties();

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
	ConfigNodePropertyString getIgnorablenodes();

	/*! \brief Set 
	 */
	void setIgnorablenodes(ConfigNodePropertyString  ignorablenodes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getDistfolders();

	/*! \brief Set 
	 */
	void setDistfolders(ConfigNodePropertyString  distfolders);

private:
	ConfigNodePropertyArray nodetypes;
	ConfigNodePropertyArray ignorableprops;
	ConfigNodePropertyString ignorablenodes;
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyString distfolders;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties_H_ */
