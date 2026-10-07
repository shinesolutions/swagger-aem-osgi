
/*
 * ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo();
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo_H_ */
