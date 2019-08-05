using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties
    /// </summary>
    public sealed class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties:  IEquatable<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties>
    { 
        /// <summary>
        /// LogStacktraceOnclose
        /// </summary>
        public ConfigNodePropertyBoolean LogStacktraceOnclose { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties()
        {
        }

        private OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties(ConfigNodePropertyBoolean LogStacktraceOnclose)
        {
            
            this.LogStacktraceOnclose = LogStacktraceOnclose;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder</returns>
        public static OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder Builder()
        {
            return new OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder</returns>
        public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder With()
        {
            return Builder()
                .LogStacktraceOnclose(LogStacktraceOnclose);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties left, OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties left, OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.
        /// </summary>
        public sealed class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _LogStacktraceOnclose;

            internal OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.LogStacktraceOnclose property.
            /// </summary>
            /// <param name="value">LogStacktraceOnclose</param>
            public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesBuilder LogStacktraceOnclose(ConfigNodePropertyBoolean value)
            {
                _LogStacktraceOnclose = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties.
            /// </summary>
            /// <returns>OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties</returns>
            public OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties Build()
            {
                Validate();
                return new OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties(
                    LogStacktraceOnclose: _LogStacktraceOnclose
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}