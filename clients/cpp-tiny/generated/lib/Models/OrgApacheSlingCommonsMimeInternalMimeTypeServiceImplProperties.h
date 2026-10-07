
/*
 * OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties();
    OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMimetypes();

	/*! \brief Set 
	 */
	void setMimetypes(ConfigNodePropertyArray mimetypes);


    private:
    ConfigNodePropertyArray mimetypes;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties_H_ */
