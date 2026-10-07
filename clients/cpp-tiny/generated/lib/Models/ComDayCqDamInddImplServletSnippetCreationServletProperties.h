
/*
 * ComDayCqDamInddImplServletSnippetCreationServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamInddImplServletSnippetCreationServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamInddImplServletSnippetCreationServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamInddImplServletSnippetCreationServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamInddImplServletSnippetCreationServletProperties();
    ComDayCqDamInddImplServletSnippetCreationServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamInddImplServletSnippetCreationServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSnippetcreationmaxcollections();

	/*! \brief Set 
	 */
	void setSnippetcreationmaxcollections(ConfigNodePropertyInteger snippetcreationmaxcollections);


    private:
    ConfigNodePropertyInteger snippetcreationmaxcollections;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamInddImplServletSnippetCreationServletProperties_H_ */
