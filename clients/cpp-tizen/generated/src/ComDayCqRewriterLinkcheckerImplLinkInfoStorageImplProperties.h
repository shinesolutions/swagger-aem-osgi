/*
 * ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties_H_
#define _ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties();
	ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServicemaxLinksPerHost();

	/*! \brief Set 
	 */
	void setServicemaxLinksPerHost(ConfigNodePropertyInteger  servicemax_links_per_host);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServicesaveExternalLinkReferences();

	/*! \brief Set 
	 */
	void setServicesaveExternalLinkReferences(ConfigNodePropertyBoolean  servicesave_external_link_references);

private:
	ConfigNodePropertyInteger servicemax_links_per_host;
	ConfigNodePropertyBoolean servicesave_external_link_references;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties_H_ */
