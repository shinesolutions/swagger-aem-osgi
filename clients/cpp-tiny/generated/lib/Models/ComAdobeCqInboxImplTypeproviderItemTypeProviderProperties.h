
/*
 * ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties();
    ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getInboximpltypeproviderregistrypaths();

	/*! \brief Set 
	 */
	void setInboximpltypeproviderregistrypaths(ConfigNodePropertyArray inboximpltypeproviderregistrypaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getInboximpltypeproviderlegacypaths();

	/*! \brief Set 
	 */
	void setInboximpltypeproviderlegacypaths(ConfigNodePropertyArray inboximpltypeproviderlegacypaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getInboximpltypeproviderdefaulturlfailureitem();

	/*! \brief Set 
	 */
	void setInboximpltypeproviderdefaulturlfailureitem(ConfigNodePropertyString inboximpltypeproviderdefaulturlfailureitem);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getInboximpltypeproviderdefaulturlworkitem();

	/*! \brief Set 
	 */
	void setInboximpltypeproviderdefaulturlworkitem(ConfigNodePropertyString inboximpltypeproviderdefaulturlworkitem);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getInboximpltypeproviderdefaulturltask();

	/*! \brief Set 
	 */
	void setInboximpltypeproviderdefaulturltask(ConfigNodePropertyString inboximpltypeproviderdefaulturltask);


    private:
    ConfigNodePropertyArray inboximpltypeproviderregistrypaths;
    ConfigNodePropertyArray inboximpltypeproviderlegacypaths;
    ConfigNodePropertyString inboximpltypeproviderdefaulturlfailureitem;
    ConfigNodePropertyString inboximpltypeproviderdefaulturlworkitem;
    ConfigNodePropertyString inboximpltypeproviderdefaulturltask;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties_H_ */
