using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties
    /// </summary>
    public sealed class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties:  IEquatable<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties>
    { 
        /// <summary>
        /// MergeRoot
        /// </summary>
        public ConfigNodePropertyString MergeRoot { get; private set; }

        /// <summary>
        /// MergeReadOnly
        /// </summary>
        public ConfigNodePropertyBoolean MergeReadOnly { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties()
        {
        }

        private OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties(ConfigNodePropertyString MergeRoot, ConfigNodePropertyBoolean MergeReadOnly)
        {
            
            this.MergeRoot = MergeRoot;
            
            this.MergeReadOnly = MergeReadOnly;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder</returns>
        public static OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder</returns>
        public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder With()
        {
            return Builder()
                .MergeRoot(MergeRoot)
                .MergeReadOnly(MergeReadOnly);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties left, OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties left, OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.
        /// </summary>
        public sealed class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _MergeRoot;
            private ConfigNodePropertyBoolean _MergeReadOnly;

            internal OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.MergeRoot property.
            /// </summary>
            /// <param name="value">MergeRoot</param>
            public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder MergeRoot(ConfigNodePropertyString value)
            {
                _MergeRoot = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.MergeReadOnly property.
            /// </summary>
            /// <param name="value">MergeReadOnly</param>
            public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesBuilder MergeReadOnly(ConfigNodePropertyBoolean value)
            {
                _MergeReadOnly = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties</returns>
            public OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties Build()
            {
                Validate();
                return new OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties(
                    MergeRoot: _MergeRoot,
                    MergeReadOnly: _MergeReadOnly
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}