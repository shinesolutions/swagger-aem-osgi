using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletBinaryProviderServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletBinaryProviderServletProperties:  IEquatable<ComDayCqDamCoreImplServletBinaryProviderServletProperties>
    { 
        /// <summary>
        /// SlingServletResourceTypes
        /// </summary>
        public ConfigNodePropertyArray SlingServletResourceTypes { get; private set; }

        /// <summary>
        /// SlingServletMethods
        /// </summary>
        public ConfigNodePropertyArray SlingServletMethods { get; private set; }

        /// <summary>
        /// CqDamDrmEnable
        /// </summary>
        public ConfigNodePropertyBoolean CqDamDrmEnable { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletBinaryProviderServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletBinaryProviderServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletBinaryProviderServletProperties(ConfigNodePropertyArray SlingServletResourceTypes, ConfigNodePropertyArray SlingServletMethods, ConfigNodePropertyBoolean CqDamDrmEnable)
        {
            
            this.SlingServletResourceTypes = SlingServletResourceTypes;
            
            this.SlingServletMethods = SlingServletMethods;
            
            this.CqDamDrmEnable = CqDamDrmEnable;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletBinaryProviderServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletResourceTypes(SlingServletResourceTypes)
                .SlingServletMethods(SlingServletMethods)
                .CqDamDrmEnable(CqDamDrmEnable);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletBinaryProviderServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletBinaryProviderServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletBinaryProviderServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletBinaryProviderServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletBinaryProviderServletProperties left, ComDayCqDamCoreImplServletBinaryProviderServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletBinaryProviderServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletBinaryProviderServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletBinaryProviderServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletBinaryProviderServletProperties left, ComDayCqDamCoreImplServletBinaryProviderServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletBinaryProviderServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _SlingServletResourceTypes;
            private ConfigNodePropertyArray _SlingServletMethods;
            private ConfigNodePropertyBoolean _CqDamDrmEnable;

            internal ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBinaryProviderServletProperties.SlingServletResourceTypes property.
            /// </summary>
            /// <param name="value">SlingServletResourceTypes</param>
            public ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder SlingServletResourceTypes(ConfigNodePropertyArray value)
            {
                _SlingServletResourceTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBinaryProviderServletProperties.SlingServletMethods property.
            /// </summary>
            /// <param name="value">SlingServletMethods</param>
            public ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder SlingServletMethods(ConfigNodePropertyArray value)
            {
                _SlingServletMethods = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletBinaryProviderServletProperties.CqDamDrmEnable property.
            /// </summary>
            /// <param name="value">CqDamDrmEnable</param>
            public ComDayCqDamCoreImplServletBinaryProviderServletPropertiesBuilder CqDamDrmEnable(ConfigNodePropertyBoolean value)
            {
                _CqDamDrmEnable = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletBinaryProviderServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletBinaryProviderServletProperties</returns>
            public ComDayCqDamCoreImplServletBinaryProviderServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletBinaryProviderServletProperties(
                    SlingServletResourceTypes: _SlingServletResourceTypes,
                    SlingServletMethods: _SlingServletMethods,
                    CqDamDrmEnable: _CqDamDrmEnable
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}