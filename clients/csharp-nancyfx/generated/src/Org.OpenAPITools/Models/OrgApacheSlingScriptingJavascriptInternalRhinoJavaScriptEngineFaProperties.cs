using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties
    /// </summary>
    public sealed class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties:  IEquatable<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties>
    { 
        /// <summary>
        /// OrgApacheSlingScriptingJavascriptRhinoOptLevel
        /// </summary>
        public ConfigNodePropertyInteger OrgApacheSlingScriptingJavascriptRhinoOptLevel { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties()
        {
        }

        private OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties(ConfigNodePropertyInteger OrgApacheSlingScriptingJavascriptRhinoOptLevel)
        {
            
            this.OrgApacheSlingScriptingJavascriptRhinoOptLevel = OrgApacheSlingScriptingJavascriptRhinoOptLevel;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder</returns>
        public static OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder Builder()
        {
            return new OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder</returns>
        public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder With()
        {
            return Builder()
                .OrgApacheSlingScriptingJavascriptRhinoOptLevel(OrgApacheSlingScriptingJavascriptRhinoOptLevel);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties left, OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties left, OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.
        /// </summary>
        public sealed class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder
        {
            private ConfigNodePropertyInteger _OrgApacheSlingScriptingJavascriptRhinoOptLevel;

            internal OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.OrgApacheSlingScriptingJavascriptRhinoOptLevel property.
            /// </summary>
            /// <param name="value">OrgApacheSlingScriptingJavascriptRhinoOptLevel</param>
            public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesBuilder OrgApacheSlingScriptingJavascriptRhinoOptLevel(ConfigNodePropertyInteger value)
            {
                _OrgApacheSlingScriptingJavascriptRhinoOptLevel = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.
            /// </summary>
            /// <returns>OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties</returns>
            public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties Build()
            {
                Validate();
                return new OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties(
                    OrgApacheSlingScriptingJavascriptRhinoOptLevel: _OrgApacheSlingScriptingJavascriptRhinoOptLevel
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}