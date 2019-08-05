using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties
    /// </summary>
    public sealed class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties:  IEquatable<OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties>
    { 
        /// <summary>
        /// OrgApacheSlingScriptingSightlyJsBindings
        /// </summary>
        public ConfigNodePropertyArray OrgApacheSlingScriptingSightlyJsBindings { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties()
        {
        }

        private OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties(ConfigNodePropertyArray OrgApacheSlingScriptingSightlyJsBindings)
        {
            
            this.OrgApacheSlingScriptingSightlyJsBindings = OrgApacheSlingScriptingSightlyJsBindings;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder</returns>
        public static OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder Builder()
        {
            return new OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder</returns>
        public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder With()
        {
            return Builder()
                .OrgApacheSlingScriptingSightlyJsBindings(OrgApacheSlingScriptingSightlyJsBindings);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties left, OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties left, OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.
        /// </summary>
        public sealed class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder
        {
            private ConfigNodePropertyArray _OrgApacheSlingScriptingSightlyJsBindings;

            internal OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.OrgApacheSlingScriptingSightlyJsBindings property.
            /// </summary>
            /// <param name="value">OrgApacheSlingScriptingSightlyJsBindings</param>
            public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesBuilder OrgApacheSlingScriptingSightlyJsBindings(ConfigNodePropertyArray value)
            {
                _OrgApacheSlingScriptingSightlyJsBindings = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.
            /// </summary>
            /// <returns>OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties</returns>
            public OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties Build()
            {
                Validate();
                return new OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties(
                    OrgApacheSlingScriptingSightlyJsBindings: _OrgApacheSlingScriptingSightlyJsBindings
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}