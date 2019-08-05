using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties:  IEquatable<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties>
    { 
        /// <summary>
        /// Filepattern
        /// </summary>
        public ConfigNodePropertyString Filepattern { get; private set; }

        /// <summary>
        /// DeviceGroups
        /// </summary>
        public ConfigNodePropertyArray DeviceGroups { get; private set; }

        /// <summary>
        /// BuildPageNodes
        /// </summary>
        public ConfigNodePropertyBoolean BuildPageNodes { get; private set; }

        /// <summary>
        /// BuildClientLibs
        /// </summary>
        public ConfigNodePropertyBoolean BuildClientLibs { get; private set; }

        /// <summary>
        /// BuildCanvasComponent
        /// </summary>
        public ConfigNodePropertyBoolean BuildCanvasComponent { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties()
        {
        }

        private ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties(ConfigNodePropertyString Filepattern, ConfigNodePropertyArray DeviceGroups, ConfigNodePropertyBoolean BuildPageNodes, ConfigNodePropertyBoolean BuildClientLibs, ConfigNodePropertyBoolean BuildCanvasComponent)
        {
            
            this.Filepattern = Filepattern;
            
            this.DeviceGroups = DeviceGroups;
            
            this.BuildPageNodes = BuildPageNodes;
            
            this.BuildClientLibs = BuildClientLibs;
            
            this.BuildCanvasComponent = BuildCanvasComponent;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder</returns>
        public static ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder</returns>
        public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder With()
        {
            return Builder()
                .Filepattern(Filepattern)
                .DeviceGroups(DeviceGroups)
                .BuildPageNodes(BuildPageNodes)
                .BuildClientLibs(BuildClientLibs)
                .BuildCanvasComponent(BuildCanvasComponent);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties left, ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties left, ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _Filepattern;
            private ConfigNodePropertyArray _DeviceGroups;
            private ConfigNodePropertyBoolean _BuildPageNodes;
            private ConfigNodePropertyBoolean _BuildClientLibs;
            private ConfigNodePropertyBoolean _BuildCanvasComponent;

            internal ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.Filepattern property.
            /// </summary>
            /// <param name="value">Filepattern</param>
            public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder Filepattern(ConfigNodePropertyString value)
            {
                _Filepattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.DeviceGroups property.
            /// </summary>
            /// <param name="value">DeviceGroups</param>
            public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder DeviceGroups(ConfigNodePropertyArray value)
            {
                _DeviceGroups = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.BuildPageNodes property.
            /// </summary>
            /// <param name="value">BuildPageNodes</param>
            public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder BuildPageNodes(ConfigNodePropertyBoolean value)
            {
                _BuildPageNodes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.BuildClientLibs property.
            /// </summary>
            /// <param name="value">BuildClientLibs</param>
            public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder BuildClientLibs(ConfigNodePropertyBoolean value)
            {
                _BuildClientLibs = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.BuildCanvasComponent property.
            /// </summary>
            /// <param name="value">BuildCanvasComponent</param>
            public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuilder BuildCanvasComponent(ConfigNodePropertyBoolean value)
            {
                _BuildCanvasComponent = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties</returns>
            public ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties(
                    Filepattern: _Filepattern,
                    DeviceGroups: _DeviceGroups,
                    BuildPageNodes: _BuildPageNodes,
                    BuildClientLibs: _BuildClientLibs,
                    BuildCanvasComponent: _BuildCanvasComponent
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}