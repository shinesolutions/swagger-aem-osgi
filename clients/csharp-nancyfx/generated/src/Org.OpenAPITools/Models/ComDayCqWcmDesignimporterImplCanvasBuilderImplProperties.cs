using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties:  IEquatable<ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties>
    { 
        /// <summary>
        /// Filepattern
        /// </summary>
        public ConfigNodePropertyString Filepattern { get; private set; }

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
        /// Use ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties()
        {
        }

        private ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(ConfigNodePropertyString Filepattern, ConfigNodePropertyBoolean BuildPageNodes, ConfigNodePropertyBoolean BuildClientLibs, ConfigNodePropertyBoolean BuildCanvasComponent)
        {
            
            this.Filepattern = Filepattern;
            
            this.BuildPageNodes = BuildPageNodes;
            
            this.BuildClientLibs = BuildClientLibs;
            
            this.BuildCanvasComponent = BuildCanvasComponent;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder</returns>
        public static ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder</returns>
        public ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder With()
        {
            return Builder()
                .Filepattern(Filepattern)
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

        public bool Equals(ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties left, ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties left, ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _Filepattern;
            private ConfigNodePropertyBoolean _BuildPageNodes;
            private ConfigNodePropertyBoolean _BuildClientLibs;
            private ConfigNodePropertyBoolean _BuildCanvasComponent;

            internal ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.Filepattern property.
            /// </summary>
            /// <param name="value">Filepattern</param>
            public ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder Filepattern(ConfigNodePropertyString value)
            {
                _Filepattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.BuildPageNodes property.
            /// </summary>
            /// <param name="value">BuildPageNodes</param>
            public ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder BuildPageNodes(ConfigNodePropertyBoolean value)
            {
                _BuildPageNodes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.BuildClientLibs property.
            /// </summary>
            /// <param name="value">BuildClientLibs</param>
            public ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder BuildClientLibs(ConfigNodePropertyBoolean value)
            {
                _BuildClientLibs = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.BuildCanvasComponent property.
            /// </summary>
            /// <param name="value">BuildCanvasComponent</param>
            public ComDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuilder BuildCanvasComponent(ConfigNodePropertyBoolean value)
            {
                _BuildCanvasComponent = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties</returns>
            public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(
                    Filepattern: _Filepattern,
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