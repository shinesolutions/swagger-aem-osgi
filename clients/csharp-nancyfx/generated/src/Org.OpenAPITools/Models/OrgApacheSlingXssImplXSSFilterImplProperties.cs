using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingXssImplXSSFilterImplProperties
    /// </summary>
    public sealed class OrgApacheSlingXssImplXSSFilterImplProperties:  IEquatable<OrgApacheSlingXssImplXSSFilterImplProperties>
    { 
        /// <summary>
        /// PolicyPath
        /// </summary>
        public ConfigNodePropertyString PolicyPath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingXssImplXSSFilterImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingXssImplXSSFilterImplProperties()
        {
        }

        private OrgApacheSlingXssImplXSSFilterImplProperties(ConfigNodePropertyString PolicyPath)
        {
            
            this.PolicyPath = PolicyPath;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingXssImplXSSFilterImplProperties.
        /// </summary>
        /// <returns>OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder</returns>
        public static OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder Builder()
        {
            return new OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder</returns>
        public OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder With()
        {
            return Builder()
                .PolicyPath(PolicyPath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingXssImplXSSFilterImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingXssImplXSSFilterImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingXssImplXSSFilterImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingXssImplXSSFilterImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingXssImplXSSFilterImplProperties left, OrgApacheSlingXssImplXSSFilterImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingXssImplXSSFilterImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingXssImplXSSFilterImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingXssImplXSSFilterImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingXssImplXSSFilterImplProperties left, OrgApacheSlingXssImplXSSFilterImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingXssImplXSSFilterImplProperties.
        /// </summary>
        public sealed class OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder
        {
            private ConfigNodePropertyString _PolicyPath;

            internal OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingXssImplXSSFilterImplProperties.PolicyPath property.
            /// </summary>
            /// <param name="value">PolicyPath</param>
            public OrgApacheSlingXssImplXSSFilterImplPropertiesBuilder PolicyPath(ConfigNodePropertyString value)
            {
                _PolicyPath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingXssImplXSSFilterImplProperties.
            /// </summary>
            /// <returns>OrgApacheSlingXssImplXSSFilterImplProperties</returns>
            public OrgApacheSlingXssImplXSSFilterImplProperties Build()
            {
                Validate();
                return new OrgApacheSlingXssImplXSSFilterImplProperties(
                    PolicyPath: _PolicyPath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}