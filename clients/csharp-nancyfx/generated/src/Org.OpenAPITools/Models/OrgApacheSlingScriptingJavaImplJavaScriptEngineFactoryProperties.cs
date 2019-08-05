using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties
    /// </summary>
    public sealed class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties:  IEquatable<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties>
    { 
        /// <summary>
        /// JavaClassdebuginfo
        /// </summary>
        public ConfigNodePropertyBoolean JavaClassdebuginfo { get; private set; }

        /// <summary>
        /// JavaJavaEncoding
        /// </summary>
        public ConfigNodePropertyString JavaJavaEncoding { get; private set; }

        /// <summary>
        /// JavaCompilerSourceVM
        /// </summary>
        public ConfigNodePropertyString JavaCompilerSourceVM { get; private set; }

        /// <summary>
        /// JavaCompilerTargetVM
        /// </summary>
        public ConfigNodePropertyString JavaCompilerTargetVM { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties()
        {
        }

        private OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(ConfigNodePropertyBoolean JavaClassdebuginfo, ConfigNodePropertyString JavaJavaEncoding, ConfigNodePropertyString JavaCompilerSourceVM, ConfigNodePropertyString JavaCompilerTargetVM)
        {
            
            this.JavaClassdebuginfo = JavaClassdebuginfo;
            
            this.JavaJavaEncoding = JavaJavaEncoding;
            
            this.JavaCompilerSourceVM = JavaCompilerSourceVM;
            
            this.JavaCompilerTargetVM = JavaCompilerTargetVM;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder</returns>
        public static OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder</returns>
        public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder With()
        {
            return Builder()
                .JavaClassdebuginfo(JavaClassdebuginfo)
                .JavaJavaEncoding(JavaJavaEncoding)
                .JavaCompilerSourceVM(JavaCompilerSourceVM)
                .JavaCompilerTargetVM(JavaCompilerTargetVM);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties left, OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties left, OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.
        /// </summary>
        public sealed class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _JavaClassdebuginfo;
            private ConfigNodePropertyString _JavaJavaEncoding;
            private ConfigNodePropertyString _JavaCompilerSourceVM;
            private ConfigNodePropertyString _JavaCompilerTargetVM;

            internal OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.JavaClassdebuginfo property.
            /// </summary>
            /// <param name="value">JavaClassdebuginfo</param>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder JavaClassdebuginfo(ConfigNodePropertyBoolean value)
            {
                _JavaClassdebuginfo = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.JavaJavaEncoding property.
            /// </summary>
            /// <param name="value">JavaJavaEncoding</param>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder JavaJavaEncoding(ConfigNodePropertyString value)
            {
                _JavaJavaEncoding = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.JavaCompilerSourceVM property.
            /// </summary>
            /// <param name="value">JavaCompilerSourceVM</param>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder JavaCompilerSourceVM(ConfigNodePropertyString value)
            {
                _JavaCompilerSourceVM = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.JavaCompilerTargetVM property.
            /// </summary>
            /// <param name="value">JavaCompilerTargetVM</param>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesBuilder JavaCompilerTargetVM(ConfigNodePropertyString value)
            {
                _JavaCompilerTargetVM = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties</returns>
            public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties Build()
            {
                Validate();
                return new OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(
                    JavaClassdebuginfo: _JavaClassdebuginfo,
                    JavaJavaEncoding: _JavaJavaEncoding,
                    JavaCompilerSourceVM: _JavaCompilerSourceVM,
                    JavaCompilerTargetVM: _JavaCompilerTargetVM
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}