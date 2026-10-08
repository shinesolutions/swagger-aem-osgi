
/*
 * ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties();
    ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServicemaxLinksPerHost();

	/*! \brief Set 
	 */
	void setServicemaxLinksPerHost(ConfigNodePropertyInteger servicemax_links_per_host);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServicesaveExternalLinkReferences();

	/*! \brief Set 
	 */
	void setServicesaveExternalLinkReferences(ConfigNodePropertyBoolean servicesave_external_link_references);


    private:
    ConfigNodePropertyInteger servicemax_links_per_host;
    ConfigNodePropertyBoolean servicesave_external_link_references;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties_H_ */
