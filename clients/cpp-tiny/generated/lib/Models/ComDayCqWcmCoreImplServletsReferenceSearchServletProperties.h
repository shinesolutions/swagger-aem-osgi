
/*
 * ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsReferenceSearchServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsReferenceSearchServletProperties_H_


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

class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplServletsReferenceSearchServletProperties();
    ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplServletsReferenceSearchServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReferencesearchservletmaxReferencesPerPage();

	/*! \brief Set 
	 */
	void setReferencesearchservletmaxReferencesPerPage(ConfigNodePropertyInteger referencesearchservletmaxReferencesPerPage);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getReferencesearchservletmaxPages();

	/*! \brief Set 
	 */
	void setReferencesearchservletmaxPages(ConfigNodePropertyInteger referencesearchservletmaxPages);


    private:
    ConfigNodePropertyInteger referencesearchservletmaxReferencesPerPage;
    ConfigNodePropertyInteger referencesearchservletmaxPages;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplServletsReferenceSearchServletProperties_H_ */
