/*
 * ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties_H_
#define _ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties();
	ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getInboximpltypeproviderregistrypaths();

	/*! \brief Set 
	 */
	void setInboximpltypeproviderregistrypaths(ConfigNodePropertyArray  inboximpltypeproviderregistrypaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getInboximpltypeproviderlegacypaths();

	/*! \brief Set 
	 */
	void setInboximpltypeproviderlegacypaths(ConfigNodePropertyArray  inboximpltypeproviderlegacypaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getInboximpltypeproviderdefaulturlfailureitem();

	/*! \brief Set 
	 */
	void setInboximpltypeproviderdefaulturlfailureitem(ConfigNodePropertyString  inboximpltypeproviderdefaulturlfailureitem);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getInboximpltypeproviderdefaulturlworkitem();

	/*! \brief Set 
	 */
	void setInboximpltypeproviderdefaulturlworkitem(ConfigNodePropertyString  inboximpltypeproviderdefaulturlworkitem);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getInboximpltypeproviderdefaulturltask();

	/*! \brief Set 
	 */
	void setInboximpltypeproviderdefaulturltask(ConfigNodePropertyString  inboximpltypeproviderdefaulturltask);

private:
	ConfigNodePropertyArray inboximpltypeproviderregistrypaths;
	ConfigNodePropertyArray inboximpltypeproviderlegacypaths;
	ConfigNodePropertyString inboximpltypeproviderdefaulturlfailureitem;
	ConfigNodePropertyString inboximpltypeproviderdefaulturlworkitem;
	ConfigNodePropertyString inboximpltypeproviderdefaulturltask;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties_H_ */
