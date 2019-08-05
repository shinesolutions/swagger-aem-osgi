/*
 * ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties_H_
#define _ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties();
	ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqcommercecataloggeneratorbucketsize();

	/*! \brief Set 
	 */
	void setCqcommercecataloggeneratorbucketsize(ConfigNodePropertyInteger  cqcommercecataloggeneratorbucketsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcommercecataloggeneratorbucketname();

	/*! \brief Set 
	 */
	void setCqcommercecataloggeneratorbucketname(ConfigNodePropertyString  cqcommercecataloggeneratorbucketname);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqcommercecataloggeneratorexcludedtemplateproperties();

	/*! \brief Set 
	 */
	void setCqcommercecataloggeneratorexcludedtemplateproperties(ConfigNodePropertyArray  cqcommercecataloggeneratorexcludedtemplateproperties);

private:
	ConfigNodePropertyInteger cqcommercecataloggeneratorbucketsize;
	ConfigNodePropertyString cqcommercecataloggeneratorbucketname;
	ConfigNodePropertyArray cqcommercecataloggeneratorexcludedtemplateproperties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties_H_ */
