
/*
 * ComAdobeCqSocialSrpImplSocialSolrConnectorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialSrpImplSocialSolrConnectorProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialSrpImplSocialSolrConnectorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialSrpImplSocialSolrConnectorProperties();
    ComAdobeCqSocialSrpImplSocialSolrConnectorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialSrpImplSocialSolrConnectorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSrptype();

	/*! \brief Set 
	 */
	void setSrptype(ConfigNodePropertyString srptype);


    private:
    ConfigNodePropertyString srptype;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialSrpImplSocialSolrConnectorProperties_H_ */
