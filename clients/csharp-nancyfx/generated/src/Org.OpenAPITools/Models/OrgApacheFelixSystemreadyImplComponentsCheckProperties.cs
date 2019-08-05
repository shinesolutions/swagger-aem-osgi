using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadyImplComponentsCheckProperties
    /// </summary>
    public sealed class OrgApacheFelixSystemreadyImplComponentsCheckProperties:  IEquatable<OrgApacheFelixSystemreadyImplComponentsCheckProperties>
    { 
        /// <summary>
        /// ComponentsList
        /// </summary>
        public ConfigNodePropertyArray ComponentsList { get; private set; }

        /// <summary>
        /// Type
        /// </summary>
        public ConfigNodePropertyDropDown Type { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixSystemreadyImplComponentsCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadyImplComponentsCheckProperties()
        {
        }

        private OrgApacheFelixSystemreadyImplComponentsCheckProperties(ConfigNodePropertyArray ComponentsList, ConfigNodePropertyDropDown Type)
        {
            
            this.ComponentsList = ComponentsList;
            
            this.Type = Type;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadyImplComponentsCheckProperties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder</returns>
        public static OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder Builder()
        {
            return new OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder</returns>
        public OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder With()
        {
            return Builder()
                .ComponentsList(ComponentsList)
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

        public bool Equals(OrgApacheFelixSystemreadyImplComponentsCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadyImplComponentsCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplComponentsCheckProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplComponentsCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadyImplComponentsCheckProperties left, OrgApacheFelixSystemreadyImplComponentsCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadyImplComponentsCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplComponentsCheckProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplComponentsCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadyImplComponentsCheckProperties left, OrgApacheFelixSystemreadyImplComponentsCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadyImplComponentsCheckProperties.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _ComponentsList;
            private ConfigNodePropertyDropDown _Type;

            internal OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplComponentsCheckProperties.ComponentsList property.
            /// </summary>
            /// <param name="value">ComponentsList</param>
            public OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder ComponentsList(ConfigNodePropertyArray value)
            {
                _ComponentsList = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplComponentsCheckProperties.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public OrgApacheFelixSystemreadyImplComponentsCheckPropertiesBuilder Type(ConfigNodePropertyDropDown value)
            {
                _Type = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadyImplComponentsCheckProperties.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadyImplComponentsCheckProperties</returns>
            public OrgApacheFelixSystemreadyImplComponentsCheckProperties Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadyImplComponentsCheckProperties(
                    ComponentsList: _ComponentsList,
                    Type: _Type
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}