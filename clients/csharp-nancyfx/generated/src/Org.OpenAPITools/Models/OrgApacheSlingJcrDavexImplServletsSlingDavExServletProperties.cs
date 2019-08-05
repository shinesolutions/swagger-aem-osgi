using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties:  IEquatable<OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties>
    { 
        /// <summary>
        /// Alias
        /// </summary>
        public ConfigNodePropertyString Alias { get; private set; }

        /// <summary>
        /// DavCreateAbsoluteUri
        /// </summary>
        public ConfigNodePropertyBoolean DavCreateAbsoluteUri { get; private set; }

        /// <summary>
        /// DavProtectedhandlers
        /// </summary>
        public ConfigNodePropertyString DavProtectedhandlers { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties()
        {
        }

        private OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties(ConfigNodePropertyString Alias, ConfigNodePropertyBoolean DavCreateAbsoluteUri, ConfigNodePropertyString DavProtectedhandlers)
        {
            
            this.Alias = Alias;
            
            this.DavCreateAbsoluteUri = DavCreateAbsoluteUri;
            
            this.DavProtectedhandlers = DavProtectedhandlers;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder</returns>
        public static OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder</returns>
        public OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder With()
        {
            return Builder()
                .Alias(Alias)
                .DavCreateAbsoluteUri(DavCreateAbsoluteUri)
                .DavProtectedhandlers(DavProtectedhandlers);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties left, OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties left, OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder
        {
            private ConfigNodePropertyString _Alias;
            private ConfigNodePropertyBoolean _DavCreateAbsoluteUri;
            private ConfigNodePropertyString _DavProtectedhandlers;

            internal OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.Alias property.
            /// </summary>
            /// <param name="value">Alias</param>
            public OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder Alias(ConfigNodePropertyString value)
            {
                _Alias = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.DavCreateAbsoluteUri property.
            /// </summary>
            /// <param name="value">DavCreateAbsoluteUri</param>
            public OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder DavCreateAbsoluteUri(ConfigNodePropertyBoolean value)
            {
                _DavCreateAbsoluteUri = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.DavProtectedhandlers property.
            /// </summary>
            /// <param name="value">DavProtectedhandlers</param>
            public OrgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesBuilder DavProtectedhandlers(ConfigNodePropertyString value)
            {
                _DavProtectedhandlers = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties</returns>
            public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties(
                    Alias: _Alias,
                    DavCreateAbsoluteUri: _DavCreateAbsoluteUri,
                    DavProtectedhandlers: _DavProtectedhandlers
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}