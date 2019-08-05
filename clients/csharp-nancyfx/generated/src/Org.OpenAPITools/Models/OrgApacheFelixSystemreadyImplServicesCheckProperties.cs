using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadyImplServicesCheckProperties
    /// </summary>
    public sealed class OrgApacheFelixSystemreadyImplServicesCheckProperties:  IEquatable<OrgApacheFelixSystemreadyImplServicesCheckProperties>
    { 
        /// <summary>
        /// ServicesList
        /// </summary>
        public ConfigNodePropertyArray ServicesList { get; private set; }

        /// <summary>
        /// Type
        /// </summary>
        public ConfigNodePropertyDropDown Type { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixSystemreadyImplServicesCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadyImplServicesCheckProperties()
        {
        }

        private OrgApacheFelixSystemreadyImplServicesCheckProperties(ConfigNodePropertyArray ServicesList, ConfigNodePropertyDropDown Type)
        {
            
            this.ServicesList = ServicesList;
            
            this.Type = Type;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadyImplServicesCheckProperties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder</returns>
        public static OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder Builder()
        {
            return new OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder</returns>
        public OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder With()
        {
            return Builder()
                .ServicesList(ServicesList)
                .Type(Type);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixSystemreadyImplServicesCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadyImplServicesCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServicesCheckProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServicesCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadyImplServicesCheckProperties left, OrgApacheFelixSystemreadyImplServicesCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadyImplServicesCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServicesCheckProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServicesCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadyImplServicesCheckProperties left, OrgApacheFelixSystemreadyImplServicesCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadyImplServicesCheckProperties.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _ServicesList;
            private ConfigNodePropertyDropDown _Type;

            internal OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServicesCheckProperties.ServicesList property.
            /// </summary>
            /// <param name="value">ServicesList</param>
            public OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder ServicesList(ConfigNodePropertyArray value)
            {
                _ServicesList = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServicesCheckProperties.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public OrgApacheFelixSystemreadyImplServicesCheckPropertiesBuilder Type(ConfigNodePropertyDropDown value)
            {
                _Type = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadyImplServicesCheckProperties.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadyImplServicesCheckProperties</returns>
            public OrgApacheFelixSystemreadyImplServicesCheckProperties Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadyImplServicesCheckProperties(
                    ServicesList: _ServicesList,
                    Type: _Type
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}