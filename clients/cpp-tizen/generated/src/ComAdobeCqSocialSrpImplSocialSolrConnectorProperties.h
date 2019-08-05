/*
 * ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialSrpImplSocialSolrConnectorProperties_H_
#define _ComAdobeCqSocialSrpImplSocialSolrConnectorProperties_H_


#include <string>
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

class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialSrpImplSocialSolrConnectorProperties();
	ComAdobeCqSocialSrpImplSocialSolrConnectorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialSrpImplSocialSolrConnectorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSrptype();

	/*! \brief Set 
	 */
	void setSrptype(ConfigNodePropertyString  srptype);

private:
	ConfigNodePropertyString srptype;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialSrpImplSocialSolrConnectorProperties_H_ */
