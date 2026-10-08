
/*
 * OrgApacheFelixHttpSslfilterSslFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheFelixHttpSslfilterSslFilterProperties_H_
#define TINY_CPP_CLIENT_OrgApacheFelixHttpSslfilterSslFilterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheFelixHttpSslfilterSslFilterProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheFelixHttpSslfilterSslFilterProperties();
    OrgApacheFelixHttpSslfilterSslFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheFelixHttpSslfilterSslFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSslforwardheader();

	/*! \brief Set 
	 */
	void setSslforwardheader(ConfigNodePropertyString sslforwardheader);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSslforwardvalue();

	/*! \brief Set 
	 */
	void setSslforwardvalue(ConfigNodePropertyString sslforwardvalue);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSslforwardcertheader();

	/*! \brief Set 
	 */
	void setSslforwardcertheader(ConfigNodePropertyString sslforwardcertheader);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRewriteabsoluteurls();

	/*! \brief Set 
	 */
	void setRewriteabsoluteurls(ConfigNodePropertyBoolean rewriteabsoluteurls);


    private:
    ConfigNodePropertyString sslforwardheader;
    ConfigNodePropertyString sslforwardvalue;
    ConfigNodePropertyString sslforwardcertheader;
    ConfigNodePropertyBoolean rewriteabsoluteurls;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheFelixHttpSslfilterSslFilterProperties_H_ */
