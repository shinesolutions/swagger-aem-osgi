using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties
    /// </summary>
    public sealed class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties:  IEquatable<OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties>
    { 
        /// <summary>
        /// SlingName
        /// </summary>
        public ConfigNodePropertyString SlingName { get; private set; }

        /// <summary>
        /// SlingDescription
        /// </summary>
        public ConfigNodePropertyString SlingDescription { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties()
        {
        }

        private OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties(ConfigNodePropertyString SlingName, ConfigNodePropertyString SlingDescription)
        {
            
            this.SlingName = SlingName;
            
            this.SlingDescription = SlingDescription;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.
        /// </summary>
        /// <returns>OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder</returns>
        public static OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder Builder()
        {
            return new OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder</returns>
        public OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder With()
        {
            return Builder()
                .SlingName(SlingName)
                .SlingDescription(SlingDescription);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties left, OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties left, OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.
        /// </summary>
        public sealed class OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingName;
            private ConfigNodePropertyString _SlingDescription;

            internal OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.SlingName property.
            /// </summary>
            /// <param name="value">SlingName</param>
            public OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder SlingName(ConfigNodePropertyString value)
            {
                _SlingName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.SlingDescription property.
            /// </summary>
            /// <param name="value">SlingDescription</param>
            public OrgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesBuilder SlingDescription(ConfigNodePropertyString value)
            {
                _SlingDescription = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.
            /// </summary>
            /// <returns>OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties</returns>
            public OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties Build()
            {
                Validate();
                return new OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties(
                    SlingName: _SlingName,
                    SlingDescription: _SlingDescription
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}