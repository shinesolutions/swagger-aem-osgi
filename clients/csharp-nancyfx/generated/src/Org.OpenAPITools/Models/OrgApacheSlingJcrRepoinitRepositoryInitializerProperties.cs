using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrRepoinitRepositoryInitializerProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties:  IEquatable<OrgApacheSlingJcrRepoinitRepositoryInitializerProperties>
    { 
        /// <summary>
        /// References
        /// </summary>
        public ConfigNodePropertyArray References { get; private set; }

        /// <summary>
        /// Scripts
        /// </summary>
        public ConfigNodePropertyArray Scripts { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties()
        {
        }

        private OrgApacheSlingJcrRepoinitRepositoryInitializerProperties(ConfigNodePropertyArray References, ConfigNodePropertyArray Scripts)
        {
            
            this.References = References;
            
            this.Scripts = Scripts;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder</returns>
        public static OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder</returns>
        public OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder With()
        {
            return Builder()
                .References(References)
                .Scripts(Scripts);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrRepoinitRepositoryInitializerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrRepoinitRepositoryInitializerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrRepoinitRepositoryInitializerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrRepoinitRepositoryInitializerProperties left, OrgApacheSlingJcrRepoinitRepositoryInitializerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrRepoinitRepositoryInitializerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrRepoinitRepositoryInitializerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrRepoinitRepositoryInitializerProperties left, OrgApacheSlingJcrRepoinitRepositoryInitializerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder
        {
            private ConfigNodePropertyArray _References;
            private ConfigNodePropertyArray _Scripts;

            internal OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.References property.
            /// </summary>
            /// <param name="value">References</param>
            public OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder References(ConfigNodePropertyArray value)
            {
                _References = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.Scripts property.
            /// </summary>
            /// <param name="value">Scripts</param>
            public OrgApacheSlingJcrRepoinitRepositoryInitializerPropertiesBuilder Scripts(ConfigNodePropertyArray value)
            {
                _Scripts = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrRepoinitRepositoryInitializerProperties</returns>
            public OrgApacheSlingJcrRepoinitRepositoryInitializerProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrRepoinitRepositoryInitializerProperties(
                    References: _References,
                    Scripts: _Scripts
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}