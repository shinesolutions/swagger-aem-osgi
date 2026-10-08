
/*
 * ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties();
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqcommercecataloggeneratorbucketsize();

	/*! \brief Set 
	 */
	void setCqcommercecataloggeneratorbucketsize(ConfigNodePropertyInteger cqcommercecataloggeneratorbucketsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcommercecataloggeneratorbucketname();

	/*! \brief Set 
	 */
	void setCqcommercecataloggeneratorbucketname(ConfigNodePropertyString cqcommercecataloggeneratorbucketname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqcommercecataloggeneratorexcludedtemplateproperties();

	/*! \brief Set 
	 */
	void setCqcommercecataloggeneratorexcludedtemplateproperties(ConfigNodePropertyArray cqcommercecataloggeneratorexcludedtemplateproperties);


    private:
    ConfigNodePropertyInteger cqcommercecataloggeneratorbucketsize;
    ConfigNodePropertyString cqcommercecataloggeneratorbucketname;
    ConfigNodePropertyArray cqcommercecataloggeneratorexcludedtemplateproperties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties_H_ */
