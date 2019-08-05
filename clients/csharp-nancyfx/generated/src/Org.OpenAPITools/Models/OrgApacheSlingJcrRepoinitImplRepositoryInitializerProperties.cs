using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties:  IEquatable<OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties>
    { 
        /// <summary>
        /// References
        /// </summary>
        public ConfigNodePropertyArray References { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties()
        {
        }

        private OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties(ConfigNodePropertyArray References)
        {
            
            this.References = References;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder</returns>
        public static OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder</returns>
        public OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder With()
        {
            return Builder()
                .References(References);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties left, OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties left, OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder
        {
            private ConfigNodePropertyArray _References;

            internal OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.References property.
            /// </summary>
            /// <param name="value">References</param>
            public OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesBuilder References(ConfigNodePropertyArray value)
            {
                _References = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties</returns>
            public OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties(
                    References: _References
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}