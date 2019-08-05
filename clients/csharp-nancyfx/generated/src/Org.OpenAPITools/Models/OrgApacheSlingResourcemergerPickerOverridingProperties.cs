using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingResourcemergerPickerOverridingProperties
    /// </summary>
    public sealed class OrgApacheSlingResourcemergerPickerOverridingProperties:  IEquatable<OrgApacheSlingResourcemergerPickerOverridingProperties>
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
        /// Use OrgApacheSlingResourcemergerPickerOverridingProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingResourcemergerPickerOverridingProperties()
        {
        }

        private OrgApacheSlingResourcemergerPickerOverridingProperties(ConfigNodePropertyString MergeRoot, ConfigNodePropertyBoolean MergeReadOnly)
        {
            
            this.MergeRoot = MergeRoot;
            
            this.MergeReadOnly = MergeReadOnly;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingResourcemergerPickerOverridingProperties.
        /// </summary>
        /// <returns>OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder</returns>
        public static OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder Builder()
        {
            return new OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder</returns>
        public OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder With()
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

        public bool Equals(OrgApacheSlingResourcemergerPickerOverridingProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingResourcemergerPickerOverridingProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourcemergerPickerOverridingProperties</param>
        /// <param name="right">Compared (OrgApacheSlingResourcemergerPickerOverridingProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingResourcemergerPickerOverridingProperties left, OrgApacheSlingResourcemergerPickerOverridingProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingResourcemergerPickerOverridingProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingResourcemergerPickerOverridingProperties</param>
        /// <param name="right">Compared (OrgApacheSlingResourcemergerPickerOverridingProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingResourcemergerPickerOverridingProperties left, OrgApacheSlingResourcemergerPickerOverridingProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingResourcemergerPickerOverridingProperties.
        /// </summary>
        public sealed class OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder
        {
            private ConfigNodePropertyString _MergeRoot;
            private ConfigNodePropertyBoolean _MergeReadOnly;

            internal OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerPickerOverridingProperties.MergeRoot property.
            /// </summary>
            /// <param name="value">MergeRoot</param>
            public OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder MergeRoot(ConfigNodePropertyString value)
            {
                _MergeRoot = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingResourcemergerPickerOverridingProperties.MergeReadOnly property.
            /// </summary>
            /// <param name="value">MergeReadOnly</param>
            public OrgApacheSlingResourcemergerPickerOverridingPropertiesBuilder MergeReadOnly(ConfigNodePropertyBoolean value)
            {
                _MergeReadOnly = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingResourcemergerPickerOverridingProperties.
            /// </summary>
            /// <returns>OrgApacheSlingResourcemergerPickerOverridingProperties</returns>
            public OrgApacheSlingResourcemergerPickerOverridingProperties Build()
            {
                Validate();
                return new OrgApacheSlingResourcemergerPickerOverridingProperties(
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