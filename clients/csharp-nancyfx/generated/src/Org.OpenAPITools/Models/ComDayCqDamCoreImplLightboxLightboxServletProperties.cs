using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplLightboxLightboxServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplLightboxLightboxServletProperties:  IEquatable<ComDayCqDamCoreImplLightboxLightboxServletProperties>
    { 
        /// <summary>
        /// SlingServletPaths
        /// </summary>
        public ConfigNodePropertyString SlingServletPaths { get; private set; }

        /// <summary>
        /// SlingServletMethods
        /// </summary>
        public ConfigNodePropertyArray SlingServletMethods { get; private set; }

        /// <summary>
        /// CqDamEnableAnonymous
        /// </summary>
        public ConfigNodePropertyBoolean CqDamEnableAnonymous { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplLightboxLightboxServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplLightboxLightboxServletProperties()
        {
        }

        private ComDayCqDamCoreImplLightboxLightboxServletProperties(ConfigNodePropertyString SlingServletPaths, ConfigNodePropertyArray SlingServletMethods, ConfigNodePropertyBoolean CqDamEnableAnonymous)
        {
            
            this.SlingServletPaths = SlingServletPaths;
            
            this.SlingServletMethods = SlingServletMethods;
            
            this.CqDamEnableAnonymous = CqDamEnableAnonymous;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplLightboxLightboxServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletPaths(SlingServletPaths)
                .SlingServletMethods(SlingServletMethods)
                .CqDamEnableAnonymous(CqDamEnableAnonymous);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplLightboxLightboxServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplLightboxLightboxServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplLightboxLightboxServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplLightboxLightboxServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplLightboxLightboxServletProperties left, ComDayCqDamCoreImplLightboxLightboxServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplLightboxLightboxServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplLightboxLightboxServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplLightboxLightboxServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplLightboxLightboxServletProperties left, ComDayCqDamCoreImplLightboxLightboxServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplLightboxLightboxServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingServletPaths;
            private ConfigNodePropertyArray _SlingServletMethods;
            private ConfigNodePropertyBoolean _CqDamEnableAnonymous;

            internal ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplLightboxLightboxServletProperties.SlingServletPaths property.
            /// </summary>
            /// <param name="value">SlingServletPaths</param>
            public ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder SlingServletPaths(ConfigNodePropertyString value)
            {
                _SlingServletPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplLightboxLightboxServletProperties.SlingServletMethods property.
            /// </summary>
            /// <param name="value">SlingServletMethods</param>
            public ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder SlingServletMethods(ConfigNodePropertyArray value)
            {
                _SlingServletMethods = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplLightboxLightboxServletProperties.CqDamEnableAnonymous property.
            /// </summary>
            /// <param name="value">CqDamEnableAnonymous</param>
            public ComDayCqDamCoreImplLightboxLightboxServletPropertiesBuilder CqDamEnableAnonymous(ConfigNodePropertyBoolean value)
            {
                _CqDamEnableAnonymous = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplLightboxLightboxServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplLightboxLightboxServletProperties</returns>
            public ComDayCqDamCoreImplLightboxLightboxServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplLightboxLightboxServletProperties(
                    SlingServletPaths: _SlingServletPaths,
                    SlingServletMethods: _SlingServletMethods,
                    CqDamEnableAnonymous: _CqDamEnableAnonymous
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}